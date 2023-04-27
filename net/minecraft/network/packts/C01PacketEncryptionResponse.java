/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Packet;
import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import net.INetHandlerLoginServer;
import net.PacketBuffer;
import net.asf_1;
import net.rk_1;
import net.ss_0;

public class C01PacketEncryptionResponse
implements Packet<INetHandlerLoginServer> {
    private byte[] a;
    private byte[] b = new byte[0];

    public void a(INetHandlerLoginServer iNetHandlerLoginServer) {
        ss_0.a(iNetHandlerLoginServer, this);
    }

    public C01PacketEncryptionResponse(SecretKey secretKey, PublicKey publicKey, byte[] byArray) {
        this.a = new byte[0];
        this.b = rk_1.b(publicKey, asf_1.a(secretKey));
        this.a = rk_1.b(publicKey, byArray);
    }

    public byte[] a(PrivateKey privateKey) {
        return this.a;
    }

    public C01PacketEncryptionResponse() {
        this.a = new byte[0];
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.c(packetBuffer, this.b);
        PacketBufferInvoker.c(packetBuffer, this.a);
    }

    public SecretKey b(PrivateKey privateKey) {
        return rk_1.a(privateKey, this.b);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.j(packetBuffer);
        this.a = PacketBufferInvoker.j(packetBuffer);
    }
}

