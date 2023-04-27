/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Chunk;
import java.util.List;
import java.util.Random;

public class HS
implements em_1 {
    private amu_0 o;
    private aj8 i;
    private ajf_0 t;
    private WorldType B;
    public amr_0 u;
    private amr_0 r;
    private Random v;
    private World s;
    private ajX j;
    private il_0[] l;
    private ajd_0 c;
    public amr_0 A;
    private float[] g;
    double[] z;
    double[] w;
    private amr_0 e;
    private double[] b;
    double[] a;
    private aji_0 n;
    private double[] m;
    public amr_0 f;
    private Block p = Blocks.water;
    private ajf_0 h;
    private ajS d;
    double[] x;
    private amr_0 q;
    private boolean k;
    private cd_0 y;

    private void a(int n, int n2, int n3) {
        this.z = afm_1.a(this.u, this.z, n, n3, 5, 5, this.y.z, this.y.r, this.y.ai);
        float f = this.y.H;
        float f2 = this.y.w;
        this.a = afm_1.a(this.e, this.a, n, n2, n3, 5, 33, 5, f / this.y.x, f2 / this.y.G, f / this.y.g);
        this.x = afm_1.a(this.r, this.x, n, n2, n3, 5, 33, 5, f, f2, f);
        this.w = afm_1.a(this.q, this.w, n, n2, n3, 5, 33, 5, f, f2, f);
        n3 = 0;
        n = 0;
        int n4 = 0;
        int n5 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int n6 = 2;
        il_0 il_02 = this.l[n4 + 2 + (n5 + 2) * 10];
        int n7 = -n6;
        int n8 = -n6;
        while (true) {
            il_0 il_03 = this.l[n4 + n7 + 2 + (n5 + n8 + 2) * 10];
            float f6 = this.y.B + il_03.d * this.y.t;
            float f7 = this.y.y + il_03.a * this.y.K;
            if (this.B == WorldType.d && f6 > 0.0f) {
                f6 = 1.0f + f6 * 2.0f;
                f7 = 1.0f + f7 * 4.0f;
            }
            float f8 = this.g[n7 + 2 + (n8 + 2) * 5] / (f6 + 2.0f);
            if (il_03.d > il_02.d) {
                f8 /= 2.0f;
            }
            f3 += f7 * f8;
            f4 += f6 * f8;
            f5 += f8;
            ++n8;
        }
    }

    public void a(int n, int n2, xb_1 xb_12) {
        this.l = aqo_0.b(aV8.q(this.s), this.l, n * 4 - 2, n2 * 4 - 2, 10, 10);
        this.a(n * 4, 0, n2 * 4);
        int n3 = 0;
        int n4 = n3 * 5;
        int n5 = (n3 + 1) * 5;
        int n6 = 0;
        int n7 = (n4 + n6) * 33;
        int n8 = (n4 + n6 + 1) * 33;
        int n9 = (n5 + n6) * 33;
        int n10 = (n5 + n6 + 1) * 33;
        int n11 = 0;
        double d = 0.125;
        double d2 = this.b[n7 + n11];
        double d3 = this.b[n8 + n11];
        double d4 = this.b[n9 + n11];
        double d5 = this.b[n10 + n11];
        double cfr_ignored_0 = (this.b[n7 + n11 + 1] - d2) * d;
        double cfr_ignored_1 = (this.b[n8 + n11 + 1] - d3) * d;
        double cfr_ignored_2 = (this.b[n9 + n11 + 1] - d4) * d;
        double cfr_ignored_3 = (this.b[n10 + n11 + 1] - d5) * d;
        int n12 = 0;
        double d6 = 0.25;
        double d7 = d2;
        double d8 = d3;
        double cfr_ignored_4 = (d4 - d2) * d6;
        double cfr_ignored_5 = (d5 - d3) * d6;
        int n13 = 0;
        double d9 = 0.25;
        double d10 = (d8 - d7) * d9;
        double d11 = d7 - d10;
        int n14 = 0;
        while (true) {
            double d12;
            d11 += d10;
            if (d12 > 0.0) {
                c5.a(xb_12, n3 * 4 + n13, n11 * 8 + n12, n6 * 4 + n14, BlocksInvoker.t(Blocks.stone));
            } else if (n11 * 8 + n12 < this.y.ax) {
                c5.a(xb_12, n3 * 4 + n13, n11 * 8 + n12, n6 * 4 + n14, BlocksInvoker.t(this.p));
            }
            ++n14;
        }
    }

    @Override
    public List<cp_0> a(a40 a402, BlockPos blockPos) {
        il_0 il_02 = aV8.o(this.s, blockPos);
        if (this.k) {
            if (a402 == a40.MONSTER && avo_1.a(this.n, blockPos)) {
                return avo_1.a(this.n);
            }
            if (a402 == a40.MONSTER && this.y.n && oj_1.a(this.d, this.s, blockPos)) {
                return oj_1.a(this.d);
            }
        }
        return hw_0.a(il_02, a402);
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public boolean b(int n, int n2) {
        return true;
    }

    @Override
    public void a(em_1 em_12, int n, int n2) {
        int n3;
        int n4;
        int n5;
        BlockFalling.P = true;
        int n6 = n * 16;
        int n7 = n2 * 16;
        BlockPos blockPos = new BlockPos(n6, 0, n7);
        il_0 il_02 = aV8.o(this.s, amv_2.a(blockPos, 16, 0, 16));
        a5_0.a(this.v, aV8.w(this.s));
        long l4 = a5_0.b(this.v) / 2L * 2L + 1L;
        long l5 = a5_0.b(this.v) / 2L * 2L + 1L;
        a5_0.a(this.v, (long)n * l4 + (long)n2 * l5 ^ aV8.w(this.s));
        ChunkCoordIntPair chunkCoordIntPair = new ChunkCoordIntPair(n, n2);
        if (this.y.aq && this.k) {
            abm_2.a(this.c, this.s, this.v, chunkCoordIntPair);
        }
        if (this.y.am && this.k) {
            aNP.a(this.j, this.s, this.v, chunkCoordIntPair);
        }
        if (this.y.I && this.k) {
            aK7.a(this.i, this.s, this.v, chunkCoordIntPair);
        }
        if (this.y.A && this.k) {
            avo_1.a(this.n, this.s, this.v, chunkCoordIntPair);
        }
        if (this.y.n && this.k) {
            oj_1.a(this.d, this.s, this.v, chunkCoordIntPair);
        }
        if (il_02 != il_0.V && il_02 != il_0.c && this.y.ao && a5_0.a(this.v, this.y.V) == 0) {
            n5 = a5_0.a(this.v, 16) + 8;
            n4 = a5_0.a(this.v, 256);
            n3 = a5_0.a(this.v, 16) + 8;
            OK.a(new in_1(Blocks.water), this.s, this.v, amv_2.a(blockPos, n5, n4, n3));
        }
        if (a5_0.a(this.v, this.y.D / 10) == 0 && this.y.ag) {
            n5 = a5_0.a(this.v, 16) + 8;
            n4 = a5_0.a(this.v, a5_0.a(this.v, 248) + 8);
            n3 = a5_0.a(this.v, 16) + 8;
            if (n4 < aV8.c(this.s) || a5_0.a(this.v, this.y.D / 8) == 0) {
                OK.a(new in_1(Blocks.lava), this.s, this.v, amv_2.a(blockPos, n5, n4, n3));
            }
        }
        if (this.y.as) {
            for (n5 = 0; n5 < this.y.j; ++n5) {
                n4 = a5_0.a(this.v, 16) + 8;
                n3 = a5_0.a(this.v, 256);
                int n8 = a5_0.a(this.v, 16) + 8;
                ar_1.a(new if_1(), this.s, this.v, amv_2.a(blockPos, n4, n3, n8));
            }
        }
        hw_0.a(il_02, this.s, this.v, new BlockPos(n6, 0, n7));
        yj_1.a(this.s, il_02, n6 + 8, n7 + 8, 16, 16, this.v);
        blockPos = amv_2.a(blockPos, 8, 0, 8);
        n5 = 0;
        n4 = 0;
        while (true) {
            BlockPos blockPos2;
            BlockPos blockPos3;
            if (aV8.f(this.s, blockPos3 = amv_2.g(blockPos2 = aV8.y(this.s, amv_2.a(blockPos, n5, 0, n4))))) {
                aV8.a(this.s, blockPos3, BlocksInvoker.t(Blocks.I), 2);
            }
            if (aV8.a(this.s, blockPos2, true)) {
                aV8.a(this.s, blockPos2, BlocksInvoker.t(Blocks.cm), 2);
            }
            ++n4;
        }
    }

    @Override
    public boolean a(boolean bl, IProgressUpdate iProgressUpdate) {
        return true;
    }

    @Override
    public boolean a() {
        return true;
    }

    public HS(World world, long l4, boolean bl, String string) {
        this.m = new double[256];
        this.h = new ajq_0();
        this.i = new aj8();
        this.j = new ajX();
        this.c = new ajd_0();
        this.n = new aji_0();
        this.t = new ajz_0();
        this.d = new ajS();
        this.s = world;
        this.k = bl;
        this.B = uv_2.r(aV8.s(world));
        this.v = new Random(l4);
        this.r = new amr_0(this.v, 16);
        this.q = new amr_0(this.v, 16);
        this.e = new amr_0(this.v, 8);
        this.o = new amu_0(this.v, 4);
        this.f = new amr_0(this.v, 10);
        this.u = new amr_0(this.v, 16);
        this.A = new amr_0(this.v, 8);
        this.b = new double[825];
        this.g = new float[25];
        int n = -2;
        int n2 = -2;
        while (true) {
            float f;
            this.g[n + 2 + (n2 + 2) * 5] = f = 10.0f / MathHelper.g((float)(n * n + n2 * n2) + 0.2f);
            ++n2;
        }
    }

    @Override
    public Chunk a(BlockPos blockPos) {
        return this.a(amv_2.j(blockPos) >> 4, amv_2.i(blockPos) >> 4);
    }

    public void a(int n, int n2, xb_1 xb_12, il_0[] il_0Array) {
        double d = 0.03125;
        this.m = t8_0.a(this.o, this.m, n * 16, n2 * 16, 16, 16, d * 2.0, d * 2.0, 1.0);
        int n3 = 0;
        int n4 = 0;
        while (true) {
            il_0 il_02 = il_0Array[n4 + n3 * 16];
            hw_0.a(il_02, this.s, this.v, xb_12, n * 16 + n3, n2 * 16 + n4, this.m[n4 + n3 * 16]);
            ++n4;
        }
    }

    @Override
    public void c() {
    }

    @Override
    public String d() {
        return ayt_0.a;
    }

    @Override
    public Chunk a(int n, int n2) {
        a5_0.a(this.v, (long)n * 341873128712L + (long)n2 * 132897987541L);
        xb_1 xb_12 = new xb_1();
        this.a(n, n2, xb_12);
        this.l = aqo_0.a(aV8.q(this.s), this.l, n * 16, n2 * 16, 16, 16);
        this.a(n, n2, xb_12, this.l);
        if (this.y.ak) {
            kh_2.a(this.h, this, this.s, n, n2, xb_12);
        }
        if (this.y.T) {
            kh_2.a(this.t, this, this.s, n, n2, xb_12);
        }
        if (this.y.aq && this.k) {
            abm_2.a(this.c, this, this.s, n, n2, xb_12);
        }
        if (this.y.am && this.k) {
            aNP.a(this.j, this, this.s, n, n2, xb_12);
        }
        if (this.y.I && this.k) {
            aK7.a(this.i, this, this.s, n, n2, xb_12);
        }
        if (this.y.A && this.k) {
            avo_1.a(this.n, this, this.s, n, n2, xb_12);
        }
        if (this.y.n && this.k) {
            oj_1.a(this.d, this, this.s, n, n2, xb_12);
        }
        Chunk chunk = new Chunk(this.s, xb_12, n, n2);
        byte[] byArray = aqp_2.i(chunk);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)this.l[i].s;
        }
        aqp_2.l(chunk);
        return chunk;
    }

    @Override
    public void a(Chunk chunk, int n, int n2) {
        if (this.y.aq && this.k) {
            abm_2.a(this.c, this, this.s, n, n2, null);
        }
        if (this.y.am && this.k) {
            aNP.a(this.j, this, this.s, n, n2, null);
        }
        if (this.y.I && this.k) {
            aK7.a(this.i, this, this.s, n, n2, null);
        }
        if (this.y.A && this.k) {
            avo_1.a(this.n, this, this.s, n, n2, null);
        }
        if (this.y.n && this.k) {
            oj_1.a(this.d, this, this.s, n, n2, null);
        }
    }

    @Override
    public int e() {
        return 0;
    }

    @Override
    public boolean a(em_1 em_12, Chunk chunk, int n, int n2) {
        boolean bl = false;
        if (this.y.n && this.k && aqp_2.e(chunk) < 3600L) {
            bl |= oj_1.a(this.d, this.s, this.v, new ChunkCoordIntPair(n, n2));
        }
        return bl;
    }

    @Override
    public BlockPos a(World world, String string, BlockPos blockPos) {
        return ayt_0.b.equals(string) && this.i != null ? aK7.a(this.i, world, blockPos) : null;
    }
}

