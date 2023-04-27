/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import java.util.Random;
import net.minecraft.block.BlockPos;

public class I2
extends il_0 {
    protected I2(int n) {
        super(n);
        this.ai.w = 2;
        this.ai.e = 1;
        this.ai.E = 1;
        this.ai.b = 8;
        this.ai.k = 10;
        this.ai.h = 1;
        this.ai.q = 4;
        this.ai.A = 0;
        this.ai.u = 0;
        this.ai.j = 5;
        this.ae = 14745518;
        ListInvoker.add(this.ar, new cp_0(ny_1.class, 1, 1, 1));
    }

    @Override
    public ii_1 b(Random random) {
        return this.E;
    }

    @Override
    public void a(World world, Random random, xb_1 xb_12, int n, int n2, double d) {
        double d2 = t8_0.a(v, (double)n * 0.25, (double)n2 * 0.25);
        if (d2 > 0.0) {
            int n3 = n & 0xF;
            int n4 = n2 & 0xF;
            int n5 = 255;
            while (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(c5.a(xb_12, n4, n5, n3))) == Material.air) {
                --n5;
            }
        }
        this.b(world, random, xb_12, n, n2, d);
    }

    @Override
    public dq_1 a(Random random, BlockPos blockPos) {
        return dq_1.BLUE_ORCHID;
    }

    @Override
    public int c(BlockPos blockPos) {
        double d = t8_0.a(v, (double)amv_2.j(blockPos) * 0.0225, (double)amv_2.i(blockPos) * 0.0225);
        return d < -0.1 ? 5011004 : 6975545;
    }

    @Override
    public int b(BlockPos blockPos) {
        return 6975545;
    }
}

