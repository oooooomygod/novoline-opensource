/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.zf
 */
public class zf_2 {
    private static String c = "Use NearestAttackableTargetGoal.class for PathfinerMob mobs!";
    public static String a = "Use NearestAttackableTargetGoal.class for PathfinerMob mobs!";
    private static long b = a1c.a(-6895880104865766601L, 8791268734773784476L, null).a(92684039228949L);

    public static void b(byte by, long l4) {
        long cfr_ignored_0 = ((long)by << 56 | l4 << 8 >>> 8) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4A5F9B95A094L;
        long l5 = l4 ^ 0x353288FA5768L;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        long cfr_ignored_1 = l5 << 8 >>> 8;
        char[] cArray = "&J;`v\u001c6\u0001\\-4y\r#\u0012Z5!Z\u00152'X,']\r\u0010\u001cX2n[\u00156\u0000J~&W\u000bw#X*(^\u00109\u0016K\u0013/ZY:\u001c[-a".toCharArray();
        int n = 0;
        int n2 = 78;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x3D));
            n2 = n2;
        }
    }
}

