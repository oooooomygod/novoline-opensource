/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.adf_0;

/*
 * Renamed from net.q4
 */
class q4_0 {
    static int[] a = new int[adf_0.values().length];

    static {
        try {
            q4_0.a[adf_0.END_COMBAT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            q4_0.a[adf_0.ENTITY_DIED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

