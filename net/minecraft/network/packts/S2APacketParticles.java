/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.B7;
import net.PacketBuffer;
import net.VG;
import net.aYK;

public class S2APacketParticles
implements Packet<INetHandlerPlayClient> {
    private int k;
    private float c;
    private float i;
    private B7 a;
    private float b;
    private boolean j;
    private float h;
    private float f;
    private float e;
    private float g;
    private int[] d;

    public S2APacketParticles(B7 b7, boolean bl, float f, float f2, float f3, float f4, float f5, float f6, float f7, int n, int ... nArray) {
        this.a = b7;
        this.j = bl;
        this.h = f;
        this.i = f2;
        this.c = f3;
        this.e = f4;
        this.f = f5;
        this.b = f6;
        this.g = f7;
        this.k = n;
        this.d = nArray;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = aYK.a(PacketBufferInvoker.p(packetBuffer));
        if (this.a == null) {
            this.a = B7.BARRIER;
        }
        this.j = PacketBufferInvoker.i(packetBuffer);
        this.h = PacketBufferInvoker.m(packetBuffer);
        this.i = PacketBufferInvoker.m(packetBuffer);
        this.c = PacketBufferInvoker.m(packetBuffer);
        this.e = PacketBufferInvoker.m(packetBuffer);
        this.f = PacketBufferInvoker.m(packetBuffer);
        this.b = PacketBufferInvoker.m(packetBuffer);
        this.g = PacketBufferInvoker.m(packetBuffer);
        this.k = PacketBufferInvoker.p(packetBuffer);
        int n = aYK.c(this.a);
        this.d = new int[n];
        for (int i = 0; i < n; ++i) {
            this.d[i] = PacketBufferInvoker.b(packetBuffer);
        }
    }

    public double e() {
        return this.c;
    }

    public float b() {
        return this.g;
    }

    public double h() {
        return this.i;
    }

    public float c() {
        return this.b;
    }

    public int[] i() {
        return this.d;
    }

    public int j() {
        return this.k;
    }

    public float d() {
        return this.f;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public float k() {
        return this.e;
    }

    public boolean g() {
        return this.j;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.e(packetBuffer, aYK.d(this.a));
        PacketBufferInvoker.a(packetBuffer, this.j);
        PacketBufferInvoker.writeFloat(packetBuffer, this.h);
        PacketBufferInvoker.writeFloat(packetBuffer, this.i);
        PacketBufferInvoker.writeFloat(packetBuffer, this.c);
        PacketBufferInvoker.writeFloat(packetBuffer, this.e);
        PacketBufferInvoker.writeFloat(packetBuffer, this.f);
        PacketBufferInvoker.writeFloat(packetBuffer, this.b);
        PacketBufferInvoker.writeFloat(packetBuffer, this.g);
        PacketBufferInvoker.e(packetBuffer, this.k);
        int n = aYK.c(this.a);
        for (int i = 0; i < n; ++i) {
            PacketBufferInvoker.b(packetBuffer, this.d[i]);
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public S2APacketParticles() {
    }

    public B7 f() {
        return this.a;
    }

    public double a() {
        return this.h;
    }
}

