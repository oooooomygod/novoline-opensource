/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.ThreadInvoker;
import net.minecraft.crash.CrashReportCategory;
import deobf.GameSettings;
import java.util.HashMap;

/*
 * Renamed from net.aOg
 */
public class aog_0 {
    private static String b(CrashReport crashReport) {
        aP2.b();
        Throwable throwable = CrashInvoker.e(crashReport);
        if (throwable == null) {
            return aaj_0.H;
        }
        StackTraceElement[] stackTraceElementArray = aWR.b(throwable);
        String string = aaj_0.q;
        if (stackTraceElementArray.length > 0) {
            string = StringInvoker.h(stackTraceElementArray[0].toString());
        }
        String string2 = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ara_2.b(throwable.getClass())), aaj_0.o), aWR.d(throwable)), aaj_0.g), CrashInvoker.a(crashReport)), aaj_0.J), string), aaj_0.z).toString();
        return string2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static void a(CrashReport crashReport, CrashReportCategory crashReportCategory) {
        block11: {
            Throwable throwable;
            block10: {
                block9: {
                    block8: {
                        GameSettings gameSettings;
                        block7: {
                            aP2.b();
                            gameSettings = ys_2.ax();
                            if (gameSettings != null) break block7;
                            return;
                        }
                        if (gameSettings.b0) break block8;
                        return;
                    }
                    throwable = CrashInvoker.e(crashReport);
                    if (throwable != null) break block9;
                    return;
                }
                if (throwable.getClass() != Throwable.class) break block10;
                return;
            }
            if (!StringInvoker.a(ara_2.b(throwable.getClass()), (CharSequence)aaj_0.s)) break block11;
            return;
        }
        try {
            aog_0.a(crashReportCategory);
            String string = aaj_0.p;
            String string2 = aog_0.a(crashReport);
            byte[] byArray = StringInvoker.a(string2, aaj_0.l);
            oi_2 oi_22 = new oi_2();
            HashMap hashMap = new HashMap();
            MapInvoker.c(hashMap, aaj_0.x, ys_2.M());
            MapInvoker.c(hashMap, aaj_0.m, aog_0.b(crashReport));
            es_1 es_12 = new es_1(string, hashMap, byArray, oi_22);
            es_12.setPriority(10);
            es_12.start();
            ThreadInvoker.sleep(1000L);
        }
        catch (Exception exception) {
            ys_2.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ara_2.b(exception.getClass())), aaj_0.j), ch_2.b(exception)).toString());
        }
    }

    private static String a(CrashReport crashReport) {
        StringBuffer stringBuffer = new StringBuffer();
        adw_2.a(stringBuffer, aL0.a(aL0.a(aL0.a(new StringBuilder(), aaj_0.E), ys_2.M()), aaj_0.k).toString());
        adw_2.a(stringBuffer, aL0.a(aL0.a(aL0.a(new StringBuilder(), aaj_0.f), aog_0.b(crashReport)), aaj_0.a).toString());
        adw_2.a(stringBuffer, aaj_0.F);
        adw_2.a(stringBuffer, CrashInvoker.b(crashReport));
        adw_2.a(stringBuffer, aaj_0.M);
        return stringBuffer.toString();
    }

    public static void a(CrashReportCategory crashReportCategory) {
        aP2.b();
        CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aaj_0.C, ys_2.M());
        if (ys_2.ax() != null) {
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aaj_0.i, aL0.c(aL0.a(new StringBuilder(), aaj_0.w), ys_2.v()).toString());
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aaj_0.d, aL0.c(aL0.a(new StringBuilder(), aaj_0.t), ys_2.y()).toString());
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aaj_0.G, aL0.c(aL0.a(new StringBuilder(), aaj_0.v), ys_2.G()).toString());
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aaj_0.L, aL0.c(aL0.a(new StringBuilder(), aaj_0.n), ys_2.ab()).toString());
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aaj_0.u, aL0.a(aL0.a(new StringBuilder(), aaj_0.c), ys_2.O()).toString());
        }
        CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aaj_0.A, aL0.a(aL0.a(new StringBuilder(), aaj_0.b), a3c_0.q()).toString());
        CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aaj_0.y, aL0.a(aL0.a(new StringBuilder(), aaj_0.I), tf_0.D).toString());
        CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aaj_0.D, aL0.a(aL0.a(new StringBuilder(), aaj_0.e), tf_0.m).toString());
        CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aaj_0.h, aL0.a(aL0.a(new StringBuilder(), aaj_0.r), tf_0.p).toString());
        CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aaj_0.B, aL0.c(aL0.a(new StringBuilder(), aaj_0.K), ys_2.aR()).toString());
    }
}

