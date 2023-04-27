/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.IChatComponent;
import deobf.INetHandlerLoginClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.a4O;

public class S00PacketDisconnect
implements Packet<INetHandlerLoginClient> {
    private IChatComponent a;

    public IChatComponent a() {
        return this.a;
    }

    public S00PacketDisconnect() {
    }

    public void a(INetHandlerLoginClient iNetHandlerLoginClient) {
        a4O.a(iNetHandlerLoginClient, this);
    }

    public S00PacketDisconnect(IChatComponent iChatComponent) {
        this.a = iChatComponent;
    }

    public void a(IChatComponent iChatComponent) {
        this.a = iChatComponent;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.q(packetBuffer);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
    }
}

