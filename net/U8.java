/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

class U8 {
    static int[] a = new int[kl_1.values().length];
    static int[] c;
    static int[] b;

    static {
        try {
            U8.a[kl_1.X.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            U8.a[kl_1.Z.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        c = new int[aAP.values().length];
        try {
            U8.c[aAP.EAST.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            U8.c[aAP.WEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            U8.c[aAP.SOUTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            U8.c[aAP.NORTH.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            U8.c[aAP.UP_Z.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            U8.c[aAP.UP_X.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            U8.c[aAP.DOWN_X.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            U8.c[aAP.DOWN_Z.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        b = new int[EnumFacing.values().length];
        try {
            U8.b[EnumFacing.DOWN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            U8.b[EnumFacing.UP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            U8.b[EnumFacing.NORTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            U8.b[EnumFacing.SOUTH.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            U8.b[EnumFacing.WEST.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            U8.b[EnumFacing.EAST.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

