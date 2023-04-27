/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.IChatComponent;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.VG;
import net.xz_0;

public class S45PacketTitle
implements Packet<INetHandlerPlayClient> {
    private IChatComponent d;
    private int a;
    private xz_0 c;
    private int b;
    private int e;

    public S45PacketTitle(xz_0 xz_02, IChatComponent iChatComponent) {
        this(xz_02, iChatComponent, -1, -1, -1);
    }

    public int c() {
        return this.b;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public S45PacketTitle(xz_0 xz_02, IChatComponent iChatComponent, int n, int n2, int n3) {
        this.c = xz_02;
        this.d = iChatComponent;
        this.a = n;
        this.b = n2;
        this.e = n3;
    }

    public IChatComponent a() {
        return this.d;
    }

    public xz_0 e() {
        return this.c;
    }

    public int b() {
        return this.e;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.c);
        if (this.c == xz_0.TITLE || this.c == xz_0.SUBTITLE) {
            PacketBufferInvoker.a(packetBuffer, this.d);
        }
        if (this.c == xz_0.TIMES) {
            PacketBufferInvoker.e(packetBuffer, this.a);
            PacketBufferInvoker.e(packetBuffer, this.b);
            PacketBufferInvoker.e(packetBuffer, this.e);
        }
    }

    public S45PacketTitle() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.c = (xz_0)PacketBufferInvoker.a(packetBuffer, xz_0.class);
        if (this.c == xz_0.TITLE || this.c == xz_0.SUBTITLE) {
            this.d = PacketBufferInvoker.q(packetBuffer);
        }
        if (this.c == xz_0.TIMES) {
            this.a = PacketBufferInvoker.p(packetBuffer);
            this.b = PacketBufferInvoker.p(packetBuffer);
            this.e = PacketBufferInvoker.p(packetBuffer);
        }
    }

    public S45PacketTitle(int n, int n2, int n3) {
        this(xz_0.TIMES, null, n, n2, n3);
    }

    public int d() {
        return this.a;
    }
}

