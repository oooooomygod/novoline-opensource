/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.SystemInvoker;
import java.util.concurrent.Callable;
import net.CrashReport;
import net.aL0;
import net.at4;

/*
 * Renamed from net.acm
 */
class acm_2
implements Callable {
    private static String b = "CL_00001222";
    CrashReport a;

    acm_2(CrashReport crashReport) {
        this.a = crashReport;
    }

    public String a() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), SystemInvoker.c(at4.c)), at4.e), SystemInvoker.c(at4.d)), at4.a), SystemInvoker.c(at4.b)).toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "{:EH\u0017#,\tD(J".toCharArray();
        int n2 = 0;
        int n3 = 103;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x5F));
            n3 = n3;
        }
    }
}

