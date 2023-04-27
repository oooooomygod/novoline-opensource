/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import deobf.Packet;
import java.io.IOException;
import net.INetHandlerStatusServer;
import net.PacketBuffer;
import net.auz_1;

public class C00PacketServerQuery
implements Packet<INetHandlerStatusServer> {
    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
    }

    public void a(INetHandlerStatusServer iNetHandlerStatusServer) {
        auz_1.a(iNetHandlerStatusServer, this);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
    }
}

