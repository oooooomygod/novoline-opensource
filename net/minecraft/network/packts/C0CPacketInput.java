/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Packet;
import java.io.IOException;
import net.INetHandlerPlayServer;
import net.MovementInput;
import net.PacketBuffer;
import net.SZ;
import net.wj_0;

public class C0CPacketInput
implements Packet<INetHandlerPlayServer> {
    private float b;
    private boolean c;
    private boolean d;
    private float a;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public void b(boolean bl) {
        this.c = bl;
    }

    public boolean a() {
        return this.d;
    }

    public void a(float f) {
        this.a = f;
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    public float d() {
        return this.a;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    public void b(float f) {
        this.b = f;
    }

    public float c() {
        return this.b;
    }

    public C0CPacketInput(float f, float f2, boolean bl, boolean bl2) {
        this.b = f;
        this.a = f2;
        this.c = bl;
        this.d = bl2;
    }

    public C0CPacketInput() {
    }

    public C0CPacketInput(MovementInput movementInput) {
        this.b = wj_0.b(movementInput);
        this.a = wj_0.b(movementInput);
        this.c = wj_0.d(movementInput);
        this.d = wj_0.a(movementInput);
    }

    public boolean b() {
        return this.c;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.writeFloat(packetBuffer, this.b);
        PacketBufferInvoker.writeFloat(packetBuffer, this.a);
        byte by = 0;
        if (this.c) {
            by = (byte)(by | 1);
        }
        if (this.d) {
            by = (byte)(by | 2);
        }
        PacketBufferInvoker.c(packetBuffer, by);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.m(packetBuffer);
        this.a = PacketBufferInvoker.m(packetBuffer);
        byte by = PacketBufferInvoker.l(packetBuffer);
        this.c = (by & 1) > 0;
        this.d = (by & 2) > 0;
    }
}

