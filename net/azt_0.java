/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.security.Key;
import javax.crypto.Mac;

/*
 * Renamed from net.aZt
 */
public class azt_0 {
    public static Mac a(String string) {
        return Mac.getInstance(string);
    }

    public static void a(Mac mac, Key key) {
        mac.init(key);
    }

    public static byte[] a(Mac mac, byte[] byArray) {
        return mac.doFinal(byArray);
    }
}

