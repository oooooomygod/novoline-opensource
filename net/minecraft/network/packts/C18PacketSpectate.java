/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Entity;
import deobf.Packet;
import java.io.IOException;
import java.util.UUID;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SZ;
import net.WorldServer;
import net.a3V;

public class C18PacketSpectate
implements Packet<INetHandlerPlayServer> {
    private UUID a;

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.h(packetBuffer);
    }

    public UUID a() {
        return this.a;
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    public C18PacketSpectate(UUID uUID) {
        this.a = uUID;
    }

    public void a(UUID uUID) {
        this.a = uUID;
    }

    public C18PacketSpectate() {
    }

    public Entity a(WorldServer worldServer) {
        return a3V.a(worldServer, this.a);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
    }
}

