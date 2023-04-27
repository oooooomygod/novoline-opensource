/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.jc_0;

/*
 * Renamed from net.wb
 */
public class wb_2
extends Enum<wb_2> {
    private static wb_2[] c;
    public static /* enum */ wb_2 BOOLEAN_VALUE;
    private static wb_2[] b;
    public static /* enum */ wb_2 NUMERICAL_VALUE;
    private static String a = "CL_00002151";
    public static /* enum */ wb_2 ANY_VALUE;

    public static wb_2 valueOf(String string) {
        return (wb_2)jc_0.a(wb_2.class, string);
    }

    private wb_2(String string2, int n2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "[4N1m!\u0006*I$0".toCharArray();
        int n2 = 0;
        int n3 = 73;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x51));
            n3 = n3;
        }
    }

    public static wb_2[] values() {
        return (wb_2[])c.clone();
    }
}

