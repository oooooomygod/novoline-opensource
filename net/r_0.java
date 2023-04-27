/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.visual.ClickGui;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.r
 */
public class r_0 {
    private aq3_0 j;
    private double e;
    private boolean o;
    private double g;
    private static int b;
    private boolean h;
    private double a;
    private double f;
    private int c;
    private double i;
    private double d = 0.0;
    private double n;
    private AbstractModule m;
    private static Color l;
    private List<JF> k = new CopyOnWriteArrayList<JF>();

    public double h() {
        return this.c() - a13.f(this.j);
    }

    private static boolean lambda$mouseClicked$3(JF jF) {
        r_0.g();
        return ahg_0.B(m5_0.a(jF)) == null || auk_2.a((Boolean)JM.a(ahg_0.B(m5_0.a(jF))));
    }

    public r_0(aq3_0 aq3_02, AbstractModule abstractModule) {
        this.j = aq3_02;
        this.m = abstractModule;
        this.e = a13.g(this.j) + (double)anf_2.a(anf_2.c(), 0, 130);
        this.f = this.c() - a13.f(this.j) + (double)anf_2.a(anf_2.c(), 0, 20);
        List list = ManagerInvoker.a(abstractModule);
        int n = r_0.k();
        Iterator iterator = ListInvoker.iterator(list);
        if (dz_0.c(iterator)) {
            Setting setting = (Setting)dz_0.b(iterator);
            ListInvoker.add(this.k, new JF(setting, this));
        }
        if (ListInvoker.b() != null) {
            r_0.b(++n);
        }
    }

    public List<JF> e() {
        return (List)aMF.a(aMF.b(ListInvoker.stream(this.k), r_0::lambda$getSettings$6), aB0.a());
    }

    private long d() {
        r_0.g();
        long l4 = 500L;
        Iterator iterator = ListInvoker.iterator(a13.h(this.j));
        if (dz_0.c(iterator)) {
            r_0 r_02 = (r_0)dz_0.b(iterator);
            if (r_02 == this) {
                // empty if block
            }
            l4 += 500L;
        }
        return l4;
    }

    public void b() {
        Iterator iterator;
        r_0.k();
        if (this.o && dz_0.c(iterator = ListInvoker.iterator((List)aMF.a(aMF.b(ListInvoker.stream(this.k), r_0::lambda$mouseReleased$5), aB0.a())))) {
            JF jF = (JF)dz_0.b(iterator);
            jF.d();
        }
    }

    private static void lambda$mouseClicked$2(r_0 r_02) {
        r_0.g();
        if (r_02.o) {
            r_02.o = false;
        }
    }

    public static int g() {
        r_0.k();
        return 80;
    }

    public boolean a(int n, int n2) {
        r_0.k();
        return (double)n >= a13.g(this.j) && (double)n <= a13.g(this.j) + 125.0 && (double)n2 >= this.c() - a13.f(this.j) + 1.0 && (double)n2 <= this.c() - a13.f(this.j) + 19.0;
    }

    public boolean a() {
        return this.o;
    }

    private double c() {
        double d = this.j.o() + 20.0;
        r_0.g();
        Iterator iterator = ListInvoker.iterator(a13.h(this.j));
        if (dz_0.c(iterator)) {
            r_0 r_02 = (r_0)dz_0.b(iterator);
            if (r_02 == this) {
                // empty if block
            }
            d += 20.0 + r_02.a;
        }
        return d;
    }

    static {
        l = new Color(20, 20, 20);
        r_0.b(59);
    }

    public double f() {
        return this.a;
    }

    public static int k() {
        return b;
    }

    private static boolean lambda$mouseReleased$5(JF jF) {
        r_0.k();
        return ahg_0.B(m5_0.a(jF)) == null || auk_2.a((Boolean)JM.a(ahg_0.B(m5_0.a(jF))));
    }

    private static boolean lambda$drawScreen$1(JF jF) {
        r_0.k();
        return ahg_0.B(m5_0.a(jF)) == null || auk_2.a((Boolean)JM.a(ahg_0.B(m5_0.a(jF))));
    }

    public void a(int n, int n2, int n3) {
        Iterator iterator;
        block7: {
            block6: {
                r_0.g();
                if (n3 != 0) break block6;
                if (!this.a(n, n2)) break block7;
                wc_1.k(this.m);
                this.e = a13.g(this.j) + (double)anf_2.a(anf_2.c(), 0, 130);
                this.f = this.c() - a13.f(this.j) + (double)anf_2.a(anf_2.c(), 0, 20);
            }
            if (this.a(n, n2) && n3 == 1) {
                if (!this.o && auk_2.a((Boolean)Ba.b(z4_0.c((ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI))))) {
                    ListInvoker.forEach(a13.h(this.j), r_0::lambda$mouseClicked$2);
                }
                abl_1.b(wc_1.l(this.m));
                boolean bl = this.o = !this.o;
            }
        }
        if (this.o && dz_0.c(iterator = ListInvoker.iterator((List)aMF.a(aMF.b(ListInvoker.stream(this.k), r_0::lambda$mouseClicked$3), aB0.a())))) {
            JF jF = (JF)dz_0.b(iterator);
            jF.i(n, n2, n3);
        }
    }

    private static boolean lambda$getSettings$6(JF jF) {
        r_0.k();
        return ahg_0.B(m5_0.a(jF)) == null || auk_2.a((Boolean)JM.a(ahg_0.B(m5_0.a(jF))));
    }

    public aq3_0 j() {
        return this.j;
    }

    public static void b(int n) {
        b = n;
    }

    public void a(ClickGui clickGui, int n, int n2, float f, boolean bl, int n3) {
        r_0.g();
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aWL.c) && _j_0.a(KN.d(NovolineInvoker.e(NovolineInvoker.getInstance()))) != 1.0 && wc_1.g(this.m)) {
            a1V.b(a13.g(this.j), this.i, a13.g(this.j) + 130.0, this.i + 20.0, n3);
        }
        GL11.glEnable((int)3089);
        this.i = this.c() - a13.f(this.j);
        ahm_0.a((float)a13.g(this.j), (float)this.i, (float)(a13.g(this.j) + 130.0), (float)(this.i + 20.0));
        if (wc_1.g(this.m) && this.g < 125.0) {
            this.g = abl_1.a(wc_1.i(this.m), 300L, 125.0);
            ListInvoker.b(new ListInvoker[2]);
        }
        if (!wc_1.g(this.m) && this.g > 0.0) {
            this.g = 125.0 - abl_1.a(wc_1.i(this.m), 300L, 125.0);
        }
        if (bl && this.d < 3.0) {
            this.d += (3.0 - this.d) * 0.05;
        }
        if (!bl && this.d > 0.0) {
            this.d += (0.0 - this.d) * 0.05;
        }
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aWL.b) && _j_0.a(KN.d(NovolineInvoker.e(NovolineInvoker.getInstance()))) == 1.0) {
            a1V.a((float)(a13.g(this.j) + 60.0), (float)(this.i + 20.0), (float)this.g, n3);
        }
        GL11.glDisable((int)3089);
        int n4 = StringPropertyInvoker.isMode(z4_0.o(clickGui), aWL.a) ? (wc_1.g(this.m) ? n3 : aol_1.b(Color.WHITE)) : aol_1.b(Color.WHITE);
        KN.b(a13.d(this.j), adj_1.a(ng_0.a, 22), wc_1.a(this.m), a13.g(this.j) + 3.0, this.i + 6.5, n4, true);
        if (ListInvoker.size(ManagerInvoker.a(this.m)) > 1) {
            if (this.a(n, n2)) {
                if (this.c < 255 && !this.h) {
                    this.c = MathHelper.a(this.c + 3, 0, 255);
                }
                this.h = true;
                if (this.c > 0 && this.h) {
                    this.c = MathHelper.a(this.c - 3, 0, 255);
                }
                this.h = false;
            }
            long l4 = MCInvoker.a();
            float f2 = 1.0f - MathHelper.d(MathHelper.h((double)((float)(l4 - this.d()) % 12000.0f / 12000.0f) * Math.PI * 4.0));
            MathHelper.a((int)(f2 * 255.0f), 20, 240);
            a13.a(this.j, a13.g(this.j) + 110.0, this.i + 8.0, 3.5, abl_1.a(wc_1.l(this.m), 100L, 1.0), this.o);
        }
        if (this.o || this.a != 0.0) {
            int n5 = 0;
            Iterator iterator = ListInvoker.iterator((List)aMF.a(aMF.b(ListInvoker.stream(this.k), r_0::lambda$drawScreen$0), aB0.a()));
            if (dz_0.c(iterator)) {
                JF jF = (JF)dz_0.b(iterator);
                n5 += m5_0.c(jF);
            }
            this.a = n5;
            iterator = ListInvoker.iterator((List)aMF.a(aMF.b(ListInvoker.stream(this.k), r_0::lambda$drawScreen$1), aB0.a()));
            if (dz_0.c(iterator)) {
                JF jF = (JF)dz_0.b(iterator);
                m5_0.a(jF, clickGui, n, n2, f, n3);
            }
        }
        if (!this.o && this.a > 0.0) {
            this.a = 0.0;
        }
    }

    public void a(boolean bl) {
        this.o = bl;
    }

    public void a(char c, int n) {
        Iterator iterator;
        r_0.k();
        if (this.o && dz_0.c(iterator = ListInvoker.iterator((List)aMF.a(aMF.b(ListInvoker.stream(this.k), r_0::lambda$keyTyped$4), aB0.a())))) {
            JF jF = (JF)dz_0.b(iterator);
            jF.a(c, n);
        }
    }

    public AbstractModule i() {
        return this.m;
    }

    private static boolean lambda$drawScreen$0(JF jF) {
        r_0.g();
        return ahg_0.B(m5_0.a(jF)) == null || auk_2.a((Boolean)JM.a(ahg_0.B(m5_0.a(jF))));
    }

    private static boolean lambda$keyTyped$4(JF jF) {
        r_0.g();
        return ahg_0.B(m5_0.a(jF)) == null || auk_2.a((Boolean)JM.a(ahg_0.B(m5_0.a(jF))));
    }
}

