/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

class AN {
    static int[] a = new int[EnumFacing.values().length];

    static {
        try {
            AN.a[EnumFacing.UP.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            AN.a[EnumFacing.NORTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            AN.a[EnumFacing.SOUTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            AN.a[EnumFacing.WEST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            AN.a[EnumFacing.EAST.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

