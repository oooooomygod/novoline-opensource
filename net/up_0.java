/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.a5Y;

/*
 * Renamed from net.Up
 */
public class up_0 {
    private static String[] b;

    public static void a(a5Y a5Y2, float f, float f2, float f3, int n, int n2, int n3, float f4) {
        a5Y2.a(f, f2, f3, n, n2, n3, f4);
    }

    static {
        if (up_0.b() == null) {
            up_0.b(new String[3]);
        }
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void b(a5Y a5Y2, float f, float f2, float f3, int n, int n2, int n3, float f4) {
        a5Y2.b(f, f2, f3, n, n2, n3, f4);
    }

    public static void a(a5Y a5Y2, float f) {
        a5Y2.a(f);
    }

    public static a5Y b(a5Y a5Y2, int n, int n2) {
        return a5Y2.b(n, n2);
    }

    public static a5Y a(a5Y a5Y2, float f, float f2, float f3, int n, int n2, int n3, boolean bl) {
        up_0.b();
        a5Y a5Y3 = a5Y2.a(f, f2, f3, n, n2, n3, bl);
        ListInvoker.b(new ListInvoker[4]);
        return a5Y3;
    }

    public static a5Y a(a5Y a5Y2, float f, float f2, float f3, int n, int n2, int n3) {
        return a5Y2.a(f, f2, f3, n, n2, n3);
    }

    public static a5Y a(a5Y a5Y2, int n, int n2) {
        return a5Y2.a(n, n2);
    }

    public static void b(a5Y a5Y2, float f) {
        a5Y2.d(f);
    }

    public static void c(a5Y a5Y2, float f) {
        a5Y2.b(f);
    }

    public static void a(a5Y a5Y2, a5Y a5Y3) {
        a5Y2.a(a5Y3);
    }

    public static String[] b() {
        return b;
    }

    public static void a(a5Y a5Y2, float f, float f2, float f3) {
        a5Y2.a(f, f2, f3);
    }

    public static a5Y a(a5Y a5Y2, String string, float f, float f2, float f3, int n, int n2, int n3) {
        up_0.b();
        a5Y a5Y3 = a5Y2.a(string, f, f2, f3, n, n2, n3);
        if (ListInvoker.b() != null) {
            up_0.b(new String[5]);
        }
        return a5Y3;
    }
}

