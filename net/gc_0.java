/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

/*
 * Renamed from net.Gc
 */
class gc_0
extends Enum<gc_0> {
    public static /* enum */ gc_0 EAST;
    private static gc_0[] g;
    public static /* enum */ gc_0 UP;
    private int c;
    private static gc_0[] f;
    private static String e = "CL_00002514";
    public static /* enum */ gc_0 NORTH;
    public static /* enum */ gc_0 WEST;
    private static gc_0[] a;
    private int h;
    private int b;
    public static /* enum */ gc_0 SOUTH;
    private int d;
    public static /* enum */ gc_0 DOWN;

    public static gc_0 a(EnumFacing enumFacing) {
        return g[SJ.i(enumFacing)];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u0018^k)]\rYi'\u0005-".toCharArray();
        int n2 = 0;
        int n3 = 79;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x14));
            n3 = n3;
        }
    }

    static int c(gc_0 gc_02) {
        return gc_02.d;
    }

    private gc_0(String string2, int n2, int n3, int n4, int n5, int n6) {
        this.h = n3;
        this.b = n4;
        this.d = n5;
        this.c = n6;
    }

    static int d(gc_0 gc_02) {
        return gc_02.b;
    }

    public static gc_0 valueOf(String string) {
        return (gc_0)jc_0.a(gc_0.class, string);
    }

    static int b(gc_0 gc_02) {
        return gc_02.c;
    }

    static int a(gc_0 gc_02) {
        return gc_02.h;
    }

    public static gc_0[] values() {
        return (gc_0[])a.clone();
    }
}

