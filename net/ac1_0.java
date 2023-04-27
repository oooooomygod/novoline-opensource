/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ti_1;

/*
 * Renamed from net.ac1
 */
class ac1_0 {
    static int[] a = new int[ti_1.values().length];

    static {
        try {
            ac1_0.a[ti_1.NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ac1_0.a[ti_1.EAT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ac1_0.a[ti_1.DRINK.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ac1_0.a[ti_1.BLOCK.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ac1_0.a[ti_1.BOW.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

