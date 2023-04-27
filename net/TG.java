/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aS1;

class TG {
    static int[] a = new int[aS1.values().length];

    static {
        try {
            TG.a[aS1.LIST.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            TG.a[aS1.MAP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

