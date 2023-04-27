/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonSerializationContext
 */
package net;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;

public class a4H {
    public static JsonElement a(JsonSerializationContext jsonSerializationContext, Object object) {
        return jsonSerializationContext.serialize(object);
    }
}

