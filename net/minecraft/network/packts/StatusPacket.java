/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import deobf.EnumConnectionState;
import deobf.EnumPacketDirection;

class StatusPacket
extends EnumConnectionState {
    StatusPacket(int n2) {
        this.registerPacket(EnumPacketDirection.SERVERBOUND, C00PacketServerQuery.class);
        this.registerPacket(EnumPacketDirection.CLIENTBOUND, S00PacketServerInfo.class);
        this.registerPacket(EnumPacketDirection.SERVERBOUND, C01PacketPing.class);
        this.registerPacket(EnumPacketDirection.CLIENTBOUND, S01PacketPong.class);
    }
}

