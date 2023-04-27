/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MQ;

/*
 * Renamed from net.avd
 */
class avd_2 {
    static int[] a = new int[MQ.values().length];

    static {
        try {
            avd_2.a[MQ.DEFAULT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            avd_2.a[MQ.CHISELED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            avd_2.a[MQ.LINES_Y.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            avd_2.a[MQ.LINES_X.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            avd_2.a[MQ.LINES_Z.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

