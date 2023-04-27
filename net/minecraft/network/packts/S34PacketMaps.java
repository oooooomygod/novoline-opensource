/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import java.util.Collection;
import net.F;
import net.PacketBuffer;
import net.VG;
import net.aL0;
import net.akw_1;
import net.ms_0;
import net.tc_2;
import net.wp_1;

public class S34PacketMaps
implements Packet<INetHandlerPlayClient> {
    private int a;
    private tc_2[] d;
    private int h;
    private byte[] e;
    private int c;
    private int g;
    private int f;
    private byte b;

    public S34PacketMaps() {
    }

    public S34PacketMaps(int n, byte by, Collection<tc_2> collection, byte[] byArray, int n2, int n3, int n4, int n5) {
        this.g = n;
        this.b = by;
        this.d = (tc_2[])ms_0.a(collection, new tc_2[ms_0.d(collection)]);
        this.f = n2;
        this.h = n3;
        this.a = n4;
        this.c = n5;
        this.e = new byte[n4 * n5];
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n5; ++j) {
                this.e[i + j * n4] = byArray[n2 + i + (n3 + j) * 128];
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.g = PacketBufferInvoker.b(packetBuffer);
        this.b = PacketBufferInvoker.l(packetBuffer);
        this.d = new tc_2[PacketBufferInvoker.b(packetBuffer)];
        for (int i = 0; i < this.d.length; ++i) {
            short s = PacketBufferInvoker.l(packetBuffer);
            this.d[i] = new tc_2((byte)(s >> 4 & 0xF), PacketBufferInvoker.l(packetBuffer), PacketBufferInvoker.l(packetBuffer), (byte)(s & 0xF));
        }
        this.a = PacketBufferInvoker.n(packetBuffer);
        if (this.a > 0) {
            this.c = PacketBufferInvoker.n(packetBuffer);
            this.f = PacketBufferInvoker.n(packetBuffer);
            this.h = PacketBufferInvoker.n(packetBuffer);
            this.e = PacketBufferInvoker.j(packetBuffer);
        }
    }

    public int a() {
        return this.g;
    }

    public void a(wp_1 wp_12) {
        int n;
        wp_12.c = this.b;
        MapInvoker.d(wp_12.e);
        for (n = 0; n < this.d.length; ++n) {
            tc_2 tc_22 = this.d[n];
            MapInvoker.c(wp_12.e, aL0.c(aL0.a(new StringBuilder(), F.a), n).toString(), tc_22);
        }
        for (n = 0; n < this.a; ++n) {
            for (int i = 0; i < this.c; ++i) {
                wp_12.d[this.f + n + (this.h + i) * 128] = this.e[n + i * this.a];
            }
        }
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.g);
        PacketBufferInvoker.c(packetBuffer, this.b);
        PacketBufferInvoker.b(packetBuffer, this.d.length);
        for (tc_2 tc_22 : this.d) {
            PacketBufferInvoker.c(packetBuffer, (akw_1.a(tc_22) & 0xF) << 4 | akw_1.b(tc_22) & 0xF);
            PacketBufferInvoker.c(packetBuffer, akw_1.d(tc_22));
            PacketBufferInvoker.c(packetBuffer, akw_1.c(tc_22));
        }
        PacketBufferInvoker.c(packetBuffer, this.a);
        if (this.a > 0) {
            PacketBufferInvoker.c(packetBuffer, this.c);
            PacketBufferInvoker.c(packetBuffer, this.f);
            PacketBufferInvoker.c(packetBuffer, this.h);
            PacketBufferInvoker.c(packetBuffer, this.e);
        }
    }
}

