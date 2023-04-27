/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.InputStream;
import java.security.KeyStore;

/*
 * Renamed from net.a2t
 */
public class a2t_0 {
    public static void a(KeyStore keyStore, InputStream inputStream, char[] cArray) {
        keyStore.load(inputStream, cArray);
    }

    public static KeyStore a(String string) {
        return KeyStore.getInstance(string);
    }
}

