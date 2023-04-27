/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import java.util.List;
import net.PacketBuffer;
import net.VG;
import net.a96;
import net.aom_0;
import net.apd_1;

public class S1CPacketEntityMetadata
implements Packet<INetHandlerPlayClient> {
    private List<apd_1> b;
    private int a;

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public int a() {
        return this.a;
    }

    public List<apd_1> b() {
        return this.b;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.b(packetBuffer);
        this.b = aom_0.a(packetBuffer);
    }

    public S1CPacketEntityMetadata(int n, a96 a962, boolean bl) {
        this.a = n;
        this.b = aom_0.c(a962);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.a);
        aom_0.a(this.b, packetBuffer);
    }

    public S1CPacketEntityMetadata() {
    }
}

