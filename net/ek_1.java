/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.eK
 */
public class ek_1 {
    public static String a = "textures/entity/enchanting_table_book.png";
    private static String c = "textures/entity/enchanting_table_book.png";
    private static long b = a1c.a(-689697236974093796L, -4212869952448374513L, null).a(242228290803005L);

    public static void b(short s, long l4) {
        long cfr_ignored_0 = ((long)s << 48 | l4 << 16 >>> 16) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x698E967D25F0L;
        long l5 = l4 ^ 0x331DE0749BA9L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "}Ee&\u0002E\u0003z\u000fx<\u0003^\u0012p\u000fx<\u0014_\u0007gTt<\u0010h\u0012hBq7(U\tfK3\"\u0019P".toCharArray();
        int n = 0;
        int n2 = 116;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7D));
            n2 = n2;
        }
    }
}

