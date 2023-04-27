/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

class GZ {
    static int[] a = new int[EnumFacing.values().length];

    static {
        try {
            GZ.a[EnumFacing.EAST.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            GZ.a[EnumFacing.WEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            GZ.a[EnumFacing.SOUTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            GZ.a[EnumFacing.NORTH.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

