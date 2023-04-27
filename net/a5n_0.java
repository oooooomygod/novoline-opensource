/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.a5n
 */
public class a5n_0 {
    private static long b = a1c.a(-8716876490381257895L, -5340181234616276871L, null).a(150641170069066L);
    private static String c = " M";
    public static String a = " M";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x18755C705E9EL;
        long l5 = l4 ^ 0x6F326B656CA2L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "dc".toCharArray();
        int n = 0;
        int n2 = 23;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x53));
            n2 = n2;
        }
    }

    public static void b(short s, long l4) {
        long cfr_ignored_0 = ((long)s << 48 | l4 << 16 >>> 16) ^ b;
        a = c;
    }
}

