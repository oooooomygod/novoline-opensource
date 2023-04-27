/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.crash.CrashReportCategory;
import deobf.EnumDifficulty;
import net.minecraft.world.GameType;
import deobf.NBTBase;
import deobf.TimerUtil;
import net.minecraft.world.WorldSettings;

public class WorldInfo {
    private boolean s;
    private long J;
    private double b;
    private boolean t;
    private TimerUtil H;
    private int o;
    private double C;
    private NBTTagCompound c;
    private EnumDifficulty w;
    private int j;
    private double l;
    private int d;
    private String I;
    private String m;
    private double e;
    private long a;
    private double K;
    private WorldType h = WorldType.n;
    private boolean G;
    private int n;
    private int p;
    private boolean z;
    private boolean B;
    private long D;
    private GameType E;
    private boolean q;
    private long y;
    private double i;
    private boolean r;
    public static EnumDifficulty A = EnumDifficulty.NORMAL;
    private w__0 f;
    private int x;
    private long k;
    private long L;
    private int g;
    private int v;
    private int u;
    private int F;

    public void c(double d) {
        this.b = d;
    }

    public void a(WorldSettings worldSettings) {
        this.k = worldSettings.a();
        this.E = worldSettings.e();
        this.s = worldSettings.i();
        this.B = add_1.e(worldSettings);
        this.h = worldSettings.c();
        this.m = worldSettings.h();
        this.q = worldSettings.f();
    }

    public boolean v() {
        return this.z;
    }

    public void g(int n) {
        this.u = n;
    }

    public void f(int n) {
        this.j = n;
    }

    public boolean E() {
        return this.B;
    }

    public boolean h() {
        return this.t;
    }

    public WorldInfo(WorldInfo worldInfo) {
        this.m = abl_0.d;
        this.e = 0.0;
        this.K = 0.0;
        this.C = 6.0E7;
        this.i = 0.0;
        this.b = 5.0;
        this.l = 0.2;
        this.L = 0L;
        this.o = 5;
        this.v = 15;
        this.f = new w__0();
        this.H = new TimerUtil();
        this.k = worldInfo.k;
        this.h = worldInfo.h;
        this.m = worldInfo.m;
        this.E = worldInfo.E;
        this.s = worldInfo.s;
        this.p = worldInfo.p;
        this.g = worldInfo.g;
        this.n = worldInfo.n;
        this.D = worldInfo.D;
        this.a = worldInfo.a;
        this.y = worldInfo.y;
        this.J = worldInfo.J;
        this.c = worldInfo.c;
        this.x = worldInfo.x;
        this.I = worldInfo.I;
        this.u = worldInfo.u;
        this.d = worldInfo.d;
        this.G = worldInfo.G;
        this.j = worldInfo.j;
        this.r = worldInfo.r;
        this.B = worldInfo.B;
        this.q = worldInfo.q;
        this.t = worldInfo.t;
        this.f = worldInfo.f;
        this.w = worldInfo.w;
        this.z = worldInfo.z;
        this.e = worldInfo.e;
        this.K = worldInfo.K;
        this.C = worldInfo.C;
        this.L = worldInfo.L;
        this.i = worldInfo.i;
        this.b = worldInfo.b;
        this.l = worldInfo.l;
        this.v = worldInfo.v;
        this.o = worldInfo.o;
    }

    public int a() {
        return this.p;
    }

    public long o() {
        return this.y;
    }

    public void i(int n) {
        this.n = n;
    }

    public void d(boolean bl) {
        this.r = bl;
    }

    public int q() {
        return this.d;
    }

    public void a(CrashReportCategory crashReportCategory) {
        CrashReportCategoryInvoker.a(crashReportCategory, abl_0.k, this::lambda$addToCrashReport$0);
        CrashReportCategoryInvoker.a(crashReportCategory, abl_0.aY, this::lambda$addToCrashReport$1);
        CrashReportCategoryInvoker.a(crashReportCategory, abl_0.aD, this::lambda$addToCrashReport$2);
        CrashReportCategoryInvoker.a(crashReportCategory, abl_0.am, this::lambda$addToCrashReport$3);
        CrashReportCategoryInvoker.a(crashReportCategory, abl_0.ah, this::lambda$addToCrashReport$4);
        CrashReportCategoryInvoker.a(crashReportCategory, abl_0.P, this::lambda$addToCrashReport$5);
        CrashReportCategoryInvoker.a(crashReportCategory, abl_0.ae, this::lambda$addToCrashReport$6);
        CrashReportCategoryInvoker.a(crashReportCategory, abl_0.a9, this::lambda$addToCrashReport$7);
        CrashReportCategoryInvoker.a(crashReportCategory, abl_0.A, this::lambda$addToCrashReport$8);
    }

    public double B() {
        return this.l;
    }

    private String lambda$addToCrashReport$7() throws Exception {
        return StringInvoker.a(abl_0.ak, new Object[]{P8.d(this.d), auk_2.b(this.G), P8.d(this.j), auk_2.b(this.r)});
    }

    public void c(int n) {
        this.d = n;
    }

    public void e(boolean bl) {
        this.t = bl;
    }

    public void f(boolean bl) {
        this.s = bl;
    }

    private String lambda$addToCrashReport$3() throws Exception {
        return CrashReportCategoryInvoker.a(this.p, this.g, this.n);
    }

    public double b() {
        return this.C;
    }

    public int r() {
        return this.o;
    }

    public int A() {
        return this.n;
    }

    public void b(long l4) {
        this.L = l4;
    }

    public void b(boolean bl) {
        this.B = bl;
    }

    public double u() {
        return this.i;
    }

    public long e() {
        return this.a;
    }

    public double f() {
        return this.b;
    }

    private String lambda$addToCrashReport$5() throws Exception {
        return StringInvoker.a(this.x);
    }

    public void h(int n) {
        this.o = n;
    }

    public void d(double d) {
        this.C = d;
    }

    public double k() {
        return this.e;
    }

    public boolean x() {
        return this.q;
    }

    public void g(boolean bl) {
        this.q = bl;
    }

    public GameType s() {
        return this.E;
    }

    public int C() {
        return this.v;
    }

    public WorldInfo(WorldSettings worldSettings, String string) {
        this.m = abl_0.aV;
        this.e = 0.0;
        this.K = 0.0;
        this.C = 6.0E7;
        this.i = 0.0;
        this.b = 5.0;
        this.l = 0.2;
        this.L = 0L;
        this.o = 5;
        this.v = 15;
        this.f = new w__0();
        this.H = new TimerUtil();
        this.a(worldSettings);
        this.I = string;
        this.w = A;
        this.t = false;
    }

    private String lambda$addToCrashReport$2() throws Exception {
        return this.m;
    }

    private String lambda$addToCrashReport$1() throws Exception {
        return StringInvoker.a(abl_0.a3, new Object[]{P8.d(fk_0.b(this.h)), fk_0.f(this.h), P8.d(fk_0.g(this.h)), auk_2.b(this.s)});
    }

    public void f(double d) {
        this.l = d;
    }

    public void a(double d) {
        this.e = d;
    }

    public void e(int n) {
        this.v = n;
    }

    public void a(boolean bl) {
        this.z = bl;
    }

    public int y() {
        return this.F;
    }

    public WorldInfo(NBTTagCompound nBTTagCompound) {
        this.m = abl_0.s;
        this.e = 0.0;
        this.K = 0.0;
        this.C = 6.0E7;
        this.i = 0.0;
        this.b = 5.0;
        this.l = 0.2;
        this.L = 0L;
        this.o = 5;
        this.v = 15;
        this.f = new w__0();
        this.H = new TimerUtil();
        this.k = tn_0.f(nBTTagCompound, abl_0.j);
        if (tn_0.a(nBTTagCompound, abl_0.ad, 8)) {
            String string = tn_0.m(nBTTagCompound, abl_0.aE);
            this.h = fk_0.a(string);
            if (this.h == null) {
                this.h = WorldType.n;
            } else if (fk_0.h(this.h)) {
                int n = 0;
                if (tn_0.a(nBTTagCompound, abl_0.c, 99)) {
                    n = tn_0.g(nBTTagCompound, abl_0.aO);
                }
                this.h = fk_0.a(this.h, n);
            }
            if (tn_0.a(nBTTagCompound, abl_0.aK, 8)) {
                this.m = tn_0.m(nBTTagCompound, abl_0.g);
            }
        }
        this.E = ar3_0.a(tn_0.g(nBTTagCompound, abl_0.aa));
        this.s = tn_0.a(nBTTagCompound, abl_0.O, 99) ? tn_0.c(nBTTagCompound, abl_0.ax) : true;
        this.p = tn_0.g(nBTTagCompound, abl_0.Y);
        this.g = tn_0.g(nBTTagCompound, abl_0.ar);
        this.n = tn_0.g(nBTTagCompound, abl_0.aq);
        this.D = tn_0.f(nBTTagCompound, abl_0.I);
        this.a = tn_0.a(nBTTagCompound, abl_0.ac, 99) ? tn_0.f(nBTTagCompound, abl_0.ao) : this.D;
        this.y = tn_0.f(nBTTagCompound, abl_0.a0);
        this.J = tn_0.f(nBTTagCompound, abl_0.al);
        this.I = tn_0.m(nBTTagCompound, abl_0.aB);
        this.u = tn_0.g(nBTTagCompound, abl_0.ab);
        this.F = tn_0.g(nBTTagCompound, abl_0.W);
        this.d = tn_0.g(nBTTagCompound, abl_0.Z);
        this.G = tn_0.c(nBTTagCompound, abl_0.aG);
        this.j = tn_0.g(nBTTagCompound, abl_0.u);
        this.r = tn_0.c(nBTTagCompound, abl_0.as);
        this.B = tn_0.c(nBTTagCompound, abl_0.z);
        this.t = tn_0.a(nBTTagCompound, abl_0.C, 99) ? tn_0.c(nBTTagCompound, abl_0.J) : true;
        if (tn_0.a(nBTTagCompound, abl_0.F, 99)) {
            this.q = tn_0.c(nBTTagCompound, abl_0.an);
        } else {
            boolean bl = this.q = this.E == GameType.CREATIVE;
        }
        if (tn_0.a(nBTTagCompound, abl_0.a1, 10)) {
            this.c = tn_0.d(nBTTagCompound, abl_0.aj);
            this.x = tn_0.g(this.c, abl_0.aH);
        }
        if (tn_0.a(nBTTagCompound, abl_0.aZ, 10)) {
            J9.a(this.f, tn_0.d(nBTTagCompound, abl_0.av));
        }
        if (tn_0.a(nBTTagCompound, abl_0.a8, 99)) {
            this.w = aYj.a(tn_0.e(nBTTagCompound, abl_0.aS));
        }
        if (tn_0.a(nBTTagCompound, abl_0.e, 1)) {
            this.z = tn_0.c(nBTTagCompound, abl_0.ai);
        }
        if (tn_0.a(nBTTagCompound, abl_0.aR, 99)) {
            this.e = tn_0.n(nBTTagCompound, abl_0.f);
        }
        if (tn_0.a(nBTTagCompound, abl_0.l, 99)) {
            this.K = tn_0.n(nBTTagCompound, abl_0.aW);
        }
        if (tn_0.a(nBTTagCompound, abl_0.a5, 99)) {
            this.C = tn_0.n(nBTTagCompound, abl_0.aP);
        }
        if (tn_0.a(nBTTagCompound, abl_0.au, 99)) {
            this.L = tn_0.f(nBTTagCompound, abl_0.aL);
        }
        if (tn_0.a(nBTTagCompound, abl_0.G, 99)) {
            this.i = tn_0.n(nBTTagCompound, abl_0.E);
        }
        if (tn_0.a(nBTTagCompound, abl_0.aT, 99)) {
            this.b = tn_0.n(nBTTagCompound, abl_0.a7);
        }
        if (tn_0.a(nBTTagCompound, abl_0.x, 99)) {
            this.l = tn_0.n(nBTTagCompound, abl_0.R);
        }
        if (tn_0.a(nBTTagCompound, abl_0.t, 99)) {
            this.o = tn_0.g(nBTTagCompound, abl_0.H);
        }
        if (tn_0.a(nBTTagCompound, abl_0.o, 99)) {
            this.v = tn_0.g(nBTTagCompound, abl_0.w);
        }
    }

    protected WorldInfo() {
        this.m = abl_0.r;
        this.e = 0.0;
        this.K = 0.0;
        this.C = 6.0E7;
        this.i = 0.0;
        this.b = 5.0;
        this.l = 0.2;
        this.L = 0L;
        this.o = 5;
        this.v = 15;
        this.f = new w__0();
        this.H = new TimerUtil();
    }

    public double D() {
        return this.K;
    }

    public NBTTagCompound i() {
        return this.c;
    }

    public long m() {
        return this.D;
    }

    private String lambda$addToCrashReport$0() throws Exception {
        return StringInvoker.a(this.g());
    }

    public String l() {
        return this.I;
    }

    public WorldType j() {
        return this.h;
    }

    public void a(EnumDifficulty enumDifficulty) {
        this.w = enumDifficulty;
    }

    private String lambda$addToCrashReport$4() throws Exception {
        return StringInvoker.a(abl_0.aI, new Object[]{lx_2.b(this.D), lx_2.b(this.a)});
    }

    public void a(WorldType worldType) {
        this.h = worldType;
    }

    public long c() {
        return this.L;
    }

    public void a(BlockPos blockPos) {
        this.p = amv_2.j(blockPos);
        this.g = amv_2.h(blockPos);
        this.n = amv_2.i(blockPos);
    }

    public int I() {
        return this.j;
    }

    public String H() {
        return this.m;
    }

    public long d() {
        return this.J;
    }

    public void e(double d) {
        this.i = d;
    }

    public void a(GameType gameType) {
        this.E = gameType;
    }

    public void a(String string) {
        this.I = string;
    }

    public void c(long l4) {
        this.a = l4;
    }

    public int F() {
        return this.u;
    }

    public boolean t() {
        return this.G;
    }

    public boolean J() {
        return this.r;
    }

    private void a(NBTTagCompound nBTTagCompound, NBTTagCompound nBTTagCompound2) {
        tn_0.a(nBTTagCompound, abl_0.aM, this.k);
        tn_0.a(nBTTagCompound, abl_0.af, fk_0.f(this.h));
        tn_0.b(nBTTagCompound, abl_0.ag, fk_0.g(this.h));
        tn_0.a(nBTTagCompound, abl_0.p, this.m);
        tn_0.b(nBTTagCompound, abl_0.a2, ar3_0.a(this.E));
        tn_0.a(nBTTagCompound, abl_0.v, this.s);
        tn_0.b(nBTTagCompound, abl_0.aw, this.p);
        tn_0.b(nBTTagCompound, abl_0.aN, this.g);
        tn_0.b(nBTTagCompound, abl_0.aC, this.n);
        tn_0.a(nBTTagCompound, abl_0.X, this.D);
        tn_0.a(nBTTagCompound, abl_0.aJ, this.a);
        tn_0.a(nBTTagCompound, abl_0.y, this.J);
        tn_0.a(nBTTagCompound, abl_0.D, ServerInvoker.c());
        tn_0.a(nBTTagCompound, abl_0.T, this.I);
        tn_0.b(nBTTagCompound, abl_0.B, this.u);
        tn_0.b(nBTTagCompound, abl_0.aQ, this.F);
        tn_0.b(nBTTagCompound, abl_0.M, this.d);
        tn_0.a(nBTTagCompound, abl_0.aU, this.G);
        tn_0.b(nBTTagCompound, abl_0.U, this.j);
        tn_0.a(nBTTagCompound, abl_0.az, this.r);
        tn_0.a(nBTTagCompound, abl_0.m, this.B);
        tn_0.a(nBTTagCompound, abl_0.S, this.q);
        tn_0.a(nBTTagCompound, abl_0.a4, this.t);
        tn_0.a(nBTTagCompound, abl_0.b, this.e);
        tn_0.a(nBTTagCompound, abl_0.V, this.K);
        tn_0.a(nBTTagCompound, abl_0.ap, this.C);
        tn_0.a(nBTTagCompound, abl_0.a6, this.L);
        tn_0.a(nBTTagCompound, abl_0.n, this.b);
        tn_0.a(nBTTagCompound, abl_0.aX, this.l);
        tn_0.a(nBTTagCompound, abl_0.aF, this.i);
        tn_0.a(nBTTagCompound, abl_0.q, (double)this.o);
        tn_0.a(nBTTagCompound, abl_0.i, (double)this.v);
        if (this.w != null) {
            tn_0.a(nBTTagCompound, abl_0.K, (byte)aYj.a(this.w));
        }
        tn_0.a(nBTTagCompound, abl_0.a, this.z);
        tn_0.a(nBTTagCompound, abl_0.L, (NBTBase)J9.a(this.f));
        tn_0.a(nBTTagCompound, abl_0.ay, (NBTBase)nBTTagCompound2);
    }

    public void d(int n) {
        this.p = n;
    }

    public void a(long l4) {
        this.D = l4;
    }

    public void c(boolean bl) {
        this.G = bl;
    }

    public long g() {
        return this.k;
    }

    public void b(int n) {
        this.F = n;
    }

    public w__0 p() {
        return this.f;
    }

    public NBTTagCompound a(NBTTagCompound nBTTagCompound) {
        NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
        this.a(nBTTagCompound2, nBTTagCompound);
        return nBTTagCompound2;
    }

    public EnumDifficulty G() {
        return this.w;
    }

    public void a(int n) {
        this.g = n;
    }

    public NBTTagCompound w() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        this.a(nBTTagCompound, this.c);
        return nBTTagCompound;
    }

    public int z() {
        return this.g;
    }

    public void b(double d) {
        this.K = d;
    }

    private String lambda$addToCrashReport$6() throws Exception {
        String string = abl_0.Q;
        try {
            switch (this.u) {
                case 19132: {
                    string = abl_0.h;
                    break;
                }
                case 19133: {
                    string = abl_0.at;
                }
            }
        }
        catch (Throwable throwable) {}
        return StringInvoker.a(abl_0.N, new Object[]{P8.d(this.u), string});
    }

    public boolean n() {
        return this.s;
    }

    private String lambda$addToCrashReport$8() throws Exception {
        return StringInvoker.a(abl_0.aA, new Object[]{ar3_0.b(this.E), P8.d(ar3_0.a(this.E)), auk_2.b(this.B), auk_2.b(this.q)});
    }
}

