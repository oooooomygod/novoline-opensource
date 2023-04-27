/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.SettingType;

class aGZ {
    static int[] a = new int[SettingType.values().length];

    static {
        try {
            aGZ.a[SettingType.SLIDER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aGZ.a[SettingType.COMBOBOX.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aGZ.a[SettingType.SELECTBOX.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

