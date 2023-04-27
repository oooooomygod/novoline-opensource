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

public class C0FPacketConfirmTransaction
implements Packet<INetHandlerPlayServer> {
    private int a;
    private boolean b;
    private short c;

    public C0FPacketConfirmTransaction(int n, short s, boolean bl) {
        this.a = n;
        this.c = s;
        this.b = bl;
    }

    public void a(short s) {
        this.c = s;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.c(packetBuffer, this.a);
        PacketBufferInvoker.g(packetBuffer, this.c);
        PacketBufferInvoker.c(packetBuffer, this.b ? 1 : 0);
    }

    public boolean c() {
        return this.b;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public void a(int n) {
        this.a = n;
    }

    public short a() {
        return this.c;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.l(packetBuffer);
        this.c = PacketBufferInvoker.k(packetBuffer);
        this.b = PacketBufferInvoker.l(packetBuffer) != 0;
    }

    public C0FPacketConfirmTransaction() {
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    public int b() {
        return this.a;
    }
}

