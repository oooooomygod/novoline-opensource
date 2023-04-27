/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.axt
 */
public class axt_2 {
    private static boolean b;

    public static byte a(String string) {
        return Byte.parseByte(string);
    }

    static {
        if (!axt_2.a()) {
            axt_2.b(true);
        }
    }

    public static boolean b() {
        return b;
    }

    public static Byte a(byte by) {
        return by;
    }

    public static boolean a() {
        axt_2.b();
        return true;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static byte a(Byte by) {
        return by;
    }

    public static String b(byte by) {
        return Byte.toString(by);
    }
}

