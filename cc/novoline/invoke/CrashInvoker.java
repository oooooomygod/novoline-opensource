/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import net.minecraft.crash.CrashReportCategory;
import java.io.File;
import net.CrashReport;

public class CrashInvoker {
    private static int b;

    public static int b() {
        return b;
    }

    static {
        if (CrashInvoker.c() == 0) {
            CrashInvoker.b(100);
        }
    }

    public static CrashReportCategory a(CrashReport crashReport, String string) {
        return crashReport.a(string);
    }

    public static int c() {
        CrashInvoker.b();
        return 86;
    }

    public static CrashReportCategory a(CrashReport crashReport, String string, int n) {
        return crashReport.a(string, n);
    }

    public static CrashReport makeCrashReport(Throwable throwable, String string) {
        return CrashReport.a(throwable, string);
    }

    public static boolean a(CrashReport crashReport, File file) {
        return crashReport.a(file);
    }

    public static String b(CrashReport crashReport) {
        return crashReport.h();
    }

    public static Throwable e(CrashReport crashReport) {
        return crashReport.f();
    }

    public static CrashReportCategory c(CrashReport crashReport) {
        return crashReport.b();
    }

    public static String a(CrashReport crashReport) {
        return crashReport.e();
    }

    public static void b(int n) {
        b = n;
    }

    public static File d(CrashReport crashReport) {
        return crashReport.a();
    }
}

