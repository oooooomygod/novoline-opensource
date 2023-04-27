/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Packet;
import java.io.IOException;
import net.INetHandlerStatusServer;
import net.PacketBuffer;
import net.auz_1;

public class C01PacketPing
implements Packet<INetHandlerStatusServer> {
    private long a;

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
    }

    public long a() {
        return this.a;
    }

    public C01PacketPing() {
    }

    public C01PacketPing(long l4) {
        this.a = l4;
    }

    public void a(INetHandlerStatusServer iNetHandlerStatusServer) {
        auz_1.a(iNetHandlerStatusServer, this);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.e(packetBuffer);
    }
}

