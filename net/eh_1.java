/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 */
package net;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.xm_1;

/*
 * Renamed from net.eH
 */
public class eh_1 {
    private static int b;

    public static void b(int n) {
        b = n;
    }

    public static int a() {
        eh_1.b();
        return 86;
    }

    public static int b() {
        return b;
    }

    static {
        if (eh_1.a() != 0) {
            eh_1.b(7);
        }
    }

    public static void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        xm_1.b(channelHandlerContext, byteBuf);
    }

    public static void b(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        xm_1.a(channelHandlerContext, byteBuf);
    }
}

