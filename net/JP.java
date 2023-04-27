/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MinecraftServer;
import deobf.NetworkSystem;
import java.net.InetAddress;
import java.net.SocketAddress;

public class JP {
    public static void a(NetworkSystem networkSystem, InetAddress inetAddress, int n) {
        networkSystem.a(inetAddress, n);
    }

    public static void c(NetworkSystem networkSystem) {
        networkSystem.c();
    }

    public static MinecraftServer d(NetworkSystem networkSystem) {
        return networkSystem.a();
    }

    public static SocketAddress b(NetworkSystem networkSystem) {
        return networkSystem.d();
    }

    public static void a(NetworkSystem networkSystem) {
        networkSystem.b();
    }
}

