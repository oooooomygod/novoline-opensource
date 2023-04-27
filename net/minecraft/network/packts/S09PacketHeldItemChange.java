/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.VG;

public class S09PacketHeldItemChange
implements Packet<INetHandlerPlayClient> {
    private int a;

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.l(packetBuffer);
    }

    public void a(int n) {
        this.a = n;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.c(packetBuffer, this.a);
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S09PacketHeldItemChange() {
    }

    public S09PacketHeldItemChange(int n) {
        this.a = n;
    }

    public int a() {
        return this.a;
    }
}

