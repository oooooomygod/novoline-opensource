/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.PrintStream;

/*
 * Renamed from net.ch
 */
public class ch_2 {
    private static boolean b;

    public static boolean a() {
        ch_2.b();
        return true;
    }

    public static void a(Exception exception) {
        exception.printStackTrace();
    }

    public static void a(Exception exception, PrintStream printStream) {
        exception.printStackTrace(printStream);
    }

    public static String b(Exception exception) {
        return exception.getMessage();
    }

    public static String c(Exception exception) {
        return exception.getLocalizedMessage();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    static {
        if (!ch_2.a()) {
            ch_2.b(true);
        }
    }

    public static boolean b() {
        return b;
    }
}

