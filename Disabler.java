package cc.novoline.modules.exploits;

import cc.novoline.Novoline;
import cc.novoline.events.EventTarget;
import cc.novoline.events.events.LoadWorldEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.events.events.WindowClickEvent;
import cc.novoline.gui.screen.setting.Manager;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.gui.screen.setting.SettingType;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.ModuleManager;
import cc.novoline.modules.configurations.annotation.Property;
import cc.novoline.modules.configurations.property.object.BooleanProperty;
import cc.novoline.modules.configurations.property.object.IntProperty;
import cc.novoline.modules.configurations.property.object.PropertyFactory;
import cc.novoline.modules.move.LongJump;
import cc.novoline.modules.player.GameSpeed;
import cc.novoline.utils.Timer;
import cc.novoline.utils.notifications.NotificationType;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author gast
 *
 * leaked & deobf by xiatian233
 *
 * reworked by hope development team
 */

public class Disabler extends AbstractModule {

    @Property("ping-spoof")
    private final BooleanProperty pingSpoof = PropertyFactory.booleanFalse();

    @Property("ping-delay")
    private final IntProperty pingDelay = PropertyFactory.createInt(400).maximum(800).minimum(300);

    @Property("click-bypass")
    private final BooleanProperty clickBypass = PropertyFactory.booleanTrue();

    private final List<Packet<?>> packets = new ArrayList<>();
    private final Timer timer = new Timer(), timerClose = new Timer();

    public Disabler(@NotNull ModuleManager novoline) {
        super(novoline, "Disabler", EnumModuleType.EXPLOITS);
        Manager.put(new Setting("PING_SPOOF", "Ping Spoof", SettingType.CHECKBOX, this, pingSpoof));
        Manager.put(new Setting("PING_DELAY", "Ping Delay", SettingType.SLIDER, this, pingDelay, 50, pingSpoof::get));
        Manager.put(new Setting("CLICK_BYPASS", "Click Bypass", SettingType.CHECKBOX, this, clickBypass));
    }

    @Override
    public void onEnable() {
        super.onEnable();
        packets.clear();
        timer.reset();
        timerClose.reset();
    }

    @Override
    public void onDisable() {
        super.onDisable();

        resetDisabler();
    }

    @EventTarget
    public void onLoadWorld(LoadWorldEvent event) {
        resetDisabler();
    }

    @EventTarget
    public void onClick(WindowClickEvent event) {
        if (event.getState() == WindowClickEvent.State.PRE) {
            if (mc.player.isMoving() && event.getPacket().clickCheck() && Boolean.TRUE.equals(clickBypass.get())) {
                event.setCancelled(true);
                Novoline.getInstance().getNotificationManager().pop("In Motion Click was cancelled to keep your safety", 2500, NotificationType.WARNING);

                if (timerClose.delay(160)) {
                    mc.getNetHandler().sendPacketNoEvent(new C0DPacketCloseWindow(0));
                    timerClose.reset();
                }
            }

            if (event.getState() == WindowClickEvent.State.PRE && (mc.isIntegratedServerRunning()) && mc.player.isMoving()) { // idk tho. recaf is fucking idiot <     wtf is aCM.d()      >
                Novoline.getInstance().getNotificationManager().pop("In Motion Click was cancelled to keep your safety", 2500, NotificationType.WARNING);
                event.setCancelled(true);
            }
        }
    }

    @EventTarget
    public void onUpdate(PlayerUpdateEvent event) {
        if (Boolean.FALSE.equals(pingSpoof.get())) return;
        if (!packets.isEmpty()) {
            if (timer.delay(needPreventAttack() ? 4000.0 : (pingDelay.get() - mc.getNetHandler().getPlayerInfo(mc.player.getName()).getResponseTime()))) {
                resetDisabler();
            }
        }
    }

    @EventTarget
    public void onPacket(PacketEvent event) {
        final Packet<?> packet = event.getPacket();

        if (event.getState() != PacketEvent.State.OUTGOING) return;

        if (packet instanceof C0BPacketEntityAction) {
            final C0BPacketEntityAction pea = (C0BPacketEntityAction) packet;
            if (pea.getAction() == C0BPacketEntityAction.Action.START_SPRINTING || pea.getAction() == C0BPacketEntityAction.Action.STOP_SPRINTING) {
                event.setCancelled(true);
            }
        }

        if (packet instanceof C16PacketClientStatus) {
            final C16PacketClientStatus pcs = (C16PacketClientStatus) packet;
            if (pcs.getStatus() == C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT && Boolean.TRUE.equals(clickBypass.get())) {
                event.setCancelled(true);
            }
        }

        if (packet instanceof C02PacketUseEntity) {
            final C02PacketUseEntity pue = (C02PacketUseEntity) packet;
            if (pue.getAction() == C02PacketUseEntity.Action.ATTACK && needPreventAttack()) {
                event.setCancelled(true);
            }
        }

        if (packet instanceof C0APacketAnimation) {
            if (needPreventAttack()) {
                event.setCancelled(true);
            }
        }

        if (packet instanceof C0FPacketConfirmTransaction) {
            final C0FPacketConfirmTransaction pct = (C0FPacketConfirmTransaction) packet;
            if (pct.getID() < 0 && Boolean.TRUE.equals(pingSpoof.get())) {
                event.setCancelled(true);
                packets.add(pct);
            }
        }

        if (packet instanceof C00PacketKeepAlive) {
            final C00PacketKeepAlive pka = (C00PacketKeepAlive) packet;
            if (Boolean.TRUE.equals(pingSpoof.get())) {
                pka.setKey(ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE));
                event.setCancelled(true);
                packets.add(pka);
            }
        }
    }

    private boolean isKeepAlive(Packet<?> packet) {
        return packet instanceof C00PacketKeepAlive;
    }

    private boolean isConfirm(Packet<?> packet) {
        return packet instanceof C0FPacketConfirmTransaction;
    }

    private void resetDisabler() {
        packets.forEach(p -> {
            if (isKeepAlive(p)) sendPacketNoEvent(p);
        });
        packets.forEach(p -> {
            if (isConfirm(p)) sendPacketNoEvent(p);
        });
        packets.clear();
        timer.reset();
    }

    private boolean needPreventAttack() {
        final GameSpeed gameSpeed = getModule(GameSpeed.class);
        final LongJump longJump = getModule(LongJump.class);
        final Blink blink = getModule(Blink.class);

        return gameSpeed.isEnabled() || longJump.isEnabled() || blink.isEnabled();
    }
}
