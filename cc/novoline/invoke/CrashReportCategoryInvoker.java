/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import net.minecraft.crash.CrashReportCategory;
import java.util.concurrent.Callable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.IBlockState;

public class CrashReportCategoryInvoker {
    private static int b;

    public static int b() {
        return b;
    }

    static {
        if (CrashReportCategoryInvoker.b() == 0) {
            CrashReportCategoryInvoker.b(105);
        }
    }

    public static StackTraceElement[] a(CrashReportCategory crashReportCategory) {
        return crashReportCategory.a();
    }

    public static int a(CrashReportCategory crashReportCategory, int n) {
        return crashReportCategory.a(n);
    }

    public static void b(int n) {
        b = n;
    }

    public static int c() {
        CrashReportCategoryInvoker.b();
        return 65;
    }

    public static void a(CrashReportCategory crashReportCategory, BlockPos blockPos, Block block, int n) {
        CrashReportCategory.a(crashReportCategory, blockPos, block, n);
    }

    public static String a(BlockPos blockPos) {
        return CrashReportCategory.a(blockPos);
    }

    public static void a(CrashReportCategory crashReportCategory, String string, Throwable throwable) {
        crashReportCategory.a(string, throwable);
    }

    public static boolean a(CrashReportCategory crashReportCategory, StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return crashReportCategory.a(stackTraceElement, stackTraceElement2);
    }

    public static void addCrashSection(CrashReportCategory crashReportCategory, String string, Object object) {
        crashReportCategory.a(string, object);
    }

    public static String a(double d, double d2, double d3) {
        return CrashReportCategory.a(d, d2, d3);
    }

    public static void a(CrashReportCategory crashReportCategory, BlockPos blockPos, IBlockState iBlockState) {
        CrashReportCategory.a(crashReportCategory, blockPos, iBlockState);
    }

    public static void a(CrashReportCategory crashReportCategory, String string, Callable callable) {
        crashReportCategory.a(string, callable);
    }

    public static void a(CrashReportCategory crashReportCategory, StringBuilder stringBuilder) {
        crashReportCategory.a(stringBuilder);
    }

    public static void b(CrashReportCategory crashReportCategory, int n) {
        crashReportCategory.b(n);
    }
}

