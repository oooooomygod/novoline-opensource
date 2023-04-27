/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.gui.screen.ClickGUI;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.script.Script;
import cc.novoline.modules.visual.ClickGui;
import deobf.MCInvoker;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * Renamed from net.aq7
 */
public class aq7_0
extends aq3_0 {
    private static int[] F;
    private double C;
    private int P;
    private boolean L;
    public double D;
    private wr_2 S;
    private boolean E;
    private double V;
    private int Q;
    private double J;
    private boolean G;
    private double U;
    private boolean R;
    private ClickGUI N;
    private double B;
    private double x;
    public double I;
    private wr_2 O;
    private wr_2 T;
    private double M = 160.0;
    private double K;
    private List<H2> y = new CopyOnWriteArrayList<H2>();
    private double H;
    private static Color z;
    private int A;

    @Override
    public boolean a(int n, int n2) {
        aq7_0.d();
        return (double)n >= this.B && (double)n <= this.B + 130.0 && (double)n2 >= this.H && (double)n2 <= this.H + 20.0;
    }

    @Override
    public void b(int n, int n2, int n3) {
        this.E = false;
        this.L = false;
        this.R = false;
    }

    public static void b(int[] nArray) {
        F = nArray;
    }

    public static int[] d() {
        return F;
    }

    @Override
    public boolean k() {
        return this.G;
    }

    public void a() {
        aq7_0.d();
        ListInvoker.clear(this.y);
        cx_0.a(NovolineInvoker.r(NovolineInvoker.getInstance()), NovolineInvoker.getInstance());
        Iterator iterator = ListInvoker.iterator(cx_0.b(NovolineInvoker.r(NovolineInvoker.getInstance())));
        if (dz_0.c(iterator)) {
            Script script = (Script)dz_0.b(iterator);
            ListInvoker.add(this.y, new H2(script));
        }
    }

    private void lambda$new$2(ClickGUI clickGUI, String string) {
        aq7_0.d();
        if (this.b() != null) {
            if (asu_1.b(a37.a(this.b()))) {
                asu_1.a(a37.a(this.b()), false);
            }
            cx_0.a(NovolineInvoker.r(NovolineInvoker.getInstance()), asu_1.a(a37.a(this.b())));
            KN.a(clickGUI, asu_1.d(a37.a(this.b())));
        }
        this.a();
    }

    public aq7_0(ClickGUI clickGUI, int n, int n2) {
        super(clickGUI, null, n, n2);
        this.B = n;
        this.H = n2;
        this.N = clickGUI;
        this.S = new wr_2(a6Y.j, arg_0 -> this.lambda$new$0(clickGUI, arg_0), 121.0, 18.0);
        this.T = new wr_2(a6Y.k, arg_0 -> this.lambda$new$1(clickGUI, arg_0), 57.5, 18.0);
        this.O = new wr_2(a6Y.l, arg_0 -> this.lambda$new$2(clickGUI, arg_0), 57.5, 18.0);
        this.a();
    }

    @Override
    public void a(ClickGui clickGui, int n, int n2, float f, int n3) {
        aq7_0.d();
        if (this.E) {
            this.B = this.Q + n;
            this.H = this.P + n2;
        }
        if (this.a(n, n2) || this.G) {
            this.K += 0.05;
        }
        if (this.K > 0.0) {
            this.K -= 0.05;
        }
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui), a6Y.f)) {
            a1V.b(this.B, this.H - 2.0, this.B + 29.0, this.H + 20.0, aol_1.b(new Color(36, 36, 36)));
            a1V.b(this.B + 29.0, this.H - 2.0, this.B + 130.0, this.H + 20.0, aol_1.b(new Color(45, 45, 45)));
        }
        a1V.b(this.B, this.H - 2.0, this.B + 29.0, this.H + 20.0, aol_1.b(aol_1.d(new Color(n3))));
        a1V.b(this.B + 29.0, this.H - 2.0, this.B + 130.0, this.H + 20.0, aol_1.b(new Color(n3)));
        KN.b(this.N, adj_1.a(bj_0.a, 48), a6Y.m, this.B + 5.5, this.H - 1.0, 0xFFFFFF, true);
        KN.b(this.N, adj_1.a(pI.a, 25), a6Y.c, this.B + 33.0, this.H + 4.0, a1V.a(aol_1.d(Color.WHITE), Color.WHITE, (double)((float)this.K)), true);
        if (this.G) {
            double d = this.M;
            double d2 = this.M;
            double d3 = ListInvoker.size(this.y) * 20;
            double d4 = d2 / d3 * d;
            double d5 = d - d4;
            double d6 = d3 - d;
            double d7 = d6 / d5;
            this.V = (int)(this.J * d7);
            this.x += (this.V - this.x) * 0.1;
            adp_0.b(false);
            a1V.b(this.B, this.H + 20.0, this.B + 130.0, this.H + 20.0 + this.M, -1);
            adp_0.a(true);
            double d8 = z4_0.l(clickGui);
            if (StringPropertyInvoker.isMode(z4_0.o(clickGui), a6Y.d)) {
                a1V.b(this.B, this.H + 20.0, this.B + 130.0, this.H + 20.0 + this.M, aol_1.b(new Color(55, 55, 55)));
            }
            a1V.b(this.B, this.H + 20.0, this.B + 125.0, this.H + 20.0 + this.M, aol_1.b(new Color(0, 0, 0, (int)(180.0 * d8))));
            double d9 = this.H + 20.0;
            Iterator iterator = ListInvoker.iterator(this.y);
            if (dz_0.c(iterator)) {
                H2 h2 = (H2)dz_0.b(iterator);
                a37.a(h2, this.N, n, n2, this.B, d9 - this.x, new Color(n3));
                d9 += 20.0;
                var25_19 -= 120;
            }
            adp_0.a();
            if (StringPropertyInvoker.isMode(z4_0.o(clickGui), a6Y.a)) {
                a1V.b(this.B, this.H + 20.0 + this.M, this.B + 130.0, this.H + 20.0 + this.M + 40.0, aol_1.b(new Color(45, 45, 45)));
            }
            a1V.b(this.B, this.H + 20.0 + this.M, this.B + 125.0, this.H + 20.0 + this.M + 40.0, aol_1.b(new Color(0, 0, 0, (int)(170.0 * d8))));
            if (StringPropertyInvoker.isMode(z4_0.o(clickGui), a6Y.b)) {
                aRD.a(this.S, this.N, n, n2, this.B + 2.0, this.H + 20.0 + this.M + 2.0);
                aRD.a(this.T, this.N, n, n2, this.B + 2.0, this.H + 20.0 + this.M + 22.0);
                aRD.a(this.O, this.N, n, n2, this.B + 65.5, this.H + 20.0 + this.M + 22.0);
            }
            aRD.a(this.S, this.N, n, n2, this.B + 2.0, this.H + 19.5 + this.M + 2.0, aol_1.b(new Color(0, 0, 0, 50)), aol_1.b(new Color(0, 0, 0, 70)));
            aRD.a(this.T, this.N, n, n2, this.B + 2.0, this.H + 19.5 + this.M + 22.0, aol_1.b(new Color(0, 0, 0, 50)), aol_1.b(new Color(0, 0, 0, 70)));
            aRD.a(this.O, this.N, n, n2, this.B + 65.5, this.H + 19.5 + this.M + 22.0, aol_1.b(new Color(0, 0, 0, 50)), aol_1.b(new Color(0, 0, 0, 70)));
            if (StringPropertyInvoker.isMode(z4_0.o(clickGui), a6Y.h)) {
                a1V.a((float)this.B + 125.0f, (float)(this.H + 20.0), 5.0f, (float)this.M, 0.0f, aol_1.b(new Color(45, 45, 45)));
            }
            a1V.a((float)this.B + 125.0f, (float)(this.H + 20.0), 5.0f, (float)this.M + 40.0f, 0.0f, aol_1.b(new Color(0, 0, 0, (int)(200.0 * d8))));
            if (d3 > d2) {
                if (StringPropertyInvoker.isMode(z4_0.o(clickGui), a6Y.e)) {
                    a1V.a((float)(this.B + 130.0 - 4.0), (float)(this.H + 20.0 + this.J), 3.0f, (float)d4 - 1.0f, 0.0f, aol_1.b(new Color(50, 50, 50, 255)));
                }
                a1V.a((float)(this.B + 130.0 - 4.0), (float)(this.H + 20.0 + this.J), 3.0f, (float)d4 - 1.0f, 0.0f, aol_1.b(new Color(0, 0, 0, (int)(100.0 * d8))));
                if ((double)n >= this.B && (double)n <= this.B + 130.0 && (double)n2 >= this.H + 20.0 && (double)n2 <= this.H + 20.0 + this.M) {
                    int n4 = MouseInvoker.m();
                    this.J += 10.0;
                    this.J -= 10.0;
                    this.J = (int)MathHelper.b(this.J, 0.0, d - d4);
                }
            } else {
                this.V = 0.0;
                this.J = 0.0;
            }
            if (this.L && (double)n2 - this.U != 0.0) {
                this.J += (double)n2 - this.U;
                this.J = (int)MathHelper.b(this.J, 0.0, d - d4);
                this.U = n2;
            }
            double d10 = this.M;
            if (StringPropertyInvoker.isMode(z4_0.o(clickGui), a6Y.i)) {
                a1V.b(this.B, this.H + 20.0 + d10 + 40.0, this.B + 130.0, this.H + 20.0 + d10 + 45.0, aol_1.b(new Color(37, 37, 37)));
            }
            a1V.b(this.B, this.H + 20.0 + d10 + 40.0, this.B + 130.0, this.H + 20.0 + d10 + 45.0, aol_1.b(new Color(0, 0, 0, (int)(200.0 * d8))));
            FontRendererInvoker.a(MCInvoker.f().fontRendererObj, a6Y.g, (float)(this.B + 130.0 - (double)3.2f), (float)(this.H + 20.0 + d10 + 40.0) - 2.5f, aol_1.b(new Color(80, 80, 80, 150)));
            if (this.R) {
                this.M = (int)MathHelper.b((double)(n2 - 40) - (this.H + 20.0), 10.0, 9999.0);
                this.J = 0.0;
                this.V = 0.0;
            }
        }
    }

    private void lambda$new$1(ClickGUI clickGUI, String string) {
        this.a();
        KN.f(clickGUI);
    }

    @Override
    public void a(int n, int n2, int n3) {
        aq7_0.d();
        if (this.a(n, n2) && n3 == 0) {
            this.E = true;
            this.Q = (int)(this.B - (double)n);
            this.P = (int)(this.H - (double)n2);
        }
        if (this.a(n, n2) && n3 == 1) {
            boolean bl = this.G = !this.G;
            if (this.G) {
                this.a();
            }
        }
        if ((double)n >= this.B + 130.0 - 8.0 && (double)n <= this.B + 130.0 && (double)n2 >= this.H + 20.0 && (double)n2 <= this.H + 20.0 + this.M) {
            this.L = true;
            this.U = n2;
        }
        if (n3 == 0 && (double)n >= this.B + 130.0 - 5.0 && (double)n <= this.B + 130.0 && (double)n2 >= this.H + 20.0 + this.M + 40.0 && (double)n2 <= this.H + 20.0 + this.M + 45.0) {
            this.R = true;
            this.C = (double)n2 - this.H;
        }
        if (this.G) {
            Iterator iterator;
            if ((double)n2 >= this.H + 20.0 && (double)n2 < this.H + 20.0 + this.M && dz_0.c(iterator = ListInvoker.iterator(this.y))) {
                H2 h2 = (H2)dz_0.b(iterator);
                h2.a(n, n2, n3);
            }
            this.S.a(n, n2, n3);
            this.O.a(n, n2, n3);
            this.T.a(n, n2, n3);
        }
    }

    @Override
    public void c(boolean bl) {
        this.G = bl;
    }

    @Override
    public void a(double d) {
        this.M = d;
    }

    @Override
    public double m() {
        return this.M;
    }

    @Override
    public double o() {
        return this.H;
    }

    @Override
    public double f() {
        return this.B;
    }

    public H2 b() {
        return (H2)oc_1.a(aMF.b(aMF.b(ListInvoker.stream(this.y), H2::b)), null);
    }

    private void lambda$new$0(ClickGUI clickGUI, String string) {
        aq7_0.d();
        if (this.b() != null) {
            if (asu_1.b(a37.a(this.b()))) {
                KN.a(clickGUI, asu_1.d(a37.a(this.b())));
                asu_1.a(a37.a(this.b()), false);
                this.a();
            }
            cx_0.b(NovolineInvoker.r(NovolineInvoker.getInstance()), asu_1.a(a37.a(this.b())));
            this.a();
            KN.f(clickGUI);
        }
    }

    static {
        z = new Color(20, 20, 20);
        aq7_0.b(null);
    }

    @Override
    public void c(double d) {
        this.B = d;
    }

    @Override
    public void b(double d) {
        this.H = d;
    }
}

