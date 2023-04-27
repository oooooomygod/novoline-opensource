/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.typesafe.config.ConfigRenderOptions
 */
package net;

import com.typesafe.config.ConfigRenderOptions;

public class a2V {
    public static ConfigRenderOptions a(ConfigRenderOptions configRenderOptions, boolean bl) {
        return configRenderOptions.setOriginComments(bl);
    }

    public static ConfigRenderOptions b(ConfigRenderOptions configRenderOptions, boolean bl) {
        return configRenderOptions.setJson(bl);
    }

    public static ConfigRenderOptions a() {
        return ConfigRenderOptions.defaults();
    }
}

