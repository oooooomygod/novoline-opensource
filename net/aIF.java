/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import net.FH;
import net.PacketBuffer;
import net.awm_0;

public class aIF
extends ByteToMessageDecoder {
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        awm_0.h(byteBuf);
        byte[] byArray = new byte[3];
        int n = 0;
        int cfr_ignored_0 = byArray.length;
        if (!awm_0.d(byteBuf)) {
            awm_0.b(byteBuf);
            return;
        }
        byArray[n] = awm_0.m(byteBuf);
        byte cfr_ignored_1 = byArray[n];
        PacketBuffer packetBuffer = new PacketBuffer(FH.a(byArray));
        try {
            int n2 = PacketBufferInvoker.b(packetBuffer);
            if (awm_0.e(byteBuf) >= n2) {
                ListInvoker.add(list, awm_0.b(byteBuf, n2));
                return;
            }
            awm_0.b(byteBuf);
            return;
        }
        finally {
            PacketBufferInvoker.t(packetBuffer);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

