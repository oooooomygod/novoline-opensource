/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

public class IL
extends il_0 {
    private static i2_0 aI;
    private static i5_0 aH;
    private static i4_0 aG;
    private static i2_0 aJ;
    private static ia_0 aF;
    private int aK;

    @Override
    protected il_0 c(int n) {
        return this.s == il_0.i.s ? new IL(n, 2).a(5858897, true).a(UM.a).a(5159473).a(0.25f, 0.8f).a(new ac_2(this.d, this.a)) : super.c(n);
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos) {
        int n;
        int n2;
        int n3;
        int n4;
        if (this.aK == 1 || this.aK == 2) {
            n4 = a5_0.a(random, 3);
            for (n3 = 0; n3 < n4; ++n3) {
                n2 = a5_0.a(random, 16) + 8;
                n = a5_0.a(random, 16) + 8;
                BlockPos blockPos2 = aV8.r(world, amv_2.a(blockPos, n2, 0, n));
                t_0.a(aF, world, random, blockPos2);
            }
        }
        apz_0.a(F, aPM.FERN);
        n4 = 0;
        while (true) {
            n3 = a5_0.a(random, 16) + 8;
            n2 = a5_0.a(random, 16) + 8;
            n = a5_0.a(random, amv_2.h(aV8.r(world, amv_2.a(blockPos, n3, 0, n2))) + 32);
            apz_0.a(F, world, random, amv_2.a(blockPos, n3, n, n2));
            ++n4;
        }
    }

    @Override
    public i7_0 a(Random random) {
        return a5_0.a(random, 5) > 0 ? new im_2(a4b.FERN) : new im_2(a4b.GRASS);
    }

    static {
        aG = new i4_0();
        aH = new i5_0(false);
        aJ = new i2_0(false, false);
        aI = new i2_0(false, true);
        aF = new ia_0(Blocks.L, 0);
    }

    @Override
    public ii_1 b(Random random) {
        return (this.aK == 1 || this.aK == 2) && a5_0.a(random, 3) == 0 ? (this.aK != 2 && a5_0.a(random, 13) != 0 ? aJ : aI) : (a5_0.a(random, 3) == 0 ? aG : aH);
    }

    public IL(int n, int n2) {
        super(n);
        this.aK = n2;
        ListInvoker.add(this.P, new cp_0(nf_1.class, 8, 4, 4));
        this.ai.w = 10;
        if (n2 != 1 && n2 != 2) {
            this.ai.j = 1;
            this.ai.b = 1;
        } else {
            this.ai.j = 7;
            this.ai.E = 1;
            this.ai.b = 3;
        }
    }

    @Override
    public void a(World world, Random random, xb_1 xb_12, int n, int n2, double d) {
        if (this.aK == 1 || this.aK == 2) {
            this.aB = m7_0.a(Blocks.grass);
            this.J = BlocksInvoker.t(Blocks.dirt);
            if (d > 1.75) {
                this.aB = BlockStateInvoker.a(BlocksInvoker.t(Blocks.dirt), BlockDirt.Q, (Comparable)((Object)a6s_0.COARSE_DIRT));
            } else if (d > -0.95) {
                this.aB = BlockStateInvoker.a(BlocksInvoker.t(Blocks.dirt), BlockDirt.Q, (Comparable)((Object)a6s_0.PODZOL));
            }
        }
        this.b(world, random, xb_12, n, n2, d);
    }
}

