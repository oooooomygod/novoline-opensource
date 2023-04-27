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
import net.World;
import net.aL0;
import net.aV8;
import net.zv_1;

public class S14PacketEntity
implements Packet<INetHandlerPlayClient> {
    protected byte f;
    protected int h;
    protected byte d;
    protected byte e;
    protected boolean b;
    protected byte a;
    protected boolean c;
    protected byte g;

    public boolean g() {
        return this.c;
    }

    public boolean d() {
        return this.b;
    }

    public byte a() {
        return this.f;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.h);
    }

    public S14PacketEntity(int n) {
        this.h = n;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public byte b() {
        return this.e;
    }

    public Entity a(World world) {
        return aV8.b(world, this.h);
    }

    public S14PacketEntity() {
    }

    public int h() {
        return this.h;
    }

    public byte f() {
        return this.d;
    }

    public String toString() {
        return aL0.a(aL0.a(new StringBuilder(), zv_1.a), super.toString()).toString();
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.h = PacketBufferInvoker.b(packetBuffer);
    }

    public byte c() {
        return this.a;
    }

    public byte e() {
        return this.g;
    }
}

