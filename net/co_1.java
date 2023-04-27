/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

/*
 * Renamed from net.cO
 */
class co_1 {
    static int[] a = new int[kl_1.values().length];
    static int[] b = new int[EnumFacing.values().length];

    static {
        try {
            co_1.a[kl_1.X.ordinal()] = 1;
            co_1.a[kl_1.Y.ordinal()] = 2;
            co_1.a[kl_1.Z.ordinal()] = 3;
            co_1.b[EnumFacing.DOWN.ordinal()] = 1;
            co_1.b[EnumFacing.UP.ordinal()] = 2;
            co_1.b[EnumFacing.NORTH.ordinal()] = 3;
            co_1.b[EnumFacing.SOUTH.ordinal()] = 4;
            co_1.b[EnumFacing.WEST.ordinal()] = 5;
            co_1.b[EnumFacing.EAST.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }

    co_1() {
    }
}

