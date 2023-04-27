/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aba_0;
import net.rm_2;

/*
 * Renamed from net.Ne
 */
public class ne_0 {
    private static boolean b;

    public static void e() {
        aba_0.a();
    }

    public static void a(rm_2 rm_22, float f, int n) {
        aba_0.b(rm_22, f, n);
    }

    public static boolean d() {
        return b;
    }

    public static void a() {
        aba_0.b();
    }

    public static void f() {
        aba_0.c();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean c() {
        ne_0.d();
        return true;
    }

    static {
        if (!ne_0.c()) {
            ne_0.b(true);
        }
    }
}

