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

public class S25PacketBlockBreakAnim
implements Packet<INetHandlerPlayClient> {
    private int b;
    private int a;
    private BlockPos c;

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.b(packetBuffer);
        this.c = PacketBufferInvoker.o(packetBuffer);
        this.a = PacketBufferInvoker.n(packetBuffer);
    }

    public S25PacketBlockBreakAnim() {
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public S25PacketBlockBreakAnim(int n, BlockPos blockPos, int n2) {
        this.b = n;
        this.c = blockPos;
        this.a = n2;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.b);
        PacketBufferInvoker.a(packetBuffer, this.c);
        PacketBufferInvoker.c(packetBuffer, this.a);
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public BlockPos c() {
        return this.c;
    }
}

