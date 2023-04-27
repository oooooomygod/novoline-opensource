/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

class a4T {
    static int[] a = new int[EnumFacing.values().length];

    static {
        try {
            a4T.a[EnumFacing.DOWN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a4T.a[EnumFacing.UP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a4T.a[EnumFacing.EAST.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a4T.a[EnumFacing.WEST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a4T.a[EnumFacing.NORTH.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a4T.a[EnumFacing.SOUTH.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

