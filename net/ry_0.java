/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.exception.CancelCodecException
 *  com.viaversion.viaversion.exception.CancelDecoderException
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.exception.CancelCodecException;
import com.viaversion.viaversion.exception.CancelDecoderException;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import net.SG;
import net.a4y_0;
import net.aAD;
import net.aX2;
import net.afj_1;
import net.aio_1;
import net.awm_0;
import net.eh_1;
import net.v__0;
import net.zg_1;

/*
 * Renamed from net.rY
 */
@ChannelHandler.Sharable
public class ry_0
extends MessageToMessageDecoder<ByteBuf> {
    private boolean a;
    private boolean b;
    private UserConnection c;

    private boolean a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws InvocationTargetException {
        aio_1.b();
        if (this.b) {
            return false;
        }
        int n = ListInvoker.indexOf(a4y_0.b(aAD.b(channelHandlerContext)), SG.a);
        if (n == -1) {
            return false;
        }
        this.b = true;
        if (n > ListInvoker.indexOf(a4y_0.b(aAD.b(channelHandlerContext)), SG.h)) {
            eh_1.b(channelHandlerContext, byteBuf);
            ChannelHandler channelHandler = a4y_0.b(aAD.b(channelHandlerContext), SG.g);
            ChannelHandler channelHandler2 = a4y_0.b(aAD.b(channelHandlerContext), SG.c);
            a4y_0.a(aAD.b(channelHandlerContext), channelHandler);
            a4y_0.a(aAD.b(channelHandlerContext), channelHandler2);
            a4y_0.b(aAD.b(channelHandlerContext), SG.f, SG.b, channelHandler);
            a4y_0.b(aAD.b(channelHandlerContext), SG.d, SG.e, channelHandler2);
            return true;
        }
        return false;
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        aio_1.a();
        if (afj_1.a(throwable, CancelCodecException.class)) {
            return;
        }
        super.exceptionCaught(channelHandlerContext, throwable);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public ry_0(UserConnection userConnection) {
        this.c = userConnection;
    }

    public UserConnection a() {
        return this.c;
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        aio_1.a();
        if (this.a) {
            this.a = false;
            ListInvoker.add(list, awm_0.i(byteBuf));
            return;
        }
        if (!aX2.b(this.c)) {
            throw zg_1.a(null);
        }
        if (!aX2.c(this.c)) {
            ListInvoker.add(list, awm_0.i(byteBuf));
            return;
        }
        ByteBuf byteBuf2 = awm_0.a(v__0.a(aAD.c(channelHandlerContext)), byteBuf);
        try {
            boolean bl = this.a(channelHandlerContext, byteBuf2);
            aX2.b(this.c, byteBuf2, CancelDecoderException::generate);
            if (bl) {
                eh_1.a(channelHandlerContext, byteBuf2);
                this.a = true;
            }
            ListInvoker.add(list, awm_0.i(byteBuf2));
            return;
        }
        finally {
            awm_0.k(byteBuf2);
        }
    }
}

