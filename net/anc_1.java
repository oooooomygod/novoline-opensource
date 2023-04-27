/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.anc
 */
public class anc_1 {
    private static long E = a1c.a(11598666202036355L, 407947263386177578L, null).a(229373053527729L);
    public static String w = "o";
    public static String u = "\u041e";
    public static String C = "a";
    public static String l = "k";
    public static String i = "C";
    public static String e = "e";
    public static String m = "B";
    public static String o = "\u0443";
    public static String g = "\u041a";
    public static String p = "\u041a";
    public static String b = "\u0412";
    public static String D = "\u0410";
    public static String y = "Cyrillic";
    public static String n = ".";
    public static String a = "\u0441";
    public static String t = "A";
    public static String x = "\u0435";
    public static String j = "\u043e";
    public static String q = "E";
    public static String d = "K";
    public static String A = "\u0421";
    public static String v = "\u0415";
    private static String F = "Cyrillic";
    public static String B = "\u00b7";
    public static String c = "\u0430";
    public static String r = "c";
    public static String h = "y";
    public static String s = "\u0423";
    public static String k = "Y";
    public static String f = "O";
    public static String z = "/";

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ E;
        C = "a";
        s = "\u0423";
        p = "\u041a";
        o = "\u0443";
        y = F;
        b = "\u0412";
        u = "\u041e";
        r = "c";
        w = "o";
        f = "O";
        l = "k";
        j = "\u043e";
        i = "C";
        h = "y";
        a = "\u0441";
        B = "\u00b7";
        D = "\u0410";
        g = "\u041a";
        e = "e";
        v = "\u0415";
        c = "\u0430";
        q = "E";
        z = "/";
        anc_1.n = ".";
        A = "\u0421";
        d = "K";
        m = "B";
        k = "Y";
        t = "A";
        x = "\u0435";
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = E ^ 0x1AA974D55185L;
        long l5 = l4 ^ 0x668FAD9B211AL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u0015$}D\u0002B\u001e5".toCharArray();
        int n = 0;
        int n2 = 66;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x14));
            n2 = n2;
        }
    }
}

