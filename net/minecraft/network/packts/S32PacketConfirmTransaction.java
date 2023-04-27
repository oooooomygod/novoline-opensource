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

public class S32PacketConfirmTransaction
implements Packet<INetHandlerPlayClient> {
    private short a;
    private int c;
    private boolean b;

    public void a(boolean bl) {
        this.b = bl;
    }

    public short c() {
        return this.a;
    }

    public S32PacketConfirmTransaction(int n, short s, boolean bl) {
        this.c = n;
        this.a = s;
        this.b = bl;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.c(packetBuffer, this.c);
        PacketBufferInvoker.g(packetBuffer, this.a);
        PacketBufferInvoker.a(packetBuffer, this.b);
    }

    public S32PacketConfirmTransaction() {
    }

    public void a(int n) {
        this.c = n;
    }

    public int a() {
        return this.c;
    }

    public void a(short s) {
        this.a = s;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.c = PacketBufferInvoker.n(packetBuffer);
        this.a = PacketBufferInvoker.k(packetBuffer);
        this.b = PacketBufferInvoker.i(packetBuffer);
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public boolean b() {
        return this.b;
    }
}

