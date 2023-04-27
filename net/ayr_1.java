/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.awt.Color;
import java.util.function.Consumer;
import net.N;
import net.a1V;
import net.a7l_0;
import net.a7r_0;
import net.aL0;
import net.aan_1;
import net.aeg_0;
import net.aol_1;
import net.avn_2;
import net.awe_1;
import net.on_0;

/*
 * Renamed from net.ayr
 */
public class ayr_1 {
    private double f;
    private int a = 0;
    private double e;
    private Consumer<String> d;
    private boolean b;
    private String i;
    private double c;
    private double g;
    private aeg_0 h = aeg_0.MOST_RECENT;

    public void a(int n, int n2, int n3) {
        on_0.c();
        if (this.a(n2, n3) && n == 0) {
            ++this.a;
            this.h = (aeg_0)((Object)ListInvoker.get(a7r_0.a((Object[])aeg_0.values()), this.a % aeg_0.values().length));
            aan_1.a(this.d, avn_2.a(this.h));
        }
    }

    public void a(double d, double d2, double d3, double d4, int n, int n2) {
        on_0.c();
        this.a(d, d2, d3, d4);
        a1V.b(d, d2, d + d3, d2 + d4, this.a(n, n2) || this.b ? aol_1.b(new Color(255, 255, 255, 150)) : aol_1.b(new Color(20, 20, 20, 150)));
        a1V.b(d + 0.5, d2 + 0.5, d + d3 - 0.5, d2 + d4 - 0.5, aol_1.b(new Color(33, 33, 33)));
        a7l_0.a(awe_1.a, (CharSequence)aL0.a(aL0.a(aL0.a(new StringBuilder(), this.i), N.b), avn_2.a(this.h)).toString(), (float)(d + d3 / 2.0), (float)(d2 + d4 / 2.0 - 3.0), -1, false);
    }

    public ayr_1(String string, Consumer<String> consumer) {
        this.i = string;
        this.d = consumer;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public void a(double d, double d2, double d3, double d4, int n, int n2, int n3, int n4) {
        this.a(d, d2, d3, d4);
        a1V.b(d, d2, d + d3, d2 + d4, n);
        a1V.b(d + 1.0, d2 + 1.0, d + d3 - 1.0, d2 + d4 - 1.0, n2);
        a7l_0.a(awe_1.a, (CharSequence)aL0.a(aL0.a(aL0.a(new StringBuilder(), this.i), N.a), avn_2.a(this.h)).toString(), (float)(d + d3 / 2.0), (float)(d2 + d4 / 2.0 - 3.0), -1, false);
    }

    public boolean a() {
        return this.b;
    }

    public void a(double d, double d2, double d3, double d4) {
        this.f = d;
        this.g = d2;
        this.c = d3;
        this.e = d4;
    }

    public aeg_0 b() {
        return this.h;
    }

    public boolean a(int n, int n2) {
        on_0.c();
        return (double)n >= this.f && (double)n2 >= this.g && (double)n <= this.f + this.c && (double)n2 <= this.g + this.e;
    }
}

