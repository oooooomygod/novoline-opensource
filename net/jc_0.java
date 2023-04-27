/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.Jc
 */
public class jc_0 {
    private static boolean b;

    public static boolean b() {
        return b;
    }

    public static Enum a(Class clazz, String string) {
        return Enum.valueOf(clazz, string);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean c() {
        jc_0.b();
        return true;
    }

    static {
        if (jc_0.b()) {
            jc_0.b(true);
        }
    }
}

