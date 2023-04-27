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
import net.acl_0;
import net.afb_0;

public class S3DPacketDisplayScoreboard
implements Packet<INetHandlerPlayClient> {
    private int a;
    private String b;

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.c(packetBuffer, this.a);
        PacketBufferInvoker.a(packetBuffer, this.b);
    }

    public int a() {
        return this.a;
    }

    public S3DPacketDisplayScoreboard(int n, acl_0 acl_02) {
        this.a = n;
        this.b = afb_0.a;
    }

    public S3DPacketDisplayScoreboard() {
    }

    public String b() {
        return this.b;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.l(packetBuffer);
        this.b = PacketBufferInvoker.d(packetBuffer, 16);
    }
}

