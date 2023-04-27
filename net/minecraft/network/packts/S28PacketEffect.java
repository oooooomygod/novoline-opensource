/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.minecraft.block.BlockPos;
import net.PacketBuffer;
import net.VG;

public class S28PacketEffect
implements Packet<INetHandlerPlayClient> {
    private boolean b;
    private int d;
    private int c;
    private BlockPos a;

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.e(packetBuffer, this.c);
        PacketBufferInvoker.a(packetBuffer, this.a);
        PacketBufferInvoker.e(packetBuffer, this.d);
        PacketBufferInvoker.a(packetBuffer, this.b);
    }

    public int a() {
        return this.c;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S28PacketEffect(int n, BlockPos blockPos, int n2, boolean bl) {
        this.c = n;
        this.a = blockPos;
        this.d = n2;
        this.b = bl;
    }

    public S28PacketEffect() {
    }

    public BlockPos d() {
        return this.a;
    }

    public int b() {
        return this.d;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.c = PacketBufferInvoker.p(packetBuffer);
        this.a = PacketBufferInvoker.o(packetBuffer);
        this.d = PacketBufferInvoker.p(packetBuffer);
        this.b = PacketBufferInvoker.i(packetBuffer);
    }

    public boolean c() {
        return this.b;
    }
}

