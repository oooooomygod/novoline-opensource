/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.IChatComponent;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.VG;

public class S47PacketPlayerListHeaderFooter
implements Packet<INetHandlerPlayClient> {
    private IChatComponent a;
    private IChatComponent b;

    public S47PacketPlayerListHeaderFooter() {
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public IChatComponent a() {
        return this.a;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.q(packetBuffer);
        this.a = PacketBufferInvoker.q(packetBuffer);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.b);
        PacketBufferInvoker.a(packetBuffer, this.a);
    }

    public S47PacketPlayerListHeaderFooter(IChatComponent iChatComponent) {
        this.b = iChatComponent;
    }

    public IChatComponent b() {
        return this.b;
    }
}

