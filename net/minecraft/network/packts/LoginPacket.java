/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import deobf.EnumConnectionState;
import deobf.EnumPacketDirection;

class LoginPacket
extends EnumConnectionState {
    LoginPacket(int n2) {
        this.registerPacket(EnumPacketDirection.CLIENTBOUND, S00PacketDisconnect.class);
        this.registerPacket(EnumPacketDirection.CLIENTBOUND, S01PacketEncryptionRequest.class);
        this.registerPacket(EnumPacketDirection.CLIENTBOUND, S02PacketLoginSuccess.class);
        this.registerPacket(EnumPacketDirection.CLIENTBOUND, S03PacketEnableCompression.class);
        this.registerPacket(EnumPacketDirection.SERVERBOUND, C00PacketLoginStart.class);
        this.registerPacket(EnumPacketDirection.SERVERBOUND, C01PacketEncryptionResponse.class);
    }
}

