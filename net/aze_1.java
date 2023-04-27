/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.TypeAdapter
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonToken
 *  com.google.gson.stream.JsonWriter
 */
package net;

import cc.novoline.invoke.MapInvoker;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;
import net.XZ;
import net.alb_0;
import net.ays_1;

/*
 * Renamed from net.azE
 */
class aze_1
extends TypeAdapter<T> {
    Map a;
    alb_0 b;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public T read(JsonReader jsonReader) throws IOException {
        if (ays_1.c(jsonReader) == JsonToken.NULL) {
            ays_1.a(jsonReader);
            return null;
        }
        return MapInvoker.c(this.a, ays_1.b(jsonReader));
    }

    aze_1(alb_0 alb_02, Map map) {
        this.b = alb_02;
        this.a = map;
    }

    public void write(JsonWriter jsonWriter, T t) throws IOException {
        XZ.a(jsonWriter);
    }
}

