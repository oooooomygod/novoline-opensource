/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import java.awt.Color;
import net.FontFamily;
import net.a1V;
import net.a7l_0;
import net.aUW;
import net.adj_1;
import net.aol_1;
import net.wr_2;

/*
 * Renamed from net.avp
 */
public class avp_2 {
    public String f;
    private double d;
    private int c = -1;
    private double a;
    private double g;
    private double b;
    private boolean e;

    public void a(int n) {
        this.c = n;
    }

    public void a(int n, int n2, int n3) {
        wr_2.b();
        if (n3 == 0 && this.a(n, n2)) {
            this.e = !this.e;
        }
    }

    public void a(FontFamily fontFamily, int n, int n2, double d, double d2, int n3, int n4) {
        wr_2.b();
        this.a = d;
        this.b = d2;
        a1V.b(d, d2, d + this.d, d2 + this.g, this.a(n, n2) ? n4 : n3);
        a1V.b(d + 1.0, d2 + 1.0, d + this.d - 1.0, d2 + this.g - 1.0, n3);
        FontRenderer fontRenderer = adj_1.a(fontFamily, 17);
        Color color = new Color(this.c);
        int n5 = this.e ? aol_1.b(color) : aol_1.b(aol_1.d(aol_1.d(color)));
        a7l_0.b(fontRenderer, this.f, d + this.d / 2.0 - (double)(a7l_0.a(fontRenderer, this.f) / 2) - (this.f.equals(aUW.a) ? 0.5 : 0.0), d2 + 0.5 + this.g / 2.0 - (double)(a7l_0.a(fontRenderer) / 2), n5, true);
    }

    public double a() {
        return this.d;
    }

    public avp_2(String string, double d, double d2, boolean bl) {
        this.f = string;
        this.d = d;
        this.g = d2;
        this.e = bl;
    }

    public boolean a(int n, int n2) {
        wr_2.b();
        return (double)n >= this.a && (double)n <= this.a + this.d && (double)n2 >= this.b && (double)n2 <= this.b + this.g;
    }

    public double c() {
        return this.g;
    }

    public boolean b() {
        return this.e;
    }

    public void a(FontFamily fontFamily, int n, int n2, double d, double d2) {
        wr_2.b();
        this.a = d;
        this.b = d2;
        a1V.b(d, d2, d + this.d, d2 + this.g, this.a(n, n2) ? aol_1.b(new Color(60, 60, 60)) : aol_1.b(new Color(54, 54, 54)));
        a1V.b(d + 1.0, d2 + 1.0, d + this.d - 1.0, d2 + this.g - 1.0, aol_1.b(new Color(50, 50, 50)));
        FontRenderer fontRenderer = adj_1.a(fontFamily, 17);
        Color color = new Color(this.c);
        int n3 = this.e ? aol_1.b(color) : aol_1.b(aol_1.d(aol_1.d(color)));
        a7l_0.b(fontRenderer, this.f, d + this.d / 2.0 - (double)(a7l_0.a(fontRenderer, this.f) / 2) - (this.f.equals(aUW.b) ? 0.5 : 0.0), d2 + 0.5 + this.g / 2.0 - (double)(a7l_0.a(fontRenderer) / 2), n3, true);
        if (ListInvoker.b() != null) {
            wr_2.b(new String[3]);
        }
    }
}

