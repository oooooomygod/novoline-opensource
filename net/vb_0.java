/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 */
package net;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.net.HttpURLConnection;
import java.util.function.Consumer;
import net.mx_2;

/*
 * Renamed from net.Vb
 */
public class vb_0 {
    public static JsonElement a(HttpURLConnection httpURLConnection, Consumer consumer, Class clazz) {
        return mx_2.a(httpURLConnection, consumer, clazz);
    }

    public static HttpURLConnection a(String string) {
        return mx_2.a(string);
    }

    public static Gson a() {
        return mx_2.b();
    }
}

