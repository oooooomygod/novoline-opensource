/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.kl_1;

class IS {
    static int[] a = new int[kl_1.values().length];

    static {
        try {
            IS.a[kl_1.X.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            IS.a[kl_1.Y.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            IS.a[kl_1.Z.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

