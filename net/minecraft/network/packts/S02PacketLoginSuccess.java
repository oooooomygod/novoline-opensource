/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import com.mojang.authlib.GameProfile;
import deobf.INetHandlerLoginClient;
import deobf.Packet;
import java.io.IOException;
import java.util.UUID;
import net.PacketBuffer;
import net.a4O;
import net.a4Z;
import net.awc_1;
import net.xl_0;

public class S02PacketLoginSuccess
implements Packet<INetHandlerLoginClient> {
    private GameProfile a;

    public GameProfile a() {
        return this.a;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        String string = PacketBufferInvoker.d(packetBuffer, 36);
        String string2 = PacketBufferInvoker.d(packetBuffer, 16);
        UUID uUID = awc_1.a(string);
        this.a = new GameProfile(uUID, string2);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public void a(INetHandlerLoginClient iNetHandlerLoginClient) {
        a4O.a(iNetHandlerLoginClient, this);
    }

    public S02PacketLoginSuccess(GameProfile gameProfile) {
        this.a = gameProfile;
    }

    public S02PacketLoginSuccess() {
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        a4Z.a(this.a);
        PacketBufferInvoker.a(packetBuffer, xl_0.a);
        PacketBufferInvoker.a(packetBuffer, a4Z.d(this.a));
    }
}

