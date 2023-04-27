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

/*
 * Renamed from net.axD
 */
public class axd_1
implements em_1 {
    private il_0[] i;
    public amr_0 a;
    private amr_0 k;
    double[] e;
    double[] m;
    private Random l;
    private amr_0 c;
    private amr_0 d;
    double[] b;
    private double[] g;
    double[] f;
    double[] h;
    private World j;
    public amr_0 n;

    @Override
    public boolean b(int n, int n2) {
        return true;
    }

    @Override
    public String d() {
        return se_0.a;
    }

    @Override
    public void a(Chunk chunk, int n, int n2) {
    }

    @Override
    public BlockPos a(World world, String string, BlockPos blockPos) {
        return null;
    }

    @Override
    public Chunk a(BlockPos blockPos) {
        return this.a(amv_2.j(blockPos) >> 4, amv_2.i(blockPos) >> 4);
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public List<cp_0> a(a40 a402, BlockPos blockPos) {
        return hw_0.a(aV8.o(this.j, blockPos), a402);
    }

    @Override
    public void c() {
    }

    public void a(xb_1 xb_12) {
        int n = 0;
        int n2 = 0;
        int n3 = 1;
        int n4 = -1;
        IBlockState iBlockState = BlocksInvoker.t(Blocks.H);
        BlocksInvoker.t(Blocks.H);
        int n5 = 127;
        while (true) {
            IBlockState iBlockState2;
            if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState2 = c5.a(xb_12, n, n5, n2))) == Material.air) {
                n4 = -1;
            } else if (BlockStateInvoker.getBlock(iBlockState2) == Blocks.stone) {
                iBlockState = BlocksInvoker.t(Blocks.air);
                BlocksInvoker.t(Blocks.H);
                n4 = n3;
                c5.a(xb_12, n, n5, n2, iBlockState);
            }
            --n5;
        }
    }

    @Override
    public boolean a(boolean bl, IProgressUpdate iProgressUpdate) {
        return true;
    }

    public axd_1(World world, long l4) {
        this.j = world;
        this.l = new Random(l4);
        this.c = new amr_0(this.l, 16);
        this.d = new amr_0(this.l, 16);
        this.k = new amr_0(this.l, 8);
        this.a = new amr_0(this.l, 10);
        this.n = new amr_0(this.l, 16);
    }

    @Override
    public void a(em_1 em_12, int n, int n2) {
        BlockFalling.P = true;
        BlockPos blockPos = new BlockPos(n * 16, 0, n2 * 16);
        hw_0.a(aV8.o(this.j, amv_2.a(blockPos, 16, 0, 16)), this.j, this.j.o, blockPos);
        BlockFalling.P = false;
    }

    @Override
    public int e() {
        return 0;
    }

    private double[] a(double[] dArray, int n, int n2, int n3, int n4, int n5, int n6) {
        dArray = new double[n4 * n5 * n6];
        double d = 684.412;
        double d2 = 684.412;
        this.m = afm_1.a(this.a, this.m, n, n3, n4, n6, 1.121, 1.121, 0.5);
        this.b = afm_1.a(this.n, this.b, n, n3, n4, n6, 200.0, 200.0, 0.5);
        this.f = afm_1.a(this.k, this.f, n, n2, n3, n4, n5, n6, (d *= 2.0) / 80.0, d2 / 160.0, d / 80.0);
        this.e = afm_1.a(this.c, this.e, n, n2, n3, n4, n5, n6, d, d2, d);
        this.h = afm_1.a(this.d, this.h, n, n2, n3, n4, n5, n6, d, d2, d);
        int n7 = 0;
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n6; ++j) {
                float f = (float)(i + n) / 1.0f;
                float f2 = (float)(j + n3) / 1.0f;
                float f3 = 100.0f - MathHelper.g(f * f + f2 * f2) * 8.0f;
                if (f3 > 80.0f) {
                    f3 = 80.0f;
                }
                if (f3 < -100.0f) {
                    f3 = -100.0f;
                }
                for (int k = 0; k < n5; ++k) {
                    double d3;
                    double d4 = 0.0;
                    double d5 = this.e[n7] / 512.0;
                    double d6 = this.h[n7] / 512.0;
                    double d7 = (this.f[n7] / 10.0 + 1.0) / 2.0;
                    d4 = d7 < 0.0 ? d5 : (d7 > 1.0 ? d6 : d5 + (d6 - d5) * d7);
                    d4 -= 8.0;
                    d4 += (double)f3;
                    int n8 = 2;
                    if (k > n5 / 2 - n8) {
                        d3 = (float)(k - (n5 / 2 - n8)) / 64.0f;
                        d3 = MathHelper.b(d3, 0.0, 1.0);
                        d4 = d4 * (1.0 - d3) + -3000.0 * d3;
                    }
                    n8 = 8;
                    d3 = (float)(n8 - k) / ((float)n8 - 1.0f);
                    dArray[n7] = d4 = d4 * (1.0 - d3) + -30.0 * d3;
                    ++n7;
                }
            }
        }
        return dArray;
    }

    @Override
    public boolean a(em_1 em_12, Chunk chunk, int n, int n2) {
        return false;
    }

    @Override
    public Chunk a(int n, int n2) {
        a5_0.a(this.l, (long)n * 341873128712L + (long)n2 * 132897987541L);
        xb_1 xb_12 = new xb_1();
        this.i = aqo_0.a(aV8.q(this.j), this.i, n * 16, n2 * 16, 16, 16);
        this.a(n, n2, xb_12);
        this.a(xb_12);
        Chunk chunk = new Chunk(this.j, xb_12, n, n2);
        byte[] byArray = aqp_2.i(chunk);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)this.i[i].s;
        }
        aqp_2.l(chunk);
        return chunk;
    }

    public void a(int n, int n2, xb_1 xb_12) {
        int n3 = 2;
        int n4 = n3 + 1;
        int n5 = 33;
        int n6 = n3 + 1;
        this.g = this.a(this.g, n * n3, 0, n2 * n3, n4, n5, n6);
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        double d = 0.25;
        double d2 = this.g[(n7 * n6 + n8) * n5 + n9];
        double d3 = this.g[(n7 * n6 + n8 + 1) * n5 + n9];
        double d4 = this.g[((n7 + 1) * n6 + n8) * n5 + n9];
        double d5 = this.g[((n7 + 1) * n6 + n8 + 1) * n5 + n9];
        double cfr_ignored_0 = (this.g[(n7 * n6 + n8) * n5 + n9 + 1] - d2) * d;
        double cfr_ignored_1 = (this.g[(n7 * n6 + n8 + 1) * n5 + n9 + 1] - d3) * d;
        double cfr_ignored_2 = (this.g[((n7 + 1) * n6 + n8) * n5 + n9 + 1] - d4) * d;
        double cfr_ignored_3 = (this.g[((n7 + 1) * n6 + n8 + 1) * n5 + n9 + 1] - d5) * d;
        int n10 = 0;
        double d6 = 0.125;
        double d7 = d2;
        double d8 = d3;
        double cfr_ignored_4 = (d4 - d2) * d6;
        double cfr_ignored_5 = (d5 - d3) * d6;
        int n11 = 0;
        double d9 = 0.125;
        double d10 = d7;
        double d11 = (d8 - d7) * d9;
        int n12 = 0;
        while (true) {
            IBlockState iBlockState = null;
            if (d10 > 0.0) {
                iBlockState = BlocksInvoker.t(Blocks.H);
            }
            int n13 = n11 + n7 * 8;
            int n14 = n10 + n9 * 4;
            int n15 = n12 + n8 * 8;
            c5.a(xb_12, n13, n14, n15, iBlockState);
            d10 += d11;
            ++n12;
        }
    }
}

