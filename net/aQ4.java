/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.EnumConnectionState;
import deobf.Packet;
import java.io.IOException;
import net.INetHandlerHandshakeServer;
import net.PacketBuffer;
import net.aAZ;
import net.aK3;

public class aQ4
implements Packet<INetHandlerHandshakeServer> {
    private int c;
    private int d;
    private EnumConnectionState requestedState;
    private String a;

    public aQ4(int n, String string, int n2, EnumConnectionState enumConnectionState) {
        this.c = n;
        this.a = string;
        this.d = n2;
        this.requestedState = enumConnectionState;
    }

    public void a(INetHandlerHandshakeServer iNetHandlerHandshakeServer) {
        aAZ.a(iNetHandlerHandshakeServer, this);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.c);
        PacketBufferInvoker.a(packetBuffer, this.a);
        PacketBufferInvoker.g(packetBuffer, this.d);
        PacketBufferInvoker.b(packetBuffer, aK3.a(this.requestedState));
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.c = PacketBufferInvoker.b(packetBuffer);
        this.a = PacketBufferInvoker.d(packetBuffer, 255);
        this.d = PacketBufferInvoker.c(packetBuffer);
        this.requestedState = aK3.a(PacketBufferInvoker.b(packetBuffer));
    }

    public aQ4() {
    }

    public EnumConnectionState b() {
        return this.requestedState;
    }

    public int d() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public String a() {
        return this.a;
    }
}

