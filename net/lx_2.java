/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.lx
 */
public class lx_2 {
    private static String[] b;

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static String c(long l4) {
        return Long.toString(l4);
    }

    public static Long b(String string) {
        return Long.valueOf(string);
    }

    public static int a(long l4) {
        return Long.hashCode(l4);
    }

    public static String[] b() {
        return b;
    }

    public static long a(Long l4) {
        return l4;
    }

    public static long a(String string) {
        return Long.parseLong(string);
    }

    public static String a(long l4, int n) {
        return Long.toString(l4, n);
    }

    public static Long b(long l4) {
        return l4;
    }

    static {
        if (lx_2.b() == null) {
            lx_2.b(new String[1]);
        }
    }
}

