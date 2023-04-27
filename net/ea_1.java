/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.PrintStream;

/*
 * Renamed from net.eA
 */
public class ea_1 {
    private static boolean b;

    public static PrintStream a(PrintStream printStream, String string, Object[] objectArray) {
        return printStream.format(string, objectArray);
    }

    public static boolean b() {
        return b;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static void a(PrintStream printStream, String string) {
        printStream.println(string);
    }

    public static boolean a() {
        ea_1.b();
        return true;
    }

    static {
        if (!ea_1.a()) {
            ea_1.b(true);
        }
    }
}

