/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.Db
 */
public class db_0 {
    private static String b = "CjUsUc";

    public static long d(double d) {
        return Double.doubleToLongBits(d);
    }

    public static String c(double d) {
        return Double.toString(d);
    }

    public static void b(String string) {
        b = string;
    }

    public static double a(long l4) {
        return Double.longBitsToDouble(l4);
    }

    public static float a(Double d) {
        return d.floatValue();
    }

    public static double b(Double d) {
        return d;
    }

    public static boolean e(double d) {
        return Double.isInfinite(d);
    }

    public static boolean f(double d) {
        return Double.isNaN(d);
    }

    static {
        if (db_0.b() == null) {
            db_0.b("CjUsUc");
        }
    }

    public static int a(double d, double d2) {
        return Double.compare(d, d2);
    }

    public static String b() {
        return b;
    }

    public static long c(Double d) {
        return d.longValue();
    }

    public static long b(double d) {
        return Double.doubleToRawLongBits(d);
    }

    public static Double a(double d) {
        return d;
    }

    public static double c(String string) {
        return Double.parseDouble(string);
    }
}

