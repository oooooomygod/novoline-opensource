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

public class S36PacketSignEditorOpen
implements Packet<INetHandlerPlayClient> {
    private BlockPos a;

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
    }

    public S36PacketSignEditorOpen() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.o(packetBuffer);
    }

    public BlockPos a() {
        return this.a;
    }

    public S36PacketSignEditorOpen(BlockPos blockPos) {
        this.a = blockPos;
    }
}

