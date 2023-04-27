/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.OJ;
import net.PacketBuffer;
import net.QU;
import net.VG;
import net.acl_0;
import net.afi_1;
import net.agr_2;
import net.hs_0;

public class S3CPacketUpdateScore
implements Packet<INetHandlerPlayClient> {
    private int a;
    private String b;
    private agr_2 d;
    private String c;

    public agr_2 c() {
        return this.d;
    }

    public S3CPacketUpdateScore(String string) {
        this.c = OJ.i;
        this.b = OJ.a;
        this.c = string;
        this.b = OJ.e;
        this.a = 0;
        this.d = agr_2.REMOVE;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public String a() {
        return this.c;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.c = PacketBufferInvoker.d(packetBuffer, 40);
        this.d = (agr_2)PacketBufferInvoker.a(packetBuffer, agr_2.class);
        this.b = PacketBufferInvoker.d(packetBuffer, 16);
        if (this.d != agr_2.REMOVE) {
            this.a = PacketBufferInvoker.b(packetBuffer);
        }
    }

    public int b() {
        return this.a;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.c);
        PacketBufferInvoker.a(packetBuffer, this.d);
        PacketBufferInvoker.a(packetBuffer, this.b);
        if (this.d != agr_2.REMOVE) {
            PacketBufferInvoker.b(packetBuffer, this.a);
        }
    }

    public String d() {
        return this.b;
    }

    public S3CPacketUpdateScore(String string, acl_0 acl_02) {
        this.c = OJ.b;
        this.b = OJ.f;
        this.c = string;
        this.b = afi_1.d(acl_02);
        this.a = 0;
        this.d = agr_2.REMOVE;
    }

    public S3CPacketUpdateScore() {
        this.c = OJ.g;
        this.b = OJ.c;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public S3CPacketUpdateScore(QU qU) {
        this.c = OJ.d;
        this.b = OJ.h;
        this.c = qU.d();
        this.b = afi_1.d(hs_0.e(qU));
        this.a = hs_0.d(qU);
        this.d = agr_2.CHANGE;
    }
}

