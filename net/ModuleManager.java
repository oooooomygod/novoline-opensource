/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.configurations.ConfigManager;
import cc.novoline.modules.EnumModuleType;
import deobf.ModuleHolder;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ModuleManager {
    private ConfigManager configManager;
    private ModuleArrayMap d = new ModuleArrayMap();
    private BindManager bindManager;
    private Novoline b;

    public ModuleManager(@NotNull Novoline novoline, int n) {
        int n2 = AbstractModule.v();
        this.b = novoline;
        this.configManager = new ConfigManager(this, n);
        this.bindManager = new BindManager(this, n);
        if (ListInvoker.b() != null) {
            AbstractModule.b(++n2);
        }
    }

    public <Module extends AbstractModule> void a(@NotNull String string, @NotNull atu<Module> atu2, boolean bl) {
        AbstractModule.c();
        asl_0.a(string, ey_1.c);
        pg_0 pg_02 = ajg.a(this, string, atu2);
        if (this.b(ake_0.b(ajg.b(pg_02)))) {
            throw new IllegalStateException(aL0.a(aL0.a(aL0.a(new StringBuilder(), ey_1.a), ajg.d(pg_02)), ey_1.b).toString());
        }
        this.d.put(string, pg_02);
    }

    @NotNull
    public <Module extends AbstractModule> Module a(Class<? extends Module> clazz) {
        return (Module)awe_0.a(this.d, clazz);
    }

    @NotNull
    public Novoline getNovoline() {
        return this.b;
    }

    public void a(AbstractModule abstractModule) {
        uw_0.a(this.d.values(), arg_0 -> ModuleManager.lambda$removeByModule$0(abstractModule, arg_0));
    }

    @NotNull
    public ModuleArrayMap d() {
        return this.d;
    }

    @NotNull
    public List<AbstractModule> a(EnumModuleType enumModuleType) {
        return awe_0.a(this.d, enumModuleType);
    }

    @Nullable
    public <Module extends AbstractModule> Module a(String string) {
        return this.d.a(string);
    }

    private static boolean lambda$removeByModule$0(AbstractModule abstractModule, ModuleHolder moduleHolder) {
        return akk_0.b(moduleHolder) == abstractModule;
    }

    public boolean b(@NotNull Class<? extends AbstractModule> clazz) {
        try {
            awe_0.a(this.d, clazz);
            return true;
        }
        catch (yf_1 yf_12) {
            return false;
        }
    }

    @NotNull
    public ConfigManager c() {
        return this.configManager;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    @NotNull
    public BindManager b() {
        return this.bindManager;
    }
}

