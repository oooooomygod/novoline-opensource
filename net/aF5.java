/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelConfig
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.EventLoop
 *  io.netty.util.Attribute
 *  io.netty.util.AttributeKey
 */
package net;

import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoop;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import java.net.SocketAddress;

public class aF5 {
    public static boolean a(Channel channel) {
        return channel.isOpen();
    }

    public static Attribute a(Channel channel, AttributeKey attributeKey) {
        return channel.attr(attributeKey);
    }

    public static ChannelFuture a(Channel channel, Object object) {
        return channel.writeAndFlush(object);
    }

    public static Channel b(Channel channel) {
        return channel.flush();
    }

    public static ChannelPipeline c(Channel channel) {
        return channel.pipeline();
    }

    public static SocketAddress d(Channel channel) {
        return channel.localAddress();
    }

    public static SocketAddress f(Channel channel) {
        return channel.remoteAddress();
    }

    public static ChannelConfig h(Channel channel) {
        return channel.config();
    }

    public static ChannelFuture g(Channel channel) {
        return channel.close();
    }

    public static EventLoop e(Channel channel) {
        return channel.eventLoop();
    }
}

