/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.kl_1;

/*
 * Renamed from net.azR
 */
class azr_0 {
    static int[] a = new int[kl_1.values().length];

    static {
        try {
            azr_0.a[kl_1.Z.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            azr_0.a[kl_1.X.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            azr_0.a[kl_1.Y.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

