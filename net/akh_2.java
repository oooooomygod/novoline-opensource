/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.ModuleHolder;
import java.lang.reflect.Field;
import net.Ba;
import net.BooleanProperty;
import net.afk_2;
import net.aka_1;
import net.ara_2;
import net.asl_0;
import net.auk_2;
import net.avx_0;
import net.p__0;
import net.wc_1;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.akh
 */
public class akh_2
extends aka_1 {
    akh_2(String string, Field field, p__0 p__02) {
        this(string, field);
    }

    private static IllegalAccessException a(IllegalAccessException illegalAccessException) {
        return illegalAccessException;
    }

    private akh_2(@NonNull String string, @NonNull Field field) {
        super(string, field, null);
    }

    @Override
    public void a(@NonNull AbstractModule abstractModule, @NonNull AbstractModule abstractModule2, boolean bl) throws IllegalAccessException {
        asl_0.a(ara_2.a(abstractModule2.getClass(), abstractModule.getClass()), afk_2.a);
        BooleanProperty booleanProperty = (BooleanProperty)avx_0.a(this.a, abstractModule);
        BooleanProperty cfr_ignored_0 = (BooleanProperty)avx_0.a(this.a, abstractModule2);
        ModuleHolder.a();
        wc_1.b(abstractModule2, auk_2.a((Boolean)Ba.b(booleanProperty)));
        ListInvoker.b(new ListInvoker[2]);
    }
}

