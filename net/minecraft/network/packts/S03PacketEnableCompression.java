/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerLoginClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.a4O;

public class S03PacketEnableCompression
implements Packet<INetHandlerLoginClient> {
    private int a;

    public S03PacketEnableCompression(int n) {
        this.a = n;
    }

    public int a() {
        return this.a;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.a);
    }

    public S03PacketEnableCompression() {
    }

    public void a(INetHandlerLoginClient iNetHandlerLoginClient) {
        a4O.a(iNetHandlerLoginClient, this);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.b(packetBuffer);
    }
}

