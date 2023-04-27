/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MapFactory;
import deobf.TypeSerializerCollection;
import java.util.Set;
import net.ConfigurationOptions;
import net.ObjectMapperFactory;

public class aVH {
    public static TypeSerializerCollection c(ConfigurationOptions configurationOptions) {
        return configurationOptions.b();
    }

    public static String a(ConfigurationOptions configurationOptions) {
        return configurationOptions.d();
    }

    public static ObjectMapperFactory d(ConfigurationOptions configurationOptions) {
        return configurationOptions.c();
    }

    public static MapFactory e(ConfigurationOptions configurationOptions) {
        return configurationOptions.e();
    }

    public static boolean a(ConfigurationOptions configurationOptions, Class clazz) {
        return configurationOptions.a(clazz);
    }

    public static ConfigurationOptions a(ConfigurationOptions configurationOptions, Set set) {
        return configurationOptions.a(set);
    }

    public static ConfigurationOptions a(ConfigurationOptions configurationOptions, ObjectMapperFactory objectMapperFactory) {
        return configurationOptions.a(objectMapperFactory);
    }

    public static boolean b(ConfigurationOptions configurationOptions) {
        return configurationOptions.g();
    }

    public static ConfigurationOptions a(ConfigurationOptions configurationOptions, TypeSerializerCollection typeSerializerCollection) {
        return configurationOptions.a(typeSerializerCollection);
    }

    public static ConfigurationOptions a(ConfigurationOptions configurationOptions, String string) {
        return configurationOptions.a(string);
    }

    public static ConfigurationOptions a() {
        return ConfigurationOptions.f();
    }
}

