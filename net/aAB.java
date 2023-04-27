/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MapColor;
import net.ab9_0;
import net.ann_2;

public enum aAB implements ab9_0
{
    STONE(0, MapColor.e, ann_2.n),
    SAND(1, MapColor.z, ann_2.p, ann_2.c),
    WOOD(2, MapColor.t, ann_2.j, ann_2.f),
    COBBLESTONE(3, MapColor.e, ann_2.r, ann_2.t),
    BRICK(4, MapColor.h, ann_2.a),
    SMOOTHBRICK(5, MapColor.e, ann_2.i, ann_2.u),
    NETHERBRICK(6, MapColor.w, ann_2.m, ann_2.q),
    QUARTZ(7, MapColor.E, ann_2.l);

    private int f;
    private static aAB[] d;
    private MapColor b;
    private String c;
    private String e;

    public int d() {
        return this.f;
    }

    private aAB(int n2, MapColor mapColor, String string2, String string3) {
        this.f = n2;
        this.b = mapColor;
        this.e = string2;
        this.c = string3;
    }

    public MapColor c() {
        return this.b;
    }

    static {
        d = new aAB[aAB.values().length];
        aAB[] aABArray = aAB.values();
        int n = aABArray.length;
        for (int i = 0; i < n; ++i) {
            aAB aAB2;
            aAB.d[aAB2.d()] = aAB2 = aABArray[i];
        }
    }

    public static aAB a(int n) {
        if (n >= d.length) {
            n = 0;
        }
        return d[n];
    }

    @Override
    public String a() {
        return this.e;
    }

    public String b() {
        return this.c;
    }

    private aAB(int n2, MapColor mapColor, String string2) {
        this(n2, mapColor, string2, string2);
    }

    public String toString() {
        return this.e;
    }
}

