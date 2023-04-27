/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 */
package net;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.Reader;

public class a1r {
    public static JsonElement a(JsonParser jsonParser, Reader reader) {
        return jsonParser.parse(reader);
    }

    public static JsonElement a(JsonParser jsonParser, String string) {
        return jsonParser.parse(string);
    }
}

