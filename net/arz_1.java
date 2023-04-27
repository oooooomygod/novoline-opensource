/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ml_0;

/*
 * Renamed from net.arZ
 */
class arz_1 {
    static int[] a = new int[ml_0.values().length];

    static {
        try {
            arz_1.a[ml_0.DOWN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arz_1.a[ml_0.UP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

