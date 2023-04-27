/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.mojang.authlib.GameProfile;
import deobf.IChatComponent;
import deobf.INetHandlerStatusClient;
import deobf.MCInvoker;
import deobf.NetworkManager;
import deobf.ServerStatusResponse;
import net.minecraft.network.packts.C01PacketPing;
import net.minecraft.network.packts.S00PacketServerInfo;
import net.minecraft.network.packts.S01PacketPong;
import net.ChatComponentText;

/*
 * Renamed from net.aEv
 */
class aev_0
implements INetHandlerStatusClient {
    private long c;
    NetworkManager f;
    aX1 a;
    ServerData b;
    private boolean e;
    private boolean d;

    @Override
    public void a(S01PacketPong s01PacketPong) {
        long l4 = this.c;
        long l5 = MCInvoker.a();
        this.b.c = l5 - l4;
        ListInvoker.add(ServerData.g, new ahr_0(this.b.k, this.b.c));
        NetworkManagerInvoker.a(this.f, new ChatComponentText(tk_2.j));
    }

    @Override
    public void a(S00PacketServerInfo s00PacketServerInfo) {
        if (this.d) {
            NetworkManagerInvoker.a(this.f, new ChatComponentText(tk_2.c));
        } else {
            CharSequence charSequence;
            this.d = true;
            ServerStatusResponse serverStatusResponse = PH.a(s00PacketServerInfo);
            this.b.e = a8K.c(serverStatusResponse) != null ? aBO.a(a8K.c(serverStatusResponse)) : tk_2.f;
            if (a8K.b(serverStatusResponse) != null) {
                this.b.a = TK.a(a8K.b(serverStatusResponse));
                this.b.l = TK.b(a8K.b(serverStatusResponse));
            } else {
                this.b.a = tk_2.p;
                this.b.l = 0;
            }
            if (a8K.d(serverStatusResponse) != null) {
                this.b.j = aL0.c(aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), tk_2.a), aMQ.c(a8K.d(serverStatusResponse))), tk_2.m), (Object)anw_0.DARK_GRAY), tk_2.i), (Object)anw_0.GRAY), aMQ.b(a8K.d(serverStatusResponse))).toString();
                if (aoe_2.b(aMQ.a(a8K.d(serverStatusResponse)))) {
                    charSequence = new StringBuilder();
                    for (GameProfile gameProfile : aMQ.a(a8K.d(serverStatusResponse))) {
                        if (aL0.a((StringBuilder)charSequence) > 0) {
                            aL0.a((StringBuilder)charSequence, tk_2.n);
                        }
                        aL0.a((StringBuilder)charSequence, a4Z.d(gameProfile));
                    }
                    if (aMQ.a(a8K.d(serverStatusResponse)).length < aMQ.c(a8K.d(serverStatusResponse))) {
                        if (aL0.a((StringBuilder)charSequence) > 0) {
                            aL0.a((StringBuilder)charSequence, tk_2.e);
                        }
                        aL0.a(aL0.c(aL0.a((StringBuilder)charSequence, tk_2.o), aMQ.c(a8K.d(serverStatusResponse)) - aMQ.a(a8K.d(serverStatusResponse)).length), tk_2.r);
                    }
                    this.b.i = ((StringBuilder)charSequence).toString();
                }
            } else {
                this.b.j = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.DARK_GRAY), tk_2.l).toString();
            }
            if (a8K.a(serverStatusResponse) != null) {
                charSequence = a8K.a(serverStatusResponse);
                if (StringInvoker.e((String)charSequence, tk_2.s)) {
                    aKZ.a(this.b, StringInvoker.a((String)charSequence, StringInvoker.c(tk_2.h)));
                } else {
                    LoggerInvoker.f(aX1.b(), tk_2.q);
                }
            } else {
                aKZ.a(this.b, null);
            }
            this.c = MCInvoker.a();
            NetworkManagerInvoker.sendPacket(this.f, new C01PacketPing(this.c));
            this.e = true;
        }
    }

    aev_0(aX1 aX12, NetworkManager networkManager, ServerData serverData) {
        this.a = aX12;
        this.f = networkManager;
        this.b = serverData;
        this.e = false;
        this.d = false;
        this.c = 0L;
    }

    @Override
    public void a(IChatComponent iChatComponent) {
        if (!this.e) {
            LoggerInvoker.f(aX1.b(), aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), tk_2.d), this.b.k), tk_2.g), aBO.d(iChatComponent)).toString());
            this.b.e = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.DARK_RED), tk_2.k).toString();
            this.b.j = tk_2.b;
            aX1.a(this.a, this.b);
        }
    }
}

