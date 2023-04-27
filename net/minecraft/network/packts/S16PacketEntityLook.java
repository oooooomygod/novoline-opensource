/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;

import java.io.IOException;
import net.PacketBuffer;

public class S16PacketEntityLook
extends S14PacketEntity {
    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        super.readPacketData(packetBuffer);
        this.e = PacketBufferInvoker.l(packetBuffer);
        this.a = PacketBufferInvoker.l(packetBuffer);
        this.b = PacketBufferInvoker.i(packetBuffer);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        super.writePacketData(packetBuffer);
        PacketBufferInvoker.c(packetBuffer, this.e);
        PacketBufferInvoker.c(packetBuffer, this.a);
        PacketBufferInvoker.a(packetBuffer, this.b);
    }

    public S16PacketEntityLook() {
        this.c = true;
    }

    public S16PacketEntityLook(int n, byte by, byte by2, boolean bl) {
        super(n);
        this.e = by;
        this.a = by2;
        this.c = true;
        this.b = bl;
    }
}

