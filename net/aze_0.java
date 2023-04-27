/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.aZe
 */
public class aze_0 {
    private static int b;

    public static boolean a(char c) {
        return Character.isDefined(c);
    }

    public static int b() {
        return b;
    }

    public static Character c(char c) {
        return Character.valueOf(c);
    }

    public static boolean e(char c) {
        return Character.isDigit(c);
    }

    public static int c() {
        aze_0.b();
        return 42;
    }

    public static char a(Character c) {
        return c.charValue();
    }

    public static String d(char c) {
        return Character.toString(c);
    }

    public static boolean b(char c) {
        return Character.isWhitespace(c);
    }

    static {
        if (aze_0.c() != 0) {
            aze_0.b(25);
        }
    }

    public static void b(int n) {
        b = n;
    }
}

