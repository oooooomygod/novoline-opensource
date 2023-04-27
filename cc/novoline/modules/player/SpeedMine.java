/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.player;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.EnumFacing;
import net.minecraft.network.packts.C07PacketPlayerDigging;
import net.minecraft.network.packts.C07PacketPlayerDigging$Action;
import java.lang.invoke.MethodHandles;

import net.minecraft.block.BlockPos;
import org.checkerframework.checker.nullness.qual.NonNull;

public class SpeedMine
extends AbstractModule {
    private EnumFacing H;
    private static long K = a1c.a(4118855820698222113L, -5457610177572892289L, MethodHandles.lookup().lookupClass()).a(71203250800288L);
    private boolean I;
    private BlockPos J;

    @EventTarget
    public void a(PacketEvent packetEvent) {
        ChestStealer.j();
        if (PacketEventInvoker.getState(packetEvent).equals((Object)State.OUTGOING) && PacketEventInvoker.c(packetEvent) instanceof C07PacketPlayerDigging) {
            C07PacketPlayerDigging c07PacketPlayerDigging = (C07PacketPlayerDigging)PacketEventInvoker.c(packetEvent);
            if (atq_0.b(c07PacketPlayerDigging) == C07PacketPlayerDigging$Action.START_DESTROY_BLOCK) {
                this.J = atq_0.a(c07PacketPlayerDigging);
                this.H = atq_0.c(c07PacketPlayerDigging);
            }
            if (atq_0.b(c07PacketPlayerDigging) == C07PacketPlayerDigging$Action.ABORT_DESTROY_BLOCK && this.I) {
                PacketEventInvoker.setCancelled(packetEvent, true);
                this.I = false;
            }
        }
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        ChestStealer.d();
        if (EventInvoker.getState(motionUpdateEvent).equals((Object)cc.novoline.events.type.State.PRE) && PlayerControllerInvoker.c(this.mc.playerController) && (double)this.mc.playerController.c * 1.2 > 1.0) {
            this.a(new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.STOP_DESTROY_BLOCK, this.J, this.H));
            BlockInvoker.a(this.mc.world, this.J);
            this.I = true;
        }
    }

    @Override
    public void w() {
        this.I = false;
    }

    public SpeedMine(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2) {
        long l4 = K ^ 0x6113219FDE59L;
        long l5 = l4 ^ 0x465299C73BD7L;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n, enumModuleType, string, (char)n2, n3, string2);
    }
}

