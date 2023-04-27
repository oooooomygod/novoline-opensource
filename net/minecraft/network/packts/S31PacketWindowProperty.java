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

public class S31PacketWindowProperty
implements Packet<INetHandlerPlayClient> {
    private int b;
    private int c;
    private int a;

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.c(packetBuffer, this.b);
        PacketBufferInvoker.g(packetBuffer, this.c);
        PacketBufferInvoker.g(packetBuffer, this.a);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.n(packetBuffer);
        this.c = PacketBufferInvoker.k(packetBuffer);
        this.a = PacketBufferInvoker.k(packetBuffer);
    }

    public S31PacketWindowProperty(int n, int n2, int n3) {
        this.b = n;
        this.c = n2;
        this.a = n3;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S31PacketWindowProperty() {
    }
}

