/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.Block;

/*
 * Renamed from net.Hd
 */
public class hd_0 {
    private static String[] b;

    public static String[] b() {
        return b;
    }

    public static void b(nz_1 nz_12) {
        nz_12.C();
    }

    public static void a(nz_1 nz_12, double d, double d2, double d3, float f, float f2) {
        nz_12.c(d, d2, d3, f, f2);
    }

    public static float a(nz_1 nz_12, int n) {
        return nz_12.c(n);
    }

    public static boolean a(nz_1 nz_12) {
        return nz_12.u();
    }

    public static rm_2 d(nz_1 nz_12) {
        return nz_12.getEntityBoundingBox();
    }

    public static float b(nz_1 nz_12, int n) {
        return nz_12.a(n);
    }

    public static boolean a(Block block) {
        return nz_1.a(block);
    }

    static {
        if (hd_0.b() != null) {
            hd_0.b(new String[1]);
        }
    }

    public static int e(nz_1 nz_12) {
        return nz_12.v();
    }

    public static boolean c(nz_1 nz_12) {
        return nz_12.ac();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }
}

