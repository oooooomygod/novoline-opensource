/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

public class MathInvoker {
    private static boolean b;

    public static double c(double d, double d2) {
        return Math.atan2(d, d2);
    }

    public static long a(long l4) {
        return Math.abs(l4);
    }

    public static double b(double d) {
        return Math.atan(d);
    }

    public static double o(double d) {
        return Math.toRadians(d);
    }

    public static float b(float f, float f2) {
        return Math.max(f, f2);
    }

    public static double a(double d) {
        return Math.abs(d);
    }

    public static double i(double d) {
        return Math.sin(d);
    }

    public static int max(int n, int n2) {
        return Math.max(n, n2);
    }

    public static double a() {
        return Math.random();
    }

    static {
        if (!MathInvoker.c()) {
            MathInvoker.b(true);
        }
    }

    public static double h(double d) {
        return Math.acos(d);
    }

    public static double b(double d, double d2) {
        return Math.pow(d, d2);
    }

    public static double c(double d) {
        return Math.log(d);
    }

    public static int b(int n, int n2) {
        return Math.min(n, n2);
    }

    public static double a(double d, double d2) {
        return Math.min(d, d2);
    }

    public static double d(double d, double d2) {
        return Math.max(d, d2);
    }

    public static double e(double d, double d2) {
        return Math.hypot(d, d2);
    }

    public static long b(long l4, long l5) {
        return Math.min(l4, l5);
    }

    public static float b(float f) {
        return Math.abs(f);
    }

    public static long f(double d) {
        return Math.round(d);
    }

    public static boolean b() {
        return b;
    }

    public static double m(double d) {
        return Math.cos(d);
    }

    public static double l(double d) {
        return Math.exp(d);
    }

    public static boolean c() {
        MathInvoker.b();
        return true;
    }

    public static double n(double d) {
        return Math.floor(d);
    }

    public static double e(double d) {
        return Math.toDegrees(d);
    }

    public static float a(float f, float f2) {
        return Math.min(f, f2);
    }

    public static double j(double d) {
        return Math.ceil(d);
    }

    public static int a(float f) {
        return Math.round(f);
    }

    public static double d(double d) {
        return Math.sqrt(d);
    }

    public static double g(double d) {
        return Math.signum(d);
    }

    public static long a(long l4, long l5) {
        return Math.max(l4, l5);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static int a(int n) {
        return Math.abs(n);
    }

    public static double k(double d) {
        return Math.asin(d);
    }
}

