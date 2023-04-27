/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.tv_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.zQ
 */
public enum zq_1 implements ab9_0
{
    NORTH_WEST(1, tv_0.d),
    NORTH(2, tv_0.g),
    NORTH_EAST(3, tv_0.z),
    WEST(4, tv_0.m),
    CENTER(5, tv_0.e),
    EAST(6, tv_0.j),
    SOUTH_WEST(7, tv_0.s),
    SOUTH(8, tv_0.i),
    SOUTH_EAST(9, tv_0.q),
    STEM(10, tv_0.h),
    ALL_INSIDE(0, tv_0.p),
    ALL_OUTSIDE(14, tv_0.v),
    ALL_STEM(15, tv_0.x);

    private String b;
    private int c;
    private static zq_1[] d;

    public int a() {
        return this.c;
    }

    private zq_1(int n2, String string2) {
        this.c = n2;
        this.b = string2;
    }

    public static zq_1 a(int n) {
        if (n >= d.length) {
            n = 0;
        }
        zq_1 cfr_ignored_0 = d[n];
        return d[0];
    }

    static {
        d = new zq_1[16];
        zq_1[] zq_1Array = zq_1.values();
        int n = zq_1Array.length;
        for (int i = 0; i < n; ++i) {
            zq_1 zq_12;
            zq_1.d[zq_12.a()] = zq_12 = zq_1Array[i];
        }
    }

    @Override
    public String a() {
        return this.b;
    }

    public String toString() {
        return this.b;
    }
}

