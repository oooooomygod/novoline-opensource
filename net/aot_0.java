/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.vx_0;

/*
 * Renamed from net.aOt
 */
class aot_0 {
    static int[] a = new int[vx_0.values().length];

    static {
        try {
            aot_0.a[vx_0.COBBLESTONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aot_0.a[vx_0.STONEBRICK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aot_0.a[vx_0.MOSSY_STONEBRICK.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aot_0.a[vx_0.CRACKED_STONEBRICK.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aot_0.a[vx_0.CHISELED_STONEBRICK.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

