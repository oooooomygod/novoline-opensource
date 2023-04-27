/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;

/*
 * Renamed from net.a2e
 */
public class a2e_0 {
    public static KeyFactory a(String string) {
        return KeyFactory.getInstance(string);
    }

    public static PrivateKey b(KeyFactory keyFactory, KeySpec keySpec) {
        return keyFactory.generatePrivate(keySpec);
    }

    public static PublicKey a(KeyFactory keyFactory, KeySpec keySpec) {
        return keyFactory.generatePublic(keySpec);
    }
}

