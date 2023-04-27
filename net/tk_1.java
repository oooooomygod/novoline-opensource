/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import net.a7l_0;
import net.adj_1;
import net.ant_0;
import net.bj_0;

/*
 * Renamed from net.tK
 */
public class tk_1 {
    private String b;
    private double a;
    private double d;
    private FontRenderer c = adj_1.a(bj_0.a, 93);

    public tk_1(String string, double d, double d2) {
        this.b = string;
        this.a = d;
        this.d = d2;
    }

    public void c(double d) {
        this.d = d;
    }

    public void b(double d) {
        GlStateManagerInvoker.b(d, d, d);
        double d2 = this.a * (1.0 / d);
        double d3 = this.d * (1.0 / d);
        a7l_0.b(this.c, this.b, d2 -= (double)(a7l_0.a(this.c, this.b) / 2), d3 -= (double)(a7l_0.a(this.c) / 2), 0xFFFFFF, true);
        GlStateManagerInvoker.b(1.0 / d, 1.0 / d, 1.0 / d);
    }

    public void a(double d) {
        this.a = d;
    }

    public boolean a(int n, int n2) {
        ant_0.b();
        return (double)n > this.a && (double)n <= this.a + (double)a7l_0.a(this.c, this.b) && (double)n2 > this.d && (double)n2 <= this.d + (double)a7l_0.a(this.c);
    }
}

