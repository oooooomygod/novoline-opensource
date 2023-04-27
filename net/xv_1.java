/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;

/*
 * Renamed from net.xV
 */
public class xv_1 {
    private static ListInvoker[] d;
    private double a;
    private double b;
    private int c;
    private double e;

    public void a(int n) {
        this.c = n;
    }

    public double a() {
        return this.a;
    }

    public static ListInvoker[] e() {
        return d;
    }

    static {
        if (xv_1.e() == null) {
            xv_1.b(new ListInvoker[2]);
        }
    }

    public static void b(ListInvoker[] listInvokerArray) {
        d = listInvokerArray;
    }

    public double c() {
        return this.b;
    }

    public xv_1(double d, double d2, double d3) {
        xv_1.e();
        this.a = d;
        this.e = d2;
        this.b = d3;
        ListInvoker.b(new ListInvoker[3]);
    }

    public double d() {
        return this.e;
    }

    public int b() {
        return this.c;
    }
}

