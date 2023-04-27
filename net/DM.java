/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.invoke.PacketBufferInvoker;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import net.PacketBuffer;
import net.aL0;
import net.aWC;
import net.awm_0;
import org.jetbrains.annotations.NotNull;

public class DM
extends MessageToByteEncoder<ByteBuf> {
    protected void a(@NotNull ChannelHandlerContext channelHandlerContext, @NotNull ByteBuf byteBuf, @NotNull ByteBuf byteBuf2) throws Exception {
        int n = awm_0.e(byteBuf);
        int n2 = PacketBufferInvoker.a(n);
        if (n2 > 3) {
            throw new IllegalArgumentException(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), aWC.b), n), aWC.a), 3).toString());
        }
        PacketBuffer packetBuffer = new PacketBuffer(byteBuf2);
        PacketBufferInvoker.f(packetBuffer, n2 + n);
        PacketBufferInvoker.b(packetBuffer, n);
        PacketBufferInvoker.a(packetBuffer, byteBuf, awm_0.o(byteBuf), n);
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

