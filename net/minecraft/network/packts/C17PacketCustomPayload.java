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
import net.abw_0;

public class C17PacketCustomPayload
implements Packet<INetHandlerPlayServer> {
    private String b;
    private PacketBuffer a;

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.d(packetBuffer, 20);
        int n = PacketBufferInvoker.f(packetBuffer);
        if (n <= Short.MAX_VALUE) {
            this.a = new PacketBuffer(PacketBufferInvoker.a(packetBuffer, n));
            return;
        }
        throw new IOException(abw_0.b);
    }

    public C17PacketCustomPayload() {
    }

    public C17PacketCustomPayload(String string, PacketBuffer packetBuffer) {
        this.b = string;
        this.a = packetBuffer;
        if (PacketBufferInvoker.d(packetBuffer) > Short.MAX_VALUE) {
            throw new IllegalArgumentException(abw_0.a);
        }
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.b);
        PacketBufferInvoker.a(packetBuffer, this.a);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public PacketBuffer a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}

