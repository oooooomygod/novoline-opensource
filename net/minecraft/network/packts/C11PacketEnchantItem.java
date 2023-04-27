/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Packet;
import java.io.IOException;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SZ;

public class C11PacketEnchantItem
implements Packet<INetHandlerPlayServer> {
    private int b;
    private int a;

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.l(packetBuffer);
        this.b = PacketBufferInvoker.l(packetBuffer);
    }

    public int a() {
        return this.b;
    }

    public C11PacketEnchantItem() {
    }

    public C11PacketEnchantItem(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    public int b() {
        return this.a;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.c(packetBuffer, this.a);
        PacketBufferInvoker.c(packetBuffer, this.b);
    }
}

