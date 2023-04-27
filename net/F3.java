/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MapColor;
import net.aa_1;
import net.ab9_0;

public enum F3 implements ab9_0
{
    OAK(0, aa_1.f, MapColor.t),
    SPRUCE(1, aa_1.d, MapColor.A),
    BIRCH(2, aa_1.k, MapColor.z),
    JUNGLE(3, aa_1.h, MapColor.d),
    ACACIA(4, aa_1.m, MapColor.J),
    DARK_OAK(5, aa_1.l, aa_1.i, MapColor.a);

    private String a;
    private int e;
    private static F3[] b;
    private String d;
    private MapColor f;

    private F3(int n2, String string2, String string3, MapColor mapColor) {
        this.e = n2;
        this.d = string2;
        this.a = string3;
        this.f = mapColor;
    }

    public int c() {
        return this.e;
    }

    private F3(int n2, String string2, MapColor mapColor) {
        this(n2, string2, string2, mapColor);
    }

    public MapColor d() {
        return this.f;
    }

    public String b() {
        return this.a;
    }

    @Override
    public String a() {
        return this.d;
    }

    public String toString() {
        return this.d;
    }

    static {
        b = new F3[F3.values().length];
        F3[] f3Array = F3.values();
        int n = f3Array.length;
        for (int i = 0; i < n; ++i) {
            F3 f3;
            F3.b[f3.c()] = f3 = f3Array[i];
        }
    }

    public static F3 a(int n) {
        if (n >= b.length) {
            n = 0;
        }
        return b[n];
    }
}

