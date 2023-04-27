/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aux__1;
import net.xz_0;

/*
 * Renamed from net.abD
 */
class abd_1 {
    static int[] a;
    static int[] b;

    static {
        b = new int[aux__1.values().length];
        try {
            abd_1.b[aux__1.ADD_PLAYER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            abd_1.b[aux__1.UPDATE_GAME_MODE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            abd_1.b[aux__1.UPDATE_LATENCY.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            abd_1.b[aux__1.UPDATE_DISPLAY_NAME.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        a = new int[xz_0.values().length];
        try {
            abd_1.a[xz_0.TITLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            abd_1.a[xz_0.SUBTITLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            abd_1.a[xz_0.RESET.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

