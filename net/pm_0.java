/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.afs_1;

/*
 * Renamed from net.Pm
 */
class pm_0 {
    static int[] a = new int[afs_1.values().length];

    static {
        try {
            pm_0.a[afs_1.EVERYTHING.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            pm_0.a[afs_1.MOBS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

