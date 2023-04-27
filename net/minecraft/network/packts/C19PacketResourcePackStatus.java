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

public class C19PacketResourcePackStatus
implements Packet<INetHandlerPlayServer> {
    private String a;
    private C19PacketResourcePackStatus$Action b;

    public C19PacketResourcePackStatus() {
    }

    public C19PacketResourcePackStatus(String string, C19PacketResourcePackStatus$Action c19PacketResourcePackStatus$Action) {
        if (StringInvoker.c(string) > 40) {
            string = StringInvoker.b(string, 0, 40);
        }
        this.a = string;
        this.b = c19PacketResourcePackStatus$Action;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.d(packetBuffer, 40);
        this.b = (C19PacketResourcePackStatus$Action)PacketBufferInvoker.a(packetBuffer, C19PacketResourcePackStatus$Action.class);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
        PacketBufferInvoker.a(packetBuffer, this.b);
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }
}

