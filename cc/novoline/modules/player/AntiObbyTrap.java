/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.player;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.type.State;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.modules.AbstractModule;
import net.minecraft.init.Blocks;
import cc.novoline.modules.EnumModuleType;
import net.minecraft.network.packts.C07PacketPlayerDigging;
import net.minecraft.network.packts.C07PacketPlayerDigging$Action;
import net.minecraft.network.packts.C0APacketAnimation;
import java.lang.invoke.MethodHandles;

import org.checkerframework.checker.nullness.qual.NonNull;

public class AntiObbyTrap
extends AbstractModule {
    private float H;
    private static long J = a1c.a(-3787360601267871272L, -3015899028896806789L, MethodHandles.lookup().lookupClass()).a(266893453899259L);
    private boolean I;

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        ChestStealer.d();
        if (EventInvoker.getState(motionUpdateEvent).equals((Object)State.PRE)) {
            if (BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(EventInvoker.h(motionUpdateEvent), EventInvoker.e(motionUpdateEvent) + 1.0, EventInvoker.c(motionUpdateEvent)))) == Blocks.O || BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(EventInvoker.h(motionUpdateEvent), EventInvoker.e(motionUpdateEvent) + 1.0, EventInvoker.c(motionUpdateEvent)))) == Blocks.cobblestone || BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(EventInvoker.h(motionUpdateEvent), EventInvoker.e(motionUpdateEvent) + 2.0, EventInvoker.c(motionUpdateEvent)))) instanceof fs_2) {
                EventInvoker.b(motionUpdateEvent, 90.0f);
                Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, new BlockPos(EventInvoker.h(motionUpdateEvent), EventInvoker.e(motionUpdateEvent) - 1.0, EventInvoker.c(motionUpdateEvent))));
                BlockPos blockPos = new BlockPos(EventInvoker.h(motionUpdateEvent), EventInvoker.e(motionUpdateEvent) - 1.0, EventInvoker.c(motionUpdateEvent));
                if (this.H == 0.0f) {
                    this.I = true;
                    this.a(new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.START_DESTROY_BLOCK, blockPos, EnumFacing.UP));
                }
                PlayerInvoker.a(this.mc.player, blockPos);
                this.a(new C0APacketAnimation());
                this.H += BlocksInvoker.a(block, this.mc.player, this.mc.world, blockPos);
                BlockInvoker.b(this.mc.world, PlayerInvoker.O(this.mc.player), blockPos, (int)(this.H * 10.0f) - 1);
                if (this.H >= 1.0f) {
                    this.a(new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.STOP_DESTROY_BLOCK, blockPos, EnumFacing.UP));
                    PlayerControllerInvoker.a(this.mc.playerController, blockPos, EnumFacing.UP);
                    this.H = 0.0f;
                    this.I = false;
                }
            }
            this.H = 0.0f;
            this.I = false;
        }
    }

    public AntiObbyTrap(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2) {
        long l4 = J ^ 0x24D3944762B3L;
        long l5 = l4 ^ 0x57960052C55CL;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n, enumModuleType, string, (char)n2, n3, string2);
    }

    public boolean a() {
        return this.I;
    }
}

