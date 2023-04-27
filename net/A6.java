/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.internal.ThreadLocalRandom
 */
package net;

import io.netty.util.internal.ThreadLocalRandom;

public class A6 {
    private static int[] b;

    public static double a(ThreadLocalRandom threadLocalRandom, double d, double d2) {
        return threadLocalRandom.nextDouble(d, d2);
    }

    static {
        if (A6.b() != null) {
            A6.b(new int[5]);
        }
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static int[] b() {
        return b;
    }

    public static ThreadLocalRandom a() {
        return ThreadLocalRandom.current();
    }
}

