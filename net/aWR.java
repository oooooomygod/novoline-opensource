/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.PrintWriter;

public class aWR {
    private static boolean b;

    public static Throwable a(Throwable throwable) {
        return throwable.getCause();
    }

    public static StackTraceElement[] b(Throwable throwable) {
        return throwable.getStackTrace();
    }

    public static String d(Throwable throwable) {
        return throwable.getMessage();
    }

    static {
        if (!aWR.a()) {
            aWR.b(true);
        }
    }

    public static void a(Throwable throwable, StackTraceElement[] stackTraceElementArray) {
        throwable.setStackTrace(stackTraceElementArray);
    }

    public static void a(Throwable throwable, Throwable throwable2) {
        throwable.addSuppressed(throwable2);
    }

    public static boolean a() {
        aWR.b();
        return true;
    }

    public static void a(Throwable throwable, PrintWriter printWriter) {
        throwable.printStackTrace(printWriter);
    }

    public static void c(Throwable throwable) {
        throwable.printStackTrace();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }
}

