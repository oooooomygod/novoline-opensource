/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.Ir
 */
public class ir_0
extends il_0 {
    private boolean aI;
    private amu_0 aH;
    private boolean aL;
    private amu_0 aJ;
    private IBlockState[] aG;
    private long aF;
    private amu_0 aK;

    @Override
    public void a(World world, Random random, xb_1 xb_12, int n, int n2, double d) {
        int n3;
        int n4;
        if (this.aG == null || this.aF != aV8.w(world)) {
            this.a(aV8.w(world));
        }
        if (this.aH == null || this.aJ == null || this.aF != aV8.w(world)) {
            Random random2 = new Random(this.aF);
            this.aH = new amu_0(random2, 4);
            this.aJ = new amu_0(random2, 1);
        }
        this.aF = aV8.w(world);
        double d2 = 0.0;
        if (this.aL) {
            n4 = (n & 0xFFFFFFF0) + (n2 & 0xF);
            n3 = (n2 & 0xFFFFFFF0) + (n & 0xF);
            double d3 = MathInvoker.a(MathInvoker.a(d), t8_0.a(this.aH, (double)n4 * 0.25, (double)n3 * 0.25));
            if (d3 > 0.0) {
                d2 = d3 * d3 * 2.5;
                double d4 = 0.001953125;
                double d5 = MathInvoker.a(t8_0.a(this.aJ, (double)n4 * d4, (double)n3 * d4));
                double d6 = MathInvoker.j(d5 * 50.0) + 14.0;
                if (d2 > d6) {
                    d2 = d6;
                }
                d2 += 64.0;
            }
        }
        n4 = n & 0xF;
        n3 = n2 & 0xF;
        int n5 = aV8.c(world);
        IBlockState iBlockState = BlocksInvoker.t(Blocks.cr);
        IBlockState iBlockState2 = this.J;
        int n6 = (int)(d / 3.0 + 3.0 + a5_0.c(random) * 0.25);
        boolean bl = (double)MathHelper.b(d / 3.0 * Math.PI) > 0.0;
        int n7 = -1;
        boolean bl2 = false;
        int n8 = 255;
        while (true) {
            if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(c5.a(xb_12, n3, n8, n4))) == Material.air) {
                int cfr_ignored_0 = (int)d2;
            }
            if (n8 <= a5_0.a(random, 5)) {
                c5.a(xb_12, n3, n8, n4, BlocksInvoker.t(Blocks.bedrock));
            } else {
                IBlockState iBlockState3 = c5.a(xb_12, n3, n8, n4);
                if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState3)) == Material.air) {
                    n7 = -1;
                } else if (BlockStateInvoker.getBlock(iBlockState3) == Blocks.stone) {
                    bl2 = false;
                    iBlockState = null;
                    iBlockState2 = BlocksInvoker.t(Blocks.stone);
                    if (n8 < n5 && BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState)) == Material.air) {
                        iBlockState = aBF.a(Blocks.water);
                    }
                    n7 = n6 + MathInvoker.max(0, n8 - n5);
                    if (n8 < n5 - 1) {
                        c5.a(xb_12, n3, n8, n4, iBlockState2);
                        if (BlockStateInvoker.getBlock(iBlockState2) == Blocks.cr) {
                            c5.a(xb_12, n3, n8, n4, BlockStateInvoker.a(BlocksInvoker.t(BlockStateInvoker.getBlock(iBlockState2)), fe_1.P, (Comparable)((Object)YZ.ORANGE)));
                        }
                    } else if (this.aI && n8 > 86 + n6 * 2) {
                        c5.a(xb_12, n3, n8, n4, BlockStateInvoker.a(BlocksInvoker.t(Blocks.dirt), BlockDirt.Q, (Comparable)((Object)a6s_0.COARSE_DIRT)));
                    } else if (n8 <= n5 + 3 + n6) {
                        c5.a(xb_12, n3, n8, n4, this.aB);
                        bl2 = true;
                    } else {
                        IBlockState iBlockState4 = BlockStateInvoker.a(BlocksInvoker.t(Blocks.cr), fe_1.P, (Comparable)((Object)YZ.ORANGE));
                        c5.a(xb_12, n3, n8, n4, iBlockState4);
                    }
                }
            }
            --n8;
        }
    }

    private void a(long l4) {
        this.aG = new IBlockState[64];
        a7r_0.b(this.aG, BlocksInvoker.t(Blocks.aJ));
        Random random = new Random(l4);
        this.aK = new amu_0(random, 1);
        int n = 0;
        while (true) {
            if ((n += a5_0.a(random, 5) + 1) < 64) {
                this.aG[n] = BlockStateInvoker.a(BlocksInvoker.t(Blocks.cr), fe_1.P, (Comparable)((Object)YZ.ORANGE));
            }
            ++n;
        }
    }

    @Override
    public ii_1 b(Random random) {
        return this.p;
    }

    @Override
    public int c(BlockPos blockPos) {
        return 9470285;
    }

    private IBlockState a(int n, int n2, int n3) {
        int n4 = (int)MathInvoker.f(t8_0.a(this.aK, (double)n * 1.0 / 512.0, (double)n * 1.0 / 512.0) * 2.0);
        return this.aG[(n2 + n4 + 64) % 64];
    }

    @Override
    public int b(BlockPos blockPos) {
        return 10387789;
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos) {
        super.a(world, random, blockPos);
    }

    public ir_0(int n, boolean bl, boolean bl2) {
        super(n);
        this.aL = bl;
        this.aI = bl2;
        this.c();
        this.a(2.0f, 0.0f);
        ListInvoker.clear(this.P);
        this.aB = BlockStateInvoker.a(aav_1.a(Blocks.sand), BlockSand.Q, (Comparable)((Object)aSQ.RED_SAND));
        this.J = BlocksInvoker.t(Blocks.cr);
        this.ai.w = -999;
        this.ai.E = 20;
        this.ai.k = 3;
        this.ai.y = 5;
        this.ai.e = 0;
        ListInvoker.clear(this.P);
        this.ai.w = 5;
    }

    @Override
    protected il_0 c(int n) {
        boolean bl = this.s == il_0.av.s;
        ir_0 ir_02 = new ir_0(n, bl, this.aI);
        ir_02.a(A);
        ir_02.a(aL0.a(aL0.a(new StringBuilder(), this.Y), aqv_1.b).toString());
        ir_02.a(this.I, true);
        return ir_02;
    }
}

