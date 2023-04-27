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

public class S0BPacketAnimation
implements Packet<INetHandlerPlayClient> {
    private int b;
    private int a;

    public int b() {
        return this.b;
    }

    public S0BPacketAnimation() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.b(packetBuffer);
        this.a = PacketBufferInvoker.n(packetBuffer);
    }

    public int a() {
        return this.a;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.b);
        PacketBufferInvoker.c(packetBuffer, this.a);
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S0BPacketAnimation(Entity entity, int n) {
        this.b = entity.r();
        this.a = n;
    }
}

