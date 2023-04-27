/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.exception.CancelCodecException
 *  com.viaversion.viaversion.exception.CancelEncoderException
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageEncoder
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.exception.CancelCodecException;
import com.viaversion.viaversion.exception.CancelEncoderException;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import net.a4y_0;
import net.aAD;
import net.aC5;
import net.aX2;
import net.afj_1;
import net.awm_0;
import net.ax7_0;
import net.eh_1;
import net.v__0;

/*
 * Renamed from net.aiO
 */
@ChannelHandler.Sharable
public class aio_1
extends MessageToMessageEncoder<ByteBuf> {
    private UserConnection b;
    private boolean a;
    private static boolean c;

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        aio_1.a();
        if (!aX2.a(this.b)) {
            throw aC5.a(null);
        }
        if (!aX2.c(this.b)) {
            ListInvoker.add(list, awm_0.i(byteBuf));
            return;
        }
        ByteBuf byteBuf2 = awm_0.a(v__0.a(aAD.c(channelHandlerContext)), byteBuf);
        try {
            boolean bl = this.a(channelHandlerContext, byteBuf2);
            aX2.a(this.b, byteBuf2, CancelEncoderException::generate);
            if (bl) {
                eh_1.a(channelHandlerContext, byteBuf2);
            }
            ListInvoker.add(list, awm_0.i(byteBuf2));
            return;
        }
        finally {
            awm_0.k(byteBuf2);
        }
    }

    static {
        if (aio_1.b()) {
            aio_1.b(true);
        }
    }

    private boolean a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws InvocationTargetException {
        aio_1.a();
        if (this.a) {
            return false;
        }
        int n = ListInvoker.indexOf(a4y_0.b(aAD.b(channelHandlerContext)), ax7_0.h);
        if (n == -1) {
            return false;
        }
        this.a = true;
        if (n > ListInvoker.indexOf(a4y_0.b(aAD.b(channelHandlerContext)), ax7_0.b)) {
            eh_1.b(channelHandlerContext, byteBuf);
            ChannelHandler channelHandler = a4y_0.b(aAD.b(channelHandlerContext), ax7_0.a);
            ChannelHandler channelHandler2 = a4y_0.b(aAD.b(channelHandlerContext), ax7_0.f);
            a4y_0.a(aAD.b(channelHandlerContext), channelHandler);
            a4y_0.a(aAD.b(channelHandlerContext), channelHandler2);
            a4y_0.b(aAD.b(channelHandlerContext), ax7_0.d, ax7_0.e, channelHandler);
            a4y_0.b(aAD.b(channelHandlerContext), ax7_0.c, ax7_0.g, channelHandler2);
            return true;
        }
        return false;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static boolean b() {
        return c;
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        aio_1.b();
        if (afj_1.a(throwable, CancelCodecException.class)) {
            return;
        }
        super.exceptionCaught(channelHandlerContext, throwable);
    }

    public aio_1(UserConnection userConnection) {
        this.b = userConnection;
    }

    public static void b(boolean bl) {
        c = bl;
    }

    public static boolean a() {
        aio_1.b();
        return true;
    }
}

