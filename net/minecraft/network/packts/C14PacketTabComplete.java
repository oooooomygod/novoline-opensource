/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Packet;
import java.io.IOException;
import net.minecraft.block.BlockPos;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SZ;
import net.aw__0;

public class C14PacketTabComplete
implements Packet<INetHandlerPlayServer> {
    private BlockPos a;
    private String b;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    public BlockPos a() {
        return this.a;
    }

    public C14PacketTabComplete(String string) {
        this(string, null);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.d(packetBuffer, Short.MAX_VALUE);
        PacketBufferInvoker.i(packetBuffer);
        this.a = PacketBufferInvoker.o(packetBuffer);
    }

    public C14PacketTabComplete() {
    }

    public String b() {
        return this.b;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, aw__0.a(this.b, 0, Short.MAX_VALUE));
        boolean bl = this.a != null;
        PacketBufferInvoker.a(packetBuffer, bl);
        PacketBufferInvoker.a(packetBuffer, this.a);
    }

    public C14PacketTabComplete(String string, BlockPos blockPos) {
        this.b = string;
        this.a = blockPos;
    }
}

