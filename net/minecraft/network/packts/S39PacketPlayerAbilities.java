/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.VG;
import net.tx_2;

public class S39PacketPlayerAbilities
implements Packet<INetHandlerPlayClient> {
    private boolean f;
    private boolean d;
    private boolean c;
    private boolean a;
    private float e;
    private float b;

    public boolean b() {
        return this.d;
    }

    public float a() {
        return this.b;
    }

    public void a(float f) {
        this.e = f;
    }

    public boolean c() {
        return this.f;
    }

    public void c(boolean bl) {
        this.d = bl;
    }

    public S39PacketPlayerAbilities(float f, float f2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.d(bl);
        this.b(bl2);
        this.a(bl3);
        this.c(bl4);
        this.b(f);
        this.a(f2);
    }

    public S39PacketPlayerAbilities(tx_2 tx_22) {
        this.c(tx_22.d());
        this.d(tx_22.a());
        this.b(tx_22.f());
        this.a(tx_22.e());
        this.b(tx_22.c());
        this.a(tx_22.g());
    }

    public boolean e() {
        return this.a;
    }

    public void b(float f) {
        this.b = f;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        byte by = PacketBufferInvoker.l(packetBuffer);
        this.c((by & 1) > 0);
        this.d((by & 2) > 0);
        this.b((by & 4) > 0);
        this.a((by & 8) > 0);
        this.b(PacketBufferInvoker.m(packetBuffer));
        this.a(PacketBufferInvoker.m(packetBuffer));
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    public S39PacketPlayerAbilities() {
    }

    public float f() {
        return this.e;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public void d(boolean bl) {
        this.c = bl;
    }

    public void b(boolean bl) {
        this.a = bl;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        byte by = 0;
        if (this.b()) {
            by = (byte)(by | 1);
        }
        if (this.d()) {
            by = (byte)(by | 2);
        }
        if (this.e()) {
            by = (byte)(by | 4);
        }
        if (this.c()) {
            by = (byte)(by | 8);
        }
        PacketBufferInvoker.c(packetBuffer, by);
        PacketBufferInvoker.writeFloat(packetBuffer, this.b);
        PacketBufferInvoker.writeFloat(packetBuffer, this.e);
    }

    public boolean d() {
        return this.c;
    }
}

