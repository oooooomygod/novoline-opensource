/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aux__1;

/*
 * Renamed from net.Vd
 */
class vd_0 {
    static int[] a = new int[aux__1.values().length];

    static {
        try {
            vd_0.a[aux__1.ADD_PLAYER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vd_0.a[aux__1.UPDATE_GAME_MODE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vd_0.a[aux__1.UPDATE_LATENCY.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vd_0.a[aux__1.UPDATE_DISPLAY_NAME.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vd_0.a[aux__1.REMOVE_PLAYER.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

