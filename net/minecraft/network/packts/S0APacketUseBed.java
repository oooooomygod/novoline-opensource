/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.EntityPlayer;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.minecraft.block.BlockPos;
import net.PacketBuffer;
import net.VG;
import net.World;
import net.a6w_0;
import net.aV8;

public class S0APacketUseBed
implements Packet<INetHandlerPlayClient> {
    private BlockPos b;
    private int a;

    public S0APacketUseBed() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.b(packetBuffer);
        this.b = PacketBufferInvoker.o(packetBuffer);
    }

    public EntityPlayer a(World world) {
        return (EntityPlayer)aV8.b(world, this.a);
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S0APacketUseBed(EntityPlayer entityPlayer, BlockPos blockPos) {
        this.a = a6w_0.r(entityPlayer);
        this.b = blockPos;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.a);
        PacketBufferInvoker.a(packetBuffer, this.b);
    }

    public BlockPos a() {
        return this.b;
    }
}

