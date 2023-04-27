/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a97;
import net.ab9_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aZ
 */
public enum az_1 implements ab9_0
{
    NORTH_SOUTH(0, a97.i),
    EAST_WEST(1, a97.n),
    ASCENDING_EAST(2, a97.k),
    ASCENDING_WEST(3, a97.s),
    ASCENDING_NORTH(4, a97.q),
    ASCENDING_SOUTH(5, a97.g),
    SOUTH_EAST(6, a97.b),
    SOUTH_WEST(7, a97.e),
    NORTH_WEST(8, a97.c),
    NORTH_EAST(9, a97.h);

    private String b;
    private static az_1[] d;
    private int a;

    public boolean b() {
        return this == ASCENDING_NORTH || this == ASCENDING_EAST || this == ASCENDING_SOUTH || this == ASCENDING_WEST;
    }

    public int a() {
        return this.a;
    }

    public static az_1 a(int n) {
        if (n >= d.length) {
            n = 0;
        }
        return d[n];
    }

    private az_1(int n2, String string2) {
        this.a = n2;
        this.b = string2;
    }

    public String toString() {
        return this.b;
    }

    @Override
    public String a() {
        return this.b;
    }

    static {
        d = new az_1[az_1.values().length];
        az_1[] az_1Array = az_1.values();
        int n = az_1Array.length;
        for (int i = 0; i < n; ++i) {
            az_1 az_12;
            az_1.d[az_12.a()] = az_12 = az_1Array[i];
        }
    }
}

