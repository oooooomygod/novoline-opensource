/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 */
package net;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import net.ServerData;
import net.a4y_0;
import net.aBx;
import net.aF5;
import net.aX1;
import net.adx_2;
import net.ui_2;

class G0
extends ChannelInitializer<Channel> {
    ServerData c;
    aBx a;
    aX1 b;

    protected void initChannel(Channel channel) throws Exception {
        try {
            ui_2.a(aF5.h(channel), ChannelOption.TCP_NODELAY, Boolean.TRUE);
        }
        catch (ChannelException channelException) {}
        a4y_0.a(aF5.c(channel), new ChannelHandler[]{new adx_2(this)});
    }

    G0(aX1 aX12, aBx aBx2, ServerData serverData) {
        this.b = aX12;
        this.a = aBx2;
        this.c = serverData;
    }
}

