/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aDm
 */
public class adm_0 {
    public static String a = "novoline/textures/white.png";
    private static String c = "novoline/textures/white.png";
    private static long b = a1c.a(8705028811600444553L, 2804217724179568431L, null).a(47402052265328L);

    public static void b(int n, char c, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = adm_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6F3DE8765B76L;
        long l5 = l4 ^ 0x5D5AEB391290L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0003#i'\u0003vF\bck-\u0017k]\u001f)lg\u0018wA\u0019)18\u0001x".toCharArray();
        int n = 0;
        int n2 = 121;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x14));
            n2 = n2;
        }
    }
}

