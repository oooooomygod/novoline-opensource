/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jdk.nashorn.api.scripting.JSObject
 *  org.jetbrains.annotations.NotNull
 */
package cc.novoline.script;

import cc.novoline.events.Event;
import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.LoadWorldEvent;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.events.events.ScriptUpdateEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.events.events.script.ScriptMoveEvent;
import cc.novoline.events.events.script.ScriptRender3DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
import deobf.SettingType;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import jdk.nashorn.api.scripting.JSObject;
import net.BooleanProperty;
import net.DoubleProperty;
import net.FloatProperty;
import net.ListProperty;
import net.MD;
import net.ModuleManager;
import net.P8;
import net.StringProperty;
import net.a1c;
import net.a9V;
import net.aRR;
import net.adt_2;
import net.alm_2;
import net.aoi_1;
import net.aor_0;
import net.auk_2;
import net.ava_0;
import net.axx_1;
import net.bd_0;
import net.bt_0;
import net.db_0;
import net.ds_2;
import net.dz_0;
import net.yu_1;
import org.jetbrains.annotations.NotNull;
import net.skidunion.annotations;

public class ScriptModule
extends AbstractModule {
    private Invocable J;
    private static long K = a1c.a(6668478353371543029L, 5415344286621657086L, MethodHandles.lookup().lookupClass()).a(148716627389124L);
    private ScriptEngine H;
    private HashMap I;

    @annotations
    public void onEvent(String string, JSObject jSObject) {
        ds_2.a(this.I, string, jSObject);
    }

    private void a(String string, Event event) {
        JSObject jSObject = (JSObject)ds_2.a(this.I, string);
        aRR.a(jSObject, null, new Object[]{event});
    }

    @annotations
    public void addStringProperty(String string, String string2, String string3, String ... stringArray) {
        ManagerInvoker.put(new Setting(string, string2, SettingType.COMBOBOX, (AbstractModule)this, StringPropertyInvoker.b(new StringProperty(string3), stringArray)));
    }

    @annotations
    public void addDoubleProperty(String string, String string2, double d, double d2, double d3, double d4) {
        ManagerInvoker.put(new Setting(string, string2, SettingType.SLIDER, (AbstractModule)this, MD.c((DoubleProperty)MD.a(new DoubleProperty(db_0.a(d)), db_0.a(d2)), db_0.a(d3)), d4));
    }

    @annotations
    public void addFloatProperty(String string, String string2, float f, float f2, float f3, float f4) {
        ManagerInvoker.put(new Setting(string, string2, SettingType.SLIDER, (AbstractModule)this, a9V.a((FloatProperty)a9V.b(new FloatProperty(axx_1.a(f)), axx_1.a(f2)), axx_1.a(f3)), f4));
    }

    public ScriptModule(@NotNull ModuleManager moduleManager, String string, EnumModuleType enumModuleType, ScriptEngine scriptEngine) {
        long l4 = K ^ 0xF5B66FF535BL;
        long l5 = l4 ^ 0x1D89327F6C3CL;
        super(l5, moduleManager, string, enumModuleType, yu_1.b);
        this.I = new HashMap();
        this.H = scriptEngine;
        this.J = (Invocable)((Object)scriptEngine);
    }

    @EventTarget
    public void a(ScriptUpdateEvent scriptUpdateEvent) {
        block5: {
            block4: {
                Script.g();
                if (alm_2.a(scriptUpdateEvent) != cc.novoline.events.type.State.PRE) break block4;
                if (!ds_2.b(this.I, yu_1.r)) break block5;
                this.a(yu_1.v, scriptUpdateEvent);
            }
            if (alm_2.a(scriptUpdateEvent) == cc.novoline.events.type.State.POST && ds_2.b(this.I, yu_1.A)) {
                this.a(yu_1.t, scriptUpdateEvent);
            }
        }
    }

    @EventTarget
    public void a(aor_0 aor_02) {
        Script.g();
        if (ds_2.b(this.I, yu_1.o)) {
            this.a(yu_1.s, aor_02);
        }
    }

    @EventTarget
    public void a(bt_0 bt_02) {
        Script.g();
        if (ds_2.b(this.I, yu_1.c)) {
            this.a(yu_1.y, bt_02);
        }
    }

    @annotations
    public ScriptValue getProperty(String string) {
        Setting setting;
        Script.g();
        List list = ManagerInvoker.a(this);
        Iterator iterator = ListInvoker.iterator(list);
        if (dz_0.c(iterator) && (setting = (Setting)dz_0.b(iterator)).J().equals(string)) {
            return new ScriptValue(setting);
        }
        return null;
    }

    @annotations
    public void addListProperty(String string, String string2, String string3, String ... stringArray) {
        ManagerInvoker.put(new Setting(string, string2, SettingType.SELECTBOX, (AbstractModule)this, ava_0.a(new ListProperty<String>(string3), stringArray)));
    }

    @Override
    public void w() {
        Script.g();
        if (ds_2.b(this.I, yu_1.d)) {
            this.a(yu_1.e, null);
        }
    }

    @annotations
    public void addIntegerProperty(String string, String string2, int n, int n2, int n3, int n4) {
        ManagerInvoker.put(new Setting(string, string2, SettingType.SLIDER, (AbstractModule)this, adt_2.a((IntProperty)adt_2.c(new IntProperty(P8.d(n)), P8.d(n2)), P8.d(n3)), n4));
    }

    @EventTarget
    public void a(bd_0 bd_02) {
        block5: {
            block4: {
                Script.g();
                if (aoi_1.b(bd_02) != State.OUTGOING) break block4;
                if (!ds_2.b(this.I, yu_1.n)) break block5;
                this.a(yu_1.z, bd_02);
            }
            if (aoi_1.b(bd_02) == State.INCOMING && ds_2.b(this.I, yu_1.m)) {
                this.a(yu_1.l, bd_02);
            }
        }
    }

    @EventTarget
    public void a(ScriptRender3DEvent scriptRender3DEvent) {
        Script.g();
        if (ds_2.b(this.I, yu_1.k)) {
            this.a(yu_1.q, scriptRender3DEvent);
        }
    }

    @EventTarget
    public void a(ScriptMoveEvent scriptMoveEvent) {
        Script.g();
        if (ds_2.b(this.I, yu_1.j)) {
            this.a(yu_1.w, scriptMoveEvent);
        }
    }

    @annotations
    public void addBooleanProperty(String string, String string2, boolean bl) {
        ManagerInvoker.put(new Setting(string, string2, SettingType.CHECKBOX, (AbstractModule)this, new BooleanProperty(auk_2.b(bl))));
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        Script.g();
        if (ds_2.b(this.I, yu_1.a)) {
            this.a(yu_1.f, tickUpdateEvent);
        }
    }

    @Override
    public void o() {
        Script.g();
        if (ds_2.b(this.I, yu_1.i)) {
            this.a(yu_1.g, null);
        }
    }

    @EventTarget
    public void a(PlayerUpdateEvent playerUpdateEvent) {
        Script.g();
        if (ds_2.b(this.I, yu_1.h)) {
            this.a(yu_1.p, playerUpdateEvent);
        }
    }

    @EventTarget
    public void a(LoadWorldEvent loadWorldEvent) {
        Script.g();
        if (ds_2.b(this.I, yu_1.x)) {
            this.a(yu_1.u, loadWorldEvent);
        }
    }
}

