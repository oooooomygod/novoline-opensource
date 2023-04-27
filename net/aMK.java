/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Vec3;
import net.DQ;
import net.aL0;

public class aMK {
    private double e;
    private double c;
    private double d;
    private static String b = "MxfPvb";

    public void c(double d) {
        this.d = d;
    }

    public aMK c() {
        return new aMK(MathInvoker.n(this.c), MathInvoker.n(this.d), MathInvoker.n(this.e));
    }

    public double b(aMK aMK2) {
        return MathInvoker.b(aMK2.c - this.c, 2.0) + MathInvoker.b(aMK2.d - this.d, 2.0) + MathInvoker.b(aMK2.e - this.e, 2.0);
    }

    public static void b(String string) {
        b = string;
    }

    public aMK(double d, double d2, double d3) {
        this.c = d;
        this.d = d2;
        this.e = d3;
    }

    public aMK a(aMK aMK2) {
        return this.a(aMK2.a(), aMK2.e(), aMK2.b());
    }

    public void b(double d) {
        this.e = d;
    }

    static {
        if (aMK.f() == null) {
            aMK.b("MxfPvb");
        }
    }

    public double e() {
        return this.d;
    }

    public Vec3 d() {
        return new Vec3(this.c, this.d, this.e);
    }

    public double b() {
        return this.e;
    }

    public double a() {
        return this.c;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), DQ.b), this.c), DQ.d), this.d), DQ.a), this.e), DQ.c).toString();
    }

    public aMK a(double d, double d2, double d3) {
        return new aMK(this.c + d, this.d + d2, this.e + d3);
    }

    public void a(double d) {
        this.c = d;
    }

    public static String f() {
        return b;
    }
}

