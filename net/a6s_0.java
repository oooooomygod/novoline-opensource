/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MapColor;
import net.ab9_0;
import net.xg_0;

/*
 * Renamed from net.a6s
 */
public enum a6s_0 implements ab9_0
{
    DIRT(0, xg_0.d, xg_0.c, MapColor.d),
    COARSE_DIRT(1, xg_0.e, xg_0.f, MapColor.d),
    PODZOL(2, xg_0.h, MapColor.A);

    private static a6s_0[] e;
    private MapColor f;
    private String c;
    private int a;
    private String d;

    @Override
    public String a() {
        return this.c;
    }

    static {
        e = new a6s_0[a6s_0.values().length];
        a6s_0[] a6s_0Array = a6s_0.values();
        int n = a6s_0Array.length;
        for (int i = 0; i < n; ++i) {
            a6s_0 a6s_02;
            a6s_0.e[a6s_02.d()] = a6s_02 = a6s_0Array[i];
        }
    }

    private a6s_0(int n2, String string2, MapColor mapColor) {
        this(n2, string2, string2, mapColor);
    }

    public String b() {
        return this.d;
    }

    private a6s_0(int n2, String string2, String string3, MapColor mapColor) {
        this.a = n2;
        this.c = string2;
        this.d = string3;
        this.f = mapColor;
    }

    public String toString() {
        return this.c;
    }

    public static a6s_0 a(int n) {
        if (n >= e.length) {
            n = 0;
        }
        return e[n];
    }

    public int d() {
        return this.a;
    }

    public MapColor c() {
        return this.f;
    }
}

