/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

class aW2 {
    static int[] a = new int[EnumFacing.values().length];

    static {
        try {
            aW2.a[EnumFacing.NORTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aW2.a[EnumFacing.SOUTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

