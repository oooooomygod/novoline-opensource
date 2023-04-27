/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a3L;

class a4D {
    static int[] a = new int[a3L.values().length];

    static {
        try {
            a4D.a[a3L.CRACKED.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a4D.a[a3L.MICROSOFT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a4D.a[a3L.COOKIE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

