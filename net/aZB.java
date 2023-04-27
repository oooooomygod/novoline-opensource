/*
 * Decompiled with CFR 0.152.
 */
package net;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class aZB {
    public static KeyGenerator a(String string) {
        return KeyGenerator.getInstance(string);
    }

    public static SecretKey a(KeyGenerator keyGenerator) {
        return keyGenerator.generateKey();
    }

    public static void a(KeyGenerator keyGenerator, int n) {
        keyGenerator.init(n);
    }
}

