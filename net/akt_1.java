/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.awr_2;

/*
 * Renamed from net.akt
 */
class akt_1 {
    static int[] a = new int[awr_2.values().length];

    static {
        try {
            akt_1.a[awr_2.COOL_WARM.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            akt_1.a[awr_2.HEAT_ICE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            akt_1.a[awr_2.SPECIAL.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

