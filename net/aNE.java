/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Vec3;

public class aNE {
    private static int[] b;

    public static double c(Vec3 vec3, Vec3 vec32) {
        return vec3.a(vec32);
    }

    public static Vec3 b(Vec3 vec3, Vec3 vec32, double d) {
        return vec3.c(vec32, d);
    }

    public static Vec3 f(Vec3 vec3, Vec3 vec32) {
        return vec3.d(vec32);
    }

    static {
        if (aNE.b() == null) {
            aNE.b(new int[4]);
        }
    }

    public static double e(Vec3 vec3, Vec3 vec32) {
        return vec3.b(vec32);
    }

    public static Vec3 d(Vec3 vec3, Vec3 vec32) {
        return vec3.g(vec32);
    }

    public static Vec3 a(Vec3 vec3, double d, double d2, double d3) {
        return vec3.a(d, d2, d3);
    }

    public static Vec3 c(Vec3 vec3, Vec3 vec32, double d) {
        return vec3.a(vec32, d);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static Vec3 b(Vec3 vec3, float f) {
        return vec3.a(f);
    }

    public static Vec3 b(Vec3 vec3, double d, double d2, double d3) {
        return vec3.b(d, d2, d3);
    }

    public static double d(Vec3 vec3) {
        return vec3.b();
    }

    public static Vec3 b(Vec3 vec3) {
        return vec3.c();
    }

    public static double a(Vec3 vec3) {
        return vec3.a();
    }

    public static Vec3 b(Vec3 vec3, Vec3 vec32) {
        return vec3.e(vec32);
    }

    public static double e(Vec3 vec3) {
        return vec3.d();
    }

    public static Vec3 g(Vec3 vec3, Vec3 vec32) {
        return vec3.f(vec32);
    }

    public static double c(Vec3 vec3) {
        return vec3.e();
    }

    public static Vec3 a(Vec3 vec3, Vec3 vec32, double d) {
        return vec3.b(vec32, d);
    }

    public static double a(Vec3 vec3, Vec3 vec32) {
        return vec3.c(vec32);
    }

    public static int[] b() {
        return b;
    }

    public static Vec3 a(Vec3 vec3, float f) {
        return vec3.b(f);
    }
}

