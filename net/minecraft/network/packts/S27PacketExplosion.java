/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import deobf.Vec3;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.BlockPos;
import net.PacketBuffer;
import net.VG;
import net.amv_2;
import net.dz_0;
import net.my_0;

public class S27PacketExplosion
implements Packet<INetHandlerPlayClient> {
    private double d;
    private double a;
    private float g;
    private double f;
    private float h;
    private List<BlockPos> c;
    private float b;
    private float e;

    public float c() {
        return this.h;
    }

    public void c(double d) {
        this.f = d;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.d = PacketBufferInvoker.m(packetBuffer);
        this.a = PacketBufferInvoker.m(packetBuffer);
        this.f = PacketBufferInvoker.m(packetBuffer);
        this.h = PacketBufferInvoker.m(packetBuffer);
        int n = PacketBufferInvoker.p(packetBuffer);
        this.c = my_0.b(n);
        int n2 = (int)this.d;
        int n3 = (int)this.a;
        int n4 = (int)this.f;
        for (int i = 0; i < n; ++i) {
            int n5 = PacketBufferInvoker.l(packetBuffer) + n2;
            int n6 = PacketBufferInvoker.l(packetBuffer) + n3;
            int n7 = PacketBufferInvoker.l(packetBuffer) + n4;
            ListInvoker.add(this.c, new BlockPos(n5, n6, n7));
        }
        this.g = PacketBufferInvoker.m(packetBuffer);
        this.b = PacketBufferInvoker.m(packetBuffer);
        this.e = PacketBufferInvoker.m(packetBuffer);
    }

    public List<BlockPos> e() {
        return this.c;
    }

    public float h() {
        return this.e;
    }

    public double g() {
        return this.a;
    }

    public S27PacketExplosion(double d, double d2, double d3, float f, List<BlockPos> list, Vec3 vec3) {
        this.d = d;
        this.a = d2;
        this.f = d3;
        this.h = f;
        this.c = my_0.a(list);
        this.g = (float)vec3.xCoord;
        this.b = (float)vec3.yCoord;
        this.e = (float)vec3.zCoord;
    }

    public void a(double d) {
        this.d = d;
    }

    public S27PacketExplosion() {
    }

    public void b(double d) {
        this.a = d;
    }

    public float b() {
        return this.b;
    }

    public double a() {
        return this.f;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.writeFloat(packetBuffer, (float)this.d);
        PacketBufferInvoker.writeFloat(packetBuffer, (float)this.a);
        PacketBufferInvoker.writeFloat(packetBuffer, (float)this.f);
        PacketBufferInvoker.writeFloat(packetBuffer, this.h);
        PacketBufferInvoker.e(packetBuffer, ListInvoker.size(this.c));
        int n = (int)this.d;
        int n2 = (int)this.a;
        int n3 = (int)this.f;
        Iterator iterator = ListInvoker.iterator(this.c);
        while (dz_0.c(iterator)) {
            BlockPos blockPos = (BlockPos)dz_0.b(iterator);
            int n4 = amv_2.j(blockPos) - n;
            int n5 = amv_2.h(blockPos) - n2;
            int n6 = amv_2.i(blockPos) - n3;
            PacketBufferInvoker.c(packetBuffer, n4);
            PacketBufferInvoker.c(packetBuffer, n5);
            PacketBufferInvoker.c(packetBuffer, n6);
        }
        PacketBufferInvoker.writeFloat(packetBuffer, this.g);
        PacketBufferInvoker.writeFloat(packetBuffer, this.b);
        PacketBufferInvoker.writeFloat(packetBuffer, this.e);
    }

    public double d() {
        return this.d;
    }

    public float f() {
        return this.g;
    }
}

