/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.NotificationType;

class aOR {
    static int[] a = new int[NotificationType.values().length];

    static {
        try {
            aOR.a[NotificationType.WARNING.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aOR.a[NotificationType.SUCCESS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aOR.a[NotificationType.ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aOR.a[NotificationType.INFO.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

