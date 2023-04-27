/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.security.KeyStore;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

public class a22 {
    public static void a(TrustManagerFactory trustManagerFactory, KeyStore keyStore) {
        trustManagerFactory.init(keyStore);
    }

    public static TrustManager[] a(TrustManagerFactory trustManagerFactory) {
        return trustManagerFactory.getTrustManagers();
    }

    public static TrustManagerFactory a(String string) {
        return TrustManagerFactory.getInstance(string);
    }
}

