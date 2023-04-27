/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Chunk;
import java.util.List;
import java.util.Random;

public class UC
implements em_1 {
    private ie_2 d;
    public amr_0 q;
    private amr_0 z;
    private ajN h;
    double[] i;
    private iz_2 a;
    private World u;
    double[] r;
    private iz_1 p;
    private ajf_0 m;
    double[] w;
    private i7_0 B;
    private iz_2 f;
    private double[] c = new double[256];
    private boolean A;
    private amr_0 o;
    double[] l;
    private Random n;
    private iq_0 k;
    private amr_0 e;
    double[] g;
    public amr_0 j;
    private iq_0 s;
    private iq_1 y;
    private double[] v = new double[256];
    private amr_0 b;
    private double[] x;
    private amr_0 t;
    private double[] C = new double[256];

    @Override
    public List<cp_0> a(a40 a402, BlockPos blockPos) {
        if (a402 == a40.MONSTER) {
            if (a4U.a(this.h, blockPos)) {
                return a4U.a(this.h);
            }
            if (a4U.a(this.h, this.u, blockPos) && BlockStateInvoker.getBlock(aV8.q(this.u, amv_2.g(blockPos))) == Blocks.ak) {
                return a4U.a(this.h);
            }
        }
        il_0 il_02 = aV8.o(this.u, blockPos);
        return hw_0.a(il_02, a402);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public boolean a(boolean bl, IProgressUpdate iProgressUpdate) {
        return true;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public BlockPos a(World world, String string, BlockPos blockPos) {
        return null;
    }

    @Override
    public void c() {
    }

    @Override
    public void a(Chunk chunk, int n, int n2) {
        a4U.a(this.h, this, this.u, n, n2, null);
    }

    public void a(int n, int n2, xb_1 xb_12) {
        int n3 = aV8.c(this.u) + 1;
        double d = 0.03125;
        this.c = afm_1.a(this.e, this.c, n * 16, n2 * 16, 0, 16, 16, 1, d, d, 1.0);
        this.v = afm_1.a(this.e, this.v, n * 16, 109, n2 * 16, 16, 1, 16, d, 1.0, d);
        this.C = afm_1.a(this.z, this.C, n * 16, n2 * 16, 0, 16, 16, 1, d * 2.0, d * 2.0, d * 2.0);
        int n4 = 0;
        int n5 = 0;
        boolean bl = this.c[n4 + n5 * 16] + a5_0.c(this.n) * 0.2 > 0.0;
        boolean bl2 = this.v[n4 + n5 * 16] + a5_0.c(this.n) * 0.2 > 0.0;
        int n6 = (int)(this.C[n4 + n5 * 16] / 3.0 + 3.0 + a5_0.c(this.n) * 0.25);
        int n7 = -1;
        IBlockState iBlockState = BlocksInvoker.t(Blocks.bu);
        IBlockState iBlockState2 = BlocksInvoker.t(Blocks.bu);
        int n8 = 127;
        while (true) {
            if (n8 < 127 - a5_0.a(this.n, 5) && n8 > a5_0.a(this.n, 5)) {
                IBlockState iBlockState3 = c5.a(xb_12, n5, n8, n4);
                if (BlockStateInvoker.getBlock(iBlockState3) != null && BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState3)) != Material.air) {
                    if (BlockStateInvoker.getBlock(iBlockState3) == Blocks.bu) {
                        iBlockState = null;
                        iBlockState2 = BlocksInvoker.t(Blocks.bu);
                        if (n8 < n3 && BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState)) == Material.air) {
                            iBlockState = aBF.a(Blocks.lava);
                        }
                        n7 = n6;
                        if (n8 >= n3 - 1) {
                            c5.a(xb_12, n5, n8, n4, iBlockState);
                        } else {
                            c5.a(xb_12, n5, n8, n4, iBlockState2);
                        }
                    }
                } else {
                    n7 = -1;
                }
            } else {
                c5.a(xb_12, n5, n8, n4, BlocksInvoker.t(Blocks.bedrock));
            }
            --n8;
        }
    }

    @Override
    public String d() {
        return adv_0.a;
    }

    public UC(World world, boolean bl, long l4) {
        this.p = new iz_1();
        this.y = new iq_1();
        this.d = new ie_2();
        this.B = new ix_1(BlocksInvoker.t(Blocks.cl), 14, ass_2.a(Blocks.bu));
        this.a = new iz_2(Blocks.flowing_lava, true);
        this.f = new iz_2(Blocks.flowing_lava, false);
        this.k = new iq_0(Blocks.A);
        this.s = new iq_0(Blocks.bn);
        this.h = new ajN();
        this.m = new aje_0();
        this.u = world;
        this.A = bl;
        this.n = new Random(l4);
        this.o = new amr_0(this.n, 16);
        this.t = new amr_0(this.n, 16);
        this.b = new amr_0(this.n, 8);
        this.e = new amr_0(this.n, 4);
        this.z = new amr_0(this.n, 4);
        this.j = new amr_0(this.n, 10);
        this.q = new amr_0(this.n, 16);
        aV8.a(world, 63);
    }

    private double[] a(double[] dArray, int n, int n2, int n3, int n4, int n5, int n6) {
        dArray = new double[n4 * n5 * n6];
        double d = 684.412;
        double d2 = 2053.236;
        this.l = afm_1.a(this.j, this.l, n, n2, n3, n4, 1, n6, 1.0, 0.0, 1.0);
        this.g = afm_1.a(this.q, this.g, n, n2, n3, n4, 1, n6, 100.0, 0.0, 100.0);
        this.w = afm_1.a(this.b, this.w, n, n2, n3, n4, n5, n6, d / 80.0, d2 / 60.0, d / 80.0);
        this.i = afm_1.a(this.o, this.i, n, n2, n3, n4, n5, n6, d, d2, d);
        this.r = afm_1.a(this.t, this.r, n, n2, n3, n4, n5, n6, d, d2, d);
        int n7 = 0;
        double[] dArray2 = new double[n5];
        int n8 = 0;
        while (n8 < n5) {
            double d3;
            dArray2[n8] = (double)MathHelper.b((double)n8 * Math.PI * 6.0 / (double)n5) * 2.0;
            double d4 = n8;
            if (n8 > n5 / 2) {
                d4 = n5 - 1 - n8;
            }
            int cfr_ignored_2 = (d3 = d4 - 4.0) == 0.0 ? 0 : (d3 < 0.0 ? -1 : 1);
            d4 = 4.0 - d4;
            int n9 = n8++;
            dArray2[n9] = dArray2[n9] - d4 * d4 * d4 * 10.0;
        }
        for (n8 = 0; n8 < n4; ++n8) {
            for (int i = 0; i < n6; ++i) {
                double d5 = 0.0;
                for (int j = 0; j < n5; ++j) {
                    double d6;
                    double d7 = dArray2[j];
                    double d8 = this.i[n7] / 512.0;
                    double d9 = this.r[n7] / 512.0;
                    double d10 = (this.w[n7] / 10.0 + 1.0) / 2.0;
                    double d11 = d10 < 0.0 ? d8 : (d10 > 1.0 ? d9 : d8 + (d9 - d8) * d10);
                    d11 -= d7;
                    if (j > n5 - 4) {
                        double d12 = (float)(j - (n5 - 4)) / 3.0f;
                        d11 = d11 * (1.0 - d12) + -10.0 * d12;
                    }
                    int cfr_ignored_3 = (d6 = (double)j - d5) == 0.0 ? 0 : (d6 < 0.0 ? -1 : 1);
                    dArray[n7] = d11;
                    ++n7;
                }
            }
        }
        return dArray;
    }

    @Override
    public Chunk a(int n, int n2) {
        a5_0.a(this.n, (long)n * 341873128712L + (long)n2 * 132897987541L);
        xb_1 xb_12 = new xb_1();
        this.b(n, n2, xb_12);
        this.a(n, n2, xb_12);
        kh_2.a(this.m, this, this.u, n, n2, xb_12);
        if (this.A) {
            a4U.a(this.h, this, this.u, n, n2, xb_12);
        }
        Chunk chunk = new Chunk(this.u, xb_12, n, n2);
        il_0[] il_0Array = aqo_0.a(aV8.q(this.u), null, n * 16, n2 * 16, 16, 16);
        byte[] byArray = aqp_2.i(chunk);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)il_0Array[i].s;
        }
        aqp_2.p(chunk);
        return chunk;
    }

    @Override
    public void a(em_1 em_12, int n, int n2) {
        BlockFalling.P = true;
        BlockPos blockPos = new BlockPos(n * 16, 0, n2 * 16);
        ChunkCoordIntPair chunkCoordIntPair = new ChunkCoordIntPair(n, n2);
        a4U.a(this.h, this.u, this.n, chunkCoordIntPair);
        int n3 = 0;
        while (true) {
            hm_1.a(this.f, this.u, this.n, amv_2.a(blockPos, a5_0.a(this.n, 16) + 8, a5_0.a(this.n, 120) + 4, a5_0.a(this.n, 16) + 8));
            ++n3;
        }
    }

    @Override
    public boolean a(em_1 em_12, Chunk chunk, int n, int n2) {
        return false;
    }

    @Override
    public Chunk a(BlockPos blockPos) {
        return this.a(amv_2.j(blockPos) >> 4, amv_2.i(blockPos) >> 4);
    }

    @Override
    public boolean b(int n, int n2) {
        return true;
    }

    @Override
    public int e() {
        return 0;
    }

    public void b(int n, int n2, xb_1 xb_12) {
        int n3 = 4;
        int n4 = aV8.c(this.u) / 2 + 1;
        int n5 = n3 + 1;
        int n6 = 17;
        int n7 = n3 + 1;
        this.x = this.a(this.x, n * n3, 0, n2 * n3, n5, n6, n7);
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        double d = 0.125;
        int n11 = (n8 * n7 + n9) * n6;
        double d2 = this.x[n11 + n10];
        int n12 = (n8 * n7 + n9 + 1) * n6;
        double d3 = this.x[n12 + n10];
        int n13 = ((n8 + 1) * n7 + n9) * n6;
        double d4 = this.x[n13 + n10];
        int n14 = ((n8 + 1) * n7 + n9 + 1) * n6;
        double d5 = this.x[n14 + n10];
        double cfr_ignored_0 = (this.x[n11 + n10 + 1] - d2) * d;
        double cfr_ignored_1 = (this.x[n12 + n10 + 1] - d3) * d;
        double cfr_ignored_2 = (this.x[n13 + n10 + 1] - d4) * d;
        double cfr_ignored_3 = (this.x[n14 + n10 + 1] - d5) * d;
        int n15 = 0;
        double d6 = 0.25;
        double d7 = d2;
        double d8 = d3;
        double cfr_ignored_4 = (d4 - d2) * d6;
        double cfr_ignored_5 = (d5 - d3) * d6;
        int n16 = 0;
        double d9 = 0.25;
        double d10 = d7;
        double d11 = (d8 - d7) * d9;
        int n17 = 0;
        while (true) {
            IBlockState iBlockState = null;
            if (n10 * 8 + n15 < n4) {
                iBlockState = aBF.a(Blocks.lava);
            }
            if (d10 > 0.0) {
                iBlockState = BlocksInvoker.t(Blocks.bu);
            }
            int n18 = n16 + n8 * 4;
            int n19 = n15 + n10 * 8;
            int n20 = n17 + n9 * 4;
            c5.a(xb_12, n18, n19, n20, iBlockState);
            d10 += d11;
            ++n17;
        }
    }
}

