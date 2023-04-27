/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.jc_0;

/*
 * Renamed from net.adr
 */
public class adr_2
extends Enum<adr_2> {
    public static /* enum */ adr_2 IN_WATER;
    public static /* enum */ adr_2 IN_AIR;
    public static /* enum */ adr_2 ON_GROUND;
    private static adr_2[] b;
    private static adr_2[] c;
    private static String a = "CL_00002255";

    public static adr_2[] values() {
        return (adr_2[])c.clone();
    }

    public static adr_2 valueOf(String string) {
        return (adr_2)jc_0.a(adr_2.class, string);
    }

    private adr_2(String string2, int n2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "reaOU\n2\u0003\u001b\u000bJ".toCharArray();
        int n2 = 0;
        int n3 = 45;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x1C));
            n3 = n3;
        }
    }
}

