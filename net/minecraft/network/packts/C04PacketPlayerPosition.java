/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;

import java.io.IOException;
import net.PacketBuffer;

public class C04PacketPlayerPosition
extends C03PacketPlayer {
    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.x = PacketBufferInvoker.s(packetBuffer);
        this.y = PacketBufferInvoker.s(packetBuffer);
        this.z = PacketBufferInvoker.s(packetBuffer);
        super.readPacketData(packetBuffer);
    }

    public C04PacketPlayerPosition(double d, double d2, double d3, boolean bl) {
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.onGround = bl;
        this.moving = true;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.writeDouble(packetBuffer, this.x);
        PacketBufferInvoker.writeDouble(packetBuffer, this.y);
        PacketBufferInvoker.writeDouble(packetBuffer, this.z);
        super.writePacketData(packetBuffer);
    }

    public C04PacketPlayerPosition() {
        this.moving = true;
    }
}

