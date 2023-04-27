/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelPipeline
 */
package net;

import cc.novoline.invoke.ListInvoker;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import java.util.List;

/*
 * Renamed from net.a4y
 */
public class a4y_0 {
    private static ListInvoker[] b;

    public static ChannelPipeline a(ChannelPipeline channelPipeline, ChannelHandler[] channelHandlerArray) {
        return channelPipeline.addLast(channelHandlerArray);
    }

    public static List b(ChannelPipeline channelPipeline) {
        return channelPipeline.names();
    }

    public static ChannelPipeline a(ChannelPipeline channelPipeline, ChannelHandler channelHandler) {
        return channelPipeline.remove(channelHandler);
    }

    public static ChannelHandler a(ChannelPipeline channelPipeline, String string) {
        return channelPipeline.remove(string);
    }

    public static ChannelHandler b(ChannelPipeline channelPipeline, String string) {
        return channelPipeline.get(string);
    }

    public static ChannelPipeline a(ChannelPipeline channelPipeline, String string, String string2, ChannelHandler channelHandler) {
        return channelPipeline.addBefore(string, string2, channelHandler);
    }

    public static ChannelPipeline a(ChannelPipeline channelPipeline, String string, ChannelHandler channelHandler) {
        return channelPipeline.addLast(string, channelHandler);
    }

    public static ChannelHandlerContext a(ChannelPipeline channelPipeline) {
        return channelPipeline.firstContext();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ChannelPipeline b(ChannelPipeline channelPipeline, String string, String string2, ChannelHandler channelHandler) {
        return channelPipeline.addAfter(string, string2, channelHandler);
    }

    public static ListInvoker[] b() {
        return b;
    }

    static {
        if (a4y_0.b() != null) {
            a4y_0.b(new ListInvoker[2]);
        }
    }
}

