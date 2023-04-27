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

public class S03PacketTimeUpdate
implements Packet<INetHandlerPlayClient> {
    private long a;
    private long b;

    public void a(long l4) {
        this.b = l4;
    }

    public S03PacketTimeUpdate() {
    }

    public long b() {
        return this.a;
    }

    public long a() {
        return this.b;
    }

    public void b(long l4) {
        this.a = l4;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.e(packetBuffer);
        this.a = PacketBufferInvoker.e(packetBuffer);
    }

    public S03PacketTimeUpdate(long l4, long l5, boolean bl) {
        this.b = l4;
        this.a = l5;
        this.a = -this.a;
        if (this.a == 0L) {
            this.a = -1L;
        }
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.b);
        PacketBufferInvoker.a(packetBuffer, this.a);
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }
}

