/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.awt.Color;
import java.util.function.Consumer;
import net.a1V;
import net.a7l_0;
import net.a7r_0;
import net.aan_1;
import net.aol_1;
import net.aw_0;
import net.awe_1;
import net.kr_1;

/*
 * Renamed from net.oN
 */
public class on_1 {
    private double i;
    private int a = 0;
    private String h;
    private double b;
    private double f;
    private Consumer<String> e;
    private double c;
    private kr_1 g = kr_1.ALL;
    private boolean d;

    public on_1(String string, Consumer<String> consumer) {
        this.h = string;
        this.e = consumer;
    }

    public void a(int n, int n2, int n3) {
        kr_1.a();
        if (this.a(n2, n3) && n == 0) {
            ++this.a;
            this.g = (kr_1)((Object)ListInvoker.get(a7r_0.a((Object[])kr_1.values()), this.a % kr_1.values().length));
            aan_1.a(this.e, aw_0.a(this.g));
        }
    }

    public kr_1 a() {
        return this.g;
    }

    public boolean a(int n, int n2) {
        kr_1.a();
        return (double)n >= this.f && (double)n2 >= this.i && (double)n <= this.f + this.b && (double)n2 <= this.i + this.c;
    }

    public void a(double d, double d2, double d3, double d4) {
        this.f = d;
        this.i = d2;
        this.b = d3;
        this.c = d4;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    public void a(double d, double d2, double d3, double d4, int n, int n2) {
        kr_1.a();
        this.a(d, d2, d3, d4);
        a1V.b(d, d2, d + d3, d2 + d4, this.a(n, n2) || this.d ? aol_1.b(new Color(255, 255, 255, 150)) : aol_1.b(new Color(45, 45, 45, 150)));
        a1V.b(d + 0.5, d2 + 0.5, d + d3 - 0.5, d2 + d4 - 0.5, aol_1.b(new Color(33, 33, 33)));
        a7l_0.a(awe_1.a, (CharSequence)aw_0.a(this.g), (float)(d + d3 / 2.0) + 3.0f, (float)(d2 + d4 / 2.0 - 3.0), -1, false);
    }
}

