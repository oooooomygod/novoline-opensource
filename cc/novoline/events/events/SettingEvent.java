/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events;

import cc.novoline.events.Event;
import cc.novoline.modules.AbstractModule;
import deobf.SettingType;
import net.AbstractNumberProperty;
import net.BooleanProperty;
import net.ListProperty;
import net.StringProperty;

public class SettingEvent
implements Event {
    private String h;
    private SettingType g;
    private BooleanProperty e;
    private ListProperty<String> d;
    private String a;
    private StringProperty f;
    private AbstractNumberProperty c;
    private AbstractModule b;

    public ListProperty<String> g() {
        return this.d;
    }

    public SettingEvent(AbstractModule abstractModule, String string) {
        this.b = abstractModule;
        this.a = string;
        this.g = SettingType.COLOR_PICKER;
    }

    public AbstractModule b() {
        return this.b;
    }

    public SettingEvent(AbstractModule abstractModule, String string, String string2, BooleanProperty booleanProperty) {
        this.b = abstractModule;
        this.a = string;
        this.h = string2;
        this.g = SettingType.CHECKBOX;
        this.e = booleanProperty;
    }

    public SettingEvent(AbstractModule abstractModule, String string, StringProperty stringProperty) {
        this.b = abstractModule;
        this.a = string;
        this.g = SettingType.COMBOBOX;
        this.f = stringProperty;
    }

    public String e() {
        return this.a;
    }

    public SettingEvent(AbstractModule abstractModule, String string, BooleanProperty booleanProperty) {
        this.b = abstractModule;
        this.a = string;
        this.g = SettingType.CHECKBOX;
        this.e = booleanProperty;
    }

    public BooleanProperty a() {
        return this.e;
    }

    public StringProperty h() {
        return this.f;
    }

    public SettingEvent(AbstractModule abstractModule, String string, AbstractNumberProperty abstractNumberProperty) {
        this.b = abstractModule;
        this.a = string;
        this.g = SettingType.SLIDER;
        this.c = abstractNumberProperty;
    }

    public SettingEvent(AbstractModule abstractModule, String string, ListProperty<String> listProperty) {
        this.b = abstractModule;
        this.a = string;
        this.g = SettingType.SELECTBOX;
        this.d = listProperty;
    }

    public AbstractNumberProperty c() {
        return this.c;
    }

    public String f() {
        return this.h;
    }

    public SettingType d() {
        return this.g;
    }
}

