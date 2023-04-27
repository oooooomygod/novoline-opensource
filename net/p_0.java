/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.p
 */
public class p_0 {
    private static long c = a1c.a(-4530112823001831756L, -1548940209104480666L, null).a(37373444873005L);
    private static String d = "Converting... ";
    public static String a = "Converting... ";
    public static String b = "%";

    public static void b(int n, short s, short s3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s3 << 48 >>> 48) ^ c;
        a = d;
        b = "%";
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x4E9B5415F0FBL;
        long l5 = l4 ^ 0x4A7506DBCB02L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0014E%{\b6{>D,#Cj/".toCharArray();
        int n = 0;
        int n2 = 22;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x41));
            n2 = n2;
        }
    }
}

