/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;

/*
 * Renamed from net.yR
 */
public class yr_1 {
    private static boolean b;

    public static int a(String string) {
        return Cipher.getMaxAllowedKeyLength(string);
    }

    public static int a(Cipher cipher) {
        return cipher.getBlockSize();
    }

    public static Cipher b(String string) {
        return Cipher.getInstance(string);
    }

    public static int a(Cipher cipher, byte[] byArray, int n, int n2, byte[] byArray2, int n3) {
        return cipher.update(byArray, n, n2, byArray2, n3);
    }

    public static byte[] a(Cipher cipher, byte[] byArray) {
        return cipher.doFinal(byArray);
    }

    public static void a(Cipher cipher, int n, Key key) {
        cipher.init(n, key);
    }

    public static boolean b() {
        return b;
    }

    public static void a(Cipher cipher, int n, Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        cipher.init(n, key, algorithmParameterSpec);
    }

    public static int a(Cipher cipher, byte[] byArray, int n, int n2, byte[] byArray2) {
        return cipher.update(byArray, n, n2, byArray2);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    static {
        if (yr_1.b()) {
            yr_1.b(true);
        }
    }

    public static boolean a() {
        yr_1.b();
        return true;
    }

    public static int a(Cipher cipher, int n) {
        return cipher.getOutputSize(n);
    }
}

