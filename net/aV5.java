/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.AbstractBootstrap
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 */
package net;

import io.netty.bootstrap.AbstractBootstrap;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import java.net.InetAddress;
import java.net.SocketAddress;

public class aV5 {
    private static String b = "VbEKCb";

    public static AbstractBootstrap a(Bootstrap bootstrap, Class clazz) {
        return bootstrap.channel(clazz);
    }

    static {
        if (aV5.b() == null) {
            aV5.b("VbEKCb");
        }
    }

    public static ChannelFuture a(Bootstrap bootstrap, SocketAddress socketAddress) {
        return bootstrap.connect(socketAddress);
    }

    public static ChannelFuture a(Bootstrap bootstrap, InetAddress inetAddress, int n) {
        return bootstrap.connect(inetAddress, n);
    }

    public static void b(String string) {
        b = string;
    }

    public static AbstractBootstrap a(Bootstrap bootstrap, ChannelHandler channelHandler) {
        return bootstrap.handler(channelHandler);
    }

    public static String b() {
        return b;
    }

    public static ChannelFuture a(Bootstrap bootstrap, String string, int n) {
        return bootstrap.connect(string, n);
    }

    public static AbstractBootstrap a(Bootstrap bootstrap, EventLoopGroup eventLoopGroup) {
        return bootstrap.group(eventLoopGroup);
    }
}

