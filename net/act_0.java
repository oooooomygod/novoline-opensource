/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import net.aL0;
import net.aP2;
import net.ahd_0;

/*
 * Renamed from net.aCt
 */
public class act_0 {
    private int a;
    private int b;

    public boolean a(int n) {
        aP2.b();
        return n < this.b ? false : n <= this.a;
    }

    public int b() {
        return this.b;
    }

    public int a() {
        return this.a;
    }

    public String toString() {
        return aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), ahd_0.a), this.b), ahd_0.b), this.a).toString();
    }

    public act_0(int n, int n2) {
        this.b = MathInvoker.b(n, n2);
        this.a = MathInvoker.max(n, n2);
    }
}

