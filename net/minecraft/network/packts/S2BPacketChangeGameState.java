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
import net.arh_1;

public class S2BPacketChangeGameState
implements Packet<INetHandlerPlayClient> {
    private float a;
    private int c;
    public static String[] b = new String[]{arh_1.a};

    public S2BPacketChangeGameState() {
    }

    public S2BPacketChangeGameState(int n, float f) {
        this.c = n;
        this.a = f;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.c(packetBuffer, this.c);
        PacketBufferInvoker.writeFloat(packetBuffer, this.a);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.c = PacketBufferInvoker.n(packetBuffer);
        this.a = PacketBufferInvoker.m(packetBuffer);
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public int a() {
        return this.c;
    }

    public float b() {
        return this.a;
    }
}

