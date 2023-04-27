/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.PacketBuffer;
import net.VG;

public class S24PacketBlockAction
implements Packet<INetHandlerPlayClient> {
    private Block c;
    private BlockPos d;
    private int a;
    private int b;

    public Block a() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public S24PacketBlockAction(BlockPos blockPos, Block block, int n, int n2) {
        this.d = blockPos;
        this.b = n;
        this.a = n2;
        this.c = block;
    }

    public S24PacketBlockAction() {
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.d = PacketBufferInvoker.o(packetBuffer);
        this.b = PacketBufferInvoker.n(packetBuffer);
        this.a = PacketBufferInvoker.n(packetBuffer);
        this.c = BlocksInvoker.a(PacketBufferInvoker.b(packetBuffer) & 0xFFF);
    }

    public int d() {
        return this.a;
    }

    public BlockPos b() {
        return this.d;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.d);
        PacketBufferInvoker.c(packetBuffer, this.b);
        PacketBufferInvoker.c(packetBuffer, this.a);
        PacketBufferInvoker.b(packetBuffer, BlocksInvoker.v(this.c) & 0xFFF);
    }
}

