/*
 * Decompiled with CFR 0.152.
 */
package net;

public class P8 {
    private static int[] b;

    public static int e(int n) {
        return Integer.bitCount(n);
    }

    public static String a(int n) {
        return Integer.toBinaryString(n);
    }

    public static String b(int n) {
        return Integer.toHexString(n);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static int[] b() {
        return b;
    }

    public static int a(String string) {
        return Integer.parseInt(string);
    }

    public static String g(int n) {
        return Integer.toString(n);
    }

    public static int b(Integer n) {
        return n;
    }

    static {
        if (P8.b() != null) {
            P8.b(new int[2]);
        }
    }

    public static int a(int n, int n2) {
        return Integer.compare(n, n2);
    }

    public static int c(int n) {
        return Integer.hashCode(n);
    }

    public static Integer d(int n) {
        return n;
    }

    public static int f(int n) {
        return Integer.lowestOneBit(n);
    }

    public static int a(String string, int n) {
        return Integer.parseInt(string, n);
    }

    public static double a(Integer n) {
        return n.doubleValue();
    }
}

