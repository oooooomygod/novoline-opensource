/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.INetHandlerStatusClient;
import net.minecraft.network.packts.S00PacketServerInfo;
import net.minecraft.network.packts.S01PacketPong;

/*
 * Renamed from net.as4
 */
public class as4_0 {
    public static void a(INetHandlerStatusClient iNetHandlerStatusClient, S00PacketServerInfo s00PacketServerInfo) {
        iNetHandlerStatusClient.a(s00PacketServerInfo);
    }

    public static void a(INetHandlerStatusClient iNetHandlerStatusClient, S01PacketPong s01PacketPong) {
        iNetHandlerStatusClient.a(s01PacketPong);
    }
}

