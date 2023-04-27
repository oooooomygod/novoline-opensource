/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Entity;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.VG;
import net.ayj_0;

public class S1BPacketEntityAttach
implements Packet<INetHandlerPlayClient> {
    private int c;
    private int a;
    private int b;

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.e(packetBuffer, this.a);
        PacketBufferInvoker.e(packetBuffer, this.c);
        PacketBufferInvoker.c(packetBuffer, this.b);
    }

    public int a() {
        return this.c;
    }

    public void c(int n) {
        this.a = n;
    }

    public void a(int n) {
        this.b = n;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.p(packetBuffer);
        this.c = PacketBufferInvoker.p(packetBuffer);
        this.b = PacketBufferInvoker.n(packetBuffer);
    }

    public S1BPacketEntityAttach(int n, Entity entity, Entity entity2) {
        this.b = n;
        this.a = ayj_0.B(entity);
        this.c = ayj_0.B(entity2);
    }

    public int c() {
        return this.a;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S1BPacketEntityAttach() {
    }

    public int b() {
        return this.b;
    }

    public void b(int n) {
        this.c = n;
    }
}

