/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.minecraft.block.BlockPos;
import deobf.EnumFacing;
import net.H_;
import net.PacketBuffer;
import net.SJ;
import net.VG;
import net.nk_2;
import net.y9;

public class S10PacketSpawnPainting
implements Packet<INetHandlerPlayClient> {
    private String d;
    private BlockPos b;
    private int a;
    private EnumFacing c;

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.a);
        PacketBufferInvoker.a(packetBuffer, this.d);
        PacketBufferInvoker.a(packetBuffer, this.b);
        PacketBufferInvoker.c(packetBuffer, SJ.j(this.c));
    }

    public S10PacketSpawnPainting() {
    }

    public int b() {
        return this.a;
    }

    public EnumFacing a() {
        return this.c;
    }

    public S10PacketSpawnPainting(nk_2 nk_22) {
        this.a = nk_22.r();
        this.b = H_.a(nk_22);
        this.c = nk_22.aj;
        this.d = nk_22.am.title;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.b(packetBuffer);
        this.d = PacketBufferInvoker.d(packetBuffer, y9.field_180001_A);
        this.b = PacketBufferInvoker.o(packetBuffer);
        this.c = SJ.b(PacketBufferInvoker.n(packetBuffer));
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public String d() {
        return this.d;
    }

    public BlockPos c() {
        return this.b;
    }
}

