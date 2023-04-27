/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import java.util.List;
import net.MathHelper;
import net.PacketBuffer;
import net.VG;
import net.a96;
import net.aom_0;
import net.apd_1;
import net.atn_0;
import net.ub_1;

public class S0FPacketSpawnMob
implements Packet<INetHandlerPlayClient> {
    private int h;
    private List<apd_1> k;
    private int n;
    private int m;
    private a96 j;
    private int l;
    private int g;
    private byte c;
    private int a;
    private byte d;
    private int b;
    private Entity i;
    private byte e;
    private int f;

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.b(packetBuffer);
        this.g = PacketBufferInvoker.l(packetBuffer) & 0xFF;
        this.a = PacketBufferInvoker.p(packetBuffer);
        this.l = PacketBufferInvoker.p(packetBuffer);
        this.n = PacketBufferInvoker.p(packetBuffer);
        this.c = PacketBufferInvoker.l(packetBuffer);
        this.e = PacketBufferInvoker.l(packetBuffer);
        this.d = PacketBufferInvoker.l(packetBuffer);
        this.m = PacketBufferInvoker.k(packetBuffer);
        this.f = PacketBufferInvoker.k(packetBuffer);
        this.h = PacketBufferInvoker.k(packetBuffer);
        this.k = aom_0.a(packetBuffer);
    }

    public byte m() {
        return this.c;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.b);
        PacketBufferInvoker.c(packetBuffer, this.g & 0xFF);
        PacketBufferInvoker.e(packetBuffer, this.a);
        PacketBufferInvoker.e(packetBuffer, this.l);
        PacketBufferInvoker.e(packetBuffer, this.n);
        PacketBufferInvoker.c(packetBuffer, this.c);
        PacketBufferInvoker.c(packetBuffer, this.e);
        PacketBufferInvoker.c(packetBuffer, this.d);
        PacketBufferInvoker.g(packetBuffer, this.m);
        PacketBufferInvoker.g(packetBuffer, this.f);
        PacketBufferInvoker.g(packetBuffer, this.h);
        aom_0.a(this.j, packetBuffer);
    }

    public int b() {
        return this.a;
    }

    public int i() {
        return this.m;
    }

    public int e() {
        return this.h;
    }

    public int a() {
        return this.n;
    }

    public int f() {
        return this.l;
    }

    public List<apd_1> d() {
        if (this.k == null) {
            this.k = aom_0.c(this.j);
        }
        return this.k;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public int c() {
        return this.f;
    }

    public byte k() {
        return this.d;
    }

    public int g() {
        return this.b;
    }

    public byte l() {
        return this.e;
    }

    public Entity h() {
        return this.i;
    }

    public S0FPacketSpawnMob() {
    }

    public S0FPacketSpawnMob(EntityLivingBase entityLivingBase) {
        this.b = entityLivingBase.r();
        this.g = (byte)ub_1.b(entityLivingBase);
        this.a = MathHelper.floor_double(entityLivingBase.posX * 32.0);
        this.l = MathHelper.floor_double(entityLivingBase.posY * 32.0);
        this.n = MathHelper.floor_double(entityLivingBase.posZ * 32.0);
        this.c = (byte)(entityLivingBase.rotationYaw * 256.0f / 360.0f);
        this.e = (byte)(entityLivingBase.rotationPitch * 256.0f / 360.0f);
        this.d = (byte)(entityLivingBase.aP * 256.0f / 360.0f);
        double d = 3.9;
        double d2 = entityLivingBase.motionX;
        double d3 = entityLivingBase.motionY;
        double d4 = entityLivingBase.motionZ;
        if (d2 < -d) {
            d2 = -d;
        }
        if (d3 < -d) {
            d3 = -d;
        }
        if (d4 < -d) {
            d4 = -d;
        }
        if (d2 > d) {
            d2 = d;
        }
        if (d3 > d) {
            d3 = d;
        }
        if (d4 > d) {
            d4 = d;
        }
        this.m = (int)(d2 * 8000.0);
        this.f = (int)(d3 * 8000.0);
        this.h = (int)(d4 * 8000.0);
        this.j = atn_0.r(entityLivingBase);
        this.i = entityLivingBase;
    }

    public int j() {
        return this.g;
    }
}

