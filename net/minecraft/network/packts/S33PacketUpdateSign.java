/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.IChatComponent;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.minecraft.block.BlockPos;
import net.PacketBuffer;
import net.VG;
import net.World;

public class S33PacketUpdateSign
implements Packet<INetHandlerPlayClient> {
    private IChatComponent[] c;
    private BlockPos a;
    private World b;

    public S33PacketUpdateSign(World world, BlockPos blockPos, IChatComponent[] iChatComponentArray) {
        this.b = world;
        this.a = blockPos;
        this.c = new IChatComponent[]{iChatComponentArray[0], iChatComponentArray[1], iChatComponentArray[2], iChatComponentArray[3]};
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
        int n = 0;
        while (true) {
            PacketBufferInvoker.a(packetBuffer, this.c[n]);
            ++n;
        }
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.o(packetBuffer);
        this.c = new IChatComponent[4];
        int n = 0;
        while (true) {
            this.c[n] = PacketBufferInvoker.q(packetBuffer);
            ++n;
        }
    }

    public BlockPos b() {
        return this.a;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S33PacketUpdateSign() {
    }

    public IChatComponent[] a() {
        return this.c;
    }
}

