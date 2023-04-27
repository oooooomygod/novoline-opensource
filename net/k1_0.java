/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

/*
 * Renamed from net.k1
 */
class k1_0 {
    static int[] a = new int[EnumFacing.values().length];

    static {
        try {
            k1_0.a[EnumFacing.EAST.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            k1_0.a[EnumFacing.WEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            k1_0.a[EnumFacing.SOUTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            k1_0.a[EnumFacing.NORTH.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            k1_0.a[EnumFacing.DOWN.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            k1_0.a[EnumFacing.UP.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

