/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

/*
 * Renamed from net.uT
 */
class ut_0 {
    static int[] a;
    static int[] b;

    static {
        b = new int[aB6.values().length];
        try {
            ut_0.b[aB6.OPENING.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ut_0.b[aB6.WOOD_DOOR.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ut_0.b[aB6.GRATES.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ut_0.b[aB6.IRON_DOOR.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        a = new int[EnumFacing.values().length];
        try {
            ut_0.a[EnumFacing.SOUTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ut_0.a[EnumFacing.WEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ut_0.a[EnumFacing.EAST.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ut_0.a[EnumFacing.NORTH.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

