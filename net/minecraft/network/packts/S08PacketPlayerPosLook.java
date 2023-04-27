/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import java.util.Set;
import net.PacketBuffer;
import net.VG;
import net.adg_0;
import net.anq_0;

public class S08PacketPlayerPosLook
implements Packet<INetHandlerPlayClient> {
    private double b;
    private double d;
    private float c;
    public Set<adg_0> e;
    private double a;
    private float f;

    public double e() {
        return this.a;
    }

    public S08PacketPlayerPosLook() {
    }

    public double b() {
        return this.b;
    }

    public void a(double d) {
        this.b = d;
    }

    public void c(double d) {
        this.a = d;
    }

    public S08PacketPlayerPosLook(double d, double d2, double d3, float f, float f2, Set<adg_0> set) {
        this.b = d;
        this.a = d2;
        this.d = d3;
        this.f = f;
        this.c = f2;
        this.e = set;
    }

    public double a() {
        return this.d;
    }

    public float c() {
        return this.f;
    }

    public Set<adg_0> d() {
        return this.e;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.writeDouble(packetBuffer, this.b);
        PacketBufferInvoker.writeDouble(packetBuffer, this.a);
        PacketBufferInvoker.writeDouble(packetBuffer, this.d);
        PacketBufferInvoker.writeFloat(packetBuffer, this.f);
        PacketBufferInvoker.writeFloat(packetBuffer, this.c);
        PacketBufferInvoker.c(packetBuffer, anq_0.a(this.e));
    }

    public float f() {
        return this.c;
    }

    public void b(float f) {
        this.f = f;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.s(packetBuffer);
        this.a = PacketBufferInvoker.s(packetBuffer);
        this.d = PacketBufferInvoker.s(packetBuffer);
        this.f = PacketBufferInvoker.m(packetBuffer);
        this.c = PacketBufferInvoker.m(packetBuffer);
        this.e = anq_0.a(PacketBufferInvoker.n(packetBuffer));
    }

    public void a(float f) {
        this.c = f;
    }

    public void b(double d) {
        this.d = d;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }
}

