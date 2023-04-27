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

public class S06PacketUpdateHealth
implements Packet<INetHandlerPlayClient> {
    private float c;
    private int b;
    private float a;

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public void a(float f) {
        this.c = f;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.m(packetBuffer);
        this.b = PacketBufferInvoker.b(packetBuffer);
        this.c = PacketBufferInvoker.m(packetBuffer);
    }

    public int b() {
        return this.b;
    }

    public float a() {
        return this.a;
    }

    public S06PacketUpdateHealth(float f, int n, float f2) {
        this.a = f;
        this.b = n;
        this.c = f2;
    }

    public float c() {
        return this.c;
    }

    public void b(float f) {
        this.a = f;
    }

    public void a(int n) {
        this.b = n;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.writeFloat(packetBuffer, this.a);
        PacketBufferInvoker.b(packetBuffer, this.b);
        PacketBufferInvoker.writeFloat(packetBuffer, this.c);
    }

    public S06PacketUpdateHealth() {
    }
}

