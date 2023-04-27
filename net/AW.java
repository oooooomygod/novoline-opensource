/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;

public abstract class AW {
    private long c;
    protected AW d;
    private long b;
    protected long a;

    public AW(long l4) {
        this.a = l4;
        this.a *= this.a * 6364136223846793005L + 1442695040888963407L;
        this.a += l4;
        this.a *= this.a * 6364136223846793005L + 1442695040888963407L;
        this.a += l4;
        this.a *= this.a * 6364136223846793005L + 1442695040888963407L;
        this.a += l4;
    }

    protected int a(int ... nArray) {
        return nArray[this.a(nArray.length)];
    }

    protected static boolean a(int n, int n2) {
        if (n == n2) {
            return true;
        }
        if (n != il_0.aE.s && n != il_0.ap.s) {
            il_0 il_02 = hw_0.a(n);
            il_0 il_03 = hw_0.a(n2);
            try {
                return hw_0.a(il_02, il_03);
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, yn_1.e);
                CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, yn_1.d);
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, yn_1.b, P8.d(n));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, yn_1.c, P8.d(n2));
                CrashReportCategoryInvoker.a(crashReportCategory, yn_1.a, new wf_0(il_02));
                CrashReportCategoryInvoker.a(crashReportCategory, yn_1.f, new em_0(il_03));
                throw new ReportedException(crashReport);
            }
        }
        return n2 == il_0.aE.s || n2 == il_0.ap.s;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public void a(long l4, long l5) {
        this.c = this.b;
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += l4;
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += l5;
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += l4;
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += l5;
    }

    public static AW[] a(long l4, WorldType worldType, String string) {
        int n;
        AW aW10 = new AI(1L);
        aW10 = new A5(2000L, aW10);
        av_0 av_02 = new av_0(1L, aW10);
        A4 a410 = new A4(2001L, av_02);
        av_0 av_03 = new av_0(2L, a410);
        av_03 = new av_0(50L, av_03);
        av_03 = new av_0(70L, av_03);
        ac_0 ac_02 = new ac_0(2L, av_03);
        ar_0 ar_02 = new ar_0(2L, ac_02);
        av_0 av_04 = new av_0(3L, ar_02);
        A7 a710 = new A7(2L, av_04, awr_2.COOL_WARM);
        a710 = new A7(2L, a710, awr_2.HEAT_ICE);
        a710 = new A7(3L, a710, awr_2.SPECIAL);
        A4 a411 = new A4(2002L, a710);
        a411 = new A4(2003L, a411);
        av_0 av_05 = new av_0(4L, a411);
        AV aV6 = new AV(5L, av_05);
        ax_0 ax_02 = new ax_0(4L, aV6);
        AW aW11 = pN.a(1000L, ax_02, 0);
        cd_0 cd_02 = null;
        int n2 = n = 4;
        if (worldType == WorldType.i && !StringInvoker.g(string)) {
            cd_02 = fl_2.a(fl_2.a(string));
            n = cd_02.b;
            n2 = cd_02.k;
        }
        if (worldType == WorldType.k) {
            n = 6;
        }
        AW aW12 = pN.a(1000L, aW11, 0);
        ao_0 ao_02 = new ao_0(100L, aW12);
        au_0 au_02 = new au_0(200L, aW11, worldType, string);
        AW aW13 = pN.a(1000L, au_02, 2);
        A3 a34 = new A3(1000L, aW13);
        AW aW14 = pN.a(1000L, ao_02, 2);
        AW aW15 = new AQ(1000L, a34, aW14);
        AW aW16 = pN.a(1000L, ao_02, 2);
        aW16 = pN.a(1000L, aW16, n2);
        an_0 an_02 = new an_0(1L, aW16);
        new AL(1000L, an_02);
        aW15 = new ag_0(1001L, aW15);
        int n3 = 0;
        while (true) {
            aW15 = new A4(1000 + n3, aW15);
            aW15 = new av_0(3L, aW15);
            ++n3;
        }
    }

    public void a(long l4) {
        this.b = l4;
        if (this.d != null) {
            this.d.a(l4);
        }
        this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
        this.b += this.a;
        this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
        this.b += this.a;
        this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
        this.b += this.a;
    }

    protected int a(int n, int n2, int n3, int n4) {
        return n2 == n3 && n3 == n4 ? n2 : (n == n2 && n == n3 ? n : (n == n2 && n == n4 ? n : (n == n3 && n == n4 ? n : (n == n2 && n3 != n4 ? n : (n == n3 && n2 != n4 ? n : (n == n4 && n2 != n3 ? n : (n2 == n3 && n != n4 ? n2 : (n2 == n4 && n != n3 ? n2 : (n3 == n4 && n != n2 ? n3 : this.a(new int[]{n, n2, n3, n4}))))))))));
    }

    public abstract int[] b(int var1, int var2, int var3, int var4);

    protected int a(int n) {
        int n2 = (int)((this.c >> 24) % (long)n);
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += this.b;
        return n2 += n;
    }

    protected static boolean b(int n) {
        return n == il_0.u.s || n == il_0.r.s || n == il_0.aa.s;
    }
}

