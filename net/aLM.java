/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.security.KeyStore;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;

public class aLM {
    public static KeyManagerFactory a(String string) {
        return KeyManagerFactory.getInstance(string);
    }

    public static void a(KeyManagerFactory keyManagerFactory, KeyStore keyStore, char[] cArray) {
        keyManagerFactory.init(keyStore, cArray);
    }

    public static KeyManager[] a(KeyManagerFactory keyManagerFactory) {
        return keyManagerFactory.getKeyManagers();
    }
}

