/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.util.MovingObjectPosition;
import deobf.Vec3;

/*
 * Renamed from net.h_
 */
public class h__0 {
    private static int[] b;

    public static rm_2 b(rm_2 rm_22, double d, double d2, double d3) {
        return rm_22.d(d, d2, d3);
    }

    public static rm_2 a(rm_2 rm_22, double d, double d2, double d3) {
        return rm_22.a(d, d2, d3);
    }

    public static double a(rm_2 rm_22, rm_2 rm_23, double d) {
        return rm_22.b(rm_23, d);
    }

    public static rm_2 a(double d, double d2, double d3, double d4, double d5, double d6) {
        return rm_2.a(d, d2, d3, d4, d5, d6);
    }

    public static double c(rm_2 rm_22, rm_2 rm_23, double d) {
        return rm_22.c(rm_23, d);
    }

    public static boolean b(rm_2 rm_22, rm_2 rm_23) {
        return rm_22.a(rm_23);
    }

    public static double b(rm_2 rm_22, rm_2 rm_23, double d) {
        return rm_22.a(rm_23, d);
    }

    static {
        if (h__0.b() != null) {
            h__0.b(new int[2]);
        }
    }

    public static double b(rm_2 rm_22) {
        return rm_22.b();
    }

    public static rm_2 c(rm_2 rm_22, double d, double d2, double d3) {
        return rm_22.c(d, d2, d3);
    }

    public static int[] b() {
        return b;
    }

    public static boolean a(rm_2 rm_22) {
        return rm_22.a();
    }

    public static MovingObjectPosition a(rm_2 rm_22, Vec3 vec3, Vec3 vec32) {
        return rm_22.a(vec3, vec32);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static rm_2 d(rm_2 rm_22, double d, double d2, double d3) {
        return rm_22.b(d, d2, d3);
    }

    public static boolean a(rm_2 rm_22, Vec3 vec3) {
        return rm_22.b(vec3);
    }

    public static rm_2 a(rm_2 rm_22, rm_2 rm_23) {
        return rm_22.b(rm_23);
    }
}

