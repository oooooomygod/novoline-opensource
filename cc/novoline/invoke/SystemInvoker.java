/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import java.io.PrintStream;

public class SystemInvoker {
    private static boolean b;

    public static String a(String string, String string2) {
        return System.getProperty(string, string2);
    }

    public static String a() {
        return System.lineSeparator();
    }

    public static String c(String string) {
        return System.getProperty(string);
    }

    public static void a(String string) {
        System.loadLibrary(string);
    }

    public static void b(String string) {
        System.load(string);
    }

    public static long f() {
        return System.currentTimeMillis();
    }

    public static boolean e() {
        return b;
    }

    public static void a(int n) {
        System.exit(n);
    }

    static {
        if (SystemInvoker.c()) {
            SystemInvoker.b(true);
        }
    }

    public static boolean c() {
        SystemInvoker.e();
        return true;
    }

    public static long nanoTime() {
        return System.nanoTime();
    }

    public static void a(Object object, int n, Object object2, int n2, int n3) {
        System.arraycopy(object, n, object2, n2, n3);
    }

    public static void b(PrintStream printStream) {
        System.setOut(printStream);
    }

    public static String b(String string, String string2) {
        return System.setProperty(string, string2);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static String d(String string) {
        return System.getenv(string);
    }

    public static void a(PrintStream printStream) {
        System.setErr(printStream);
    }
}

