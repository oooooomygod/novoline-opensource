/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import net.minecraft.profiler.Profiler;
import java.util.List;

public class ProfilerInvoker {
    private static int[] b;

    public static void startSection(Profiler profiler, String string) {
        profiler.b(string);
    }

    public static void b(Profiler profiler) {
        profiler.b();
    }

    public static void a(Profiler profiler, String string) {
        profiler.a(string);
    }

    public static String c(Profiler profiler) {
        return profiler.a();
    }

    public static List b(Profiler profiler, String string) {
        return profiler.c(string);
    }

    static {
        if (ProfilerInvoker.b() != null) {
            ProfilerInvoker.b(new int[3]);
        }
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void endSection(Profiler profiler) {
        profiler.c();
    }

    public static int[] b() {
        return b;
    }
}

