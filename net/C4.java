/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.typesafe.config.ConfigOrigin
 *  com.typesafe.config.ConfigRenderOptions
 *  com.typesafe.config.ConfigValue
 *  com.typesafe.config.ConfigValueType
 */
package net;

import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigValue;
import com.typesafe.config.ConfigValueType;

public class C4 {
    private static int[] b;

    public static ConfigValueType a(ConfigValue configValue) {
        return configValue.valueType();
    }

    public static Object b(ConfigValue configValue) {
        return configValue.unwrapped();
    }

    public static int[] b() {
        return b;
    }

    public static ConfigValue a(ConfigValue configValue, ConfigOrigin configOrigin) {
        return configValue.withOrigin(configOrigin);
    }

    public static ConfigOrigin c(ConfigValue configValue) {
        return configValue.origin();
    }

    public static String a(ConfigValue configValue, ConfigRenderOptions configRenderOptions) {
        return configValue.render(configRenderOptions);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    static {
        if (C4.b() != null) {
            C4.b(new int[3]);
        }
    }
}

