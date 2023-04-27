/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.VG;

public class S0DPacketCollectItem
implements Packet<INetHandlerPlayClient> {
    private int a;
    private int b;

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.b);
        PacketBufferInvoker.b(packetBuffer, this.a);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.b(packetBuffer);
        this.a = PacketBufferInvoker.b(packetBuffer);
    }

    public S0DPacketCollectItem(int n, int n2) {
        this.b = n;
        this.a = n2;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S0DPacketCollectItem() {
    }
}

