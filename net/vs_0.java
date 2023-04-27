/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a6s_0;

/*
 * Renamed from net.Vs
 */
class vs_0 {
    static int[] a = new int[a6s_0.values().length];

    static {
        try {
            vs_0.a[a6s_0.DIRT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vs_0.a[a6s_0.COARSE_DIRT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

