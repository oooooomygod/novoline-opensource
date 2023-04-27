/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.MCInvoker;

/*
 * Renamed from net.Mz
 */
public class mz_0 {
    public double a;
    public int c;
    public double b;

    public double a() {
        double d = MathInvoker.a(MCInvoker.f().player.posX - this.a);
        double d2 = MathInvoker.a(MCInvoker.f().player.posZ - this.b);
        return MathInvoker.d(d * d + d2 * d2);
    }

    public mz_0(double d, double d2, int n) {
        this.a = d;
        this.b = d2;
        this.c = n;
    }
}

