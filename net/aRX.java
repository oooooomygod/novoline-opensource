/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

class aRX {
    static int[] a = new int[EnumFacing.values().length];

    static {
        try {
            aRX.a[EnumFacing.UP.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aRX.a[EnumFacing.NORTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aRX.a[EnumFacing.SOUTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aRX.a[EnumFacing.WEST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aRX.a[EnumFacing.EAST.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

