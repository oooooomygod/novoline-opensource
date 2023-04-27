/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/*
 * Renamed from net.Cs
 */
public class cs_0 {
    private static int[] b;

    public static SSLContext a(String string) {
        return SSLContext.getInstance(string);
    }

    public static int[] b() {
        return b;
    }

    public static void a(SSLContext sSLContext, KeyManager[] keyManagerArray, TrustManager[] trustManagerArray, SecureRandom secureRandom) {
        sSLContext.init(keyManagerArray, trustManagerArray, secureRandom);
    }

    public static SSLSocketFactory a(SSLContext sSLContext) {
        return sSLContext.getSocketFactory();
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    static {
        if (cs_0.b() != null) {
            cs_0.b(new int[4]);
        }
    }
}

