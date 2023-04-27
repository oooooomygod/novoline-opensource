/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.anf_0;
import net.az_1;

class aPY {
    static int[] a;
    static int[] b;

    static {
        b = new int[az_1.values().length];
        try {
            aPY.b[az_1.ASCENDING_EAST.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aPY.b[az_1.ASCENDING_WEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aPY.b[az_1.ASCENDING_NORTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aPY.b[az_1.ASCENDING_SOUTH.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        a = new int[anf_0.values().length];
        try {
            aPY.a[anf_0.CHEST.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aPY.a[anf_0.FURNACE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aPY.a[anf_0.TNT.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aPY.a[anf_0.SPAWNER.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aPY.a[anf_0.HOPPER.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aPY.a[anf_0.COMMAND_BLOCK.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

