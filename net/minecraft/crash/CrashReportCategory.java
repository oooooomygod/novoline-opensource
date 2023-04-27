/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.crash;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.ThreadInvoker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.CrashReport;
import net.IBlockState;
import net.P8;
import net.a21;
import net.aF1;
import net.aL0;
import net.amv_2;
import net.aqc_2;
import net.ara_2;
import net.db_0;
import net.dm_1;
import net.dz_0;
import net.my_0;

public class CrashReportCategory {
    private List<aF1> b = my_0.c();
    private String c;
    private StackTraceElement[] d = new StackTraceElement[0];
    private CrashReport a;

    public StackTraceElement[] a() {
        return this.d;
    }

    public void a(StringBuilder stringBuilder) {
        aL0.a(aL0.a(aL0.a(stringBuilder, dm_1.o), this.c), dm_1.t);
        aL0.a(stringBuilder, dm_1.s);
        StackTraceElement[] stackTraceElementArray = ListInvoker.iterator(this.b);
        while (dz_0.c((Iterator)stackTraceElementArray)) {
            aF1 aF12 = (aF1)dz_0.b((Iterator)stackTraceElementArray);
            aL0.a(stringBuilder, dm_1.k);
            aL0.a(stringBuilder, aF12.a());
            aL0.a(stringBuilder, dm_1.j);
            aL0.a(stringBuilder, aF12.b());
        }
        if (this.d != null && this.d.length > 0) {
            aL0.a(stringBuilder, dm_1.p);
            for (StackTraceElement stackTraceElement : this.d) {
                aL0.a(stringBuilder, dm_1.r);
                aL0.a(stringBuilder, stackTraceElement.toString());
            }
        }
    }

    public static String a(double d, double d2, double d3) {
        return StringInvoker.a(dm_1.b, new Object[]{db_0.a(d), db_0.a(d2), db_0.a(d3), CrashReportCategory.a(new BlockPos(d, d2, d3))});
    }

    private static String lambda$addBlockInfo$0(int n, Block block) throws Exception {
        try {
            return StringInvoker.a(dm_1.c, new Object[]{P8.d(n), BlocksInvoker.o(block), ara_2.k(block.getClass())});
        }
        catch (Throwable throwable) {
            return aL0.c(aL0.a(new StringBuilder(), dm_1.q), n).toString();
        }
    }

    public void a(String string, Callable<String> callable) {
        try {
            this.a(string, a21.a(callable));
        }
        catch (Throwable throwable) {
            this.a(string, throwable);
        }
    }

    private static String lambda$addBlockInfo$1(int n) throws Exception {
        return aL0.a(aL0.c(aL0.a(new StringBuilder(), dm_1.a), n), dm_1.d).toString();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public boolean a(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (this.d.length != 0) {
            StackTraceElement stackTraceElement3 = this.d[0];
            if (aqc_2.a(stackTraceElement3) == aqc_2.a(stackTraceElement) && aqc_2.b(stackTraceElement3).equals(aqc_2.b(stackTraceElement)) && aqc_2.e(stackTraceElement3).equals(aqc_2.e(stackTraceElement)) && aqc_2.c(stackTraceElement3).equals(aqc_2.c(stackTraceElement))) {
                boolean bl = this.d.length > 1;
                if (!this.d[1].equals(stackTraceElement2)) {
                    return false;
                }
                this.d[0] = stackTraceElement;
                return true;
            }
            return false;
        }
        return false;
    }

    public void a(String string, Object object) {
        ListInvoker.add(this.b, new aF1(string, object));
    }

    private static String lambda$addBlockInfo$3(BlockPos blockPos) throws Exception {
        return CrashReportCategory.a(blockPos);
    }

    private static String lambda$addBlockInfo$2(BlockPos blockPos) throws Exception {
        return CrashReportCategory.a(blockPos);
    }

    public static String a(BlockPos blockPos) {
        int n = amv_2.j(blockPos);
        int n2 = amv_2.h(blockPos);
        int n3 = amv_2.i(blockPos);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            aL0.a(stringBuilder, StringInvoker.a(dm_1.x, new Object[]{P8.d(n), P8.d(n2), P8.d(n3)}));
        }
        catch (Throwable throwable) {
            aL0.a(stringBuilder, dm_1.f);
        }
        aL0.a(stringBuilder, dm_1.z);
        int n4 = n >> 4;
        int n5 = n3 >> 4;
        int n6 = n & 0xF;
        int n7 = n2 >> 4;
        int n8 = n3 & 0xF;
        int n9 = n4 << 4;
        int n10 = n5 << 4;
        int n11 = (n4 + 1 << 4) - 1;
        int n12 = (n5 + 1 << 4) - 1;
        try {
            aL0.a(stringBuilder, StringInvoker.a(dm_1.n, new Object[]{P8.d(n6), P8.d(n7), P8.d(n8), P8.d(n4), P8.d(n5), P8.d(n9), P8.d(n10), P8.d(n11), P8.d(n12)}));
        }
        catch (Throwable throwable) {
            aL0.a(stringBuilder, dm_1.y);
        }
        aL0.a(stringBuilder, dm_1.g);
        int n13 = n >> 9;
        n5 = n3 >> 9;
        n6 = n13 << 5;
        n7 = n5 << 5;
        n8 = (n13 + 1 << 5) - 1;
        n9 = (n5 + 1 << 5) - 1;
        n10 = n13 << 9;
        n11 = n5 << 9;
        n12 = (n13 + 1 << 9) - 1;
        int n14 = (n5 + 1 << 9) - 1;
        try {
            aL0.a(stringBuilder, StringInvoker.a(dm_1.e, new Object[]{P8.d(n13), P8.d(n5), P8.d(n6), P8.d(n7), P8.d(n8), P8.d(n9), P8.d(n10), P8.d(n11), P8.d(n12), P8.d(n14)}));
        }
        catch (Throwable throwable) {
            aL0.a(stringBuilder, dm_1.u);
        }
        return stringBuilder.toString();
    }

    public static void a(CrashReportCategory crashReportCategory, BlockPos blockPos, Block block, int n) {
        int n2 = BlocksInvoker.v(block);
        crashReportCategory.a(dm_1.m, () -> CrashReportCategory.lambda$addBlockInfo$0(n2, block));
        crashReportCategory.a(dm_1.v, () -> CrashReportCategory.lambda$addBlockInfo$1(n));
        crashReportCategory.a(dm_1.h, () -> CrashReportCategory.lambda$addBlockInfo$2(blockPos));
    }

    public static void a(CrashReportCategory crashReportCategory, BlockPos blockPos, IBlockState iBlockState) {
        crashReportCategory.a(dm_1.A, iBlockState::toString);
        crashReportCategory.a(dm_1.B, () -> CrashReportCategory.lambda$addBlockInfo$3(blockPos));
    }

    public int a(int n) {
        StackTraceElement[] stackTraceElementArray = ThreadInvoker.a().getStackTrace();
        if (stackTraceElementArray.length <= 0) {
            return 0;
        }
        this.d = new StackTraceElement[stackTraceElementArray.length - 3 - n];
        SystemInvoker.a(stackTraceElementArray, 3 + n, this.d, 0, this.d.length);
        return this.d.length;
    }

    public void b(int n) {
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[this.d.length - n];
        SystemInvoker.a(this.d, 0, stackTraceElementArray, 0, stackTraceElementArray.length);
        this.d = stackTraceElementArray;
    }

    public void a(String string, Throwable throwable) {
        this.a(string, (Object)throwable);
    }

    public CrashReportCategory(CrashReport crashReport, String string) {
        this.a = crashReport;
        this.c = string;
    }
}

