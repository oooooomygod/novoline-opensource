/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.zZ
 */
public class zz_1 {
    public static String j = "\n";
    public static String c = "";
    public static String n = " ";
    public static String f = "";
    private static String p = "\r\n";
    public static String d = " ";
    public static String g = " ";
    private static long o = a1c.a(174053159214893533L, 5272882007646592024L, null).a(22764779533749L);
    public static String a = " ";
    public static String i = " ";
    public static String k = "";
    public static String e = " ";
    public static String l = " ";
    public static String h = "\r\n";
    public static String b = "\r";
    public static String m = "\n";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = o ^ 0x1327C015C27EL;
        long l5 = l4 ^ 0x3E29B03B7BE4L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u0015X".toCharArray();
        int n = 0;
        int n2 = 89;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x41));
            n2 = n2;
        }
    }

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ o;
        e = " ";
        l = " ";
        a = " ";
        d = " ";
        g = " ";
        c = "";
        m = "\n";
        k = "";
        zz_1.n = " ";
        b = "\r";
        f = "";
        h = p;
        j = "\n";
        i = " ";
    }
}

