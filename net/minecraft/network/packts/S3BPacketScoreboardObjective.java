/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.PL;
import net.PacketBuffer;
import net.VG;
import net.a26;
import net.acl_0;
import net.afi_1;
import net.aon_1;

public class S3BPacketScoreboardObjective
implements Packet<INetHandlerPlayClient> {
    private int a;
    private String b;
    private PL d;
    private String c;

    public S3BPacketScoreboardObjective() {
    }

    public int d() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.c = PacketBufferInvoker.d(packetBuffer, 16);
        this.a = PacketBufferInvoker.l(packetBuffer);
        if (this.a == 0 || this.a == 2) {
            this.b = PacketBufferInvoker.d(packetBuffer, 32);
            this.d = a26.a(PacketBufferInvoker.d(packetBuffer, 16));
        }
    }

    public S3BPacketScoreboardObjective(acl_0 acl_02, int n) {
        this.c = afi_1.d(acl_02);
        this.b = afi_1.b(acl_02);
        this.d = aon_1.c(afi_1.a(acl_02));
        this.a = n;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.c);
        PacketBufferInvoker.c(packetBuffer, this.a);
        if (this.a == 0 || this.a == 2) {
            PacketBufferInvoker.a(packetBuffer, this.b);
            PacketBufferInvoker.a(packetBuffer, a26.a(this.d));
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public PL c() {
        return this.d;
    }

    public String a() {
        return this.c;
    }
}

