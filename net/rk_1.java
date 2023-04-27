/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.awp_2;

/*
 * Renamed from net.rK
 */
public class rk_1 {
    public static byte[] a(Key key, byte[] byArray) {
        return awp_2.a(key, byArray);
    }

    public static PublicKey a(byte[] byArray) {
        return awp_2.a(byArray);
    }

    public static byte[] b(Key key, byte[] byArray) {
        return awp_2.b(key, byArray);
    }

    public static SecretKey a() {
        return awp_2.a();
    }

    public static KeyPair b() {
        return awp_2.b();
    }

    public static Cipher a(int n, Key key) {
        return awp_2.a(n, key);
    }

    public static byte[] a(String string, PublicKey publicKey, SecretKey secretKey) {
        return awp_2.a(string, publicKey, secretKey);
    }

    public static SecretKey a(PrivateKey privateKey, byte[] byArray) {
        return awp_2.a(privateKey, byArray);
    }
}

