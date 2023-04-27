/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.zq_1;

/*
 * Renamed from net.ahS
 */
class ahs_1 {
    static int[] a = new int[zq_1.values().length];

    static {
        try {
            ahs_1.a[zq_1.ALL_STEM.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ahs_1.a[zq_1.ALL_INSIDE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ahs_1.a[zq_1.STEM.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

