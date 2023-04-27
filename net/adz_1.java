/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import deobf.NetworkManager;
import deobf.NetworkSystem;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import deobf.EnumPacketDirection;

/*
 * Renamed from net.adz
 */
class adz_1
extends ChannelInitializer<Channel> {
    NetworkSystem a;

    adz_1(NetworkSystem networkSystem) {
        this.a = networkSystem;
    }

    protected void initChannel(Channel channel) throws Exception {
        NetworkManager networkManager = new NetworkManager(EnumPacketDirection.SERVERBOUND);
        NetworkManagerInvoker.setNetHandler(networkManager, new ap7_0(NetworkSystem.a(this.a), networkManager));
        ListInvoker.add(NetworkSystem.b(this.a), (Object)networkManager);
        a4y_0.a(aF5.c(channel), a5J.a, (ChannelHandler)networkManager);
    }
}

