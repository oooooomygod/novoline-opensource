/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
package net;

import cc.novoline.invoke.ListInvoker;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import net.a5x_0;

public class NN
extends MessageToMessageDecoder<ByteBuf> {
    private a5x_0 a;

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws ShortBufferException, Exception {
        ListInvoker.add(list, this.a.a(channelHandlerContext, byteBuf));
    }

    public NN(Cipher cipher) {
        this.a = new a5x_0(cipher);
    }
}

