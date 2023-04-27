/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MapColor;
import net.ab9_0;
import net.wv_2;


public enum aSQ implements ab9_0
{
    SAND(0, wv_2.c, wv_2.e, MapColor.z),
    RED_SAND(1, wv_2.b, wv_2.f, MapColor.J);

    private int a;
    private String c;
    private MapColor d;
    private static aSQ[] b;
    private String f;

    public String toString() {
        return this.f;
    }

    public static aSQ a(int n) {
        if (n >= b.length) {
            n = 0;
        }
        return b[n];
    }

    public int a() {
        return this.a;
    }

    @Override
    public String a() {
        return this.f;
    }

    static {
        b = new aSQ[aSQ.values().length];
        aSQ[] aSQArray = aSQ.values();
        int n = aSQArray.length;
        for (int i = 0; i < n; ++i) {
            aSQ aSQ2;
            aSQ.b[aSQ2.a()] = aSQ2 = aSQArray[i];
        }
    }

    private aSQ(int n2, String string2, String string3, MapColor mapColor) {
        this.a = n2;
        this.f = string2;
        this.d = mapColor;
        this.c = string3;
    }

    public String c() {
        return this.c;
    }

    public MapColor b() {
        return this.d;
    }
}

