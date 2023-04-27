/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MapColor;
import net.Material;

/*
 * Renamed from net.akM
 */
public class akm_1 {
    private static boolean b;

    public static boolean h(Material material) {
        return material.c();
    }

    public static boolean g(Material material) {
        return material.k();
    }

    static {
        if (!akm_1.a()) {
            akm_1.b(true);
        }
    }

    public static MapColor j(Material material) {
        return material.e();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    public static boolean e(Material material) {
        return material.m();
    }

    public static boolean d(Material material) {
        return material.q();
    }

    public static boolean f(Material material) {
        return material.l();
    }

    public static boolean a() {
        akm_1.b();
        return true;
    }

    public static boolean c(Material material) {
        return material.p();
    }

    public static int b(Material material) {
        return material.o();
    }

    public static boolean i(Material material) {
        return material.h();
    }

    public static boolean a(Material material) {
        return material.f();
    }
}

