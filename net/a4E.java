/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.IOException;

public class a4E {
    private static boolean b;

    public static void b(IOException iOException) {
        iOException.printStackTrace();
    }

    public static boolean b() {
        return b;
    }

    public static boolean c() {
        a4E.b();
        return true;
    }

    public static String a(IOException iOException) {
        return iOException.getMessage();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    static {
        if (!a4E.b()) {
            a4E.b(true);
        }
    }
}

