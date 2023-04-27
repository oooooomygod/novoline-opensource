/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 */
package net;

import deobf.NetworkManager;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import net.a4y_0;
import net.aF5;
import net.ew_1;

/*
 * Renamed from net.aVc
 */
class avc_0
extends ChannelInitializer<Channel> {
    NetworkManager a;

    avc_0(NetworkManager networkManager) {
        this.a = networkManager;
    }

    protected void initChannel(Channel channel) {
        a4y_0.a(aF5.c(channel), ew_1.a, (ChannelHandler)this.a);
    }
}

