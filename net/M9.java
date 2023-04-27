/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.util.concurrent.GenericFutureListener;

public class M9 {
    public static ChannelFuture c(ChannelFuture channelFuture) {
        return channelFuture.awaitUninterruptibly();
    }

    public static Channel a(ChannelFuture channelFuture) {
        return channelFuture.channel();
    }

    public static ChannelFuture b(ChannelFuture channelFuture) {
        return channelFuture.sync();
    }

    public static ChannelFuture a(ChannelFuture channelFuture, GenericFutureListener genericFutureListener) {
        return channelFuture.addListener(genericFutureListener);
    }

    public static ChannelFuture a(ChannelFuture channelFuture, GenericFutureListener[] genericFutureListenerArray) {
        return channelFuture.addListeners(genericFutureListenerArray);
    }

    public static ChannelFuture d(ChannelFuture channelFuture) {
        return channelFuture.syncUninterruptibly();
    }
}

