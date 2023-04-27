/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.visual.ClickGui;
import deobf.ModuleRegistry;
import java.awt.Color;

/*
 * Renamed from net.ayA
 */
public class aya_1 {
    private aQF c;
    public float d = 0.0f;
    private String a;
    private boolean e;
    private double f;
    private double b;

    public boolean b() {
        return this.e;
    }

    public void a(int n, int n2, int n3) {
        block5: {
            block6: {
                wr_2.b();
                if (n3 != 0) break block5;
                if (!this.a(n, n2)) break block6;
                if ((double)n < this.f + 100.0) {
                    this.e = true;
                }
                if (!((double)n > this.f + 110.0)) break block5;
                a4_.a(aen_2.b(NovolineInvoker.l(NovolineInvoker.getInstance())), this.a);
                SS.a(this.c);
            }
            if (this.e) {
                this.e = false;
            }
        }
    }

    public boolean a(int n, int n2) {
        wr_2.b();
        return (double)n > this.f && (double)n < this.f + 125.0 && (double)n2 > this.b && (double)n2 < this.b + 20.0;
    }

    public String a() {
        return this.a;
    }

    public aQF c() {
        return this.c;
    }

    public aya_1(String string, aQF aQF2) {
        this.a = string;
        this.c = aQF2;
    }

    public void a(int n, int n2, double d, double d2, Color color) {
        ClickGui clickGui;
        wr_2.b();
        this.f = d;
        this.b = d2;
        if (this.a(n, n2) && this.d < 1.0f) {
            this.d = MathInvoker.a(1.0f, this.d + (1.0f - this.d) * 0.15f);
            ListInvoker.b(new ListInvoker[1]);
        }
        if (!this.a(n, n2) && this.d > 0.0f) {
            this.d = MathInvoker.b(0.0f, this.d + -this.d * 0.15f);
        }
        if (this.e) {
            this.d = 1.0f;
        }
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI)), ap0_0.a)) {
            a1V.b(d, d2, d + 130.0, d2 + 20.0, aol_1.b(new Color(aol_1.c(color), aol_1.g(color), aol_1.f(color), (int)(this.d * 150.0f))));
            KN.b(SS.b(this.c), adj_1.a(ng_0.a, 20), this.a, d + 6.0, d2 + 6.5, -1, true);
        }
        a1V.b(d, d2, d + 130.0, d2 + 20.0, aol_1.b(new Color(0, 0, 0, (int)(this.d * 60.0f))));
        KN.b(SS.b(this.c), adj_1.a(ng_0.a, 20), this.a, d + 6.0, d2 + 6.5, this.a(n, n2) ? aol_1.b(color) : -1, true);
        boolean bl = (double)n >= d + 110.0 && (double)n <= d + 122.0 && (double)n2 >= d2 + 3.0 && (double)n2 <= d2 + 17.0;
        boolean bl2 = (double)n >= d + 100.0 && (double)n < d + 110.0 && (double)n2 >= d2 + 3.0 && (double)n2 <= d2 + 17.0;
        KN.b(SS.b(this.c), adj_1.a(r0_0.a, 22), ap0_0.c, (float)d + 113.0f, (float)(d2 + 8.0), aol_1.b(new Color(120, 120, 120)), false);
        KN.b(SS.b(this.c), adj_1.a(r0_0.a, 22), ap0_0.b, (float)d + 100.0f, (float)(d2 + 8.0), aol_1.b(new Color(120, 120, 120)), false);
    }
}

