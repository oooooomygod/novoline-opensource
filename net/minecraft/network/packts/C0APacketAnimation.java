/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import deobf.Packet;
import java.io.IOException;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SZ;

public class C0APacketAnimation
implements Packet<INetHandlerPlayServer> {
    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
    }
}

