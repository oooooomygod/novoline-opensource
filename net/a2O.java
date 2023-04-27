/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.Callable;
import net.CrashReport;
import net.af_0;

class a2O
implements Callable {
    CrashReport b;
    private static String a = "CL_00001355";

    a2O(CrashReport crashReport) {
        this.b = crashReport;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "o]&\u007f\u0003pV\u001d\"Lz".toCharArray();
        int n2 = 0;
        int n3 = 18;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x3E));
            n3 = n3;
        }
    }

    public String a() throws Exception {
        return af_0.d();
    }
}

