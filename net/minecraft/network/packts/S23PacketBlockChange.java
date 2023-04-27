/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.IBlockState;
import net.PacketBuffer;
import net.VG;
import net.World;
import net.aV8;
import net.aZv;

public class S23PacketBlockChange
implements Packet<INetHandlerPlayClient> {
    private BlockPos b;
    private IBlockState a;

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.b);
        PacketBufferInvoker.b(packetBuffer, aZv.a(Block.H, this.a));
    }

    public IBlockState b() {
        return this.a;
    }

    public S23PacketBlockChange() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.o(packetBuffer);
        this.a = (IBlockState)aZv.a(Block.H, PacketBufferInvoker.b(packetBuffer));
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S23PacketBlockChange(World world, BlockPos blockPos) {
        this.b = blockPos;
        this.a = aV8.q(world, blockPos);
    }

    public BlockPos a() {
        return this.b;
    }
}

