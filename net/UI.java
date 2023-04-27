/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MapColor;
import net.aOG;
import net.ab9_0;

public enum UI implements ab9_0
{
    STONE(0, MapColor.e, aOG.m),
    GRANITE(1, MapColor.d, aOG.g),
    GRANITE_SMOOTH(2, MapColor.d, aOG.b, aOG.k),
    DIORITE(3, MapColor.E, aOG.a),
    DIORITE_SMOOTH(4, MapColor.E, aOG.c, aOG.n),
    ANDESITE(5, MapColor.e, aOG.p),
    ANDESITE_SMOOTH(6, MapColor.e, aOG.i, aOG.d);

    private int b;
    private String f;
    private MapColor d;
    private static UI[] a;
    private String e;

    public int d() {
        return this.b;
    }

    private UI(int n2, MapColor mapColor, String string2, String string3) {
        this.b = n2;
        this.f = string2;
        this.e = string3;
        this.d = mapColor;
    }

    public static UI a(int n) {
        if (n >= a.length) {
            n = 0;
        }
        return a[n];
    }

    public MapColor c() {
        return this.d;
    }

    public String toString() {
        return this.f;
    }

    private UI(int n2, MapColor mapColor, String string2) {
        this(n2, mapColor, string2, string2);
    }

    public String b() {
        return this.e;
    }

    @Override
    public String a() {
        return this.f;
    }

    static {
        a = new UI[UI.values().length];
        UI[] uIArray = UI.values();
        int n = uIArray.length;
        for (int i = 0; i < n; ++i) {
            UI uI;
            UI.a[uI.d()] = uI = uIArray[i];
        }
    }
}

