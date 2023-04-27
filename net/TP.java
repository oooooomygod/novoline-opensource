/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.NotificationType;

class TP {
    static int[] a = new int[NotificationType.values().length];

    static {
        try {
            TP.a[NotificationType.WARNING.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            TP.a[NotificationType.SUCCESS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            TP.a[NotificationType.ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

