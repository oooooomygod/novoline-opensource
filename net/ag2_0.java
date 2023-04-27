/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.axs_2;

/*
 * Renamed from net.ag2
 */
class ag2_0 {
    static int[] a = new int[axs_2.values().length];

    static {
        try {
            ag2_0.a[axs_2.SET_SIZE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ag2_0.a[axs_2.LERP_SIZE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ag2_0.a[axs_2.SET_CENTER.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ag2_0.a[axs_2.SET_WARNING_BLOCKS.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ag2_0.a[axs_2.SET_WARNING_TIME.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ag2_0.a[axs_2.INITIALIZE.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

