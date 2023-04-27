/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.minecraft.block.BlockPos;
import net.NBTTagCompound;
import net.PacketBuffer;
import net.VG;

public class S35PacketUpdateTileEntity
implements Packet<INetHandlerPlayClient> {
    private NBTTagCompound c;
    private BlockPos b;
    private int a;

    public int b() {
        return this.a;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.b);
        PacketBufferInvoker.c(packetBuffer, (byte)this.a);
        PacketBufferInvoker.a(packetBuffer, this.c);
    }

    public S35PacketUpdateTileEntity(BlockPos blockPos, int n, NBTTagCompound nBTTagCompound) {
        this.b = blockPos;
        this.a = n;
        this.c = nBTTagCompound;
    }

    public NBTTagCompound a() {
        return this.c;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.o(packetBuffer);
        this.a = PacketBufferInvoker.n(packetBuffer);
        this.c = PacketBufferInvoker.a(packetBuffer);
    }

    public BlockPos c() {
        return this.b;
    }

    public S35PacketUpdateTileEntity() {
    }
}

