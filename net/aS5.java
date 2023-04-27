/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aS5 {
    public static String a = "Use .panic or .panic (module type)";
    private static String c = "Use .panic or .panic (module type)";
    private static long b = a1c.a(-6988156674514175451L, 8494241156444713494L, null).a(148931337551992L);

    public static void b(int n, int n2, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x27C91CAAD052L;
        long l5 = l4 ^ 0x247630C4FEB6L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "8 \u0012S\u0001>?\u0003:\u0014S@<~C#\u0016\u001dF-~E>\u0018\u0017Z\";M'\u000e\u0003Jg".toCharArray();
        int n = 0;
        int n2 = 50;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5F));
            n2 = n2;
        }
    }
}

