/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Packet;

import java.io.IOException;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SZ;
import net.aIC;
import net.aSY;
import net.tx_2;

public class C13PacketPlayerAbilities
implements Packet<INetHandlerPlayServer> {
    private float c;
    private boolean e;
    private float d;
    private boolean f;
    private boolean a;
    private boolean b;

    public void d(boolean bl) {
        this.b = bl;
    }

    public void b(boolean bl) {
        this.f = bl;
    }

    public void b(float f) {
        this.d = f;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public void c(boolean bl) {
        this.a = bl;
    }

    public boolean d() {
        return this.f;
    }

    public void a(float f) {
        this.c = f;
    }

    public boolean a() {
        return this.e;
    }

    public boolean b() {
        return this.a;
    }

    public C13PacketPlayerAbilities(S39PacketPlayerAbilities s39PacketPlayerAbilities) {
        this.a(s39PacketPlayerAbilities.b());
        this.d(s39PacketPlayerAbilities.d());
        this.c(s39PacketPlayerAbilities.e());
        this.b(aIC.f(s39PacketPlayerAbilities));
        this.a(s39PacketPlayerAbilities.a());
        this.b(s39PacketPlayerAbilities.f());
    }

    public C13PacketPlayerAbilities() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        byte by = PacketBufferInvoker.l(packetBuffer);
        this.a((by & 1) > 0);
        this.d((by & 2) > 0);
        this.c((by & 4) > 0);
        this.b((by & 8) > 0);
        this.a(PacketBufferInvoker.m(packetBuffer));
        this.b(PacketBufferInvoker.m(packetBuffer));
    }

    public boolean f() {
        return this.b;
    }

    public float e() {
        return this.d;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public C13PacketPlayerAbilities(float f, float f2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.d(bl);
        this.c(bl2);
        this.b(bl3);
        this.a(bl4);
        this.a(f);
        this.b(f2);
    }

    public C13PacketPlayerAbilities(tx_2 tx_22) {
        this.a(tx_22.d());
        this.d(tx_22.a());
        this.c(tx_22.f());
        this.b(aSY.a(tx_22));
        this.a(tx_22.c());
        this.b(tx_22.g());
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        byte by = 0;
        if (this.a()) {
            by = (byte)(by | 1);
        }
        if (this.f()) {
            by = (byte)(by | 2);
        }
        if (this.b()) {
            by = (byte)(by | 4);
        }
        if (this.d()) {
            by = (byte)(by | 8);
        }
        PacketBufferInvoker.c(packetBuffer, by);
        PacketBufferInvoker.writeFloat(packetBuffer, this.c);
        PacketBufferInvoker.writeFloat(packetBuffer, this.d);
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    public float c() {
        return this.c;
    }
}

