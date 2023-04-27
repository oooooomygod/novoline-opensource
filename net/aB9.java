/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.FieldNamingPolicy
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.TypeAdapterFactory
 */
package net;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import java.lang.reflect.Type;

public class aB9 {
    public static GsonBuilder a(GsonBuilder gsonBuilder, Class clazz, Object object) {
        return gsonBuilder.registerTypeHierarchyAdapter(clazz, object);
    }

    public static GsonBuilder a(GsonBuilder gsonBuilder) {
        return gsonBuilder.disableHtmlEscaping();
    }

    public static GsonBuilder e(GsonBuilder gsonBuilder) {
        return gsonBuilder.excludeFieldsWithoutExposeAnnotation();
    }

    public static GsonBuilder a(GsonBuilder gsonBuilder, FieldNamingPolicy fieldNamingPolicy) {
        return gsonBuilder.setFieldNamingPolicy(fieldNamingPolicy);
    }

    public static GsonBuilder d(GsonBuilder gsonBuilder) {
        return gsonBuilder.setPrettyPrinting();
    }

    public static GsonBuilder c(GsonBuilder gsonBuilder) {
        return gsonBuilder.serializeNulls();
    }

    public static GsonBuilder a(GsonBuilder gsonBuilder, Type type, Object object) {
        return gsonBuilder.registerTypeAdapter(type, object);
    }

    public static Gson b(GsonBuilder gsonBuilder) {
        return gsonBuilder.create();
    }

    public static GsonBuilder a(GsonBuilder gsonBuilder, TypeAdapterFactory typeAdapterFactory) {
        return gsonBuilder.registerTypeAdapterFactory(typeAdapterFactory);
    }
}

