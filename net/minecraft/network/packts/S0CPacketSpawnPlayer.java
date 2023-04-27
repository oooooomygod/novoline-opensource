/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import deobf.EntityPlayer;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import net.MathHelper;
import net.PacketBuffer;
import net.VG;
import net.a4Z;
import net.a6w_0;
import net.a96;
import net.aom_0;
import net.apd_1;

public class S0CPacketSpawnPlayer
implements Packet<INetHandlerPlayClient> {
    private UUID a;
    private int j;
    private List<apd_1> f;
    private int b;
    private int d;
    private int c;
    private byte h;
    private byte g;
    private a96 i;
    private int e;

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S0CPacketSpawnPlayer(EntityPlayer entityPlayer) {
        this.c = entityPlayer.r();
        this.a = a4Z.a(a6w_0.G(entityPlayer));
        this.b = MathHelper.floor_double(entityPlayer.posX * 32.0);
        this.e = MathHelper.floor_double(entityPlayer.posY * 32.0);
        this.j = MathHelper.floor_double(entityPlayer.posZ * 32.0);
        this.g = (byte)(entityPlayer.rotationYaw * 256.0f / 360.0f);
        this.h = (byte)(entityPlayer.rotationPitch * 256.0f / 360.0f);
        InventoryInvoker.g(entityPlayer.inventory);
        this.d = 0;
        this.i = a6w_0.f(entityPlayer);
    }

    public int h() {
        return this.j;
    }

    public int e() {
        return this.b;
    }

    public S0CPacketSpawnPlayer() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.c = PacketBufferInvoker.b(packetBuffer);
        this.a = PacketBufferInvoker.h(packetBuffer);
        this.b = PacketBufferInvoker.p(packetBuffer);
        this.e = PacketBufferInvoker.p(packetBuffer);
        this.j = PacketBufferInvoker.p(packetBuffer);
        this.g = PacketBufferInvoker.l(packetBuffer);
        this.h = PacketBufferInvoker.l(packetBuffer);
        this.d = PacketBufferInvoker.k(packetBuffer);
        this.f = aom_0.a(packetBuffer);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.c);
        PacketBufferInvoker.a(packetBuffer, this.a);
        PacketBufferInvoker.e(packetBuffer, this.b);
        PacketBufferInvoker.e(packetBuffer, this.e);
        PacketBufferInvoker.e(packetBuffer, this.j);
        PacketBufferInvoker.c(packetBuffer, this.g);
        PacketBufferInvoker.c(packetBuffer, this.h);
        PacketBufferInvoker.g(packetBuffer, this.d);
        aom_0.a(this.i, packetBuffer);
    }

    public byte g() {
        return this.h;
    }

    public int i() {
        return this.e;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public List<apd_1> a() {
        if (this.f == null) {
            this.f = aom_0.c(this.i);
        }
        return this.f;
    }

    public UUID b() {
        return this.a;
    }

    public byte f() {
        return this.g;
    }
}

