/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.jc_0;

public class ajH
extends Enum<ajH> {
    public static /* enum */ ajH S;
    public static /* enum */ ajH T;
    public static /* enum */ ajH Q;
    private static ajH[] c;
    private static ajH[] a;
    public static /* enum */ ajH R;
    private static String b = "CL_00002542";

    private ajH(String string2, int n2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "+\u0000j.&C#Zy\u0001,".toCharArray();
        int n2 = 0;
        int n3 = 32;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x48));
            n3 = n3;
        }
    }

    public static ajH[] values() {
        return (ajH[])c.clone();
    }

    public static ajH valueOf(String string) {
        return (ajH)jc_0.a(ajH.class, string);
    }
}

