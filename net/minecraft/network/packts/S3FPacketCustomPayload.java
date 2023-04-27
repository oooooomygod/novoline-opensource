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
import net.YB;

public class S3FPacketCustomPayload
implements Packet<INetHandlerPlayClient> {
    private String a;
    private PacketBuffer b;

    public S3FPacketCustomPayload(String string, PacketBuffer packetBuffer) {
        this.a = string;
        this.b = packetBuffer;
        if (PacketBufferInvoker.d(packetBuffer) > 0x100000) {
            throw new IllegalArgumentException(YB.b);
        }
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
        PacketBufferInvoker.a(packetBuffer, this.b);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public S3FPacketCustomPayload() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.d(packetBuffer, 20);
        int n = PacketBufferInvoker.f(packetBuffer);
        if (n <= 0x100000) {
            this.b = new PacketBuffer(PacketBufferInvoker.a(packetBuffer, n));
            return;
        }
        throw new IOException(YB.a);
    }

    public PacketBuffer a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }
}

