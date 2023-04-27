/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aPX;

class aZH {
    static int[] a = new int[aPX.values().length];

    static {
        try {
            aZH.a[aPX.POSITION.ordinal()] = 1;
            aZH.a[aPX.UV.ordinal()] = 2;
            aZH.a[aPX.COLOR.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }

    aZH() {
    }
}

