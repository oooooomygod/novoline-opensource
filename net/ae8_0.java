/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ae8
 */
public class ae8_0 {
    public static String a = "textures/entity/slime/slime.png";
    private static long b = a1c.a(8207037878907088996L, -2184308398794939218L, null).a(61814647717240L);
    private static String c = "textures/entity/slime/slime.png";

    public static void b(char c, long l4) {
        long cfr_ignored_0 = ((long)c << 48 | l4 << 16 >>> 16) ^ b;
        a = ae8_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4C71C8D18101L;
        long l5 = l4 ^ 0x77787E298C59L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "o5ET_q\u001dh\u007fXN^j\fb\u007fNLCn\u001d4#QIGfVk>Z".toCharArray();
        int n = 0;
        int n2 = 60;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x27));
            n2 = n2;
        }
    }
}

