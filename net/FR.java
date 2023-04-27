/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class FR {
    public static String a = "[{}]@.({}:{}): {}";
    private static long b = a1c.a(-7573661654072421494L, 8512894007433154656L, null).a(195537365605808L);
    private static String c = "[{}]@.({}:{}): {}";

    public static void b(long l4) {
        l4 = b ^ l4;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5CECF4DC8B9DL;
        long cfr_ignored_0 = l4 ^ 0x1230B3326EDCL;
        char[] cArray = "B9{70\u001cnb?<\u0011\r\u001b|99{".toCharArray();
        int n = 0;
        int n2 = 97;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_1 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x78));
            n2 = n2;
        }
    }
}

