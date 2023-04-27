/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.auS
 */
public class aus_1 {
    private static long b = a1c.a(8578867832467017613L, -3510757113665893232L, null).a(128807413416791L);
    public static String a = "textures/entity/witch.png";
    private static String c = "textures/entity/witch.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x323BF0E9D27L;
        long l5 = l4 ^ 0x24B64939D8D6L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "B2ntljVExsnmqGOxaim{[\u0018'xg".toCharArray();
        int n = 0;
        int n2 = 47;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x19));
            n2 = n2;
        }
    }

    public static void b(int n, char c, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = aus_1.c;
    }
}

