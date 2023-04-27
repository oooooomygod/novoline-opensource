/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Chunk;
import deobf.INetHandlerPlayClient;
import deobf.Packet;

import java.io.IOException;
import java.util.List;
import net.P8;
import net.PacketBuffer;
import net.VG;
import net.aqp_2;
import net.arf_1;
import net.ek_0;
import net.qq_2;

public class S26PacketMapChunkBulk
implements Packet<INetHandlerPlayClient> {
    private int[] c;
    private ek_0[] a;
    private int[] b;
    private boolean d;

    public S26PacketMapChunkBulk(List<Chunk> list) {
        int n = ListInvoker.size(list);
        this.b = new int[n];
        this.c = new int[n];
        this.a = new ek_0[n];
        this.d = !qq_2.e(aqp_2.r((Chunk)((Chunk)ListInvoker.get(list, (int)0))).d);
        for (int i = 0; i < n; ++i) {
            Chunk chunk = (Chunk)ListInvoker.get(list, i);
            ek_0 ek_02 = arf_1.a(chunk, true, this.d, 65535);
            this.b[i] = chunk.f;
            this.c[i] = chunk.v;
            this.a[i] = ek_02;
        }
    }

    public int b(int n) {
        return this.a[n].b;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        int n;
        PacketBufferInvoker.a(packetBuffer, this.d);
        PacketBufferInvoker.b(packetBuffer, this.a.length);
        for (n = 0; n < this.b.length; ++n) {
            PacketBufferInvoker.e(packetBuffer, this.b[n]);
            PacketBufferInvoker.e(packetBuffer, this.c[n]);
            PacketBufferInvoker.g(packetBuffer, (short)(this.a[n].b & 0xFFFF));
        }
        for (n = 0; n < this.b.length; ++n) {
            PacketBufferInvoker.a(packetBuffer, this.a[n].a);
        }
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        int n;
        this.d = PacketBufferInvoker.i(packetBuffer);
        int n2 = PacketBufferInvoker.b(packetBuffer);
        this.b = new int[n2];
        this.c = new int[n2];
        this.a = new ek_0[n2];
        for (n = 0; n < n2; ++n) {
            this.b[n] = PacketBufferInvoker.p(packetBuffer);
            this.c[n] = PacketBufferInvoker.p(packetBuffer);
            this.a[n] = new ek_0();
            this.a[n].b = PacketBufferInvoker.k(packetBuffer) & 0xFFFF;
            this.a[n].a = new byte[S21PacketChunkData.a(P8.e(this.a[n].b), this.d, true)];
        }
        for (n = 0; n < n2; ++n) {
            PacketBufferInvoker.b(packetBuffer, this.a[n].a);
        }
    }

    public S26PacketMapChunkBulk() {
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public int c(int n) {
        return this.b[n];
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public int a() {
        return this.b.length;
    }

    public byte[] d(int n) {
        return this.a[n].a;
    }

    public int a(int n) {
        return this.c[n];
    }
}

