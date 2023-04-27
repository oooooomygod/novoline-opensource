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
import net.a2l_0;
import net.a3M;

public class S1EPacketRemoveEntityEffect
implements Packet<INetHandlerPlayClient> {
    private int b;
    private int a;

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.b(packetBuffer);
        this.b = PacketBufferInvoker.n(packetBuffer);
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public int b() {
        return this.a;
    }

    public S1EPacketRemoveEntityEffect() {
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.a);
        PacketBufferInvoker.c(packetBuffer, this.b);
    }

    public int a() {
        return this.b;
    }

    public S1EPacketRemoveEntityEffect(int n, a2l_0 a2l_02) {
        this.a = n;
        this.b = a3M.b(a2l_02);
    }
}

