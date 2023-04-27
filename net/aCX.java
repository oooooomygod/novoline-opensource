/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class aCX {
    public static int a(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.getPort();
    }

    public static InetAddress b(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.getAddress();
    }
}

