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

public class S02PacketChat
implements Packet<INetHandlerPlayClient> {
    private IChatComponent a;
    private byte b;

    public boolean c() {
        return this.b == 1 || this.b == 2;
    }

    public void a(IChatComponent iChatComponent) {
        this.a = iChatComponent;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
        PacketBufferInvoker.c(packetBuffer, this.b);
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.q(packetBuffer);
        this.b = PacketBufferInvoker.l(packetBuffer);
    }

    public S02PacketChat(IChatComponent iChatComponent, byte by) {
        this.a = iChatComponent;
        this.b = by;
    }

    public IChatComponent a() {
        return this.a;
    }

    public S02PacketChat() {
    }

    public S02PacketChat(IChatComponent iChatComponent) {
        this(iChatComponent, 1);
    }

    public byte b() {
        return this.b;
    }
}

