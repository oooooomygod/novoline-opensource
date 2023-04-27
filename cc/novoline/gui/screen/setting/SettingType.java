/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.gui.screen.setting;

import net.jc_0;

public class SettingType
extends Enum<SettingType> {
    private static String[] b;
    public static /* enum */ SettingType BUTTON;
    private static /* synthetic */ SettingType[] a;
    public static /* enum */ SettingType COLOR_PICKER;
    public static /* enum */ SettingType SEPARATOR;
    public static /* enum */ SettingType CHECKBOX;
    public static /* enum */ SettingType TEXTBOX;
    public static /* enum */ SettingType COMBOBOX;
    public static /* enum */ SettingType SLIDER;
    public static /* enum */ SettingType BINDABLE;
    public static /* enum */ SettingType SELECTBOX;

    public static SettingType[] values() {
        return (SettingType[])a.clone();
    }

    static {
        COMBOBOX = new SettingType();
        SELECTBOX = new SettingType();
        CHECKBOX = new SettingType();
        SLIDER = new SettingType();
        TEXTBOX = new SettingType();
        COLOR_PICKER = new SettingType();
        SettingType.b(null);
        BINDABLE = new SettingType();
        BUTTON = new SettingType();
        SEPARATOR = new SettingType();
        a = new SettingType[]{COMBOBOX, SELECTBOX, CHECKBOX, SLIDER, TEXTBOX, COLOR_PICKER, BINDABLE, BUTTON, SEPARATOR};
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static SettingType valueOf(String string) {
        return (SettingType)jc_0.a(SettingType.class, string);
    }

    public static String[] b() {
        return b;
    }
}

