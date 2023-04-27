/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.ModuleHolder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ModuleArrayMap
extends Object2ObjectArrayMap<String, ModuleHolder<?>> {
    private static boolean lambda$getByName$5(String string, ModuleHolder moduleHolder) {
        return StringInvoker.d(wc_1.a(akk_0.b(moduleHolder)), string);
    }

    private static boolean lambda$getByCategory$2(EnumModuleType enumModuleType, ModuleHolder moduleHolder) {
        return wc_1.d(akk_0.b(moduleHolder)).equals((Object)enumModuleType);
    }

    public ModuleArrayMap() {
    }

    public ModuleArrayMap(Object2ObjectMap<@NotNull String, @NotNull ModuleHolder<?>> object2ObjectMap) {
        super(object2ObjectMap);
    }

    private static yf_1 lambda$getByClass$1(Class clazz) {
        return new yf_1(aL0.a(aL0.a(aL0.a(new StringBuilder(), a9v_0.d), ara_2.k(clazz)), a9v_0.a).toString());
    }

    @NotNull
    public List<AbstractModule> a(EnumModuleType enumModuleType) {
        return (List)aMF.a(aMF.a(aMF.b(uw_0.a(this.values()), arg_0 -> ModuleArrayMap.lambda$getByCategory$2(enumModuleType, arg_0)), ModuleHolder::c), aB0.a(ObjectArrayList::new));
    }

    @NotNull
    public <Module extends AbstractModule> ModuleHolder<Module> a(@NotNull Class<? extends Module> clazz) {
        return (ModuleHolder)oc_1.a(oc_1.a(aMF.b(aMF.b(pb_1.a(this.entrySet()), arg_0 -> ModuleArrayMap.lambda$getHolderByClass$3(clazz, arg_0))), Map.Entry::getValue), () -> ModuleArrayMap.lambda$getHolderByClass$4(clazz));
    }

    @Nullable
    public <Module extends AbstractModule> Module a(@Nullable String string, boolean bl) {
        AbstractModule.c();
        if (aw__0.d(string)) {
            return null;
        }
        Stream stream = uw_0.a(this.values());
        stream = aMF.b(stream, arg_0 -> ModuleArrayMap.lambda$getByName$5(string, arg_0));
        stream = aMF.b(stream, arg_0 -> ModuleArrayMap.lambda$getByName$6(string, arg_0));
        return (Module)((AbstractModule)oc_1.a(oc_1.a(aMF.d(stream), ModuleHolder::c), null));
    }

    @NotNull
    public <Module extends AbstractModule> Module b(@NotNull Class<? extends Module> clazz) {
        return (Module)((AbstractModule)oc_1.a(oc_1.a(oc_1.a(aMF.b(aMF.b(pb_1.a(this.entrySet()), arg_0 -> ModuleArrayMap.lambda$getByClass$0(clazz, arg_0))), Map.Entry::getValue), ModuleHolder::c), () -> ModuleArrayMap.lambda$getByClass$1(clazz)));
    }

    private static boolean lambda$getByClass$0(Class clazz, Map.Entry entry) {
        return akk_0.b((ModuleHolder)FG.a(entry)).getClass() == clazz;
    }

    public ModuleArrayMap(int n) {
        super(n);
    }

    private static yf_1 lambda$getHolderByClass$4(Class clazz) {
        return new yf_1(aL0.a(aL0.a(aL0.a(new StringBuilder(), a9v_0.c), ara_2.k(clazz)), a9v_0.b).toString());
    }

    private static yf_1 a(yf_1 yf_12) {
        return yf_12;
    }

    private static boolean lambda$getHolderByClass$3(Class clazz, Map.Entry entry) {
        return akk_0.b((ModuleHolder)FG.a(entry)).getClass() == clazz;
    }

    private static boolean lambda$getByName$6(String string, ModuleHolder moduleHolder) {
        return wc_1.a(akk_0.b(moduleHolder)).equals(string);
    }

    @Nullable
    public <Module extends AbstractModule> Module a(@Nullable String string) {
        return this.a(string, true);
    }
}

