/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;

import java.io.IOException;
import net.PacketBuffer;

public class C06PacketPlayerPosLook
extends C03PacketPlayer {
    public C06PacketPlayerPosLook(double d, double d2, double d3, float f, float f2, boolean bl) {
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.yaw = f;
        this.pitch = f2;
        this.onGround = bl;
        this.rotating = true;
        this.moving = true;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.writeDouble(packetBuffer, this.x);
        PacketBufferInvoker.writeDouble(packetBuffer, this.y);
        PacketBufferInvoker.writeDouble(packetBuffer, this.z);
        PacketBufferInvoker.writeFloat(packetBuffer, this.yaw);
        PacketBufferInvoker.writeFloat(packetBuffer, this.pitch);
        super.writePacketData(packetBuffer);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.x = PacketBufferInvoker.s(packetBuffer);
        this.y = PacketBufferInvoker.s(packetBuffer);
        this.z = PacketBufferInvoker.s(packetBuffer);
        this.yaw = PacketBufferInvoker.m(packetBuffer);
        this.pitch = PacketBufferInvoker.m(packetBuffer);
        super.readPacketData(packetBuffer);
    }

    public C06PacketPlayerPosLook() {
        this.moving = true;
        this.rotating = true;
    }
}

