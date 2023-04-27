/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.IChatComponent;
import deobf.Packet;
import java.io.IOException;
import net.minecraft.block.BlockPos;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SZ;
import net.aGU;

public class C12PacketUpdateSign
implements Packet<INetHandlerPlayServer> {
    private IChatComponent[] b;
    private BlockPos a;

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
        int n = 0;
        while (true) {
            IChatComponent iChatComponent = this.b[n];
            String string = aGU.a(iChatComponent);
            PacketBufferInvoker.a(packetBuffer, string);
            ++n;
        }
    }

    public C12PacketUpdateSign(BlockPos blockPos, IChatComponent[] iChatComponentArray) {
        this.a = blockPos;
        this.b = new IChatComponent[]{iChatComponentArray[0], iChatComponentArray[1], iChatComponentArray[2], iChatComponentArray[3]};
    }

    public IChatComponent[] a() {
        return this.b;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.o(packetBuffer);
        this.b = new IChatComponent[4];
        int n = 0;
        while (true) {
            IChatComponent iChatComponent;
            String string = PacketBufferInvoker.d(packetBuffer, 384);
            this.b[n] = iChatComponent = aGU.a(string);
            ++n;
        }
    }

    public BlockPos b() {
        return this.a;
    }

    public C12PacketUpdateSign() {
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }
}

