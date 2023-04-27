/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.NetHandlerPlayClient;
import deobf.NetworkManager;
import deobf.Packet;
import java.util.Collection;
import java.util.UUID;
import net.NetworkPlayerInfo;

public class aDM {
    private static String[] b;

    public static NetworkManager a(NetHandlerPlayClient netHandlerPlayClient) {
        return netHandlerPlayClient.d();
    }

    public static void b(NetHandlerPlayClient netHandlerPlayClient, Packet packet) {
        netHandlerPlayClient.a(packet);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void c(NetHandlerPlayClient netHandlerPlayClient) {
        netHandlerPlayClient.c();
    }

    public static NetworkPlayerInfo a(NetHandlerPlayClient netHandlerPlayClient, String string) {
        return netHandlerPlayClient.a(string);
    }

    public static void a(NetHandlerPlayClient netHandlerPlayClient, Packet packet) {
        netHandlerPlayClient.b(packet);
    }

    static {
        if (aDM.b() != null) {
            aDM.b(new String[5]);
        }
    }

    public static String[] b() {
        return b;
    }

    public static NetworkPlayerInfo a(UUID uUID) {
        return NetHandlerPlayClient.a(uUID);
    }

    public static Collection b(NetHandlerPlayClient netHandlerPlayClient) {
        return netHandlerPlayClient.b();
    }
}

