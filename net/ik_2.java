/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.ik
 */
public class ik_2
extends io_2 {
    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = this.a(random);
        if (!this.a(world, random, blockPos, n)) {
            return false;
        }
        this.c(world, amv_2.c(blockPos, n), 2);
        int n2 = amv_2.h(blockPos) + n - 2 - a5_0.a(random, 4);
        if (n2 > amv_2.h(blockPos) + n / 2) {
            float f = a5_0.e(random) * (float)Math.PI * 2.0f;
            int n3 = amv_2.j(blockPos) + (int)(0.5f + MathHelper.cos(f) * 4.0f);
            int n4 = amv_2.i(blockPos) + (int)(0.5f + MathHelper.sin(f) * 4.0f);
            int n5 = 0;
            while (true) {
                n3 = amv_2.j(blockPos) + (int)(1.5f + MathHelper.cos(f) * (float)n5);
                n4 = amv_2.i(blockPos) + (int)(1.5f + MathHelper.sin(f) * (float)n5);
                this.a(world, new BlockPos(n3, n2 - 3 + n5 / 2, n4), this.b);
                ++n5;
            }
        }
        for (n2 = 0; n2 < n; ++n2) {
            BlockPos blockPos2;
            BlockPos blockPos3;
            BlockPos blockPos4 = amv_2.c(blockPos, n2);
            if (this.a(BlockStateInvoker.getBlock(aV8.q(world, blockPos4)))) {
                this.a(world, blockPos4, this.b);
                this.a(world, random, amv_2.d(blockPos4), ha_2.Q);
                this.a(world, random, amv_2.a(blockPos4), ha_2.P);
            }
            if (n2 >= n - 1) continue;
            BlockPos blockPos5 = amv_2.f(blockPos4);
            if (this.a(BlockStateInvoker.getBlock(aV8.q(world, blockPos5)))) {
                this.a(world, blockPos5, this.b);
                this.a(world, random, amv_2.f(blockPos5), ha_2.R);
                this.a(world, random, amv_2.a(blockPos5), ha_2.P);
            }
            if (this.a(BlockStateInvoker.getBlock(aV8.q(world, blockPos3 = amv_2.f(amv_2.b(blockPos4)))))) {
                this.a(world, blockPos3, this.b);
                this.a(world, random, amv_2.f(blockPos3), ha_2.R);
                this.a(world, random, amv_2.b(blockPos3), ha_2.T);
            }
            if (!this.a(BlockStateInvoker.getBlock(aV8.q(world, blockPos2 = amv_2.b(blockPos4))))) continue;
            this.a(world, blockPos2, this.b);
            this.a(world, random, amv_2.d(blockPos2), ha_2.Q);
            this.a(world, random, amv_2.b(blockPos2), ha_2.T);
        }
        return true;
    }

    public ik_2(boolean bl, int n, int n2, IBlockState iBlockState, IBlockState iBlockState2) {
        super(bl, n, n2, iBlockState, iBlockState2);
    }

    private void c(World world, BlockPos blockPos, int n) {
        int n2 = 2;
        int n3 = -n2;
        while (true) {
            this.a(world, amv_2.c(blockPos, n3), n + 1 - n3);
            ++n3;
        }
    }

    private void a(World world, Random random, BlockPos blockPos, J_ j_) {
        if (a5_0.a(random, 3) > 0 && aV8.k(world, blockPos)) {
            this.a(world, blockPos, BlockStateInvoker.a(BlocksInvoker.t(Blocks.as), j_, Boolean.TRUE));
        }
    }
}

