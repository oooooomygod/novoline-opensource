/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.move;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.type.State;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.player.Scaffold;
import cc.novoline.modules.EnumModuleType;
import deobf.ModuleRegistry;
import net.minecraft.network.packts.C0BPacketEntityAction;
import net.minecraft.network.packts.C0BPacketEntityAction$Action;
import java.lang.invoke.MethodHandles;
import net.ModuleManager;
import net.a1c;
import net.wj_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class FastSneak
extends AbstractModule {
    private static long H = a1c.a(-8245598510850179505L, 3350737149394440326L, MethodHandles.lookup().lookupClass()).a(213170194343618L);

    public FastSneak(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2) {
        long l4 = H ^ 0x1B1F9312C299L;
        long l5 = l4 ^ 0x5AEC6C6D1A8DL;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n, enumModuleType, string, (char)n2, n3, string2);
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        Scaffold.p();
        Scaffold scaffold = (Scaffold)ModuleInvoker.isEnable(ModuleRegistry.SCAFFOLD);
        if (wj_0.a(PlayerInvoker.j(this.mc.player)) && PlayerInvoker.q(this.mc.player) && !scaffold.x()) {
            if (EventInvoker.getState(motionUpdateEvent).equals((Object)State.PRE)) {
                this.b(new C0BPacketEntityAction(this.mc.player, C0BPacketEntityAction$Action.STOP_SNEAKING));
            }
            this.b(new C0BPacketEntityAction(this.mc.player, C0BPacketEntityAction$Action.START_SNEAKING));
        }
    }
}

