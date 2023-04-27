/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.Chunk;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.P8;
import net.PacketBuffer;
import net.VG;
import net.a4f_0;
import net.ano_2;
import net.aqp_2;
import net.awc_0;
import net.dz_0;
import net.ek_0;
import net.my_0;
import net.qq_2;

public class S21PacketChunkData
implements Packet<INetHandlerPlayClient> {
    private ek_0 b;
    private int a;
    private boolean d;
    private int c;

    public S21PacketChunkData(Chunk chunk, boolean bl, int n) {
        this.c = chunk.f;
        this.a = chunk.v;
        this.d = bl;
        this.b = S21PacketChunkData.a(chunk, bl, !qq_2.e(aqp_2.r((Chunk)chunk).d), n);
    }

    public boolean c() {
        return this.d;
    }

    public int a() {
        return this.c;
    }

    public byte[] e() {
        return this.b.a;
    }

    public int d() {
        return this.a;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    private static int a(byte[] byArray, byte[] byArray2, int n) {
        SystemInvoker.a(byArray, 0, byArray2, n, byArray.length);
        return n + byArray.length;
    }

    public static ek_0 a(Chunk chunk, boolean bl, boolean bl2, int n) {
        ano_2 ano_22;
        Object object;
        int n2;
        ano_2[] ano_2Array = aqp_2.m(chunk);
        ek_0 ek_02 = new ek_0();
        ArrayList arrayList = my_0.c();
        for (n2 = 0; n2 < ano_2Array.length; ++n2) {
            object = ano_2Array[n2];
            if (a4f_0.d((ano_2)object) || (n & 1 << n2) == 0) continue;
            ek_02.b |= 1 << n2;
            ListInvoker.add(arrayList, object);
        }
        ek_02.a = new byte[S21PacketChunkData.a(P8.e(ek_02.b), bl2, bl)];
        n2 = 0;
        object = ListInvoker.iterator(arrayList);
        while (dz_0.c((Iterator)object)) {
            char[] cArray;
            ano_22 = (ano_2)dz_0.b((Iterator)object);
            for (char c : cArray = a4f_0.g(ano_22)) {
                ek_02.a[n2++] = (byte)(c & 0xFF);
                ek_02.a[n2++] = (byte)(c >> 8 & 0xFF);
            }
        }
        object = ListInvoker.iterator(arrayList);
        while (dz_0.c((Iterator)object)) {
            ano_22 = (ano_2)dz_0.b((Iterator)object);
            n2 = S21PacketChunkData.a(awc_0.a(a4f_0.b(ano_22)), ek_02.a, n2);
        }
        object = ListInvoker.iterator(arrayList);
        while (dz_0.c((Iterator)object)) {
            ano_22 = (ano_2)dz_0.b((Iterator)object);
            n2 = S21PacketChunkData.a(awc_0.a(a4f_0.f(ano_22)), ek_02.a, n2);
        }
        S21PacketChunkData.a(aqp_2.i(chunk), ek_02.a, n2);
        return ek_02;
    }

    protected static int a(int n, boolean bl, boolean bl2) {
        int n2 = n * 2 * 16 * 16 * 16;
        int n3 = n * 16 * 16 * 16 / 2;
        int n4 = n * 16 * 16 * 16 / 2;
        int n5 = 256;
        return n2 + n3 + n4 + n5;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.e(packetBuffer, this.c);
        PacketBufferInvoker.e(packetBuffer, this.a);
        PacketBufferInvoker.a(packetBuffer, this.d);
        PacketBufferInvoker.g(packetBuffer, (short)(this.b.b & 0xFFFF));
        PacketBufferInvoker.c(packetBuffer, this.b.a);
    }

    public int b() {
        return this.b.b;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.c = PacketBufferInvoker.p(packetBuffer);
        this.a = PacketBufferInvoker.p(packetBuffer);
        this.d = PacketBufferInvoker.i(packetBuffer);
        this.b = new ek_0();
        this.b.b = PacketBufferInvoker.k(packetBuffer);
        this.b.a = PacketBufferInvoker.j(packetBuffer);
    }

    public S21PacketChunkData() {
    }
}

