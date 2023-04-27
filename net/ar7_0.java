/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.modules.configurations.ConfigManager;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.ar7
 */
@ahn_1
public class ar7_0 {
    @ato_0(value="config-version")
    private int a;
    @ato_0(value="modules")
    private ModuleArrayMap b;

    public static @NonNull ar7_0 a(@NonNull String string, @Nullable ModuleArrayMap moduleArrayMap, int n) {
        asl_0.a((Object)moduleArrayMap, axe_1.a);
        return new ar7_0(moduleArrayMap, n);
    }

    private ar7_0(@Nullable ModuleArrayMap moduleArrayMap, int n) {
        this.b = moduleArrayMap;
        this.a = n;
    }

    public int b() {
        return this.a;
    }

    public @NonNull String toString() {
        return aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), axe_1.d), (Object)this.b), axe_1.c), this.a), '}').toString();
    }

    public ModuleArrayMap a() {
        return this.b;
    }

    public ar7_0() {
    }

    public static @NonNull ar7_0 a(@NonNull ConfigManager configManager, @NonNull String string) {
        asl_0.a(configManager, axe_1.b);
        return new ar7_0(aen_2.c(aHE.a(configManager)), configManager.a());
    }
}

