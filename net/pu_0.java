/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ayb_0;

/*
 * Renamed from net.Pu
 */
class pu_0 {
    static int[] a = new int[ayb_0.values().length];

    static {
        try {
            pu_0.a[ayb_0.MOJANG.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            pu_0.a[ayb_0.THEALTENING.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

