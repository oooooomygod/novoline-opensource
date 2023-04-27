/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.als
 */
public class als_2 {
    public static Process a(Runtime runtime, String string) {
        return runtime.exec(string);
    }

    public static long b(Runtime runtime) {
        return runtime.totalMemory();
    }

    public static Process a(Runtime runtime, String[] stringArray) {
        return runtime.exec(stringArray);
    }

    public static long d(Runtime runtime) {
        return runtime.maxMemory();
    }

    public static long a(Runtime runtime) {
        return runtime.freeMemory();
    }

    public static void a(Runtime runtime, Thread thread) {
        runtime.addShutdownHook(thread);
    }

    public static Runtime a() {
        return Runtime.getRuntime();
    }

    public static int c(Runtime runtime) {
        return runtime.availableProcessors();
    }
}

