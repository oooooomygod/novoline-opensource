/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.typesafe.config.ConfigParseOptions
 *  com.typesafe.config.ConfigRenderOptions
 *  org.jetbrains.annotations.NotNull
 */
package net;

import com.typesafe.config.ConfigParseOptions;
import com.typesafe.config.ConfigRenderOptions;
import net.a4a_0;
import net.ake_1;
import net.hi_0;
import org.jetbrains.annotations.NotNull;

public class H8
extends hi_0<H8> {
    private ConfigParseOptions f;
    private static int[] g;
    private ConfigRenderOptions e = a4a_0.a();

    public static void b(int[] nArray) {
        g = nArray;
    }

    @NotNull
    public ConfigRenderOptions e() {
        return this.e;
    }

    public static int[] b() {
        return g;
    }

    protected H8() {
        this.f = a4a_0.b();
    }

    @NotNull
    public H8 a(@NotNull ConfigRenderOptions configRenderOptions) {
        this.e = configRenderOptions;
        return this;
    }

    static {
        if (H8.b() != null) {
            H8.b(new int[5]);
        }
    }

    @NotNull
    public H8 a(ConfigParseOptions configParseOptions) {
        this.f = configParseOptions;
        return this;
    }

    @NotNull
    public ake_1 c() {
        return new ake_1(this, null);
    }

    @NotNull
    public ConfigParseOptions d() {
        return this.f;
    }
}

