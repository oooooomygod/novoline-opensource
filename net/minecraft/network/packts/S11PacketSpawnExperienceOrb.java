/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.MathHelper;
import net.PacketBuffer;
import net.TC;
import net.VG;
import net.oa_2;

public class S11PacketSpawnExperienceOrb
implements Packet<INetHandlerPlayClient> {
    private int d;
    private int e;
    private int a;
    private int c;
    private int b;

    public S11PacketSpawnExperienceOrb() {
    }

    public int a() {
        return this.e;
    }

    public S11PacketSpawnExperienceOrb(oa_2 oa_22) {
        this.e = oa_22.r();
        this.b = MathHelper.floor_double(oa_22.posX * 32.0);
        this.a = MathHelper.floor_double(oa_22.posY * 32.0);
        this.c = MathHelper.floor_double(oa_22.posZ * 32.0);
        this.d = TC.a(oa_22);
    }

    public int c() {
        return this.a;
    }

    public int e() {
        return this.d;
    }

    public int b() {
        return this.b;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.e = PacketBufferInvoker.b(packetBuffer);
        this.b = PacketBufferInvoker.p(packetBuffer);
        this.a = PacketBufferInvoker.p(packetBuffer);
        this.c = PacketBufferInvoker.p(packetBuffer);
        this.d = PacketBufferInvoker.k(packetBuffer);
    }

    public int d() {
        return this.c;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.e);
        PacketBufferInvoker.e(packetBuffer, this.b);
        PacketBufferInvoker.e(packetBuffer, this.a);
        PacketBufferInvoker.e(packetBuffer, this.c);
        PacketBufferInvoker.g(packetBuffer, this.d);
    }
}

