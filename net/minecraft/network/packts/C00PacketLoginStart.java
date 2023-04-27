/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import com.mojang.authlib.GameProfile;
import deobf.Packet;
import java.io.IOException;
import net.INetHandlerLoginServer;
import net.PacketBuffer;
import net.a4Z;
import net.ss_0;

public class C00PacketLoginStart
implements Packet<INetHandlerLoginServer> {
    private GameProfile a;

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = new GameProfile(null, PacketBufferInvoker.d(packetBuffer, 16));
    }

    public void a(GameProfile gameProfile) {
        this.a = gameProfile;
    }

    public void a(INetHandlerLoginServer iNetHandlerLoginServer) {
        ss_0.a(iNetHandlerLoginServer, this);
    }

    public C00PacketLoginStart() {
    }

    public GameProfile a() {
        return this.a;
    }

    public C00PacketLoginStart(GameProfile gameProfile) {
        this.a = gameProfile;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, a4Z.d(this.a));
    }
}

