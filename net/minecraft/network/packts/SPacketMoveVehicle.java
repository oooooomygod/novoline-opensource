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

public class SPacketMoveVehicle
implements Packet<INetHandlerPlayClient> {
    private float d;
    private double b;
    private double a;
    private double c;
    private float e;

    public double a() {
        return this.b;
    }

    public SPacketMoveVehicle() {
    }

    public float c() {
        return this.d;
    }

    public float d() {
        return this.e;
    }

    public double b() {
        return this.c;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.writeDouble(packetBuffer, this.a);
        PacketBufferInvoker.writeDouble(packetBuffer, this.b);
        PacketBufferInvoker.writeDouble(packetBuffer, this.c);
        PacketBufferInvoker.writeFloat(packetBuffer, this.e);
        PacketBufferInvoker.writeFloat(packetBuffer, this.d);
    }

    public double e() {
        return this.a;
    }

    public SPacketMoveVehicle(Entity entity) {
        this.a = entity.posX;
        this.b = entity.posY;
        this.c = entity.posZ;
        this.e = entity.rotationYaw;
        this.d = entity.rotationPitch;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.s(packetBuffer);
        this.b = PacketBufferInvoker.s(packetBuffer);
        this.c = PacketBufferInvoker.s(packetBuffer);
        this.e = PacketBufferInvoker.m(packetBuffer);
        this.d = PacketBufferInvoker.m(packetBuffer);
    }
}

