/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Chunk;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.minecraft.block.Block;
import net.ChunkCoordIntPair;
import net.IBlockState;
import net.PacketBuffer;
import net.SM;
import net.VG;
import net.aZv;
import net.apg_2;

public class S22PacketMultiBlockChange
implements Packet<INetHandlerPlayClient> {
    private apg_2[] a;
    private ChunkCoordIntPair b;

    public S22PacketMultiBlockChange() {
    }

    static ChunkCoordIntPair a(S22PacketMultiBlockChange s22PacketMultiBlockChange) {
        return s22PacketMultiBlockChange.b;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.e(packetBuffer, this.b.b);
        PacketBufferInvoker.e(packetBuffer, this.b.a);
        PacketBufferInvoker.b(packetBuffer, this.a.length);
        for (apg_2 apg_22 : this.a) {
            PacketBufferInvoker.g(packetBuffer, SM.b(apg_22));
            PacketBufferInvoker.b(packetBuffer, aZv.a(Block.H, SM.a(apg_22)));
        }
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = new ChunkCoordIntPair(PacketBufferInvoker.p(packetBuffer), PacketBufferInvoker.p(packetBuffer));
        this.a = new apg_2[PacketBufferInvoker.b(packetBuffer)];
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = new apg_2(this, PacketBufferInvoker.k(packetBuffer), (IBlockState)aZv.a(Block.H, PacketBufferInvoker.b(packetBuffer)));
        }
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S22PacketMultiBlockChange(int n, short[] sArray, Chunk chunk) {
        this.b = new ChunkCoordIntPair(chunk.f, chunk.v);
        this.a = new apg_2[n];
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = new apg_2(this, sArray[i], chunk);
        }
    }

    public apg_2[] a() {
        return this.a;
    }
}

