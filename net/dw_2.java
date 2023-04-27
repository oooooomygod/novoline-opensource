/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.dw
 */
public class dw_2 {
    private static String c = "Use NearestAttackableTargetGoal.class for PathfinerMob mobs!";
    private static long b = a1c.a(-7412405296135368594L, 5453843066388984731L, null).a(263324135255350L);
    public static String a = "Use NearestAttackableTargetGoal.class for PathfinerMob mobs!";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x124CC5993F42L;
        long l5 = l4 ^ 0x99D7FE693A0L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "e\u0007?V3_uB\u0011)\u0002<N`Q\u00171\u0017\u001fVqd\u0015(\u0011\u0018NS_\u00156X\u001eVuC\u0007z\u0010\u0012H4`\u0015.\u001e\u001bSzU\u0006\u0017\u0019\u001f\u001ay_\u0016)W".toCharArray();
        int n = 0;
        int n2 = 55;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 7));
            n2 = n2;
        }
    }

    public static void b(short s, char c, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = dw_2.c;
    }
}

