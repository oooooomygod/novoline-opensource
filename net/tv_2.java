/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ml_0;

/*
 * Renamed from net.tv
 */
class tv_2 {
    static int[] a = new int[ml_0.values().length];

    static {
        try {
            tv_2.a[ml_0.DOWN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            tv_2.a[ml_0.UP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

