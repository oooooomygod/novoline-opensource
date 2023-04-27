/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Entity;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.MathHelper;
import net.PacketBuffer;
import net.VG;

public class S0EPacketSpawnObject
implements Packet<INetHandlerPlayClient> {
    private int j;
    private int d;
    private int k;
    private int i;
    private int h;
    private int g;
    private int b;
    private int c;
    private int a;
    private int f;
    private int e;

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.b(packetBuffer);
        this.j = PacketBufferInvoker.l(packetBuffer);
        this.c = PacketBufferInvoker.p(packetBuffer);
        this.f = PacketBufferInvoker.p(packetBuffer);
        this.g = PacketBufferInvoker.p(packetBuffer);
        this.e = PacketBufferInvoker.l(packetBuffer);
        this.d = PacketBufferInvoker.l(packetBuffer);
        this.b = PacketBufferInvoker.p(packetBuffer);
        if (this.b > 0) {
            this.k = PacketBufferInvoker.k(packetBuffer);
            this.i = PacketBufferInvoker.k(packetBuffer);
            this.h = PacketBufferInvoker.k(packetBuffer);
        }
    }

    public int i() {
        return this.b;
    }

    public int h() {
        return this.k;
    }

    public int e() {
        return this.f;
    }

    public void a(int n) {
        this.g = n;
    }

    public void b(int n) {
        this.c = n;
    }

    public int f() {
        return this.c;
    }

    public S0EPacketSpawnObject(Entity entity, int n, int n2) {
        this.a = entity.r();
        this.c = MathHelper.floor_double(entity.posX * 32.0);
        this.f = MathHelper.floor_double(entity.posY * 32.0);
        this.g = MathHelper.floor_double(entity.posZ * 32.0);
        this.e = MathHelper.f(entity.rotationPitch * 256.0f / 360.0f);
        this.d = MathHelper.f(entity.rotationYaw * 256.0f / 360.0f);
        this.j = n;
        this.b = n2;
        double d = entity.motionX;
        double d2 = entity.motionY;
        double d3 = entity.motionZ;
        double d4 = 3.9;
        if (d < -d4) {
            d = -d4;
        }
        if (d2 < -d4) {
            d2 = -d4;
        }
        if (d3 < -d4) {
            d3 = -d4;
        }
        if (d > d4) {
            d = d4;
        }
        if (d2 > d4) {
            d2 = d4;
        }
        if (d3 > d4) {
            d3 = d4;
        }
        this.k = (int)(d * 8000.0);
        this.i = (int)(d2 * 8000.0);
        this.h = (int)(d3 * 8000.0);
    }

    public int c() {
        return this.d;
    }

    public S0EPacketSpawnObject(Entity entity, int n) {
        this(entity, n, 0);
    }

    public S0EPacketSpawnObject() {
    }

    public void f(int n) {
        this.b = n;
    }

    public void g(int n) {
        this.h = n;
    }

    public void c(int n) {
        this.i = n;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.a);
        PacketBufferInvoker.c(packetBuffer, this.j);
        PacketBufferInvoker.e(packetBuffer, this.c);
        PacketBufferInvoker.e(packetBuffer, this.f);
        PacketBufferInvoker.e(packetBuffer, this.g);
        PacketBufferInvoker.c(packetBuffer, this.e);
        PacketBufferInvoker.c(packetBuffer, this.d);
        PacketBufferInvoker.e(packetBuffer, this.b);
        if (this.b > 0) {
            PacketBufferInvoker.g(packetBuffer, this.k);
            PacketBufferInvoker.g(packetBuffer, this.i);
            PacketBufferInvoker.g(packetBuffer, this.h);
        }
    }

    public int g() {
        return this.e;
    }

    public int a() {
        return this.g;
    }

    public int d() {
        return this.h;
    }

    public int k() {
        return this.j;
    }

    public void d(int n) {
        this.k = n;
    }

    public int j() {
        return this.i;
    }

    public int b() {
        return this.a;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public void e(int n) {
        this.f = n;
    }
}

