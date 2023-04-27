/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.TimerUtil;
import java.awt.Color;
import net.a1V;
import net.a7l_0;
import net.aL0;
import net.aol_1;
import net.me_0;
import net.sp_1;

/*
 * Renamed from net.On
 */
public class on_0 {
    private double h;
    private TimerUtil g;
    private String b = sp_1.e;
    private boolean i;
    private static String d;
    private double c;
    private double f;
    private double a;
    private double e;

    public void a(int n, int n2, int n3) {
        on_0.c();
        if (n == 0) {
            if (this.b(n2, n3)) {
                this.i = !this.i;
            }
            this.i = false;
        }
    }

    public boolean b(int n, int n2) {
        on_0.c();
        return (double)n >= this.e && (double)n <= this.e + this.a && (double)n2 >= this.h && (double)n2 <= this.h + this.f;
    }

    public boolean a(int n, int n2) {
        on_0.c();
        return (double)n >= this.e + 3.5 && (double)n <= this.e + 3.0 + this.c + 2.0 + this.c && (double)n2 >= this.h + this.f - 18.0 && (double)n2 <= this.h + this.f - 3.0;
    }

    public void a(double d, double d2, double d3, double d4, double d5, int n, int n2) {
        on_0.c();
        this.e = d;
        this.h = d2;
        this.a = d4;
        this.f = d3;
        this.c = d5;
        a1V.b(d + 3.5, d2 + d3 - 18.0, d + 3.0 + d5 + 2.0 + d5, d2 + d3 - 3.0, this.a(n, n2) ? aol_1.b(new Color(58, 58, 58)) : aol_1.b(new Color(38, 38, 38)));
        a1V.b(d + 4.0, d2 + d3 - 17.5, d + 3.0 + d5 + 2.0 + d5 - 0.5, d2 + d3 - 3.5, aol_1.b(new Color(15, 15, 15)));
        a7l_0.b(me_0.a, a7l_0.a(me_0.a, aL0.a(aL0.a(new StringBuilder(), this.b), this.i ? sp_1.b : sp_1.g).toString(), (int)d5 * 2 - 15, true), d + 6.0, d2 + d3 - 15.0, -1, true);
        ListInvoker.b(new ListInvoker[4]);
    }

    public on_0() {
        this.g = new TimerUtil();
    }

    public void b(int n, int n2, int n3) {
        on_0.c();
        if (n == 0) {
            if (this.a(n2, n3)) {
                this.i = !this.i;
            }
            this.i = false;
        }
    }

    public static void b(String string) {
        d = string;
    }

    public void a(double d, double d2, double d3, double d4, int n, int n2, int n3, int n4) {
        this.e = d;
        on_0.c();
        this.h = d2;
        this.a = d4;
        this.f = d3;
        a1V.b(d, d2, d + d4, d2 + d3, n);
        a1V.b(d + 1.0, d2 + 1.0, d + d4 - 1.0, d2 + d3 - 1.0, n2);
        a7l_0.b(me_0.a, a7l_0.a(me_0.a, aL0.a(aL0.a(new StringBuilder(), this.b), this.i ? sp_1.f : sp_1.c).toString(), (int)d4 / 2 - 15, true), d + 3.0, d2 + 3.0, -1, true);
    }

    static {
        if (on_0.c() != null) {
            on_0.b("IiAZhb");
        }
    }

    public static String c() {
        return d;
    }

    public void a(char c, int n) {
        block5: {
            block6: {
                on_0.c();
                if (!this.i) break block5;
                if (n != 14) break block6;
                if (StringInvoker.c(this.b) == 0) break block5;
                this.b = StringInvoker.b(this.b, 0, StringInvoker.c(this.b) - 1);
            }
            if (n == 1 || n == 28) {
                this.i = false;
            }
            if (n != 14 && n != 219 && n != 157 && n != 29 && n != 54 && n != 42 && n != 15 && n != 58 && n != 211 && n != 199 && n != 210 && n != 200 && n != 208 && n != 205 && n != 203 && n != 56 && n != 184 && n != 197 && n != 70 && n != 207 && n != 201 && n != 209 && n != 221 && n != 59 && n != 60 && n != 61 && n != 62 && n != 63 && n != 64 && n != 65 && n != 66 && n != 67 && n != 68 && n != 87 && n != 88) {
                this.b = aL0.a(aL0.a(new StringBuilder(), this.b), c).toString();
            }
        }
    }

    public void a(String string) {
        this.b = string;
    }

    public String a() {
        return this.b;
    }

    public boolean b() {
        return this.i;
    }

    public void a(double d, double d2, double d3, double d4, int n, int n2) {
        on_0.c();
        this.e = d;
        this.h = d2;
        this.a = d4;
        this.f = d3;
        a1V.b(d, d2, d + d4, d2 + d3, this.b(n, n2) ? aol_1.b(new Color(58, 58, 58)) : aol_1.b(new Color(38, 38, 38)));
        a1V.b(d + 0.5, d2 + 0.5, d + d4 - 0.5, d2 + d3 - 0.5, aol_1.b(new Color(15, 15, 15)));
        a7l_0.b(me_0.a, a7l_0.a(me_0.a, aL0.a(aL0.a(new StringBuilder(), this.b), this.i ? sp_1.d : sp_1.a).toString(), (int)d4 / 2 - 15, true), d + 3.0, d2 + 3.0, -1, true);
        if (ListInvoker.b() != null) {
            on_0.b("T1u9w");
        }
    }
}

