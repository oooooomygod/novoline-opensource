/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class EE {
    public static PublicKey b(KeyPair keyPair) {
        return keyPair.getPublic();
    }

    public static PrivateKey a(KeyPair keyPair) {
        return keyPair.getPrivate();
    }
}

