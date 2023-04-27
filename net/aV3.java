/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.awt.Color;
import net.aZK;

public class aV3 {
    private static int b;

    public static void a(aZK aZK2, double d, double d2, double d3, double d4, double d5, double d6, Color color, double[] dArray, boolean bl) {
        aZK2.a(d, d2, d3, d4, d5, d6, color, dArray, bl);
    }

    public static aZK a() {
        return aZK.e();
    }

    public static void a(aZK aZK2, double d, double d2, double d3, double d4, Color color, boolean bl) {
        aZK2.a(d, d2, d3, d4, color, bl);
    }

    public static void a(aZK aZK2, double d, double d2, double d3, double d4, double d5, double d6, Color color, float f) {
        aZK2.a(d, d2, d3, d4, d5, d6, color, f);
    }

    public static void a(aZK aZK2, double d, double d2, double d3, double d4, double d5, double d6, Color color, double d7, boolean bl) {
        int n = aV3.b();
        aZK2.b(d, d2, d3, d4, d5, d6, color, d7, bl);
        if (ListInvoker.b() != null) {
            aV3.b(++n);
        }
    }

    public static void b(int n) {
        b = n;
    }

    public static int c() {
        aV3.b();
        return 1;
    }

    public static void a(aZK aZK2, double d, double d2, double d3, double d4, double d5, Color color, boolean bl) {
        aZK2.a(d, d2, d3, d4, d5, color, bl);
    }

    public static int b() {
        return b;
    }

    public static void a(aZK aZK2, double d, double d2, double d3, double d4, double d5, double d6, Color color, boolean bl) {
        aZK2.a(d, d2, d3, d4, d5, d6, color, bl);
    }

    static {
        if (aV3.b() == 0) {
            aV3.b(62);
        }
    }
}

