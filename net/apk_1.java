/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.apK
 */
public class apk_1 {
    public static String a = "textures/entity/boat.png";
    private static String c = "textures/entity/boat.png";
    private static long b = a1c.a(8740020590729081219L, 4092798602941368598L, null).a(168242944118836L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5B12695B3DE5L;
        long cfr_ignored_0 = l4 ^ 0x11E4EABDA6EEL;
        char[] cArray = "ot1}eNIh>,gdUXb>+fqH\u0002k\u007f.".toCharArray();
        int n = 0;
        int n2 = 119;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_1 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x6C));
            n2 = n2;
        }
    }

    public static void b(long l4) {
        l4 = b ^ l4;
        a = c;
    }
}

