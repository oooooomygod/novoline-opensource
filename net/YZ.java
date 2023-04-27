/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MapColor;
import net.aQO;
import net.ab9_0;
import net.anw_0;

public enum YZ implements ab9_0
{
    WHITE(0, 15, aQO.e, aQO.p, MapColor.x, anw_0.WHITE),
    ORANGE(1, 14, aQO.c, aQO.m, MapColor.J, anw_0.GOLD),
    MAGENTA(2, 13, aQO.O, aQO.j, MapColor.j, anw_0.AQUA),
    LIGHT_BLUE(3, 12, aQO.L, aQO.C, MapColor.i, anw_0.BLUE),
    YELLOW(4, 11, aQO.g, aQO.k, MapColor.c, anw_0.YELLOW),
    LIME(5, 10, aQO.K, aQO.N, MapColor.F, anw_0.GREEN),
    PINK(6, 9, aQO.H, aQO.D, MapColor.s, anw_0.LIGHT_PURPLE),
    GRAY(7, 8, aQO.E, aQO.M, MapColor.L, anw_0.DARK_GRAY),
    SILVER(8, 7, aQO.q, aQO.r, MapColor.H, anw_0.GRAY),
    CYAN(9, 6, aQO.o, aQO.i, MapColor.K, anw_0.DARK_AQUA),
    PURPLE(10, 5, aQO.x, aQO.n, MapColor.k, anw_0.DARK_PURPLE),
    BLUE(11, 4, aQO.y, aQO.a, MapColor.I, anw_0.DARK_BLUE),
    BROWN(12, 3, aQO.I, aQO.J, MapColor.a, anw_0.GOLD),
    GREEN(13, 2, aQO.f, aQO.Q, MapColor.N, anw_0.DARK_GREEN),
    RED(14, 1, aQO.h, aQO.U, MapColor.h, anw_0.DARK_RED),
    BLACK(15, 0, aQO.F, aQO.S, MapColor.o, anw_0.BLACK);

    private anw_0 b;
    private static YZ[] i;
    private MapColor g;
    private int e;
    private static YZ[] c;
    private String f;
    private String d;
    private int h;

    public MapColor e() {
        return this.g;
    }

    public static YZ b(int n) {
        if (n >= i.length) {
            n = 0;
        }
        return i[n];
    }

    static {
        i = new YZ[YZ.values().length];
        c = new YZ[YZ.values().length];
        YZ[] yZArray = YZ.values();
        int n = yZArray.length;
        for (int i = 0; i < n; ++i) {
            YZ yZ;
            YZ.i[yZ.d()] = yZ = yZArray[i];
            YZ.c[yZ.c()] = yZ;
        }
    }

    public int d() {
        return this.e;
    }

    public int c() {
        return this.h;
    }

    private YZ(int n2, int n3, String string2, String string3, MapColor mapColor, anw_0 anw_02) {
        this.e = n2;
        this.h = n3;
        this.d = string2;
        this.f = string3;
        this.g = mapColor;
        this.b = anw_02;
    }

    public static YZ a(int n) {
        if (n >= c.length) {
            n = 0;
        }
        return c[n];
    }

    @Override
    public String a() {
        return this.d;
    }

    public String toString() {
        return this.f;
    }

    public String b() {
        return this.f;
    }
}

