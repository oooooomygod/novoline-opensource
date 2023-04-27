/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.security.PublicKey;
import java.security.Signature;

/*
 * Renamed from net.lN
 */
public class ln_0 {
    public static Signature a(String string) {
        return Signature.getInstance(string);
    }

    public static boolean b(Signature signature, byte[] byArray) {
        return signature.verify(byArray);
    }

    public static void a(Signature signature, PublicKey publicKey) {
        signature.initVerify(publicKey);
    }

    public static void a(Signature signature, byte[] byArray) {
        signature.update(byArray);
    }
}

