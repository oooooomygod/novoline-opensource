/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.Ig
 */
public class ig_0
extends il_0 {
    protected boolean aF;

    @Override
    protected il_0 c(int n) {
        ig_0 ig_02 = new ig_0(n);
        ig_02.a(aQK.a);
        ig_02.aF = true;
        ig_02.b(9286496);
        ig_02.w = 14273354;
        return ig_02;
    }

    protected ig_0(int n) {
        super(n);
        this.a(0.8f, 0.4f);
        this.a(ah);
        ListInvoker.add(this.P, new cp_0(na_1.class, 5, 2, 6));
        this.ai.w = -999;
        this.ai.e = 4;
        this.ai.j = 10;
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos) {
        double d = t8_0.a(v, (double)(amv_2.j(blockPos) + 8) / 200.0, (double)(amv_2.i(blockPos) + 8) / 200.0);
        if (!(d < -0.8)) {
            this.ai.e = 4;
            this.ai.j = 10;
            apz_0.a(F, aPM.GRASS);
            int n = 0;
            while (true) {
                int n2 = a5_0.a(random, 16) + 8;
                int n3 = a5_0.a(random, 16) + 8;
                int n4 = a5_0.a(random, amv_2.h(aV8.r(world, amv_2.a(blockPos, n2, 0, n3))) + 32);
                apz_0.a(F, world, random, amv_2.a(blockPos, n2, n4, n3));
                ++n;
            }
        }
        this.ai.e = 15;
        this.ai.j = 5;
        if (this.aF) {
            apz_0.a(F, aPM.SUNFLOWER);
            int n = 0;
            while (true) {
                int n5 = a5_0.a(random, 16) + 8;
                int n6 = a5_0.a(random, 16) + 8;
                int n7 = a5_0.a(random, amv_2.h(aV8.r(world, amv_2.a(blockPos, n5, 0, n6))) + 32);
                apz_0.a(F, world, random, amv_2.a(blockPos, n5, n7, n6));
                ++n;
            }
        }
        super.a(world, random, blockPos);
    }

    @Override
    public dq_1 a(Random random, BlockPos blockPos) {
        double d = t8_0.a(v, (double)amv_2.j(blockPos) / 200.0, (double)amv_2.i(blockPos) / 200.0);
        if (d < -0.8) {
            int n = a5_0.a(random, 4);
            switch (n) {
                case 0: {
                    return dq_1.ORANGE_TULIP;
                }
                case 1: {
                    return dq_1.RED_TULIP;
                }
                case 2: {
                    return dq_1.PINK_TULIP;
                }
            }
            return dq_1.WHITE_TULIP;
        }
        if (a5_0.a(random, 3) > 0) {
            int n = a5_0.a(random, 3);
            return dq_1.POPPY;
        }
        return dq_1.DANDELION;
    }
}

