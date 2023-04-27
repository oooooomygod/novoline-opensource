/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerLoginClient;
import deobf.Packet;
import java.io.IOException;
import java.security.PublicKey;
import net.C7;
import net.PacketBuffer;
import net.a4O;
import net.rk_1;

public class S01PacketEncryptionRequest
implements Packet<INetHandlerLoginClient> {
    private String b;
    private PublicKey a;
    private byte[] c;

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.b);
        PacketBufferInvoker.c(packetBuffer, C7.a(this.a));
        PacketBufferInvoker.c(packetBuffer, this.c);
    }

    public S01PacketEncryptionRequest() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.d(packetBuffer, 20);
        this.a = rk_1.a(PacketBufferInvoker.j(packetBuffer));
        this.c = PacketBufferInvoker.j(packetBuffer);
    }

    public PublicKey b() {
        return this.a;
    }

    public void a(INetHandlerLoginClient iNetHandlerLoginClient) {
        a4O.a(iNetHandlerLoginClient, this);
    }

    public String a() {
        return this.b;
    }

    public S01PacketEncryptionRequest(String string, PublicKey publicKey, byte[] byArray) {
        this.b = string;
        this.a = publicKey;
        this.c = byArray;
    }

    public byte[] c() {
        return this.c;
    }
}

