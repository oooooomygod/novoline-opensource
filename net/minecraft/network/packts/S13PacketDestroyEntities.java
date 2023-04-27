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

public class S13PacketDestroyEntities
implements Packet<INetHandlerPlayClient> {
    private int[] a;

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.a.length);
        for (int n : this.a) {
            PacketBufferInvoker.b(packetBuffer, n);
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public S13PacketDestroyEntities(int ... nArray) {
        this.a = nArray;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public int[] a() {
        return this.a;
    }

    public S13PacketDestroyEntities() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = new int[PacketBufferInvoker.b(packetBuffer)];
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = PacketBufferInvoker.b(packetBuffer);
        }
    }
}

