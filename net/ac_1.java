/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectCollection
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.lwjgl.input.Keyboard
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.ModuleHolder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectCollection;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.AX;
import net.ModuleArrayMap;
import net.P8;
import net.a0_0;
import net.aMF;
import net.aar_1;
import net.ae6_0;
import net.aen_2;
import net.aer_0;
import net.amv_2;
import net.anw_0;
import net.ara_2;
import net.aue_0;
import net.avx_0;
import net.azo_1;
import net.ms_0;
import net.wc_1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.input.Keyboard;

/*
 * Renamed from net.aC
 */
public class ac_1
extends a0_0 {
    private static Map<String, Integer> k = new Object2ObjectOpenHashMap();

    public void a(@NotNull AbstractModule abstractModule, ae6_0 ae6_02) {
        wc_1.a(abstractModule, ae6_02);
        AX.b(aen_2.a(NovolineInvoker.l(this.g)));
    }

    @Override
    public void a(String[] stringArray, int n, int n2) {
        amv_2.b();
        if (stringArray.length < 2) {
            this.a(aue_0.b, aue_0.l, azo_1.a(aue_0.p, aue_0.c));
            this.b();
            this.a(aar_1.a(aar_1.a(aar_1.a(azo_1.a(aue_0.r, anw_0.GRAY), aue_0.q), aue_0.h, anw_0.YELLOW), aue_0.e));
            return;
        }
        String cfr_ignored_0 = stringArray[0];
        String string = StringInvoker.b(stringArray[1], Locale.ROOT);
        Integer cfr_ignored_1 = (Integer)MapInvoker.a(k, (Object)string, null);
        this.b(aue_0.m);
    }

    @Override
    @Nullable
    public List<String> b(@NotNull String[] stringArray) {
        switch (stringArray.length) {
            case 1: {
                ModuleArrayMap moduleArrayMap = aen_2.c(NovolineInvoker.l(this.g));
                ObjectCollection objectCollection = moduleArrayMap.values();
                return this.a(aMF.a(aMF.a(ms_0.b((Collection)objectCollection), ModuleHolder::c), AbstractModule::t), stringArray[0], true);
            }
            case 2: {
                return this.a(MapInvoker.c(k), stringArray[1], true);
            }
        }
        return null;
    }

    public ac_1(@NotNull Novoline novoline, String string, String string2, List<String> list) {
        super(novoline, string, string2, list);
    }

    private static IllegalAccessException a(IllegalAccessException illegalAccessException) {
        return illegalAccessException;
    }

    static {
        MapInvoker.c(k, aue_0.k, P8.d(-4));
        MapInvoker.c(k, aue_0.i, P8.d(-3));
        try {
            for (Field field : ara_2.g(Keyboard.class)) {
                if (!StringInvoker.e(avx_0.a(field), aue_0.g)) continue;
                avx_0.a(field, true);
                MapInvoker.c(k, StringInvoker.b(StringInvoker.a(avx_0.a(field), 4), Locale.ROOT), P8.d(P8.b((Integer)avx_0.a(field, null))));
            }
        }
        catch (IllegalAccessException illegalAccessException) {
            aer_0.a(illegalAccessException);
        }
    }
}

