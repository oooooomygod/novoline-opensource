/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.ref.WeakReference;

/*
 * Renamed from net.e7
 */
public class e7_0 {
    private static int b;

    public static int b() {
        return b;
    }

    public static Object a(WeakReference weakReference) {
        return weakReference.get();
    }

    public static void b(int n) {
        b = n;
    }

    public static int c() {
        e7_0.b();
        return 58;
    }

    static {
        if (e7_0.c() != 0) {
            e7_0.b(26);
        }
    }
}

