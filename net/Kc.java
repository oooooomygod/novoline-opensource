/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import deobf.EnumConnectionState;
import deobf.NetworkManager;
import deobf.Packet;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import deobf.EnumPacketDirection;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Kc
extends MessageToByteEncoder<Packet> {
    private static Logger b = LogManagerInvoker.c();
    private static Marker c = aSV.a(OT.c, NetworkManager.i);
    private EnumPacketDirection a;

    @Contract(pure=true)
    public Kc(@NotNull EnumPacketDirection enumPacketDirection) {
        this.a = enumPacketDirection;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    protected void a(@NotNull ChannelHandlerContext channelHandlerContext, @NotNull Packet packet, @NotNull ByteBuf byteBuf) throws Exception {
        EnumConnectionState enumConnectionState = (EnumConnectionState)((Object)a8E.a(aF5.a(aAD.a(channelHandlerContext), NetworkManager.l)));
        Integer n = aK3.a(enumConnectionState, this.a, packet);
        if (LoggerInvoker.a(b)) {
            LoggerInvoker.d(b, c, OT.a, new Object[]{enumConnectionState, n, ara_2.b(packet.getClass())});
        }
        throw new IOException(OT.b);
    }
}

