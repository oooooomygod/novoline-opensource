/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

public class aDz
extends Enum<aDz> {
    public static /* enum */ aDz DOWN;
    protected aP0[] h;
    public static /* enum */ aDz SOUTH;
    public static /* enum */ aDz EAST;
    protected aP0[] i;
    public static /* enum */ aDz NORTH;
    protected aP0[] g;
    private static String e = "CL_00002516";
    protected EnumFacing[] d;
    private static aDz[] k;
    protected aP0[] c;
    private static aDz[] b;
    protected boolean a;
    public static /* enum */ aDz WEST;
    public static /* enum */ aDz UP;
    protected float f;
    private static aDz[] j;

    private aDz(String string2, int n2, EnumFacing[] enumFacingArray, float f, boolean bl, aP0[] aP0Array, aP0[] aP0Array2, aP0[] aP0Array3, aP0[] aP0Array4) {
        this.d = enumFacingArray;
        this.f = f;
        this.a = bl;
        this.h = aP0Array;
        this.i = aP0Array2;
        this.c = aP0Array3;
        this.g = aP0Array4;
    }

    public static aDz a(EnumFacing enumFacing) {
        return b[SJ.i(enumFacing)];
    }

    public static aDz valueOf(String string) {
        return (aDz)jc_0.a(aDz.class, string);
    }

    public static aDz[] values() {
        return (aDz[])j.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "Ar}e?\u0010G0\u000b\u0013c".toCharArray();
        int n2 = 0;
        int n3 = 39;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x25));
            n3 = n3;
        }
    }
}

