/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.axX
 */
public class axx_1 {
    private static int[] b;

    public static int[] b() {
        return b;
    }

    public static int b(float f) {
        return Float.floatToIntBits(f);
    }

    public static String d(float f) {
        return Float.toString(f);
    }

    public static float a(String string) {
        return Float.parseFloat(string);
    }

    public static int a(float f, float f2) {
        return Float.compare(f, f2);
    }

    public static int e(float f) {
        return Float.floatToRawIntBits(f);
    }

    static {
        if (axx_1.b() == null) {
            axx_1.b(new int[5]);
        }
    }

    public static float a(Float f) {
        return f.floatValue();
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static float a(int n) {
        return Float.intBitsToFloat(n);
    }

    public static boolean c(float f) {
        return Float.isInfinite(f);
    }

    public static Float a(float f) {
        return Float.valueOf(f);
    }

    public static boolean f(float f) {
        return Float.isNaN(f);
    }
}

