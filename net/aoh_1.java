/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.nio.FloatBuffer;
import net.T4;

/*
 * Renamed from net.aoH
 */
public class aoh_1 {
    private static int[] b;

    public static void a(T4 t4, float f, float f2) {
        t4.a(f, f2);
    }

    public static void a(T4 t4, float f) {
        t4.a(f);
    }

    public static void a(T4 t4, FloatBuffer floatBuffer) {
        t4.a(floatBuffer);
    }

    public static void a(T4 t4, boolean bl) {
        t4.a(bl);
    }

    public static int[] b() {
        return b;
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void a(T4 t4, float f, float f2, float f3, float f4) {
        t4.a(f, f2, f3, f4);
    }

    public static void b(T4 t4, int n) {
        t4.b(n);
    }

    public static void a(T4 t4, float f, float f2, float f3) {
        t4.a(f, f2, f3);
    }

    public static void a(T4 t4, int n) {
        t4.a(n);
    }

    static {
        if (aoh_1.b() != null) {
            aoh_1.b(new int[2]);
        }
    }
}

