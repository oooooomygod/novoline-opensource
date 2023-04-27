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

public class S1FPacketSetExperience
implements Packet<INetHandlerPlayClient> {
    private int a;
    private float c;
    private int b;

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S1FPacketSetExperience() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.c = PacketBufferInvoker.m(packetBuffer);
        this.a = PacketBufferInvoker.b(packetBuffer);
        this.b = PacketBufferInvoker.b(packetBuffer);
    }

    public int a() {
        return this.a;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.writeFloat(packetBuffer, this.c);
        PacketBufferInvoker.b(packetBuffer, this.a);
        PacketBufferInvoker.b(packetBuffer, this.b);
    }

    public int b() {
        return this.b;
    }

    public float c() {
        return this.c;
    }

    public S1FPacketSetExperience(float f, int n, int n2) {
        this.c = f;
        this.b = n;
        this.a = n2;
    }
}

