/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.security.Key;

/*
 * Renamed from net.a7b
 */
public class a7b_0 {
    public static String a(Key key) {
        return key.getAlgorithm();
    }

    public static byte[] b(Key key) {
        return key.getEncoded();
    }
}

