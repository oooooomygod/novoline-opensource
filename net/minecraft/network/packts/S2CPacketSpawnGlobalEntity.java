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
import net.ou_2;

public class S2CPacketSpawnGlobalEntity
implements Packet<INetHandlerPlayClient> {
    private int b;
    private int e;
    private int d;
    private int a;
    private int c;

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.d);
        PacketBufferInvoker.c(packetBuffer, this.e);
        PacketBufferInvoker.e(packetBuffer, this.c);
        PacketBufferInvoker.e(packetBuffer, this.a);
        PacketBufferInvoker.e(packetBuffer, this.b);
    }

    public int c() {
        return this.d;
    }

    public int b() {
        return this.b;
    }

    public int a() {
        return this.c;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.d = PacketBufferInvoker.b(packetBuffer);
        this.e = PacketBufferInvoker.l(packetBuffer);
        this.c = PacketBufferInvoker.p(packetBuffer);
        this.a = PacketBufferInvoker.p(packetBuffer);
        this.b = PacketBufferInvoker.p(packetBuffer);
    }

    public S2CPacketSpawnGlobalEntity() {
    }

    public int e() {
        return this.d;
    }

    public S2CPacketSpawnGlobalEntity(Entity entity) {
        this.d = ayj_0.B(entity);
        this.c = MathHelper.floor_double(entity.posX * 32.0);
        this.a = MathHelper.floor_double(entity.posY * 32.0);
        this.b = MathHelper.floor_double(entity.posZ * 32.0);
        if (entity instanceof ou_2) {
            this.e = 1;
        }
    }

    public int f() {
        return this.a;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public int d() {
        return this.e;
    }
}

