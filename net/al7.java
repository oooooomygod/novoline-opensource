/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

class al7
extends _v_0 {
    private ns_1 b;
    private int c;

    public void c() {
        if (this.c == 0) {
            this.c = 20;
        }
    }

    public al7(ns_1 ns_12) {
        this.b = ns_12;
    }

    @Override
    public void d() {
        --this.c;
        if (this.c <= 0) {
            World world = this.b.worldObj;
            Random random = aN9.d(this.b);
            BlockPos blockPos = new BlockPos(this.b);
            int n = 0;
            int n2 = 0;
            int n3 = 0;
            while (true) {
                BlockPos blockPos2;
                IBlockState iBlockState;
                if (BlockStateInvoker.getBlock(iBlockState = aV8.q(world, blockPos2 = amv_2.a(blockPos, n2, n, n3))) == Blocks.bV) {
                    if (J9.c(aV8.k(world), a2L.a)) {
                        aV8.b(world, blockPos2, true);
                    } else {
                        aV8.a(world, blockPos2, SL.b((vx_0)((Object)BlockStateInvoker.b(iBlockState, h6_0.P))), 3);
                    }
                    if (a5_0.a(random)) {
                        return;
                    }
                }
                n3 = 1 - n3;
            }
        }
    }

    @Override
    public boolean g() {
        return this.c > 0;
    }
}

