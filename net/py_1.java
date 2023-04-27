/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.pY
 */
public class py_1 {
    public static String a = "Failed to add player. {} already is in chunk {}, {}";
    private static String c = "Failed to add player. {} already is in chunk {}, {}";
    private static long b = a1c.a(-7484590682097371233L, -116643669139268384L, null).a(151325966698856L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1BE050431F07L;
        long l5 = l4 ^ 0x5969C1BACAADL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0012GWozh\u0015 I\u001eb{h\u0015$J_zz~\u001bt]C#~`G1GZz?eFtOP#|d@:M\u001exb \u0015/[".toCharArray();
        int n = 0;
        int n2 = 87;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 3));
            n2 = n2;
        }
    }

    public static void b(int n, short s, short s3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }
}

