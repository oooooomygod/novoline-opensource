/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.auk
 */
public class auk_2 {
    private static int[] b;

    static {
        if (auk_2.b() != null) {
            auk_2.b(new int[3]);
        }
    }

    public static Boolean a(String string) {
        return Boolean.valueOf(string);
    }

    public static boolean b(String string) {
        return Boolean.parseBoolean(string);
    }

    public static Boolean b(boolean bl) {
        return bl;
    }

    public static int[] b() {
        return b;
    }

    public static String a(boolean bl) {
        return Boolean.toString(bl);
    }

    public static boolean a(Boolean bl) {
        return bl;
    }

    public static int a(boolean bl, boolean bl2) {
        return Boolean.compare(bl, bl2);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }
}

