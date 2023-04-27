/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBufAllocator
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelPipeline
 */
package net;

import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;

public class aAD {
    public static ChannelFuture a(ChannelHandlerContext channelHandlerContext, Object object) {
        return channelHandlerContext.writeAndFlush(object);
    }

    public static ByteBufAllocator c(ChannelHandlerContext channelHandlerContext) {
        return channelHandlerContext.alloc();
    }

    public static ChannelHandlerContext b(ChannelHandlerContext channelHandlerContext, Object object) {
        return channelHandlerContext.fireChannelRead(object);
    }

    public static ChannelFuture d(ChannelHandlerContext channelHandlerContext) {
        return channelHandlerContext.close();
    }

    public static ChannelPipeline b(ChannelHandlerContext channelHandlerContext) {
        return channelHandlerContext.pipeline();
    }

    public static Channel a(ChannelHandlerContext channelHandlerContext) {
        return channelHandlerContext.channel();
    }
}

