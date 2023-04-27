/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

/*
 * Renamed from net.as3
 */
class as3_0 {
    static int[] a = new int[EnumFacing.values().length];

    static {
        try {
            as3_0.a[EnumFacing.WEST.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            as3_0.a[EnumFacing.EAST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            as3_0.a[EnumFacing.NORTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            as3_0.a[EnumFacing.SOUTH.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

