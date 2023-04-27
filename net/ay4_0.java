/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.axs_1;

/*
 * Renamed from net.ay4
 */
class ay4_0 {
    static int[] a = new int[axs_1.values().length];

    static {
        try {
            ay4_0.a[axs_1.UP.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ay4_0.a[axs_1.DOWN.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ay4_0.a[axs_1.LEFT.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ay4_0.a[axs_1.RIGHT.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

