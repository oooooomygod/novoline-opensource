/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.handler.timeout.ReadTimeoutHandler
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import deobf.NetworkManager;
import deobf.NetworkSystem;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import deobf.EnumPacketDirection;

class aXS
extends ChannelInitializer<Channel> {
    NetworkSystem a;

    protected void initChannel(Channel channel) throws Exception {
        try {
            ui_2.a(aF5.h(channel), ChannelOption.TCP_NODELAY, Boolean.TRUE);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        a4y_0.a(a4y_0.a(a4y_0.a(a4y_0.a(a4y_0.a(a4y_0.a(aF5.c(channel), tg_2.b, (ChannelHandler)new ReadTimeoutHandler(30)), tg_2.a, (ChannelHandler)new axa_1(this.a)), tg_2.e, (ChannelHandler)new aIF()), tg_2.d, (ChannelHandler)new FQ(EnumPacketDirection.SERVERBOUND)), tg_2.c, (ChannelHandler)new DM()), tg_2.g, (ChannelHandler)new Kc(EnumPacketDirection.CLIENTBOUND));
        NetworkManager networkManager = new NetworkManager(EnumPacketDirection.SERVERBOUND);
        ListInvoker.add(NetworkSystem.b(this.a), (Object)networkManager);
        a4y_0.a(aF5.c(channel), tg_2.f, (ChannelHandler)networkManager);
        NetworkManagerInvoker.setNetHandler(networkManager, new ax_2(NetworkSystem.a(this.a), networkManager));
    }

    aXS(NetworkSystem networkSystem) {
        this.a = networkSystem;
    }
}

