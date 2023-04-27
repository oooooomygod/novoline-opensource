/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.VG;
import net.a2l_0;
import net.a3M;

public class S1DPacketEntityEffect
implements Packet<INetHandlerPlayClient> {
    private byte e;
    private int f;
    private int c;
    private byte b;
    private a2l_0 a;
    private byte d;

    public void b(byte by) {
        this.e = by;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.f);
        PacketBufferInvoker.c(packetBuffer, this.b);
        PacketBufferInvoker.c(packetBuffer, this.e);
        PacketBufferInvoker.b(packetBuffer, this.c);
        PacketBufferInvoker.c(packetBuffer, this.d);
    }

    public byte d() {
        return this.b;
    }

    public S1DPacketEntityEffect() {
    }

    public boolean c() {
        return this.d != 0;
    }

    public void a(int n) {
        this.f = n;
    }

    public void a(a2l_0 a2l_02) {
        this.a = a2l_02;
    }

    public int e() {
        return this.c;
    }

    public void a(byte by) {
        this.b = by;
    }

    public boolean g() {
        return this.c == Short.MAX_VALUE;
    }

    public int a() {
        return this.f;
    }

    public a2l_0 b() {
        return this.a;
    }

    public void b(int n) {
        this.c = n;
    }

    public S1DPacketEntityEffect(int n, a2l_0 a2l_02) {
        this.a = a2l_02;
        this.f = n;
        this.b = (byte)(a3M.b(a2l_02) & 0xFF);
        this.e = (byte)(a3M.g(a2l_02) & 0xFF);
        this.c = MathInvoker.b(a2l_02.d(), Short.MAX_VALUE);
        this.d = (byte)(a3M.e(a2l_02) ? 1 : 0);
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public byte f() {
        return this.e;
    }

    public void c(byte by) {
        this.d = by;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.f = PacketBufferInvoker.b(packetBuffer);
        this.b = PacketBufferInvoker.l(packetBuffer);
        this.e = PacketBufferInvoker.l(packetBuffer);
        this.c = PacketBufferInvoker.b(packetBuffer);
        this.d = PacketBufferInvoker.l(packetBuffer);
    }
}

