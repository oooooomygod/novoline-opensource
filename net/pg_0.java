/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.ModuleHolder;
import cc.novoline.modules.configurations.annotation.Property;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.function.BiFunction;

import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.Pg
 */
public class pg_0<Module extends AbstractModule>
extends ModuleHolder<Module> {
    private @NonNull atu<Module> a;
    private @NonNull ModuleManager g;
    private @NonNull Map<@NonNull String, @NonNull aka_1> f;

    private void a(Map<@NonNull String, @NonNull aka_1> map, @NonNull Field field, @NonNull BiFunction<String, Field, aka_1> biFunction) {
        ModuleHolder.e();
        Property property = (Property)avx_0.b(field, Property.class);
        avx_0.a(field, true);
        String string = eq_0.a(field, property);
        aka_1 aka_12 = (aka_1)acb_0.a(biFunction, string, field);
        MapInvoker.c(map, string, aka_12);
    }

    public @NonNull Module d() {
        return (Module)aVX.a(this.a, this.g);
    }

    private @NonNull Map<@NonNull String, @NonNull aka_1> b() {
        Field field;
        ModuleHolder.a();
        Object2ObjectArrayMap object2ObjectArrayMap = new Object2ObjectArrayMap();
        Class<?> clazz = this.e.getClass();
        Field[] fieldArray = ara_2.e(AbstractModule.class);
        int n = fieldArray.length;
        int n2 = 0;
        if (n2 < n) {
            field = fieldArray[n2];
            this.a((Map<String, aka_1>)object2ObjectArrayMap, field, pg_0::lambda$collectFields$0);
            ++n2;
        }
        if ((n2 = 0) < (n = (fieldArray = ara_2.e(clazz)).length)) {
            field = fieldArray[n2];
            this.a((Map<String, aka_1>)object2ObjectArrayMap, field, pg_0::lambda$collectFields$1);
            ++n2;
        }
        return object2ObjectArrayMap;
    }

    public static <Module extends AbstractModule> @NonNull pg_0<Module> a(@NonNull ModuleManager moduleManager, @NonNull String string, @NonNull atu<Module> atu2) {
        asl_0.a(moduleManager, ak2_0.b);
        asl_0.a(string, ak2_0.a);
        asl_0.a(atu2, ak2_0.d);
        return new pg_0<Module>(moduleManager, string, atu2);
    }

    private pg_0(@NonNull ModuleManager moduleManager, @NonNull String string, @NonNull atu<Module> atu2) {
        super(string, aVX.a(atu2, moduleManager));
        this.g = moduleManager;
        this.a = atu2;
        this.f = this.b();
    }

    public @NonNull Map<@NonNull String, @NonNull aka_1> a() {
        return this.f;
    }

    private static aka_1 lambda$collectFields$1(String string, Field field) {
        return new aka_1(string, field, null);
    }

    private static aka_1 lambda$collectFields$0(String string, Field field) {
        if (StringInvoker.d(string, ak2_0.c)) {
            return new akh_2(string, field, null);
        }
        return new aka_1(string, field, null);
    }
}

