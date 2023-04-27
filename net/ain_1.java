/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;

/*
 * Renamed from net.aiN
 */
public class ain_1 {
    private static String[] b;

    public static BlockPos c(z6_0 z6_02) {
        return z6_02.e();
    }

    public static BlockPos f(z6_0 z6_02) {
        return z6_02.c();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    static {
        if (ain_1.b() != null) {
            ain_1.b(new String[3]);
        }
    }

    public static int g(z6_0 z6_02) {
        return z6_02.c();
    }

    public static BlockPos b(z6_0 z6_02) {
        return z6_02.a();
    }

    public static BlockPos d(z6_0 z6_02) {
        return z6_02.f();
    }

    public static z6_0 a(z6_0 z6_02, int n, int n2, int n3) {
        return z6_02.a(n, n2, n3);
    }

    public static int a(z6_0 z6_02) {
        return z6_02.b();
    }

    public static int e(z6_0 z6_02) {
        return z6_02.a();
    }

    public static String[] b() {
        return b;
    }
}

