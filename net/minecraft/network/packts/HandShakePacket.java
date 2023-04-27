/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import deobf.EnumConnectionState;
import deobf.EnumPacketDirection;
import net.aQ4;

class HandShakePacket
extends EnumConnectionState {
    HandShakePacket(int n2) {
        this.registerPacket(EnumPacketDirection.SERVERBOUND, aQ4.class);
    }
}

