/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.INetHandlerLoginClient;
import net.minecraft.network.packts.S00PacketDisconnect;
import net.minecraft.network.packts.S01PacketEncryptionRequest;
import net.minecraft.network.packts.S02PacketLoginSuccess;
import net.minecraft.network.packts.S03PacketEnableCompression;

public class a4O {
    private static String b;

    public static String b() {
        return b;
    }

    public static void a(INetHandlerLoginClient iNetHandlerLoginClient, S01PacketEncryptionRequest s01PacketEncryptionRequest) {
        iNetHandlerLoginClient.a(s01PacketEncryptionRequest);
    }

    public static void a(INetHandlerLoginClient iNetHandlerLoginClient, S00PacketDisconnect s00PacketDisconnect) {
        iNetHandlerLoginClient.a(s00PacketDisconnect);
    }

    public static void a(INetHandlerLoginClient iNetHandlerLoginClient, S02PacketLoginSuccess s02PacketLoginSuccess) {
        iNetHandlerLoginClient.a(s02PacketLoginSuccess);
    }

    public static void a(INetHandlerLoginClient iNetHandlerLoginClient, S03PacketEnableCompression s03PacketEnableCompression) {
        iNetHandlerLoginClient.a(s03PacketEnableCompression);
    }

    static {
        if (a4O.b() != null) {
            a4O.b("CP9uTb");
        }
    }

    public static void b(String string) {
        b = string;
    }
}

