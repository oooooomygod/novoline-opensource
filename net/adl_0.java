/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.adL
 */
public class adl_0 {
    public static String a = "";
    private static String d = "Overworld";
    public static String b = "Overworld";
    private static long c = a1c.a(-5413162806135279935L, 5909240050594813938L, null).a(105361221723237L);

    public static void b(long l4, char c) {
        long cfr_ignored_0 = (l4 << 16 | (long)c << 48 >>> 48) ^ adl_0.c;
        a = "";
        b = d;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x3EFE5C9FCCC1L;
        long l5 = l4 ^ 0x767EF6003D9FL;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u000f$&# Mm,6".toCharArray();
        int n = 0;
        int n2 = 73;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 9));
            n2 = n2;
        }
    }
}

