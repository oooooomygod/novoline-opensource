/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Packet;

import java.io.IOException;
import net.minecraft.block.BlockPos;
import deobf.EnumFacing;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SJ;
import net.SZ;

public class C07PacketPlayerDigging
implements Packet<INetHandlerPlayServer> {
    private EnumFacing facing;
    private C07PacketPlayerDigging$Action status;
    private BlockPos position;

    public C07PacketPlayerDigging(C07PacketPlayerDigging$Action c07PacketPlayerDigging$Action, BlockPos blockPos, EnumFacing enumFacing) {
        this.status = c07PacketPlayerDigging$Action;
        this.position = blockPos;
        this.facing = enumFacing;
    }

    public C07PacketPlayerDigging() {
    }

    public EnumFacing a() {
        return this.facing;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.status = (C07PacketPlayerDigging$Action)PacketBufferInvoker.a(packetBuffer, C07PacketPlayerDigging$Action.class);
        this.position = PacketBufferInvoker.o(packetBuffer);
        this.facing = SJ.a(PacketBufferInvoker.n(packetBuffer));
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.status);
        PacketBufferInvoker.a(packetBuffer, this.position);
        PacketBufferInvoker.c(packetBuffer, SJ.i(this.facing));
    }

    public C07PacketPlayerDigging(C07PacketPlayerDigging$Action c07PacketPlayerDigging$Action) {
        this.status = c07PacketPlayerDigging$Action;
        this.position = BlockPos.m;
        this.facing = EnumFacing.DOWN;
    }

    public BlockPos b() {
        return this.position;
    }

    public C07PacketPlayerDigging$Action c() {
        return this.status;
    }
}

