/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
package net;

import cc.novoline.invoke.PacketBufferInvoker;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;
import net.PacketBuffer;
import net.a1x;
import net.awm_0;

/*
 * Renamed from net.wV
 */
public class wv_1
extends MessageToByteEncoder<ByteBuf> {
    private Deflater a;
    private byte[] c = new byte[8192];
    private int b;

    public void a(int n) {
        this.b = n;
    }

    public wv_1(int n) {
        this.b = n;
        this.a = new Deflater();
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        int n = awm_0.e(byteBuf);
        PacketBuffer packetBuffer = new PacketBuffer(byteBuf2);
        if (n < this.b) {
            PacketBufferInvoker.b(packetBuffer, 0);
            PacketBufferInvoker.a(packetBuffer, byteBuf);
        } else {
            byte[] byArray = new byte[n];
            awm_0.a(byteBuf, byArray);
            PacketBufferInvoker.b(packetBuffer, byArray.length);
            a1x.a(this.a, byArray, 0, n);
            a1x.b(this.a);
            while (!a1x.c(this.a)) {
                int n2 = a1x.a(this.a, this.c);
                PacketBufferInvoker.a(packetBuffer, this.c, 0, n2);
            }
            a1x.a(this.a);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

