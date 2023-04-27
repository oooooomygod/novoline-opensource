/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

class a5W {
    static int[] a = new int[EnumFacing.values().length];

    static {
        try {
            a5W.a[EnumFacing.SOUTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a5W.a[EnumFacing.NORTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a5W.a[EnumFacing.WEST.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a5W.a[EnumFacing.EAST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

