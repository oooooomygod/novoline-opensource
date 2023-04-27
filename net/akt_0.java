/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.net.InetAddress;

/*
 * Renamed from net.aKt
 */
public class akt_0 {
    public static String b(InetAddress inetAddress) {
        return inetAddress.getHostAddress();
    }

    public static byte[] a(InetAddress inetAddress) {
        return inetAddress.getAddress();
    }

    public static InetAddress a(String string) {
        return InetAddress.getByName(string);
    }
}

