/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

/*
 * Renamed from net.aiX
 */
class aix_1 {
    static int[] a = new int[EnumFacing.values().length];

    static {
        try {
            aix_1.a[EnumFacing.EAST.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aix_1.a[EnumFacing.WEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aix_1.a[EnumFacing.SOUTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aix_1.a[EnumFacing.NORTH.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

