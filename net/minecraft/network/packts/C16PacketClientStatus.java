/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Packet;

import java.io.IOException;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SZ;

public class C16PacketClientStatus
implements Packet<INetHandlerPlayServer> {
    private C16PacketClientStatus$EnumState a;

    public C16PacketClientStatus$EnumState a() {
        return this.a;
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = (C16PacketClientStatus$EnumState)PacketBufferInvoker.a(packetBuffer, C16PacketClientStatus$EnumState.class);
    }

    public C16PacketClientStatus(C16PacketClientStatus$EnumState c16PacketClientStatus$EnumState) {
        this.a = c16PacketClientStatus$EnumState;
    }

    public C16PacketClientStatus() {
    }
}

