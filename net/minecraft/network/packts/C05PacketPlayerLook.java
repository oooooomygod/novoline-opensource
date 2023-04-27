/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;

import java.io.IOException;
import net.PacketBuffer;

public class C05PacketPlayerLook
extends C03PacketPlayer {
    public C05PacketPlayerLook(float f, float f2, boolean bl) {
        this.yaw = f;
        this.pitch = f2;
        this.onGround = bl;
        this.rotating = true;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.writeFloat(packetBuffer, this.yaw);
        PacketBufferInvoker.writeFloat(packetBuffer, this.pitch);
        super.writePacketData(packetBuffer);
    }

    public C05PacketPlayerLook() {
        this.rotating = true;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.yaw = PacketBufferInvoker.m(packetBuffer);
        this.pitch = PacketBufferInvoker.m(packetBuffer);
        super.readPacketData(packetBuffer);
    }
}

