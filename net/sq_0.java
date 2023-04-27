/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aL0;
import net.aP2;
import net.aPN;

/*
 * Renamed from net.Sq
 */
public class sq_0 {
    private String d;
    private int a;
    private int c;
    private int b;

    public sq_0(int n, int n2, int n3, String string) {
        this.b = n;
        this.a = n2;
        this.c = n3;
        this.d = string;
    }

    public int c() {
        aP2.b();
        return this.a > 9 ? this.b * 100 + this.a : (this.c > 9 ? this.b * 100 + this.a * 10 + 9 : this.b * 100 + this.a * 10 + this.c);
    }

    public int d() {
        return this.a;
    }

    public sq_0(int n, int n2) {
        this(n, n2, 0);
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public String toString() {
        aP2.b();
        return this.d == null ? aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), aPN.c), this.b), aPN.b), this.a), aPN.e), this.c).toString() : aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), aPN.f), this.b), aPN.a), this.a), aPN.d), this.c), this.d).toString();
    }

    public sq_0(int n, int n2, int n3) {
        this(n, n2, n3, null);
    }
}

