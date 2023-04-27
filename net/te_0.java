/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/*
 * Renamed from net.Te
 */
public class te_0 {
    public static void a(HttpURLConnection httpURLConnection, boolean bl) {
        httpURLConnection.setDoInput(bl);
    }

    public static int d(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getContentLength();
    }

    public static void a(HttpURLConnection httpURLConnection, int n) {
        httpURLConnection.setConnectTimeout(n);
    }

    public static void a(HttpURLConnection httpURLConnection, String string) {
        httpURLConnection.setRequestMethod(string);
    }

    public static InputStream c(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getInputStream();
    }

    public static void a(HttpURLConnection httpURLConnection) {
        httpURLConnection.disconnect();
    }

    public static InputStream g(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getErrorStream();
    }

    public static void b(HttpURLConnection httpURLConnection, String string, String string2) {
        httpURLConnection.setRequestProperty(string, string2);
    }

    public static void e(HttpURLConnection httpURLConnection) {
        httpURLConnection.connect();
    }

    public static OutputStream b(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getOutputStream();
    }

    public static int f(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getResponseCode();
    }

    public static void c(HttpURLConnection httpURLConnection, boolean bl) {
        httpURLConnection.setDoOutput(bl);
    }

    public static void b(HttpURLConnection httpURLConnection, boolean bl) {
        httpURLConnection.setUseCaches(bl);
    }

    public static void a(HttpURLConnection httpURLConnection, String string, String string2) {
        httpURLConnection.addRequestProperty(string, string2);
    }
}

