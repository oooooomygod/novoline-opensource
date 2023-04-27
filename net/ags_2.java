/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.SettingType;

/*
 * Renamed from net.ags
 */
class ags_2 {
    static int[] a = new int[SettingType.values().length];

    static {
        try {
            ags_2.a[SettingType.SLIDER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ags_2.a[SettingType.SELECTBOX.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ags_2.a[SettingType.COMBOBOX.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

