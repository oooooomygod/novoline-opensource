/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.Il
 */
public abstract class il_0 {
    protected static ac_2 A;
    public static il_0 L;
    protected static ac_2 au;
    public static Set<il_0> U;
    public static il_0 an;
    protected static ac_2 B;
    protected static ac_2 f;
    public static il_0 k;
    protected static ac_2 aA;
    public String Y;
    protected static amu_0 ak;
    public static il_0 ao;
    public static il_0 n;
    public static il_0 l;
    public static il_0 X;
    public int I;
    protected boolean e;
    public static il_0 as;
    protected static ac_2 Q;
    public cp_1 ai;
    public static il_0 al;
    public static il_0 N;
    public float C;
    public int ae;
    public static il_0 b;
    public int s;
    public static il_0 av;
    public static il_0 ac;
    protected List<cp_0> ar;
    public int ad = 5169201;
    protected boolean S;
    public static il_0 ag;
    public static Map<String, il_0> ab;
    public static il_0 Z;
    private static il_0[] m;
    public static il_0 aE;
    protected List<cp_0> P;
    public static il_0 aC;
    public static il_0 T;
    public static il_0 R;
    public IBlockState J;
    public static il_0 H;
    public static il_0 aD;
    public int w;
    protected static ac_2 ah;
    public float o;
    public IBlockState aB = m7_0.a(Blocks.grass);
    public static il_0 y;
    public static il_0 r;
    protected static amu_0 v;
    public static il_0 i;
    public float d;
    protected static ac_2 t;
    public static il_0 ay;
    public static il_0 V;
    private static Logger h;
    protected iu_1 E;
    public static il_0 ax;
    protected List<cp_0> x;
    public static il_0 M;
    protected List<cp_0> aj;
    public static il_0 c;
    public float a;
    public static il_0 u;
    public static il_0 af;
    public static il_0 am;
    protected ig_2 g;
    public static il_0 G;
    public static il_0 O;
    public static il_0 aw;
    protected static ac_2 z;
    protected id_1 p;
    protected static ac_2 W;
    public static il_0 K;
    protected static ac_2 aq;
    protected static ac_2 j;
    public static il_0 aa;
    protected static ac_2 az;
    protected static ib_1 F;
    public static il_0 D;
    public static il_0 ap;
    public static il_0 at;
    public static il_0 q;

    protected il_0 c() {
        this.S = false;
        return this;
    }

    public static il_0[] n() {
        return m;
    }

    public boolean j() {
        return !this.d() && this.S;
    }

    public il_0 b() {
        this.e = true;
        return this;
    }

    public float e() {
        return 0.1f;
    }

    public float m() {
        return this.o;
    }

    protected il_0 d(int n) {
        this.w = n;
        return this;
    }

    public void b(World world, Random random, xb_1 xb_12, int n, int n2, double d) {
        int n3 = aV8.c(world);
        IBlockState iBlockState = this.aB;
        IBlockState iBlockState2 = this.J;
        int n4 = -1;
        int n5 = (int)(d / 3.0 + 3.0 + a5_0.c(random) * 0.25);
        int n6 = n & 0xF;
        int n7 = n2 & 0xF;
        z6_0 z6_02 = new z6_0();
        int n8 = 255;
        while (true) {
            if (n8 <= a5_0.a(random, 5)) {
                c5.a(xb_12, n7, n8, n6, BlocksInvoker.t(Blocks.bedrock));
            } else {
                IBlockState iBlockState3 = c5.a(xb_12, n7, n8, n6);
                if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState3)) == Material.air) {
                    n4 = -1;
                } else if (BlockStateInvoker.getBlock(iBlockState3) == Blocks.stone) {
                    iBlockState = null;
                    iBlockState2 = BlocksInvoker.t(Blocks.stone);
                    if (n8 < n3 && BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState)) == Material.air) {
                        iBlockState = this.a(ain_1.a(z6_02, n, n8, n2)) < 0.15f ? BlocksInvoker.t(Blocks.I) : aBF.a(Blocks.water);
                    }
                    n4 = n5;
                    if (n8 >= n3 - 1) {
                        c5.a(xb_12, n7, n8, n6, iBlockState);
                    } else if (n8 < n3 - 7 - n5) {
                        iBlockState = null;
                        iBlockState2 = BlocksInvoker.t(Blocks.stone);
                        c5.a(xb_12, n7, n8, n6, BlocksInvoker.t(Blocks.gravel));
                    } else {
                        c5.a(xb_12, n7, n8, n6, iBlockState2);
                    }
                }
            }
            --n8;
        }
    }

    public int a(float f) {
        f /= 3.0f;
        f = MathHelper.b(f, -1.0f, 1.0f);
        return MathHelper.a(0.62222224f - f * 0.05f, 0.5f + f * 0.1f, 1.0f);
    }

    protected il_0 a(String string) {
        this.Y = string;
        return this;
    }

    public i7_0 a(Random random) {
        return new im_2(a4b.GRASS);
    }

    public int f() {
        return (int)(this.o * 65536.0f);
    }

    public boolean a() {
        return this.d();
    }

    public ii_1 b(Random random) {
        return a5_0.a(random, 10) == 0 ? this.g : this.p;
    }

    protected il_0 a(float f, float f2) {
        if (f > 0.1f && f < 0.2f) {
            throw new IllegalArgumentException(aRC.i);
        }
        this.C = f;
        this.o = f2;
        return this;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public ann_0 k() {
        return (double)this.C < 0.2 ? ann_0.COLD : ((double)this.C < 1.0 ? ann_0.MEDIUM : ann_0.WARM);
    }

    public boolean d() {
        return this.e;
    }

    public List<cp_0> a(a40 a402) {
        switch (fs_0.a[a402.ordinal()]) {
            case 1: {
                return this.ar;
            }
            case 2: {
                return this.P;
            }
            case 3: {
                return this.x;
            }
            case 4: {
                return this.aj;
            }
        }
        return asg_0.e();
    }

    protected il_0 c(int n) {
        return new I3(n, this);
    }

    protected il_0 a(ac_2 ac_22) {
        this.d = ac_22.a;
        this.a = ac_22.b;
        return this;
    }

    public boolean h() {
        return this.o > 0.85f;
    }

    protected il_0(int n) {
        this.J = BlocksInvoker.t(Blocks.dirt);
        this.d = il_0.aq.a;
        this.a = il_0.aq.b;
        this.C = 0.5f;
        this.o = 0.5f;
        this.ae = 0xFFFFFF;
        this.ar = my_0.c();
        this.P = my_0.c();
        this.x = my_0.c();
        this.aj = my_0.c();
        this.S = true;
        this.p = new id_1(false);
        this.g = new ig_2(false);
        this.E = new iu_1();
        this.s = n;
        il_0.m[n] = this;
        this.ai = this.g();
        ListInvoker.add(this.P, new cp_0(ne_1.class, 12, 4, 4));
        ListInvoker.add(this.P, new cp_0(ng_1.class, 10, 3, 3));
        ListInvoker.add(this.P, new cp_0(nh_1.class, 10, 4, 4));
        ListInvoker.add(this.P, new cp_0(nd_1.class, 10, 4, 4));
        ListInvoker.add(this.P, new cp_0(na_2.class, 8, 4, 4));
        ListInvoker.add(this.ar, new cp_0(n9_0.class, 100, 4, 4));
        ListInvoker.add(this.ar, new cp_0(n0_0.class, 100, 4, 4));
        ListInvoker.add(this.ar, new cp_0(nM.class, 100, 4, 4));
        ListInvoker.add(this.ar, new cp_0(nd_2.class, 100, 4, 4));
        ListInvoker.add(this.ar, new cp_0(ny_1.class, 100, 4, 4));
        ListInvoker.add(this.ar, new cp_0(nn_0.class, 10, 1, 4));
        ListInvoker.add(this.ar, new cp_0(nm_0.class, 5, 1, 1));
        ListInvoker.add(this.x, new cp_0(nJ.class, 10, 4, 4));
        ListInvoker.add(this.aj, new cp_0(n1_0.class, 10, 8, 8));
    }

    public float a(BlockPos blockPos) {
        if (amv_2.h(blockPos) > 64) {
            float f = (float)(t8_0.a(ak, (double)amv_2.j(blockPos) * 1.0 / 8.0, (double)amv_2.i(blockPos) * 1.0 / 8.0) * 4.0);
            return this.C - (f + (float)amv_2.h(blockPos) - 64.0f) * 0.05f / 30.0f;
        }
        return this.C;
    }

    public int b(BlockPos blockPos) {
        double d = MathHelper.b(this.a(blockPos), 0.0f, 1.0f);
        double d2 = MathHelper.b(this.m(), 0.0f, 1.0f);
        return zm_1.a(d, d2);
    }

    public void a(World world, Random random, BlockPos blockPos) {
        arn_2.a(this.ai, world, random, this, blockPos);
    }

    protected il_0 b(int n) {
        this.a(n, false);
        return this;
    }

    protected il_0 a(int n, boolean bl) {
        this.I = n;
        this.w = (n & 0xFEFEFE) >> 1;
        return this;
    }

    protected cp_1 g() {
        return new cp_1();
    }

    public static il_0 a(int n, il_0 il_02) {
        if (n <= m.length) {
            il_0 cfr_ignored_0 = m[n];
            return il_02;
        }
        LoggerInvoker.b(h, aRC.x, new Object[]{P8.d(n)});
        return u;
    }

    public static il_0 e(int n) {
        return il_0.a(n, null);
    }

    public boolean a(il_0 il_02) {
        return il_02 == this || this.l() == il_02.l();
    }

    static {
        h = LogManagerInvoker.c();
        aq = new ac_2(0.1f, 0.2f);
        t = new ac_2(-0.5f, 0.0f);
        B = new ac_2(-1.0f, 0.1f);
        j = new ac_2(-1.8f, 0.1f);
        ah = new ac_2(0.125f, 0.05f);
        Q = new ac_2(0.2f, 0.2f);
        A = new ac_2(0.45f, 0.3f);
        f = new ac_2(1.5f, 0.025f);
        aA = new ac_2(1.0f, 0.5f);
        W = new ac_2(0.0f, 0.025f);
        az = new ac_2(0.1f, 0.8f);
        z = new ac_2(0.2f, 0.3f);
        au = new ac_2(-0.2f, 0.1f);
        m = new il_0[256];
        U = axe_2.a();
        ab = MapsInvoker.a();
        u = new II(0).b(112).a(aRC.Q).a(B);
        G = new ig_0(1).b(9286496).a(aRC.M);
        V = new I6(2).b(16421912).a(aRC.j).c().a(2.0f, 0.0f).a(ah);
        L = new iv_0(3, false).b(0x606060).a(aRC.f).a(aA).a(0.2f, 0.3f);
        H = new ip_0(4, 0).b(353825).a(aRC.h);
        ag = new IL(5, 0).b(747097).a(aRC.g).a(5159473).a(0.25f, 0.8f).a(Q);
        aw = new I2(6).b(522674).a(aRC.q).a(9154376).a(au).a(0.8f, 0.9f);
        am = new ic_0(7).b(255).a(aRC.H).a(t);
        q = new IW(8).b(0xFF0000).a(aRC.I).c().a(2.0f, 0.0f);
        l = new Ij(9).b(0x8080FF).a(aRC.r).c();
        aa = new II(10).b(0x9090A0).a(aRC.o).b().a(B).a(0.0f, 0.5f);
        an = new ic_0(11).b(0xA0A0FF).a(aRC.w).b().a(t).a(0.0f, 0.5f);
        n = new io_0(12, false).b(0xFFFFFF).a(aRC.T).b().a(0.0f, 0.5f).a(ah);
        X = new io_0(13, false).b(0xA0A0A0).a(aRC.k).b().a(A).a(0.0f, 0.5f);
        y = new iu_0(14).b(0xFF00FF).a(aRC.G).a(0.9f, 1.0f).a(z);
        O = new iu_0(15).b(0xA000FF).a(aRC.F).a(0.9f, 1.0f).a(W);
        aD = new iy_0(16).b(16440917).a(aRC.O).a(0.8f, 0.4f).a(W);
        c = new I6(17).b(13786898).a(aRC.d).c().a(2.0f, 0.0f).a(A);
        R = new ip_0(18, 0).b(2250012).a(aRC.s).a(A);
        ax = new IL(19, 0).b(1456435).a(aRC.e).a(5159473).a(0.25f, 0.8f).a(A);
        K = new iv_0(20, true).b(7501978).a(aRC.p).a(aBz.a(aA)).a(0.2f, 0.3f);
        at = new IV(21, false).b(5470985).a(aRC.K).a(5470985).a(0.95f, 0.9f);
        al = new IV(22, false).b(2900485).a(aRC.u).a(5470985).a(0.95f, 0.9f).a(A);
        D = new IV(23, true).b(6458135).a(aRC.l).a(5470985).a(0.95f, 0.8f);
        r = new II(24).b(48).a(aRC.A).a(j);
        af = new ik_0(25).b(10658436).a(aRC.t).a(0.2f, 0.3f).a(az);
        k = new iy_0(26).b(16445632).a(aRC.y).a(0.05f, 0.3f).a(W).b();
        b = new ip_0(27, 2).a(aRC.C).b(3175492);
        ao = new ip_0(28, 2).a(aRC.z).b(2055986).a(A);
        T = new ip_0(29, 3).b(4215066).a(aRC.E);
        N = new IL(30, 0).b(3233098).a(aRC.c).a(5159473).b().a(-0.5f, 0.4f).a(Q).d(0xFFFFFF);
        M = new IL(31, 0).b(2375478).a(aRC.J).a(5159473).b().a(-0.5f, 0.4f).a(A).d(0xFFFFFF);
        i = new IL(32, 1).b(5858897).a(aRC.S).a(5159473).a(0.3f, 0.8f).a(Q);
        ay = new IL(33, 1).b(4542270).a(aRC.a).a(5159473).a(0.3f, 0.8f).a(A);
        Z = new iv_0(34, true).b(0x507050).a(aRC.L).a(aA).a(0.2f, 0.3f);
        ac = new in_0(35).b(12431967).a(aRC.n).a(1.2f, 0.0f).c().a(ah);
        aC = new in_0(36).b(10984804).a(aRC.v).a(1.0f, 0.0f).c().a(f);
        av = new ir_0(37, false, false).b(14238997).a(aRC.N);
        aE = new ir_0(38, false, true).b(11573093).a(aRC.R).a(f);
        ap = new ir_0(39, false, false).b(13274213).a(aRC.D).a(f);
        as = u;
        G.i();
        V.i();
        H.i();
        ag.i();
        aw.i();
        n.i();
        at.i();
        D.i();
        N.i();
        ac.i();
        aC.i();
        av.i();
        aE.i();
        ap.i();
        b.i();
        ao.i();
        T.i();
        i.i();
        L.i();
        Z.i();
        i.c(il_0.ay.s + 128).a(aRC.P);
        for (il_0 il_02 : m) {
            if (MapInvoker.b(ab, il_02.Y)) {
                throw new Error(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), aRC.B), il_02.Y), aRC.m), ((il_0)MapInvoker.c(il_0.ab, (Object)il_02.Y)).s), aRC.b), il_02.s).toString());
            }
            MapInvoker.c(ab, il_02.Y, il_02);
            if (il_02.s >= 128) continue;
            aS0.b(U, il_02);
        }
        aS0.a(U, q);
        aS0.a(U, l);
        aS0.a(U, aa);
        aS0.a(U, K);
        ak = new amu_0(new Random(1234L), 1);
        v = new amu_0(new Random(2345L), 1);
        F = new ib_1();
    }

    protected il_0 a(int n) {
        this.ad = n;
        return this;
    }

    public Class<? extends il_0> l() {
        return this.getClass();
    }

    public int c(BlockPos blockPos) {
        double d = MathHelper.b(this.a(blockPos), 0.0f, 1.0f);
        double d2 = MathHelper.b(this.m(), 0.0f, 1.0f);
        return zl_1.a(d, d2);
    }

    public dq_1 a(Random random, BlockPos blockPos) {
        return a5_0.a(random, 3) > 0 ? dq_1.DANDELION : dq_1.POPPY;
    }

    public void a(World world, Random random, xb_1 xb_12, int n, int n2, double d) {
        this.b(world, random, xb_12, n, n2, d);
    }

    protected il_0 i() {
        return this.c(this.s + 128);
    }
}

