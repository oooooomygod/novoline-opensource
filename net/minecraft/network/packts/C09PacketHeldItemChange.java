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

public class C09PacketHeldItemChange
implements Packet<INetHandlerPlayServer> {
    private int a;

    public int a() {
        return this.a;
    }

    public C09PacketHeldItemChange() {
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.k(packetBuffer);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.g(packetBuffer, this.a);
    }

    public void a(int n) {
        this.a = n;
    }

    public C09PacketHeldItemChange(int n) {
        this.a = n;
    }
}

