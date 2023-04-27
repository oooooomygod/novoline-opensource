/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;

/*
 * Renamed from net.a5
 */
public class a5_0 {
    private static int b;

    public static long b(Random random) {
        return random.nextLong();
    }

    public static double c(Random random) {
        return random.nextDouble();
    }

    public static double f(Random random) {
        return random.nextGaussian();
    }

    public static int d(Random random) {
        return random.nextInt();
    }

    public static int b() {
        return b;
    }

    public static float e(Random random) {
        return random.nextFloat();
    }

    public static void a(Random random, byte[] byArray) {
        random.nextBytes(byArray);
    }

    public static int a() {
        a5_0.b();
        return 15;
    }

    public static void b(int n) {
        b = n;
    }

    static {
        if (a5_0.a() == 0) {
            a5_0.b(15);
        }
    }

    public static int a(Random random, int n) {
        return random.nextInt(n);
    }

    public static void a(Random random, long l4) {
        random.setSeed(l4);
    }

    public static boolean a(Random random) {
        return random.nextBoolean();
    }
}

