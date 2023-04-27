/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonToken
 */
package net;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

/*
 * Renamed from net.ayS
 */
public class ays_1 {
    public static void a(JsonReader jsonReader) {
        jsonReader.nextNull();
    }

    public static JsonToken c(JsonReader jsonReader) {
        return jsonReader.peek();
    }

    public static String b(JsonReader jsonReader) {
        return jsonReader.nextString();
    }
}

