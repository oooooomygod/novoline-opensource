/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.az_1;

class aX8 {
    static int[] a = new int[az_1.values().length];

    static {
        try {
            aX8.a[az_1.NORTH_SOUTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aX8.a[az_1.EAST_WEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aX8.a[az_1.ASCENDING_EAST.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aX8.a[az_1.ASCENDING_WEST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aX8.a[az_1.ASCENDING_NORTH.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aX8.a[az_1.ASCENDING_SOUTH.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aX8.a[az_1.SOUTH_EAST.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aX8.a[az_1.SOUTH_WEST.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aX8.a[az_1.NORTH_WEST.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aX8.a[az_1.NORTH_EAST.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

