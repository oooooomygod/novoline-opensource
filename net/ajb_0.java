/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ajb
 */
public class ajb_0 {
    public static String a = "Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?";
    private static String c = "Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?";
    private static long b = a1c.a(2453905921630387849L, 183527090746438586L, null).a(243728466156843L);

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0xCC8E4612BEEL;
        long l5 = l4 ^ 0x53872C968A08L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u001d4I\u0006`z\t<5\b\u0002ek\u0013h\u007f[H,l@2?\u0012D){Qm>\u0004DmkE))\u0012D){Qm>\u0004DmkE))e\u0005t%\tm>PAh?\u0004h\u0017I\u001dnz\t<(QDm?E'-M\u0016,mL;5D\u0011xvF&zZ\u0001\u007fp\\:9M\u0014m|Bw".toCharArray();
        int n = 0;
        int n2 = 39;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x6F));
            n2 = n2;
        }
    }
}

