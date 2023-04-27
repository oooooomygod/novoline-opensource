/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net;

import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.GenericFutureListener;
import net.DZ;
import net.E8;
import net.FH;
import net.G0;
import net.M9;
import net.MathHelper;
import net.aAD;
import net.aF5;
import net.aL0;
import net.aX1;
import net.amx_2;
import net.anw_0;
import net.awm_0;
import net.xy_0;

/*
 * Renamed from net.adx
 */
class adx_2
extends SimpleChannelInboundHandler<ByteBuf> {
    G0 a;

    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelActive(channelHandlerContext);
        ByteBuf byteBuf = FH.d();
        try {
            awm_0.e(byteBuf, 254);
            awm_0.e(byteBuf, 1);
            awm_0.e(byteBuf, 250);
            char[] cArray = StringInvoker.f(xy_0.b);
            awm_0.c(byteBuf, cArray.length);
            for (char c : cArray) {
                awm_0.d(byteBuf, c);
            }
            awm_0.c(byteBuf, 7 + 2 * StringInvoker.c(E8.a(this.a.a)));
            awm_0.e(byteBuf, 127);
            cArray = StringInvoker.f(E8.a(this.a.a));
            awm_0.c(byteBuf, cArray.length);
            for (char c : cArray) {
                awm_0.d(byteBuf, c);
            }
            awm_0.a(byteBuf, E8.b(this.a.a));
            M9.a(aF5.a(aAD.a(channelHandlerContext), byteBuf), (GenericFutureListener)ChannelFutureListener.CLOSE_ON_FAILURE);
            return;
        }
        finally {
            awm_0.k(byteBuf);
        }
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
        short s = awm_0.a(byteBuf);
        if (s == 255) {
            String string = new String(awm_0.c(awm_0.b(byteBuf, awm_0.j(byteBuf) * 2)), Charsets.UTF_16BE);
            String[] stringArray = (String[])DZ.a(amx_2.b(aX1.a(), string), String.class);
            if (xy_0.c.equals(stringArray[0])) {
                MathHelper.a(stringArray[1], 0);
                String string2 = stringArray[2];
                String string3 = stringArray[3];
                int n = MathHelper.a(stringArray[4], -1);
                int n2 = MathHelper.a(stringArray[5], -1);
                this.a.c.l = -1;
                this.a.c.a = string2;
                this.a.c.e = string3;
                this.a.c.j = aL0.c(aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), xy_0.e), n), xy_0.d), (Object)anw_0.DARK_GRAY), xy_0.a), (Object)anw_0.GRAY), n2).toString();
            }
        }
        aAD.d(channelHandlerContext);
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        aAD.d(channelHandlerContext);
    }

    adx_2(G0 g0) {
        this.a = g0;
    }
}

