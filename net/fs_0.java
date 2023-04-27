/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a40;

/*
 * Renamed from net.Fs
 */
class fs_0 {
    static int[] a = new int[a40.values().length];

    static {
        try {
            fs_0.a[a40.MONSTER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fs_0.a[a40.CREATURE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fs_0.a[a40.WATER_CREATURE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fs_0.a[a40.AMBIENT.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

