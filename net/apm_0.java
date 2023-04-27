/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aPm
 */
public class apm_0 {
    private static long b = a1c.a(-5210798186802763937L, -708226693074091746L, null).a(70930027459234L);
    public static String a = "textures/entity/enderdragon/dragon_eyes.png";
    private static String c = "textures/entity/enderdragon/dragon_eyes.png";

    public static void b(char c, int n, char c2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ b;
        a = apm_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x437CFA723D1L;
        long l5 = l4 ^ 0x241BA75DAE3FL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u001b\u001b.:\u0012\u0010Q\u001cQ3 \u0013\u000b@\u0016Q3 \u0003\u0007F\u000b\f7)\b\f\u001b\u000b\f7)\b\fk\n\u00073=I\u0012Z\b".toCharArray();
        int n = 0;
        int n2 = 19;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7C));
            n2 = n2;
        }
    }
}

