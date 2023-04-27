/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.Packet;
import java.io.IOException;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SZ;

public class C01PacketChatMessage
implements Packet<INetHandlerPlayServer> {
    private String a;

    public void a(String string) {
        this.a = string;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.d(packetBuffer, 100);
    }

    public C01PacketChatMessage(String string) {
        if (StringInvoker.c(string) > 100) {
            string = StringInvoker.b(string, 0, 100);
        }
        this.a = string;
    }

    public C01PacketChatMessage() {
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
    }

    public String a() {
        return this.a;
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }
}

