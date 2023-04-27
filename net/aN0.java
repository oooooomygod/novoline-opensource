/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 */
package net;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;

public class aN0 {
    public static Object a(JsonDeserializationContext jsonDeserializationContext, JsonElement jsonElement, Type type) {
        return jsonDeserializationContext.deserialize(jsonElement, type);
    }
}

