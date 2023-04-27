/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ml_0;

/*
 * Renamed from net.alM
 */
class alm_1 {
    static int[] a = new int[ml_0.values().length];

    static {
        try {
            alm_1.a[ml_0.UP.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            alm_1.a[ml_0.DOWN.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

