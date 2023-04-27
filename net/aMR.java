/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.security.KeyPairGenerator;

public class aMR {
    public static void a(KeyPairGenerator keyPairGenerator, int n) {
        keyPairGenerator.initialize(n);
    }

    public static KeyPairGenerator a(String string) {
        return KeyPairGenerator.getInstance(string);
    }
}

