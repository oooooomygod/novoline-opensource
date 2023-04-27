/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.AbstractBootstrap
 *  io.netty.bootstrap.ServerBootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 */
package net;

import io.netty.bootstrap.AbstractBootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import java.net.InetAddress;
import java.net.SocketAddress;

/*
 * Renamed from net.qQ
 */
public class qq_1 {
    public static ChannelFuture a(ServerBootstrap serverBootstrap) {
        return serverBootstrap.bind();
    }

    public static ServerBootstrap a(ServerBootstrap serverBootstrap, EventLoopGroup eventLoopGroup) {
        return serverBootstrap.group(eventLoopGroup);
    }

    public static ServerBootstrap a(ServerBootstrap serverBootstrap, ChannelHandler channelHandler) {
        return serverBootstrap.childHandler(channelHandler);
    }

    public static AbstractBootstrap a(ServerBootstrap serverBootstrap, Class clazz) {
        return serverBootstrap.channel(clazz);
    }

    public static AbstractBootstrap a(ServerBootstrap serverBootstrap, InetAddress inetAddress, int n) {
        return serverBootstrap.localAddress(inetAddress, n);
    }

    public static AbstractBootstrap a(ServerBootstrap serverBootstrap, SocketAddress socketAddress) {
        return serverBootstrap.localAddress(socketAddress);
    }
}

