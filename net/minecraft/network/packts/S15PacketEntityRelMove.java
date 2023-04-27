/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;

import java.io.IOException;
import net.PacketBuffer;

public class S15PacketEntityRelMove
extends S14PacketEntity {
    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        super.readPacketData(packetBuffer);
        this.f = PacketBufferInvoker.l(packetBuffer);
        this.g = PacketBufferInvoker.l(packetBuffer);
        this.d = PacketBufferInvoker.l(packetBuffer);
        this.b = PacketBufferInvoker.i(packetBuffer);
    }

    public S15PacketEntityRelMove(int n, byte by, byte by2, byte by3, boolean bl) {
        super(n);
        this.f = by;
        this.g = by2;
        this.d = by3;
        this.b = bl;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        super.writePacketData(packetBuffer);
        PacketBufferInvoker.c(packetBuffer, this.f);
        PacketBufferInvoker.c(packetBuffer, this.g);
        PacketBufferInvoker.c(packetBuffer, this.d);
        PacketBufferInvoker.a(packetBuffer, this.b);
    }

    public S15PacketEntityRelMove() {
    }
}

