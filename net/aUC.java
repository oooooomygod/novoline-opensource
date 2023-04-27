/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import cc.novoline.modules.visual.ClickGui;
import cc.novoline.modules.visual.HUD;

class aUC
extends FutureTask {
    ClickGui f;
    BedBreaker a;

    @Override
    public void b() {
    }

    @Override
    public void f() {
        HUD.j();
        int n = -20;
        int n2 = -20;
        int n3 = -10;
        BlockPos blockPos = new BlockPos(ClickGui.a((ClickGui)this.f).player.posX - (double)n, ClickGui.c((ClickGui)this.f).player.posY + (double)n3, ClickGui.e((ClickGui)this.f).player.posZ - (double)n2);
        BlockStateInvoker.getBlock(BlockInvoker.getMaterial(ClickGui.d((ClickGui)this.f).world, blockPos));
        if (BlockStateInvoker.getBlock(BlockInvoker.getMaterial(ClickGui.b((ClickGui)this.f).world, blockPos)) == Blocks.aw && BlockStateInvoker.b(BlockInvoker.getMaterial(ClickGui.f((ClickGui)this.f).world, blockPos), gp_2.R) == a5E.HEAD) {
            o_0.a(this.a, blockPos);
            ClickGui.a(this.f, aFL.b, aL0.a(aL0.a(new StringBuilder(), aFL.a), blockPos).toString(), 3000, NotificationType.INFO);
        }
        ++n3;
        ++n2;
        ++n;
    }

    aUC(ClickGui clickGui, int n, ag3_0 ag3_02, BedBreaker bedBreaker) {
        this.f = clickGui;
        this.a = bedBreaker;
        super(n, ag3_02);
    }
}

