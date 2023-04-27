/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aGH {
    private static String c = "facing";
    public static String a = "facing";
    private static long b = a1c.a(7731667303441555744L, 5876983825298814202L, null).a(70292165671543L);

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x301E909094C2L;
        long l5 = l4 ^ 0x2706A1C9D968L;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "bJrAN\u0010".toCharArray();
        int n = 0;
        int n2 = 48;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x34));
            n2 = n2;
        }
    }
}

