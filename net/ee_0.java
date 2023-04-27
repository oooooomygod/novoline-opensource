/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * Renamed from net.Ee
 */
public class ee_0 {
    private static boolean b;

    public static boolean c() {
        ee_0.b();
        return true;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static int a(AtomicInteger atomicInteger) {
        return atomicInteger.incrementAndGet();
    }

    static {
        if (!ee_0.c()) {
            ee_0.b(true);
        }
    }

    public static boolean b() {
        return b;
    }
}

