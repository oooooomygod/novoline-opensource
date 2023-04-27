/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.mojang.authlib.GameProfile;
import deobf.IChatComponent;
import deobf.INetHandlerStatusClient;
import deobf.NetworkManager;
import deobf.ServerStatusResponse;
import net.minecraft.network.packts.C01PacketPing;
import net.minecraft.network.packts.S00PacketServerInfo;
import net.minecraft.network.packts.S01PacketPong;
import net.ChatComponentText;

/*
 * Renamed from net.Vz
 */
class vz_0
implements INetHandlerStatusClient {
    aBQ a;
    private boolean e;
    String c;
    aY5 d;
    NetworkManager b;

    @Override
    public void a(IChatComponent iChatComponent) {
        if (!this.e) {
            LoggerInvoker.f(aBQ.c(), aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), F7.a), this.c), F7.f), aBO.d(iChatComponent)).toString());
        }
    }

    vz_0(aBQ aBQ2, aY5 aY52, NetworkManager networkManager, String string) {
        this.a = aBQ2;
        this.d = aY52;
        this.b = networkManager;
        this.c = string;
        this.e = false;
    }

    @Override
    public void a(S00PacketServerInfo s00PacketServerInfo) {
        ServerStatusResponse serverStatusResponse = PH.a(s00PacketServerInfo);
        if (a8K.d(serverStatusResponse) != null) {
            this.d.c = StringInvoker.a(aMQ.c(a8K.d(serverStatusResponse)));
            if (aoe_2.b(aMQ.a(a8K.d(serverStatusResponse)))) {
                StringBuilder stringBuilder = new StringBuilder();
                for (GameProfile gameProfile : aMQ.a(a8K.d(serverStatusResponse))) {
                    if (aL0.a(stringBuilder) > 0) {
                        aL0.a(stringBuilder, F7.e);
                    }
                    aL0.a(stringBuilder, a4Z.d(gameProfile));
                }
                if (aMQ.a(a8K.d(serverStatusResponse)).length < aMQ.c(a8K.d(serverStatusResponse))) {
                    if (aL0.a(stringBuilder) > 0) {
                        aL0.a(stringBuilder, F7.c);
                    }
                    aL0.a(aL0.c(aL0.a(stringBuilder, F7.h), aMQ.c(a8K.d(serverStatusResponse)) - aMQ.a(a8K.d(serverStatusResponse)).length), F7.g);
                }
                this.d.a = stringBuilder.toString();
            }
        } else {
            this.d.a = F7.d;
        }
        NetworkManagerInvoker.sendPacket(this.b, new C01PacketPing(aGK.a()));
        this.e = true;
    }

    @Override
    public void a(S01PacketPong s01PacketPong) {
        NetworkManagerInvoker.a(this.b, new ChatComponentText(F7.b));
    }
}

