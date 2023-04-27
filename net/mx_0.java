/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

/*
 * Renamed from net.Mx
 */
public enum mx_0 {
    DOWN(new av6[]{new av6(ej_0.d, ej_0.c, ej_0.a, null), new av6(ej_0.d, ej_0.c, ej_0.f, null), new av6(ej_0.e, ej_0.c, ej_0.f, null), new av6(ej_0.e, ej_0.c, ej_0.a, null)}),
    UP(new av6[]{new av6(ej_0.d, ej_0.b, ej_0.f, null), new av6(ej_0.d, ej_0.b, ej_0.a, null), new av6(ej_0.e, ej_0.b, ej_0.a, null), new av6(ej_0.e, ej_0.b, ej_0.f, null)}),
    NORTH(new av6[]{new av6(ej_0.e, ej_0.b, ej_0.f, null), new av6(ej_0.e, ej_0.c, ej_0.f, null), new av6(ej_0.d, ej_0.c, ej_0.f, null), new av6(ej_0.d, ej_0.b, ej_0.f, null)}),
    SOUTH(new av6[]{new av6(ej_0.d, ej_0.b, ej_0.a, null), new av6(ej_0.d, ej_0.c, ej_0.a, null), new av6(ej_0.e, ej_0.c, ej_0.a, null), new av6(ej_0.e, ej_0.b, ej_0.a, null)}),
    WEST(new av6[]{new av6(ej_0.d, ej_0.b, ej_0.f, null), new av6(ej_0.d, ej_0.c, ej_0.f, null), new av6(ej_0.d, ej_0.c, ej_0.a, null), new av6(ej_0.d, ej_0.b, ej_0.a, null)}),
    EAST(new av6[]{new av6(ej_0.e, ej_0.b, ej_0.a, null), new av6(ej_0.e, ej_0.c, ej_0.a, null), new av6(ej_0.e, ej_0.c, ej_0.f, null), new av6(ej_0.e, ej_0.b, ej_0.f, null)});

    private static mx_0[] a;
    private av6[] c;

    private mx_0(av6[] av6Array) {
        this.c = av6Array;
    }

    static {
        a = new mx_0[6];
        mx_0.a[ej_0.c] = DOWN;
        mx_0.a[ej_0.b] = UP;
        mx_0.a[ej_0.f] = NORTH;
        mx_0.a[ej_0.a] = SOUTH;
        mx_0.a[ej_0.d] = WEST;
        mx_0.a[ej_0.e] = EAST;
    }

    public av6 a(int n) {
        return this.c[n];
    }

    public static mx_0 a(EnumFacing enumFacing) {
        return a[SJ.i(enumFacing)];
    }
}

