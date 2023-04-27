/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.FieldNamingPolicy
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.function.Consumer;
import net.a1r;
import net.a5R;
import net.aB9;
import net.aNW;
import net.aan_1;
import net.ara_2;
import net.asl_0;
import net.te_0;
import net.uw_2;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.mx
 */
public class mx_2 {
    private static JsonParser a = new JsonParser();
    private static Gson b = aB9.b(aB9.a(aB9.e(aB9.c(aB9.a(new GsonBuilder()))), FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES));

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private mx_2() {
        throw new UnsupportedOperationException(uw_2.b);
    }

    public static JsonParser a() {
        return a;
    }

    public static <T extends JsonElement> @Nullable T a(@NonNull HttpURLConnection httpURLConnection, @Nullable Consumer<? super HttpURLConnection> consumer, @NonNull Class<T> clazz) throws IOException {
        JsonElement jsonElement;
        aNW.g();
        te_0.e(httpURLConnection);
        try {
            if (te_0.f(httpURLConnection) < 200 || te_0.f(httpURLConnection) > 299) {
                if (consumer != null) {
                    aan_1.a(consumer, httpURLConnection);
                }
                T t = null;
                return t;
            }
            jsonElement = a1r.a(a, new InputStreamReader(te_0.c(httpURLConnection)));
            if (!ara_2.b(clazz, jsonElement)) {
                throw new RuntimeException(uw_2.c);
            }
        }
        finally {
            te_0.a(httpURLConnection);
        }
        return (T)jsonElement;
    }

    public static Gson b() {
        return b;
    }

    public static @NonNull HttpURLConnection a(String string) throws IOException {
        asl_0.a(string, uw_2.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection)a5R.e(new URL(string));
        te_0.b(httpURLConnection, uw_2.f, uw_2.d);
        te_0.b(httpURLConnection, uw_2.e, uw_2.h);
        aNW.g();
        te_0.a(httpURLConnection, 15000);
        te_0.a(httpURLConnection, uw_2.g);
        te_0.c(httpURLConnection, true);
        ListInvoker.b(new ListInvoker[2]);
        return httpURLConnection;
    }
}

