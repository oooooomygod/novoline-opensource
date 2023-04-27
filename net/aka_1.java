/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.modules.configurations.property.Property;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.ModuleHolder;
import java.lang.reflect.Field;

import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.akA
 */
public class aka_1 {
    protected @NonNull Field a;
    protected @NonNull String b;

    public void a(@NonNull AbstractModule abstractModule, @NonNull AbstractModule abstractModule2, boolean bl) throws IllegalAccessException {
        int n = ModuleHolder.e();
        asl_0.a(ara_2.a(abstractModule2.getClass(), abstractModule.getClass()), V.a);
        int n2 = n;
        Property property = (Property)avx_0.a(this.a, abstractModule);
        Property property2 = (Property)avx_0.a(this.a, abstractModule2);
        arr_1.a(property2, arr_1.a(property));
        if (ListInvoker.b() != null) {
            ModuleHolder.b(++n2);
        }
    }

    private static IllegalAccessException b(IllegalAccessException illegalAccessException) {
        return illegalAccessException;
    }

    aka_1(String string, Field field, p__0 p__02) {
        this(string, field);
    }

    private aka_1(@NonNull String string, @NonNull Field field) {
        this.b = string;
        this.a = field;
    }
}

