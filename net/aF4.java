/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.az_1;

class aF4 {
    static int[] a = new int[az_1.values().length];

    static {
        try {
            aF4.a[az_1.NORTH_SOUTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aF4.a[az_1.EAST_WEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aF4.a[az_1.ASCENDING_EAST.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aF4.a[az_1.ASCENDING_WEST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aF4.a[az_1.ASCENDING_NORTH.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aF4.a[az_1.ASCENDING_SOUTH.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

