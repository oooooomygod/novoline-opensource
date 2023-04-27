/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import deobf.EnumConnectionState;
import deobf.NetworkManager;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import deobf.EnumPacketDirection;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.jetbrains.annotations.NotNull;

public class FQ
extends ByteToMessageDecoder {
    private static Logger c = LogManagerInvoker.c();
    private EnumPacketDirection a;
    private static Marker b = aSV.a(ej_1.e, NetworkManager.i);

    private static Exception a(Exception exception) {
        return exception;
    }

    protected void decode(@NotNull ChannelHandlerContext channelHandlerContext, @NotNull ByteBuf byteBuf, @NotNull List<Object> list) throws Exception {
        if (awm_0.e(byteBuf) != 0) {
            PacketBuffer packetBuffer = new PacketBuffer(byteBuf);
            int n = PacketBufferInvoker.b(packetBuffer);
            aK3.a((EnumConnectionState)((Object)a8E.a(aF5.a(aAD.a(channelHandlerContext), NetworkManager.l))), this.a, n);
            throw new IOException(aL0.c(aL0.a(new StringBuilder(), ej_1.g), n).toString());
        }
    }

    public FQ(EnumPacketDirection enumPacketDirection) {
        this.a = enumPacketDirection;
    }
}

