/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.gui.screen.ClickGUI;
import java.awt.Color;
import net.KN;
import net.SH;
import net.a7u;
import net.adj_1;
import net.aol_1;
import net.ng_0;
import net.r0_0;
import net.wr_2;

public class V2 {
    public SH g;
    public String i;
    private double d;
    public boolean h;
    public String b;
    public boolean f;
    public long e;
    private double a;
    public long c;

    public void a(ClickGUI clickGUI, int n, int n2, double d, double d2) {
        wr_2.b();
        this.a = d;
        this.d = d2;
        KN.b(clickGUI, adj_1.a(ng_0.a, 20), this.b, d + 6.0, d2 + 6.5, -1, true);
        boolean bl = (double)n >= d + 110.0 && (double)n <= d + 120.0 && (double)n2 >= d2 + 2.0 && (double)n2 <= d2 + 16.0;
        KN.b(clickGUI, adj_1.a(r0_0.a, 20), a7u.a, (float)d + 111.0f, (float)(d2 + 8.0), aol_1.b(new Color(100, 100, 100, 255)), false);
    }

    public boolean a(int n, int n2) {
        wr_2.b();
        return (double)n > this.a && (double)n < this.a + 115.0 && (double)n2 > this.d && (double)n2 < this.d + 20.0;
    }

    public long a() {
        return this.c;
    }

    public V2(String string, String string2, long l4, long l5, SH sH) {
        this.b = string;
        this.i = string2;
        this.g = sH;
        this.c = l5;
        this.e = l4;
    }

    public long b() {
        return this.e;
    }

    public void a(int n, int n2, int n3) {
        wr_2.b();
        if (n3 != 0 || !this.a(n, n2) || (double)n > this.a + 100.0) {
            // empty if block
        }
    }
}

