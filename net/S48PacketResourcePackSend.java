/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.PacketBufferInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.VG;
import net.WC;
import net.aL0;

public class S48PacketResourcePackSend
implements Packet<INetHandlerPlayClient> {
    private String b;
    private String a;

    public String a() {
        return this.a;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
        PacketBufferInvoker.a(packetBuffer, this.b);
    }

    public S48PacketResourcePackSend(String string, String string2) {
        this.a = string;
        this.b = string2;
        if (StringInvoker.c(string2) > 40) {
            throw new IllegalArgumentException(aL0.a(aL0.c(aL0.a(new StringBuilder(), WC.b), StringInvoker.c(string2)), WC.a).toString());
        }
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.d(packetBuffer, Short.MAX_VALUE);
        this.b = PacketBufferInvoker.d(packetBuffer, 40);
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public String b() {
        return this.b;
    }

    public S48PacketResourcePackSend() {
    }
}

