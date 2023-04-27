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
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import net.PacketBuffer;
import net.awm_0;

/*
 * Renamed from net.apT
 */
public class apt_1
extends ByteToMessageDecoder {
    private int a;
    private Inflater b;

    public apt_1(int n) {
        this.a = n;
        this.b = new Inflater();
    }

    public void a(int n) {
        this.a = n;
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws DataFormatException, Exception {
        if (awm_0.e(byteBuf) != 0) {
            PacketBuffer packetBuffer = new PacketBuffer(byteBuf);
            PacketBufferInvoker.b(packetBuffer);
            ListInvoker.add(list, PacketBufferInvoker.a(packetBuffer, PacketBufferInvoker.f(packetBuffer)));
        }
    }

    private static DataFormatException a(DataFormatException dataFormatException) {
        return dataFormatException;
    }
}

