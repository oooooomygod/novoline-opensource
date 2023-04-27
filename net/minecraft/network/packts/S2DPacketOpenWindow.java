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
import net.aMN;

public class S2DPacketOpenWindow
implements Packet<INetHandlerPlayClient> {
    private int e;
    private IChatComponent d;
    private String a;
    private int c;
    private int b;

    public int b() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    public S2DPacketOpenWindow() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.n(packetBuffer);
        this.a = PacketBufferInvoker.d(packetBuffer, 32);
        this.d = PacketBufferInvoker.q(packetBuffer);
        this.e = PacketBufferInvoker.n(packetBuffer);
        if (this.a.equals(aMN.a)) {
            this.c = PacketBufferInvoker.p(packetBuffer);
        }
    }

    public S2DPacketOpenWindow(int n, String string, IChatComponent iChatComponent, int n2, int n3) {
        this(n, string, iChatComponent, n2);
        this.c = n3;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.c(packetBuffer, this.b);
        PacketBufferInvoker.a(packetBuffer, this.a);
        PacketBufferInvoker.a(packetBuffer, this.d);
        PacketBufferInvoker.c(packetBuffer, this.e);
        if (this.a.equals(aMN.b)) {
            PacketBufferInvoker.e(packetBuffer, this.c);
        }
    }

    public S2DPacketOpenWindow(int n, String string, IChatComponent iChatComponent) {
        this(n, string, iChatComponent, 0);
    }

    public int c() {
        return this.c;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S2DPacketOpenWindow(int n, String string, IChatComponent iChatComponent, int n2) {
        this.b = n;
        this.a = string;
        this.d = iChatComponent;
        this.e = n2;
    }

    public int a() {
        return this.e;
    }

    public boolean f() {
        return this.e > 0;
    }

    public IChatComponent d() {
        return this.d;
    }

    public String e() {
        return this.a;
    }
}

