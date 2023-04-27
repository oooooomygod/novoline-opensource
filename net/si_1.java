/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Packet;

/*
 * Renamed from net.sI
 */
public class si_1 {
    public static void b(Packet packet, PacketBuffer packetBuffer) {
        packet.writePacketData(packetBuffer);
    }

    public static void a(Packet packet, INetHandler INetHandler) {
        packet.processPacket(INetHandler);
    }

    public static void a(Packet packet, PacketBuffer packetBuffer) {
        packet.readPacketData(packetBuffer);
    }
}

