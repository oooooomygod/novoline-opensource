/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.crash;

import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.SystemInvoker;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.Logger;

public class CrashReport {
    private CrashReportCategory g = new CrashReportCategory(this, ayl_2.E);
    private static Logger j;
    private String a;
    private StackTraceElement[] i;
    private static String f;
    private File b;
    private boolean d = false;
    private Throwable c;
    private List e = my_0.c();
    private boolean h = true;

    public CrashReportCategory a(String string) {
        return this.a(string, 1);
    }


    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public CrashReport(String string, Throwable throwable) {
        this.i = new StackTraceElement[0];
        this.a = string;
        this.c = throwable;
        this.d();
    }

    public String h() {
        if (!this.d) {
            this.d = true;
            agr_1.a(this, this.g);
        }
        StringBuilder stringBuilder = new StringBuilder();
        aL0.a(stringBuilder, ayl_2.l);
        aDb.f(ail_0.c3, new Object[]{stringBuilder});
        aDb.f(ail_0.bo, new Object[]{stringBuilder});
        aL0.a(stringBuilder, ayl_2.ag);
        aL0.a(stringBuilder, CrashReport.g());
        aL0.a(stringBuilder, ayl_2.ah);
        aL0.a(stringBuilder, ayl_2.V);
        aL0.a(stringBuilder, aZ2.a(new SimpleDateFormat(), new Date()));
        aL0.a(stringBuilder, ayl_2.b);
        aL0.a(stringBuilder, ayl_2.H);
        aL0.a(stringBuilder, this.a);
        aL0.a(stringBuilder, ayl_2.n);
        aL0.a(stringBuilder, this.c());
        aL0.a(stringBuilder, ayl_2.I);
        int n = 0;
        while (true) {
            aL0.a(stringBuilder, ayl_2.g);
            ++n;
        }
    }

    public File a() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    public CrashReportCategory b() {
        return this.g;
    }

    public boolean a(File file) {
        if (this.b != null) {
            return false;
        }
        if (zq_2.b(file) != null) {
            zq_2.a(zq_2.b(file));
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            l2.a(fileWriter, this.h());
            l2.a(fileWriter);
            this.b = file;
            return true;
        }
        catch (Throwable throwable) {
            LoggerInvoker.a(j, aL0.a(aL0.a(new StringBuilder(), ayl_2.O), file).toString(), throwable);
            return false;
        }
    }

    public Throwable f() {
        return this.c;
    }

    private static String g() {
        String[] stringArray = new String[]{ayl_2.c, ayl_2.r, ayl_2.e, ayl_2.j, ayl_2.t, ayl_2.y, ayl_2.q, ayl_2.x, ayl_2.ab, ayl_2.z, ayl_2.B, ayl_2.k, ayl_2.m, ayl_2.al, ayl_2.A, ayl_2.S, ayl_2.ad, ayl_2.P, ayl_2.aa, ayl_2.ai, ayl_2.F, ayl_2.R, ayl_2.aj, ayl_2.N, ayl_2.o, ayl_2.ak, ayl_2.T, ayl_2.f, ayl_2.a, ayl_2.W, ayl_2.Y, ayl_2.L, ayl_2.p, ayl_2.G};
        try {
            return stringArray[(int)(SystemInvoker.nanoTime() % (long)stringArray.length)];
        }
        catch (Throwable throwable) {
            return ayl_2.X;
        }
    }

    public static CrashReport a(Throwable throwable, String string) {
        CrashReport crashReport = throwable instanceof ReportedException ? apx_0.a((ReportedException)throwable) : new CrashReport(string, throwable);
        return crashReport;
    }

    private void d() {
        CrashReportCategoryInvoker.a(this.g, ayl_2.ac, new asz_1(this));
        CrashReportCategoryInvoker.a(this.g, ayl_2.J, new acm_2(this));
        CrashReportCategoryInvoker.a(this.g, ayl_2.af, new aes_2());
        CrashReportCategoryInvoker.a(this.g, ayl_2.v, new asf_0(this));
        CrashReportCategoryInvoker.a(this.g, ayl_2.h, new df_1(this));
        CrashReportCategoryInvoker.a(this.g, ayl_2.K, new azn_0(this));
        CrashReportCategoryInvoker.a(this.g, ayl_2.am, new ak__0(this));
        CrashReportCategoryInvoker.a(this.g, ayl_2.M, new a2O(this));
        if (ayy_0.d(ail_0.br)) {
            Object object = aDb.f(ail_0.bC, new Object[0]);
            aDb.a(object, ail_0.br, new Object[]{this, this.g});
        }
    }

    public void a(StringBuilder stringBuilder) {
        if (!(this.i != null && this.i.length > 0 || ListInvoker.isEmpty(this.e))) {
            this.i = (StackTraceElement[])aoe_2.a((Object[])CrashReportCategoryInvoker.a((CrashReportCategory)ListInvoker.get(this.e, 0)), 0, 1);
        }
        if (this.i != null && this.i.length > 0) {
            aL0.a(stringBuilder, ayl_2.C);
            aL0.a(stringBuilder, ayl_2.u);
            for (StackTraceElement stackTraceElement : this.i) {
                aL0.a(aL0.a(aL0.a(stringBuilder, ayl_2.i), ayl_2.U), stackTraceElement.toString());
                aL0.a(stringBuilder, ayl_2.s);
            }
            aL0.a(stringBuilder, ayl_2.Z);
        }
        StackTraceElement[] stackTraceElementArray = ListInvoker.iterator(this.e);
        while (dz_0.c((Iterator)stackTraceElementArray)) {
            Object object = dz_0.b((Iterator)stackTraceElementArray);
            CrashReportCategoryInvoker.a((CrashReportCategory)object, stringBuilder);
            aL0.a(stringBuilder, ayl_2.d);
        }
        CrashReportCategoryInvoker.a(this.g, stringBuilder);
    }

    public String c() {
        StringWriter stringWriter = null;
        PrintWriter printWriter = null;
        Throwable throwable = this.c;
        if (aWR.d(throwable) == null) {
            if (throwable instanceof NullPointerException) {
                throwable = new NullPointerException(this.a);
            } else if (throwable instanceof StackOverflowError) {
                throwable = new StackOverflowError(this.a);
            } else if (throwable instanceof OutOfMemoryError) {
                throwable = new OutOfMemoryError(this.a);
            }
            aWR.a(throwable, aWR.b(this.c));
        }
        String string = ((Object)throwable).toString();
        try {
            stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            aWR.a(throwable, printWriter);
            string = stringWriter.toString();
        }
        catch (Throwable throwable2) {
            IOUtilsInvoker.a(stringWriter);
            IOUtilsInvoker.a(printWriter);
            throw throwable2;
        }
        IOUtilsInvoker.a(stringWriter);
        IOUtilsInvoker.a(printWriter);
        return string;
    }

    public CrashReportCategory a(String string, int n) {
        CrashReportCategory crashReportCategory = new CrashReportCategory(this, string);
        if (this.h) {
            int n2 = CrashReportCategoryInvoker.a(crashReportCategory, n);
            StackTraceElement[] stackTraceElementArray = aWR.b(this.c);
            StackTraceElement stackTraceElement = null;
            StackTraceElement stackTraceElement2 = null;
            int n3 = stackTraceElementArray.length - n2;
            ea_1.a(System.out, aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), ayl_2.D), stackTraceElementArray.length), ayl_2.w), n2), ayl_2.Q).toString());
            if (0 <= n3 && n3 < stackTraceElementArray.length) {
                stackTraceElement = stackTraceElementArray[n3];
                if (stackTraceElementArray.length + 1 - n2 < stackTraceElementArray.length) {
                    stackTraceElement2 = stackTraceElementArray[stackTraceElementArray.length + 1 - n2];
                }
            }
            this.h = CrashReportCategoryInvoker.a(crashReportCategory, stackTraceElement, stackTraceElement2);
            if (!ListInvoker.isEmpty(this.e)) {
                CrashReportCategory crashReportCategory2 = (CrashReportCategory)ListInvoker.get(this.e, ListInvoker.size(this.e) - 1);
                CrashReportCategoryInvoker.b(crashReportCategory2, n2);
            } else if (stackTraceElementArray.length >= n2 && 0 <= n3 && n3 < stackTraceElementArray.length) {
                this.i = new StackTraceElement[n3];
                SystemInvoker.a(stackTraceElementArray, 0, this.i, 0, this.i.length);
            } else {
                this.h = false;
            }
        }
        ListInvoker.add(this.e, crashReportCategory);
        return crashReportCategory;
    }
}

