/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.gui.screen.ClickGUI;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.utils.Timer;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.modules.visual.ClickGui;
import cc.novoline.modules.EnumModuleType;
import deobf.MCInvoker;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.aq3
 */
public class aq3_0 {
    public double n;
    private double u;
    private static Color p = new Color(20, 20, 20);
    private List<r_0> o;
    private double w;
    private ClickGUI j;
    private double d;
    private boolean q;
    private double c;
    private Timer k = new Timer();
    private double t;
    private double e;
    private double a;
    public double s;
    private double l;
    private double i;
    private boolean r;
    private boolean f;
    private boolean h;
    private EnumModuleType g;
    private double m;
    private double b;
    private static boolean v;

    public boolean k() {
        return this.h;
    }

    public void c(double d) {
        this.t = d;
    }

    public EnumModuleType j() {
        return this.g;
    }

    public void b(double d) {
        this.b = d;
    }

    static {
        aq3_0.b(false);
    }

    public double f() {
        return this.t;
    }

    public void a(double d) {
        this.w = d;
    }

    public double o() {
        return this.b;
    }

    public void b(int n) {
        this.a = n;
    }

    public double l() {
        return this.a;
    }

    public double m() {
        return this.w;
    }

    public void c(boolean bl) {
        this.h = bl;
    }

    public void a(double d, double d2, double d3, double d4) {
        aq3_0.p();
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.disableTexture2D();
        GL11.glBegin((int)5);
        GL11.glVertex2d((double)(d + -MathInvoker.i(MathInvoker.o(d4 - 90.0)) * d3), (double)(d2 + MathInvoker.m(MathInvoker.o(d4 - 90.0)) * d3));
        GL11.glVertex2d((double)(d + -MathInvoker.i(MathInvoker.o(d4)) * d3 * 2.0), (double)(d2 + MathInvoker.m(MathInvoker.o(d4)) * d3 * 2.0));
        GL11.glVertex2d((double)(d + -MathInvoker.i(MathInvoker.o(d4 + 90.0)) * d3 * 3.0), (double)(d2 + MathInvoker.m(MathInvoker.o(d4 + 90.0)) * d3));
        GL11.glEnd();
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.popMatrix();
        if (ListInvoker.b() != null) {
            aq3_0.b(false);
        }
    }

    public double e() {
        return this.d;
    }

    public static void b(boolean bl) {
        v = bl;
    }

    public void a(int n) {
        this.d = n;
    }

    public static boolean p() {
        aq3_0.d();
        return true;
    }

    public void b(int n, int n2, int n3) {
        Iterator iterator;
        aq3_0.d();
        this.r = false;
        this.q = false;
        this.f = false;
        if (this.h && dz_0.c(iterator = ListInvoker.iterator(this.o))) {
            r_0 r_02 = (r_0)dz_0.b(iterator);
            ME.d(r_02);
        }
    }

    public double b() {
        aq3_0.d();
        double d = 0.0;
        Iterator iterator = ListInvoker.iterator(this.o);
        if (dz_0.c(iterator)) {
            r_0 r_02 = (r_0)dz_0.b(iterator);
            d += 20.0 + ME.b(r_02);
        }
        return d;
    }

    public void a(double d, double d2, double d3, boolean bl) {
        aq3_0.p();
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.disableTexture2D();
        GL11.glBegin((int)5);
        GL11.glVertex2d((double)(d + d3), (double)(d2 + d3));
        GL11.glVertex2d((double)(d + d3 * 2.0), (double)(d2 + d3 * 2.0));
        GL11.glVertex2d((double)(d + d3 * 3.0), (double)(d2 + d3));
        GL11.glVertex2d((double)(d + d3 * 3.0), (double)((d2 += d3 * 3.0) - d3));
        GL11.glVertex2d((double)(d + d3 * 2.0), (double)(d2 - d3 * 2.0));
        GL11.glVertex2d((double)(d + d3), (double)(d2 - d3));
        GL11.glEnd();
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.popMatrix();
    }

    public static boolean d() {
        return v;
    }

    public void a(int n, int n2, int n3) {
        Iterator iterator;
        aq3_0.p();
        if (this.a(n, n2) && n3 == 0) {
            this.r = true;
            this.u = this.t - (double)n;
            this.l = this.b - (double)n2;
        }
        if (this.a(n, n2) && n3 == 1) {
            this.h = !this.h;
        }
        double cfr_ignored_0 = this.w - 39.0;
        if ((double)n >= this.t + 130.0 - 4.0 && (double)n <= this.t + 130.0 && (double)n2 >= this.b + 23.0 && (double)n2 <= this.b + 20.0 + this.w - 3.0) {
            this.q = true;
            this.m = n2;
        }
        double d = MathInvoker.a((double)(ListInvoker.size(this.o) * 20), this.w);
        if (n3 == 0 && (double)n >= this.t + 130.0 - 5.0 && (double)n <= this.t + 130.0 && (double)n2 >= this.b + 20.0 + d && (double)n2 <= this.b + 20.0 + d + 5.0) {
            this.f = true;
            this.i = (double)n2 - this.b;
        }
        if (this.h && (double)n >= this.t && (double)n <= this.t + 130.0 && (double)n2 >= this.b + 20.0 && (double)n2 <= this.b + 20.0 + this.w && dz_0.c(iterator = ListInvoker.iterator(this.o))) {
            r_0 r_02 = (r_0)dz_0.b(iterator);
            r_02.a(n, n2, n3);
        }
    }

    public boolean a(AbstractModule abstractModule) {
        r_0 r_02;
        aq3_0.d();
        Iterator iterator = ListInvoker.iterator(this.o);
        return dz_0.c(iterator) && abstractModule == ME.c(r_02 = (r_0)dz_0.b(iterator));
    }

    public int a() {
        int n = 0;
        aq3_0.d();
        Iterator iterator = ListInvoker.iterator(this.o);
        if (dz_0.c(iterator)) {
            r_0 r_02 = (r_0)dz_0.b(iterator);
            n = (int)((double)n + ME.b(r_02));
        }
        return n;
    }

    public aq3_0(ClickGUI clickGUI, EnumModuleType enumModuleType, int n, int n2) {
        this.o = new CopyOnWriteArrayList<r_0>();
        aq3_0.p();
        this.w = 200.0;
        this.j = clickGUI;
        this.g = enumModuleType;
        this.t = n;
        this.b = n2;
        Iterator iterator = ListInvoker.iterator(aen_2.a(NovolineInvoker.l(KN.a(clickGUI)), enumModuleType));
        if (dz_0.c(iterator)) {
            AbstractModule abstractModule = (AbstractModule)dz_0.b(iterator);
            ListInvoker.add(this.o, new r_0(this, abstractModule));
        }
    }

    public void a(char c, int n) {
        r_0 r_02;
        aq3_0.p();
        Iterator iterator = ListInvoker.iterator(this.o);
        if (dz_0.c(iterator) && (r_02 = (r_0)dz_0.b(iterator)).a()) {
            r_02.a(c, n);
        }
    }

    public Timer n() {
        return this.k;
    }

    public ClickGUI i() {
        return this.j;
    }

    public double g() {
        return this.e;
    }

    public void a(ClickGui clickGui, int n, int n2, float f, int n3) {
        aq3_0.d();
        if (this.r) {
            this.t = this.u + (double)n;
            this.b = this.l + (double)n2;
        }
        if (this.a(n, n2) || this.h) {
            this.c += 0.05;
            ListInvoker.b(new ListInvoker[5]);
        }
        if (this.c > 0.0) {
            this.c -= 0.05;
        }
        String string = this.c();
        FontRenderer fontRenderer = adj_1.a(al1_0.a, 28);
        FontRenderer fontRenderer2 = adj_1.a(pI.a, 25);
        double d = z4_0.l(clickGui);
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui), od_0.n)) {
            a1V.b(this.t, this.b - 2.0, this.t + 25.0, this.b + 20.0, aol_1.b(new Color(36, 36, 36)));
            a1V.b(this.t + 25.0, this.b - 2.0, this.t + 130.0, this.b + 20.0, aol_1.b(new Color(45, 45, 45)));
        }
        a1V.b(this.t, this.b - 2.0, this.t + 25.0, this.b + 20.0, aol_1.b(aol_1.d(new Color(n3))));
        a1V.b(this.t + 25.0, this.b - 2.0, this.t + 130.0, this.b + 20.0, aol_1.b(new Color(n3)));
        KN.b(this.j, fontRenderer2, aod_2.d(StringInvoker.i(this.g.name())), this.t + 29.0, this.b + 4.0, a1V.a(aol_1.d(Color.WHITE), Color.WHITE, (double)((float)this.c)), true);
        KN.b(this.j, fontRenderer, string, this.t + 5.5, this.b + 9.5 - (double)(a7l_0.a(fontRenderer) / 2), a1V.a(aol_1.d(Color.WHITE), Color.WHITE, (double)((float)this.c)), true);
        if (this.h) {
            boolean bl = (double)n >= this.t + 120.0 - 8.0 && (double)n <= this.t + 130.0 - 3.0 && (double)n2 >= this.b + 23.0 && (double)n2 <= this.b + 20.0 + this.w - 3.0 || this.q;
            adp_0.b(false);
            a1V.b(this.t, this.b + 20.0, this.t + 130.0, this.b + 20.0 + this.w, -1);
            adp_0.a(true);
            if (StringPropertyInvoker.isMode(z4_0.o(clickGui), od_0.j)) {
                a1V.b(this.t, this.b + 20.0, this.t + 130.0, this.b + 20.0 + this.b(), aol_1.b(new Color(55, 55, 55)));
            }
            a1V.b(this.t, this.b + 20.0, this.t + 125.0, this.b + 20.0 + this.b(), aol_1.b(new Color(0, 0, 0, (int)(180.0 * d))));
            Iterator iterator = ListInvoker.iterator(this.o);
            if (dz_0.c(iterator)) {
                r_0 r_02 = (r_0)dz_0.b(iterator);
                ME.a(r_02, clickGui, n, n2, f, bl, n3);
            }
            adp_0.a();
            double d2 = this.w;
            double d3 = this.w;
            double d4 = ListInvoker.size(this.o) * 20 + this.a();
            double d5 = d3 / d4 * d2;
            double d6 = d2 - d5;
            double d7 = d4 - d2;
            double d8 = d7 / d6;
            this.a = (int)(this.d * d8);
            this.e += (this.a - this.e) * 0.1;
            if (StringPropertyInvoker.isMode(z4_0.o(clickGui), od_0.p)) {
                a1V.a((float)this.t + 130.0f - 5.0f, (float)(this.b + 20.0), 5.0f, (float)MathInvoker.a((double)(ListInvoker.size(this.o) * 20), this.w), 0.0f, aol_1.b(new Color(45, 45, 45, 255)));
            }
            a1V.a((float)this.t + 125.0f, (float)(this.b + 20.0), 5.0f, (float)MathInvoker.a(d4, this.w), 0.0f, aol_1.b(new Color(0, 0, 0, (int)(200.0 * d))));
            if (d4 > d3) {
                a1V.a((float)(this.t + 130.0 - 4.0), (float)(this.b + 20.0 + this.d), 3.0f, (float)d5 - 1.0f, 0.0f, aol_1.b(new Color(0, 0, 0, (int)(100.0 * d))));
                if ((double)n >= this.t && (double)n <= this.t + 130.0 && (double)n2 >= this.b + 20.0 && (double)n2 <= this.b + 20.0 + this.w) {
                    int n4 = MouseInvoker.m();
                    if (n4 != 0) {
                        if (n4 < 0) {
                            this.d += 10.0;
                        }
                        this.d -= 10.0;
                    }
                    this.d = (int)MathHelper.b(this.d, 0.0, d2 - d5);
                }
                if (this.q) {
                    // empty if block
                }
            } else {
                this.a = 0.0;
                this.d = 0.0;
            }
            if (this.q && (double)n2 - this.m != 0.0) {
                this.d += (double)n2 - this.m;
                this.d = (int)MathHelper.b(this.d, 0.0, d2 - d5);
                this.m = n2;
            }
            double d9 = MathInvoker.a((double)(ListInvoker.size(this.o) * 20 + this.a()), this.w);
            if (StringPropertyInvoker.isMode(z4_0.o(clickGui), od_0.c)) {
                a1V.b(this.t, this.b + 20.0 + d9, this.t + 130.0, this.b + 20.0 + d9 + 5.0, aol_1.b(new Color(45, 45, 45)));
            }
            a1V.b(this.t, this.b + 20.0 + d9, this.t + 130.0, this.b + 20.0 + d9 + 5.0, aol_1.b(new Color(0, 0, 0, (int)(200.0 * d))));
            FontRendererInvoker.a(MCInvoker.f().fontRendererObj, od_0.d, (float)(this.t + 130.0 - (double)3.2f), (float)(this.b + 20.0 + d9) - 2.5f, aol_1.b(new Color(80, 80, 80, 150)));
            if (this.f) {
                double d10 = 0.0;
                Iterator iterator2 = ListInvoker.iterator(this.o);
                if (dz_0.c(iterator2)) {
                    r_0 r_03 = (r_0)dz_0.b(iterator2);
                    if (r_03.a()) {
                        d10 += 20.0 + ME.b(r_03);
                    }
                    d10 += 20.0;
                }
                this.w = MathHelper.b((double)n2 - (this.b + 20.0), 10.0, d10);
                this.d = 0.0;
                this.a = 0.0;
            }
        }
    }

    public String c() {
        aq3_0.p();
        String string = od_0.a;
        if (StringInvoker.d(this.g.name(), od_0.o)) {
            string = od_0.m;
        }
        if (StringInvoker.d(this.g.name(), od_0.g)) {
            string = od_0.e;
        }
        if (StringInvoker.d(this.g.name(), od_0.l)) {
            string = od_0.r;
        }
        if (StringInvoker.d(this.g.name(), od_0.f)) {
            string = od_0.i;
        }
        if (StringInvoker.d(this.g.name(), od_0.b)) {
            string = od_0.q;
        }
        if (StringInvoker.d(this.g.name(), od_0.h)) {
            string = od_0.k;
        }
        return string;
    }

    public boolean a(int n, int n2) {
        aq3_0.d();
        return (double)n >= this.t && (double)n <= this.t + 120.0 && (double)n2 >= this.b && (double)n2 <= this.b + 20.0;
    }

    public List<r_0> h() {
        return this.o;
    }

    public void a(double d, double d2, double d3, double d4, boolean bl) {
        aq3_0.d();
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.disableTexture2D();
        GL11.glBegin((int)5);
        double d5 = d3 * d4;
        GL11.glVertex2d((double)(d + d3), (double)(d2 + d5));
        GL11.glVertex2d((double)(d + d3 * 2.0), (double)(d2 + d5 * 2.0));
        GL11.glVertex2d((double)(d + d3 * 3.0), (double)(d2 + d5));
        GL11.glVertex2d((double)(d + d3 * 3.0), (double)((d2 += d3 * 2.0) - d5));
        GL11.glVertex2d((double)(d + d3 * 2.0), (double)(d2 - d5 * 2.0));
        GL11.glVertex2d((double)(d + d3), (double)(d2 - d5));
        GL11.glEnd();
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.popMatrix();
    }
}

