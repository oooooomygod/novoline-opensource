/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.aqc
 */
public class aqc_2 {
    public static String b(StackTraceElement stackTraceElement) {
        return stackTraceElement.getClassName();
    }

    public static boolean a(StackTraceElement stackTraceElement) {
        return stackTraceElement.isNativeMethod();
    }

    public static String e(StackTraceElement stackTraceElement) {
        return stackTraceElement.getFileName();
    }

    public static int d(StackTraceElement stackTraceElement) {
        return stackTraceElement.getLineNumber();
    }

    public static String c(StackTraceElement stackTraceElement) {
        return stackTraceElement.getMethodName();
    }
}

