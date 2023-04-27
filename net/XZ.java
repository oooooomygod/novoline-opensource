/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.stream.JsonWriter
 */
package net;

import com.google.gson.stream.JsonWriter;

public class XZ {
    private static int[] b;

    static {
        if (XZ.b() != null) {
            XZ.b(new int[1]);
        }
    }

    public static JsonWriter a(JsonWriter jsonWriter) {
        return jsonWriter.nullValue();
    }

    public static int[] b() {
        return b;
    }

    public static JsonWriter a(JsonWriter jsonWriter, String string) {
        return jsonWriter.value(string);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }
}

