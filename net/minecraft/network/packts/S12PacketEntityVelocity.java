/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Entity;
import deobf.EntityPlayerSP;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.VG;

public class S12PacketEntityVelocity
implements Packet<INetHandlerPlayClient> {
    private int d;
    private int c;
    private int b;
    private int a;

    public int c() {
        return this.d;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.d);
        PacketBufferInvoker.g(packetBuffer, this.b);
        PacketBufferInvoker.g(packetBuffer, this.a);
        PacketBufferInvoker.g(packetBuffer, this.c);
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public int d() {
        return this.b;
    }

    public void c(int n) {
        this.c = n;
    }

    public void a(EntityPlayerSP entityPlayerSP, double d, double d2, double d3) {
        entityPlayerSP.motionX = d == 0.0 ? entityPlayerSP.motionX : d;
        entityPlayerSP.motionY = d2 == 0.0 ? entityPlayerSP.motionY : d2;
        entityPlayerSP.motionZ = d3 == 0.0 ? entityPlayerSP.motionZ : d3;
    }

    public S12PacketEntityVelocity(Entity entity) {
        this(entity.r(), entity.motionX, entity.motionY, entity.motionZ);
    }

    public int b() {
        return this.c;
    }

    public void b(int n) {
        this.a = n;
    }

    public S12PacketEntityVelocity() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.d = PacketBufferInvoker.b(packetBuffer);
        this.b = PacketBufferInvoker.k(packetBuffer);
        this.a = PacketBufferInvoker.k(packetBuffer);
        this.c = PacketBufferInvoker.k(packetBuffer);
    }

    public int a() {
        return this.a;
    }

    public void a(int n) {
        this.b = n;
    }

    public S12PacketEntityVelocity(int n, double d, double d2, double d3) {
        this.d = n;
        double d4 = 3.9;
        if (d < -d4) {
            d = -d4;
        }
        if (d2 < -d4) {
            d2 = -d4;
        }
        if (d3 < -d4) {
            d3 = -d4;
        }
        if (d > d4) {
            d = d4;
        }
        if (d2 > d4) {
            d2 = d4;
        }
        if (d3 > d4) {
            d3 = d4;
        }
        this.b = (int)(d * 8000.0);
        this.a = (int)(d2 * 8000.0);
        this.c = (int)(d3 * 8000.0);
    }
}

