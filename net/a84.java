/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

class a84 {
    static int[] a = new int[EnumFacing.values().length];

    static {
        try {
            a84.a[EnumFacing.UP.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a84.a[EnumFacing.NORTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a84.a[EnumFacing.SOUTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a84.a[EnumFacing.EAST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a84.a[EnumFacing.WEST.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

