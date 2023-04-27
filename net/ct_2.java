/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.SystemInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.ct
 */
public class ct_2 {
    private AW c;
    private List<il_0> e;
    private aes_0 a = new aes_0(this);
    private AW d;
    private String b = U7.l;

    public ct_2(World world) {
        this(aV8.w(world), uv_2.r(aV8.s(world)), uv_2.n(aV8.s(world)));
    }

    public il_0 a(BlockPos blockPos, il_0 il_02) {
        return sx_2.a(this.a, amv_2.j(blockPos), amv_2.i(blockPos), il_02);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    protected ct_2() {
        this.e = my_0.c();
        ListInvoker.add(this.e, il_0.H);
        ListInvoker.add(this.e, il_0.G);
        ListInvoker.add(this.e, il_0.ag);
        ListInvoker.add(this.e, il_0.ax);
        ListInvoker.add(this.e, il_0.R);
        ListInvoker.add(this.e, il_0.at);
        ListInvoker.add(this.e, il_0.al);
    }

    public float[] a(float[] fArray, int n, int n2, int n3, int n4) {
        af_0.c();
        if (fArray.length < n3 * n4) {
            fArray = new float[n3 * n4];
        }
        int[] nArray = asa_0.a(this.c, n, n2, n3, n4);
        for (int i = 0; i < n3 * n4; ++i) {
            try {
                float f = (float)hw_0.i(hw_0.a(nArray[i], il_0.as)) / 65536.0f;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                fArray[i] = f;
                continue;
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, U7.e);
                CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, U7.q);
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.u, P8.d(i));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.p, P8.d(fArray.length));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.o, P8.d(n));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.g, P8.d(n2));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.s, P8.d(n3));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.i, P8.d(n4));
                throw new ReportedException(crashReport);
            }
        }
        return fArray;
    }

    public float a(float f, int n) {
        return f;
    }

    public il_0[] b(il_0[] il_0Array, int n, int n2, int n3, int n4) {
        return this.a(il_0Array, n, n2, n3, n4, true);
    }

    public il_0 a(BlockPos blockPos) {
        return this.a(blockPos, null);
    }

    public il_0[] a(il_0[] il_0Array, int n, int n2, int n3, int n4, boolean bl) {
        af_0.c();
        if (il_0Array.length < n3 * n4) {
            il_0Array = new il_0[n3 * n4];
        }
        if (n3 == 16 && n4 == 16 && (n & 0xF) == 0 && (n2 & 0xF) == 0) {
            il_0[] il_0Array2 = sx_2.a(this.a, n, n2);
            SystemInvoker.a(il_0Array2, 0, il_0Array, 0, n3 * n4);
        } else {
            int[] nArray = asa_0.a(this.c, n, n2, n3, n4);
            for (int i = 0; i < n3 * n4; ++i) {
                il_0Array[i] = hw_0.a(nArray[i], il_0.as);
            }
        }
        return il_0Array;
    }

    public BlockPos a(int n, int n2, int n3, List<il_0> list, Random random) {
        af_0.c();
        int n4 = n - n3 >> 2;
        int n5 = n2 - n3 >> 2;
        int n6 = n + n3 >> 2;
        int n7 = n2 + n3 >> 2;
        int n8 = n6 - n4 + 1;
        int n9 = n7 - n5 + 1;
        int[] nArray = asa_0.a(this.d, n4, n5, n8, n9);
        BlockPos blockPos = null;
        int n10 = 0;
        for (int i = 0; i < n8 * n9; ++i) {
            int n11 = n4 + i % n8 << 2;
            int n12 = n5 + i / n8 << 2;
            il_0 il_02 = hw_0.a(nArray[i]);
            if (!ListInvoker.contains(list, il_02) || a5_0.a(random, n10 + 1) != 0) continue;
            blockPos = new BlockPos(n11, 0, n12);
            ++n10;
        }
        return blockPos;
    }

    public ct_2(long l4, WorldType worldType, String string) {
        this();
        this.b = string;
        AW[] aWArray = asa_0.a(l4, worldType, string);
        this.d = aWArray[0];
        this.c = aWArray[1];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(int n, int n2, int n3, List<il_0> list) {
        af_0.c();
        int n4 = n - n3 >> 2;
        int n5 = n2 - n3 >> 2;
        int n6 = n + n3 >> 2;
        int n7 = n2 + n3 >> 2;
        int n8 = n6 - n4 + 1;
        int n9 = n7 - n5 + 1;
        int[] nArray = asa_0.a(this.d, n4, n5, n8, n9);
        int i = 0;
        while (i < n8 * n9) {
            Object object;
            try {
                object = hw_0.a(nArray[i]);
                if (!ListInvoker.contains(list, object)) {
                    return false;
                }
                ++i;
            }
            catch (Throwable throwable) {
                object = CrashInvoker.makeCrashReport(throwable, U7.h);
                CrashReportCategory crashReportCategory = CrashInvoker.a((CrashReport)object, U7.r);
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.c, this.d.toString());
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.j, P8.d(n));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.b, P8.d(n2));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.f, P8.d(n3));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.m, list);
                throw new ReportedException((CrashReport)object);
            }
        }
        return true;
    }

    public void b() {
        this.a.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public il_0[] a(il_0[] il_0Array, int n, int n2, int n3, int n4) {
        af_0.c();
        if (il_0Array.length < n3 * n4) {
            il_0Array = new il_0[n3 * n4];
        }
        int[] nArray = asa_0.a(this.d, n, n2, n3, n4);
        int i = 0;
        while (i < n3 * n4) {
            try {
                il_0Array[i] = hw_0.a(nArray[i], il_0.as);
                ++i;
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, U7.n);
                CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, U7.w);
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.d, P8.d(il_0Array.length));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.t, P8.d(n));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.v, P8.d(n2));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.a, P8.d(n3));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, U7.k, P8.d(n4));
                throw new ReportedException(crashReport);
            }
        }
        return il_0Array;
    }

    public List<il_0> a() {
        return this.e;
    }
}

