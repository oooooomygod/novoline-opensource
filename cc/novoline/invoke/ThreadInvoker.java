/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import java.util.Map;

public class ThreadInvoker {
    private static boolean b;

    public static void sleep(long l4) {
        Thread.sleep(l4);
    }

    public static void yield() {
        Thread.yield();
    }

    public static void e(Thread thread) {
        thread.start();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static StackTraceElement[] a(Thread thread) {
        return thread.getStackTrace();
    }

    public static boolean b() {
        return b;
    }

    static {
        if (!ThreadInvoker.e()) {
            ThreadInvoker.b(true);
        }
    }

    public static Thread a() {
        return Thread.currentThread();
    }

    public static ThreadGroup c(Thread thread) {
        return thread.getThreadGroup();
    }

    public static String b(Thread thread) {
        return thread.getName();
    }

    public static long d(Thread thread) {
        return thread.getId();
    }

    public static void a(Thread thread, String string) {
        thread.setName(string);
    }

    public static void a(Thread thread, boolean bl) {
        thread.setDaemon(bl);
    }

    public static void a(Thread thread, int n) {
        thread.setPriority(n);
    }

    public static boolean e() {
        ThreadInvoker.b();
        return true;
    }

    public static Map d() {
        return Thread.getAllStackTraces();
    }

    public static boolean f() {
        return Thread.interrupted();
    }
}

