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
import net.VG;
import net.aNX;
import net.ag4_0;

public class S29PacketSoundEffect
implements Packet<INetHandlerPlayClient> {
    private int a = Integer.MAX_VALUE;
    private int e;
    private int f;
    private float d;
    private String b;
    private int c;

    public double f() {
        return (float)this.a / 8.0f;
    }

    public S29PacketSoundEffect(String string, double d, double d2, double d3, float f, float f2) {
        ag4_0.a((Object)string, aNX.a, new Object[0]);
        this.b = string;
        this.e = (int)(d * 8.0);
        this.a = (int)(d2 * 8.0);
        this.f = (int)(d3 * 8.0);
        this.d = f;
        this.c = (int)(f2 * 63.0f);
        f2 = MathHelper.b(f2, 0.0f, 255.0f);
    }

    public String c() {
        return this.b;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.d(packetBuffer, 256);
        this.e = PacketBufferInvoker.p(packetBuffer);
        this.a = PacketBufferInvoker.p(packetBuffer);
        this.f = PacketBufferInvoker.p(packetBuffer);
        this.d = PacketBufferInvoker.m(packetBuffer);
        this.c = PacketBufferInvoker.n(packetBuffer);
    }

    public float a() {
        return (float)this.c / 63.0f;
    }

    public double d() {
        return (float)this.e / 8.0f;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.b);
        PacketBufferInvoker.e(packetBuffer, this.e);
        PacketBufferInvoker.e(packetBuffer, this.a);
        PacketBufferInvoker.e(packetBuffer, this.f);
        PacketBufferInvoker.writeFloat(packetBuffer, this.d);
        PacketBufferInvoker.c(packetBuffer, this.c);
    }

    public double b() {
        return (float)this.f / 8.0f;
    }

    public S29PacketSoundEffect() {
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public float e() {
        return this.d;
    }
}

