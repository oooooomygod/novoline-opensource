/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerStatusClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.as4_0;

public class S01PacketPong
implements Packet<INetHandlerStatusClient> {
    public long a;

    public S01PacketPong(long l4) {
        this.a = l4;
    }

    public void a(INetHandlerStatusClient iNetHandlerStatusClient) {
        as4_0.a(iNetHandlerStatusClient, this);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
    }

    public S01PacketPong() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.e(packetBuffer);
    }
}

