/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;


public enum aAP implements ab9_0
{
    DOWN_X(0, aG8.s, EnumFacing.DOWN),
    EAST(1, aG8.a, EnumFacing.EAST),
    WEST(2, aG8.i, EnumFacing.WEST),
    SOUTH(3, aG8.d, EnumFacing.SOUTH),
    NORTH(4, aG8.o, EnumFacing.NORTH),
    UP_Z(5, aG8.c, EnumFacing.UP),
    UP_X(6, aG8.m, EnumFacing.UP),
    DOWN_Z(7, aG8.t, EnumFacing.DOWN);

    private int b;
    private EnumFacing a;
    private static aAP[] e;
    private String d;

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public int b() {
        return this.b;
    }

    public EnumFacing a() {
        return this.a;
    }

    public String toString() {
        return this.d;
    }

    @Override
    public String a() {
        return this.d;
    }

    public static aAP a(EnumFacing enumFacing, EnumFacing enumFacing2) {
        switch (enumFacing) {
            case DOWN: {
                switch (SJ.h(enumFacing2)) {
                    case X: {
                        return DOWN_X;
                    }
                    case Z: {
                        return DOWN_Z;
                    }
                }
                throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aG8.q), enumFacing2), aG8.h), enumFacing).toString());
            }
            case UP: {
                switch (SJ.h(enumFacing2)) {
                    case X: {
                        return UP_X;
                    }
                    case Z: {
                        return UP_Z;
                    }
                }
                throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aG8.p), enumFacing2), aG8.u), enumFacing).toString());
            }
            case NORTH: {
                return NORTH;
            }
            case SOUTH: {
                return SOUTH;
            }
            case WEST: {
                return WEST;
            }
            case EAST: {
                return EAST;
            }
        }
        throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), aG8.n), enumFacing).toString());
    }

    static {
        e = new aAP[aAP.values().length];
        aAP[] aAPArray = aAP.values();
        int n = aAPArray.length;
        for (int i = 0; i < n; ++i) {
            aAP aAP2;
            aAP.e[aAP2.b()] = aAP2 = aAPArray[i];
        }
    }

    private aAP(int n2, String string2, EnumFacing enumFacing) {
        this.b = n2;
        this.d = string2;
        this.a = enumFacing;
    }

    public static aAP a(int n) {
        if (n >= e.length) {
            n = 0;
        }
        return e[n];
    }
}

