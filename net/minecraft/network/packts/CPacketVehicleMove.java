/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Entity;
import deobf.Packet;
import java.io.IOException;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SZ;

public class CPacketVehicleMove
implements Packet<INetHandlerPlayServer> {
    private double b;
    private float d;
    private double a;
    private double e;
    private float c;

    public CPacketVehicleMove(Entity entity, double d, double d2, double d3) {
        this.b = d;
        this.a = d2;
        this.e = d3;
        this.d = entity.rotationYaw;
        this.c = entity.rotationPitch;
    }

    public float c() {
        return this.c;
    }

    public double a() {
        return this.b;
    }

    public float e() {
        return this.d;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.writeDouble(packetBuffer, this.b);
        PacketBufferInvoker.writeDouble(packetBuffer, this.a);
        PacketBufferInvoker.writeDouble(packetBuffer, this.e);
        PacketBufferInvoker.writeFloat(packetBuffer, this.d);
        PacketBufferInvoker.writeFloat(packetBuffer, this.c);
    }

    public CPacketVehicleMove(Entity entity, float f, float f2) {
        this.b = entity.posX;
        this.a = entity.posY;
        this.e = entity.posZ;
        this.d = f;
        this.c = f2;
    }

    public CPacketVehicleMove(double d, double d2, double d3, float f, float f2) {
        this.b = d;
        this.a = d2;
        this.e = d3;
        this.d = f;
        this.c = f2;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.s(packetBuffer);
        this.a = PacketBufferInvoker.s(packetBuffer);
        this.e = PacketBufferInvoker.s(packetBuffer);
        this.d = PacketBufferInvoker.m(packetBuffer);
        this.c = PacketBufferInvoker.m(packetBuffer);
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    public double b() {
        return this.a;
    }

    public CPacketVehicleMove() {
    }

    public double d() {
        return this.e;
    }

    public CPacketVehicleMove(Entity entity) {
        this.b = entity.posX;
        this.a = entity.posY;
        this.e = entity.posZ;
        this.d = entity.rotationYaw;
        this.c = entity.rotationPitch;
    }
}

