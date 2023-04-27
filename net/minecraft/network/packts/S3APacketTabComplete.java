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

public class S3APacketTabComplete
implements Packet<INetHandlerPlayClient> {
    private String[] a;

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = new String[PacketBufferInvoker.b(packetBuffer)];
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = PacketBufferInvoker.d(packetBuffer, Short.MAX_VALUE);
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.a.length);
        for (String string : this.a) {
            PacketBufferInvoker.a(packetBuffer, string);
        }
    }

    public String[] a() {
        return this.a;
    }

    public S3APacketTabComplete() {
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S3APacketTabComplete(String[] stringArray) {
        this.a = stringArray;
    }
}

