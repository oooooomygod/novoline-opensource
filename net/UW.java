/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.a5K;
import net.a5Y;
import net.kz_1;

public class UW {
    private static boolean b;

    public static void a(a5K a5K2, a5Y a5Y2) {
        a5K2.a(a5Y2);
    }

    public static a5K c(a5K a5K2, float f, float f2, float f3) {
        return a5K2.b(f, f2, f3);
    }

    public static a5K b(a5K a5K2, float f, float f2, float f3) {
        return a5K2.a(f, f2, f3);
    }

    public static boolean c() {
        UW.b();
        return true;
    }

    public static a5Y a(a5K a5K2, int n, int n2) {
        return a5K2.a(n, n2);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static void a(a5K a5K2, a5K a5K3) {
        a5K2.a(a5K3);
    }

    public static a5K a(a5K a5K2, boolean bl) {
        return a5K2.c(bl);
    }

    public static void a(a5K a5K2, float f) {
        a5K2.e(f);
    }

    public static a5K e(a5K a5K2, float f, float f2, float f3) {
        return a5K2.e(f, f2, f3);
    }

    public static void a(a5K a5K2, float f, float f2, float f3, int n, int n2, int n3, float f4) {
        UW.c();
        a5K2.a(f, f2, f3, n, n2, n3, f4);
        ListInvoker.b(new ListInvoker[4]);
    }

    public static kz_1 b(a5K a5K2) {
        return a5K2.b();
    }

    public static a5K d(a5K a5K2, float f, float f2, float f3) {
        return a5K2.c(f, f2, f3);
    }

    public static void a(a5K a5K2, float f, float f2, float f3) {
        a5K2.a(f, f2, f3);
    }

    public static a5K a(a5K a5K2) {
        return a5K2.d();
    }

    public static boolean b() {
        return b;
    }

    static {
        if (!UW.c()) {
            UW.b(true);
        }
    }

    public static a5K c(a5K a5K2) {
        return a5K2.a();
    }
}

