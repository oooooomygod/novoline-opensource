/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.Callable;
import net.CrashReport;
import net.W4;
import net.aL0;
import net.als_2;

/*
 * Renamed from net.aZn
 */
class azn_0
implements Callable {
    private static String a = "CL_00001302";
    CrashReport b;

    public String a() {
        Runtime runtime = als_2.a();
        long l4 = als_2.d(runtime);
        long l5 = als_2.b(runtime);
        long l6 = als_2.a(runtime);
        long l7 = l4 / 1024L / 1024L;
        long l8 = l5 / 1024L / 1024L;
        long l10 = l6 / 1024L / 1024L;
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), l6), W4.f), l10), W4.c), l5), W4.d), l8), W4.b), l4), W4.e), l7), W4.a).toString();
    }

    azn_0(CrashReport crashReport) {
        this.b = crashReport;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "o&_`\u0004\u001az\u001dY0b".toCharArray();
        int n2 = 0;
        int n3 = 81;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x7D));
            n3 = n3;
        }
    }
}

