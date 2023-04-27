/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.Callable;
import net.CrashReport;
import net.aDK;

/*
 * Renamed from net.asZ
 */
class asz_1
implements Callable {
    private static String b = "CL_00001197";
    CrashReport a;

    asz_1(CrashReport crashReport) {
        this.a = crashReport;
    }

    public String a() {
        return aDK.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u0003\u0000fn\u001a\byq}\u0000i".toCharArray();
        int n2 = 0;
        int n3 = 87;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x17));
            n3 = n3;
        }
    }
}

