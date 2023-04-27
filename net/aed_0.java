/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
package net;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import net.a5x_0;

/*
 * Renamed from net.aEd
 */
public class aed_0
extends MessageToByteEncoder<ByteBuf> {
    private a5x_0 a;

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws ShortBufferException, Exception {
        this.a.a(byteBuf, byteBuf2);
    }

    public aed_0(Cipher cipher) {
        this.a = new a5x_0(cipher);
    }
}

