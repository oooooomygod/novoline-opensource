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
import net.ayj_0;

public class S18PacketEntityTeleport
implements Packet<INetHandlerPlayClient> {
    private int e;
    private int g;
    private boolean b;
    private int d;
    private int c;
    private byte f;
    private byte a;

    public S18PacketEntityTeleport(Entity entity) {
        this.d = ayj_0.B(entity);
        this.c = MathHelper.floor_double(entity.posX * 32.0);
        this.g = MathHelper.floor_double(entity.posY * 32.0);
        this.e = MathHelper.floor_double(entity.posZ * 32.0);
        this.a = (byte)(entity.rotationYaw * 256.0f / 360.0f);
        this.f = (byte)(entity.rotationPitch * 256.0f / 360.0f);
        this.b = entity.onGround;
    }

    public S18PacketEntityTeleport(int n, int n2, int n3, int n4, byte by, byte by2, boolean bl) {
        this.d = n;
        this.c = n2;
        this.g = n3;
        this.e = n4;
        this.a = by;
        this.f = by2;
        this.b = bl;
    }

    public int f() {
        return this.c;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public int g() {
        return this.e;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.d);
        PacketBufferInvoker.e(packetBuffer, this.c);
        PacketBufferInvoker.e(packetBuffer, this.g);
        PacketBufferInvoker.e(packetBuffer, this.e);
        PacketBufferInvoker.c(packetBuffer, this.a);
        PacketBufferInvoker.c(packetBuffer, this.f);
        PacketBufferInvoker.a(packetBuffer, this.b);
    }

    public int b() {
        return this.g;
    }

    public byte a() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    public byte e() {
        return this.f;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.d = PacketBufferInvoker.b(packetBuffer);
        this.c = PacketBufferInvoker.p(packetBuffer);
        this.g = PacketBufferInvoker.p(packetBuffer);
        this.e = PacketBufferInvoker.p(packetBuffer);
        this.a = PacketBufferInvoker.l(packetBuffer);
        this.f = PacketBufferInvoker.l(packetBuffer);
        this.b = PacketBufferInvoker.i(packetBuffer);
    }

    public S18PacketEntityTeleport() {
    }
}

