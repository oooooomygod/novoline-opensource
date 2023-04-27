/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Map;
import net.KA;
import net.ady_1;

public class R {
    private static String a = "CL_00001094";
    private static ady_1 b;

    static void a(ady_1 ady_12) {
        b = ady_12;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u0003\u000b+cIGcqwMg".toCharArray();
        int n2 = 0;
        int n3 = 63;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x7F));
            n3 = n3;
        }
    }

    public static Map a() {
        return R.b.b;
    }

    public static String a(String string, Object ... objectArray) {
        return KA.a(b, string, objectArray);
    }
}

