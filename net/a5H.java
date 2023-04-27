/*
 * Decompiled with CFR 0.152.
 */
package net;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class a5H {
    public static SSLSocketFactory b() {
        return HttpsURLConnection.getDefaultSSLSocketFactory();
    }

    public static void a(SSLSocketFactory sSLSocketFactory) {
        HttpsURLConnection.setDefaultSSLSocketFactory(sSLSocketFactory);
    }

    public static HostnameVerifier a() {
        return HttpsURLConnection.getDefaultHostnameVerifier();
    }

    public static void a(HostnameVerifier hostnameVerifier) {
        HttpsURLConnection.setDefaultHostnameVerifier(hostnameVerifier);
    }
}

