/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aNo
 */
public class ano_0 {
    private static String c = "textures/gui/container/furnace.png";
    public static String a = "textures/gui/container/furnace.png";
    private static long b = a1c.a(8344519192923056569L, 3749869597019345573L, null).a(13472839818419L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x64830F1C0E52L;
        long l5 = l4 ^ 0x32031DF83128L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "R\u000f\u0006IBB{UE\u0019H^\u001f}I\u0004\n\\^^{TE\u0018HE^\u007fE\u000fPMYW".toCharArray();
        int n = 0;
        int n2 = 26;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x3C));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }
}

