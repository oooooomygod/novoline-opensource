/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.script;

import cc.novoline.gui.screen.setting.Setting;
import java.util.List;
import net.ahg_0;
import net.auk_2;
import net.skidunion.annotations;

public class ScriptValue {
    public Setting a;

    @annotations
    public boolean getBoolean() {
        return auk_2.a(ahg_0.i(this.a));
    }

    @annotations
    public int getInteger() {
        return ahg_0.c(this.a);
    }

    @annotations
    public String getString() {
        return ahg_0.u(this.a);
    }

    @annotations
    public String getText() {
        return ahg_0.g(this.a);
    }

    @annotations
    public float getFloat() {
        return this.a.h();
    }

    public ScriptValue(Setting setting) {
        this.a = setting;
    }

    @annotations
    public List<String> getList() {
        return ahg_0.o(this.a);
    }

    @annotations
    public long getLong() {
        return this.a.f();
    }

    @annotations
    public double getDouble() {
        return this.a.R();
    }
}

