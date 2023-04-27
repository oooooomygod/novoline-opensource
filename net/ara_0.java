/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aRa
 */
public class ara_0 {
    private static String d = "Already decorating";
    private static long c = a1c.a(-266164281291164600L, 93835244512449559L, null).a(135361867939016L);
    public static String a = "";
    public static String b = "Already decorating";

    public static void b(char c, char c2, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ ara_0.c;
        a = "";
        b = d;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x60AE8758A2EBL;
        long l5 = l4 ^ 0x395DAEEFDB92L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "u s[\u0007>\b\u0014(d]\t(\u0010@%oY".toCharArray();
        int n = 0;
        int n2 = 53;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 1));
            n2 = n2;
        }
    }
}

