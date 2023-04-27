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

public class C00PacketKeepAlive
implements Packet<INetHandlerPlayServer> {
    private int a;

    public C00PacketKeepAlive(int n) {
        this.a = n;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.a);
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.b(packetBuffer);
    }

    public void a(int n) {
        this.a = n;
    }

    public int a() {
        return this.a;
    }

    public C00PacketKeepAlive() {
    }
}

