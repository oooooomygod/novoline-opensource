/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

public class aP0
extends Enum<aP0> {
    public static /* enum */ aP0 WEST;
    private static aP0[] a;
    public static /* enum */ aP0 NORTH;
    public static /* enum */ aP0 FLIP_WEST;
    public static /* enum */ aP0 SOUTH;
    public static /* enum */ aP0 DOWN;
    public static /* enum */ aP0 FLIP_DOWN;
    public static /* enum */ aP0 EAST;
    private static String d = "CL_00002513";
    public static /* enum */ aP0 FLIP_UP;
    public static /* enum */ aP0 UP;
    public static /* enum */ aP0 FLIP_SOUTH;
    public static /* enum */ aP0 FLIP_EAST;
    private static aP0[] c;
    public static /* enum */ aP0 FLIP_NORTH;
    protected int b;

    public static aP0[] values() {
        return (aP0[])c.clone();
    }

    private aP0(String string2, int n2, EnumFacing enumFacing, boolean bl) {
        this.b = SJ.i(enumFacing) + EnumFacing.values().length;
    }

    public static aP0 valueOf(String string) {
        return (aP0)jc_0.a(aP0.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "}\u001aDZt32\fc*Y".toCharArray();
        int n2 = 0;
        int n3 = 124;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x42));
            n3 = n3;
        }
    }
}

