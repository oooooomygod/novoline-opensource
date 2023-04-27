/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.SettingType;

/*
 * Renamed from net.aVy
 */
class avy_0 {
    static int[] a = new int[SettingType.values().length];

    static {
        try {
            avy_0.a[SettingType.CHECKBOX.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            avy_0.a[SettingType.SLIDER.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            avy_0.a[SettingType.COMBOBOX.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            avy_0.a[SettingType.SELECTBOX.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            avy_0.a[SettingType.COLOR_PICKER.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            avy_0.a[SettingType.TEXTBOX.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            avy_0.a[SettingType.BUTTON.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            avy_0.a[SettingType.BINDABLE.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            avy_0.a[SettingType.SEPARATOR.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

