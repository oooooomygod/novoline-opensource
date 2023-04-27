/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.ThreadLocalRandom;

/*
 * Renamed from net.anf
 */
public class anf_2 {
    private static String[] b;

    static {
        if (anf_2.b() == null) {
            anf_2.b(new String[3]);
        }
    }

    public static float a(ThreadLocalRandom threadLocalRandom) {
        return threadLocalRandom.nextFloat();
    }

    public static double a(ThreadLocalRandom threadLocalRandom, double d, double d2) {
        return threadLocalRandom.nextDouble(d, d2);
    }

    public static int a(ThreadLocalRandom threadLocalRandom, int n, int n2) {
        return threadLocalRandom.nextInt(n, n2);
    }

    public static int a(ThreadLocalRandom threadLocalRandom, int n) {
        return threadLocalRandom.nextInt(n);
    }

    public static double b(ThreadLocalRandom threadLocalRandom) {
        return threadLocalRandom.nextDouble();
    }

    public static String[] b() {
        return b;
    }

    public static int c(ThreadLocalRandom threadLocalRandom) {
        return threadLocalRandom.nextInt();
    }

    public static ThreadLocalRandom c() {
        return ThreadLocalRandom.current();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }
}

