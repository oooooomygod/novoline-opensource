/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.SystemInvoker;
import java.util.concurrent.Callable;
import net.CrashReport;
import net.aL0;
import net.ug_1;

/*
 * Renamed from net.dF
 */
class df_1
implements Callable {
    private static String b = "CL_00001275";
    CrashReport a;

    public String a() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), SystemInvoker.c(ug_1.d)), ug_1.c), SystemInvoker.c(ug_1.b)), ug_1.e), SystemInvoker.c(ug_1.a)).toString();
    }

    df_1(CrashReport crashReport) {
        this.a = crashReport;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "J\u0012\u0002!PAL8lj$".toCharArray();
        int n2 = 0;
        int n3 = 16;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x19));
            n3 = n3;
        }
    }
}

