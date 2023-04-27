/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.gui.screen.ClickGUI;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.visual.ClickGui;
import deobf.MCInvoker;
import java.awt.Color;

/*
 * Renamed from net.aqx
 */
public class aqx_2
extends aq3_0 {
    private double K;
    public double N;
    private double y;
    private int O;
    private double C = 140.0;
    private ClickGUI J;
    private aQF F;
    private boolean E;
    private boolean L;
    public double H;
    private int z;
    private double A;
    private SH D;
    private boolean I;
    private boolean M;
    private int G;
    private int B;

    @Override
    public double f() {
        return this.y;
    }

    @Override
    public void a(char c, int n) {
        aq7_0.d();
        if (this.I) {
            this.D.a(c, n);
        }
        this.F.a(c, n);
        super.a(c, n);
    }

    @Override
    public void c(double d) {
        this.y = d;
    }

    @Override
    public double m() {
        return this.C;
    }

    @Override
    public boolean k() {
        return this.M;
    }

    @Override
    public void c(boolean bl) {
        this.M = bl;
    }

    @Override
    public void a(ClickGui clickGui, int n, int n2, float f, int n3) {
        aq7_0.d();
        if (this.E) {
            this.y = this.z + n;
            this.K = this.O + n2;
        }
        if (this.a(n, n2) || this.M) {
            this.A += 0.05;
        }
        if (this.A > 0.0) {
            this.A -= 0.05;
        }
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aue_1.b)) {
            a1V.b(this.y, this.K - 2.0, this.y + 29.0, this.K + 20.0, aol_1.b(new Color(36, 36, 36)));
            a1V.b(this.y + 29.0, this.K - 2.0, this.y + 130.0, this.K + 20.0, aol_1.b(new Color(45, 45, 45)));
        }
        a1V.b(this.y, this.K - 2.0, this.y + 29.0, this.K + 20.0, aol_1.b(aol_1.d(new Color(n3))));
        a1V.b(this.y + 29.0, this.K - 2.0, this.y + 130.0, this.K + 20.0, aol_1.b(new Color(n3)));
        KN.b(this.J, adj_1.a(pI.a, 25), aue_1.g, this.y + 33.0, this.K + 4.0, a1V.a(aol_1.d(Color.WHITE), Color.WHITE, (double)((float)this.A)), true);
        KN.b(this.J, adj_1.a(bj_0.a, 48), aue_1.f, this.y + 5.5, this.K - 1.0, 0xFFFFFF, true);
        int n4 = StringPropertyInvoker.isMode(z4_0.o(clickGui), aue_1.e) ? 130 : 225;
        KN.b(this.J, adj_1.a(r0_0.a, 30), aue_1.h, (float)this.y + 112.0f, (float)(this.K + 5.0), this.I ? aol_1.b(new Color(200, 200, 200)) : aol_1.b(new Color(n4, n4, n4)), true);
        if (this.M) {
            if (this.I) {
                a9W.a(this.D, clickGui, n, n2, this.y, this.K + 20.0);
            }
            SS.a(this.F, clickGui, n, n2, this.y, this.K + 20.0, n3);
            double d = this.C;
            if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aue_1.d)) {
                a1V.b(this.y, this.K + 20.0 + d + 60.0, this.y + 130.0, this.K + 20.0 + d + 65.0, aol_1.b(new Color(37, 37, 37)));
            }
            a1V.b(this.y, this.K + 20.0 + d + 60.0, this.y + 130.0, this.K + 20.0 + d + 65.0, aol_1.b(new Color(0, 0, 0, (int)(200.0 * z4_0.l(clickGui)))));
            FontRendererInvoker.a(MCInvoker.f().fontRendererObj, aue_1.a, (float)(this.y + 130.0 - (double)3.2f), (float)(this.K + 20.0 + d + 60.0) - 2.5f, aol_1.b(new Color(80, 80, 80, 150)));
            if (this.L) {
                this.C = (int)MathHelper.b((double)(n2 - 60) - (this.K + 20.0), 10.0, 9999.0);
            }
        }
        if (ListInvoker.b() != null) {
            aq7_0.b(new int[2]);
        }
    }

    @Override
    public double o() {
        return this.K;
    }

    @Override
    public void a(int n, int n2, int n3) {
        aq7_0.d();
        if (this.a(n, n2) && n3 == 0) {
            if ((double)n < this.y + 100.0) {
                this.E = true;
                this.z = (int)(this.y - (double)n);
                this.O = (int)(this.K - (double)n2);
            }
            boolean bl = this.I = !this.I;
            if (this.I) {
                NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), aue_1.i, aue_1.c, 2500, NotificationType.WARNING);
                this.I = false;
            }
            if (!this.I) {
                SS.a(this.F);
            }
            a9W.a(this.D);
        }
        if (this.a(n, n2) && n3 == 1) {
            boolean bl = this.M = !this.M;
        }
        if (this.M) {
            if (this.I) {
                this.D.b(n, n2, n3);
            }
            this.F.b(n, n2, n3);
            if (n3 == 0 && (double)n >= this.y + 130.0 - 5.0 && (double)n <= this.y + 130.0 && (double)n2 >= this.K + 20.0 + this.C + 60.0 && (double)n2 <= this.K + 20.0 + this.C + 65.0) {
                this.L = true;
                this.G = (int)((double)n2 - this.K);
            }
        }
        super.a(n, n2, n3);
    }

    @Override
    public void b(double d) {
        this.K = d;
    }

    @Override
    public boolean a(int n, int n2) {
        aq7_0.d();
        return (double)n >= this.y && (double)n <= this.y + 130.0 && (double)n2 >= this.K && (double)n2 <= this.K + 20.0;
    }

    public aqx_2(ClickGUI clickGUI, int n, int n2) {
        super(clickGUI, null, n, n2);
        this.y = n;
        this.K = n2;
        this.J = clickGUI;
        this.F = new aQF(clickGUI, this);
        this.D = new SH(clickGUI, this);
    }

    @Override
    public void b(int n, int n2, int n3) {
        aq7_0.d();
        if (this.I) {
            this.D.a(n, n2, n3);
        }
        this.F.a(n, n2, n3);
        this.E = false;
        this.L = false;
        super.b(n, n2, n3);
    }

    public SH a() {
        return this.D;
    }

    @Override
    public void a(double d) {
        this.C = d;
    }
}

