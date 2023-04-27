/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Packet;
import java.io.IOException;
import deobf.EnumChatVisibility;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SZ;
import net.ani_2;

public class C15PacketClientSettings
implements Packet<INetHandlerPlayServer> {
    private int a;
    private EnumChatVisibility b;
    private int d;
    private boolean c;
    private String e;

    public EnumChatVisibility a() {
        return this.b;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.e);
        PacketBufferInvoker.c(packetBuffer, this.a);
        PacketBufferInvoker.c(packetBuffer, ani_2.b(this.b));
        PacketBufferInvoker.a(packetBuffer, this.c);
        PacketBufferInvoker.c(packetBuffer, this.d);
    }

    public boolean d() {
        return this.c;
    }

    public C15PacketClientSettings() {
    }

    public int b() {
        return this.a;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.e = PacketBufferInvoker.d(packetBuffer, 7);
        this.a = PacketBufferInvoker.l(packetBuffer);
        this.b = ani_2.a(PacketBufferInvoker.l(packetBuffer));
        this.c = PacketBufferInvoker.i(packetBuffer);
        this.d = PacketBufferInvoker.n(packetBuffer);
    }

    public String c() {
        return this.e;
    }

    public int e() {
        return this.d;
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    public C15PacketClientSettings(String string, int n, EnumChatVisibility enumChatVisibility, boolean bl, int n2) {
        this.e = string;
        this.a = n;
        this.b = enumChatVisibility;
        this.c = bl;
        this.d = n2;
    }
}

