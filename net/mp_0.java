/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MapColor;
import net.aSQ;
import net.ab9_0;
import net.arl_0;
import net.pl_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.Mp
 */
public enum mp_0 implements ab9_0
{
    RED_SANDSTONE(0, arl_0.b, pl_0.b(aSQ.RED_SAND));

    private String e;
    private MapColor d;
    private int b;
    private static mp_0[] c;

    public static mp_0 a(int n) {
        if (n >= c.length) {
            n = 0;
        }
        return c[n];
    }

    private mp_0(int n2, String string2, MapColor mapColor) {
        this.b = n2;
        this.e = string2;
        this.d = mapColor;
    }

    public String c() {
        return this.e;
    }

    public MapColor a() {
        return this.d;
    }

    public String toString() {
        return this.e;
    }

    static {
        c = new mp_0[mp_0.values().length];
        mp_0[] mp_0Array = mp_0.values();
        int n = mp_0Array.length;
        for (int i = 0; i < n; ++i) {
            mp_0 mp_02;
            mp_0.c[mp_02.b()] = mp_02 = mp_0Array[i];
        }
    }

    public int b() {
        return this.b;
    }

    @Override
    public String a() {
        return this.e;
    }
}

