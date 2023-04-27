/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

/*
 * Renamed from net.af1
 */
class af1_0 {
    static int[] a = new int[EnumFacing.values().length];

    static {
        try {
            af1_0.a[EnumFacing.NORTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            af1_0.a[EnumFacing.SOUTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            af1_0.a[EnumFacing.WEST.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            af1_0.a[EnumFacing.EAST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

