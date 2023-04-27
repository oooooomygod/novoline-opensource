/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 */
package net;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import net.aAD;
import net.awm_0;
import net.v__0;
import net.yr_1;

/*
 * Renamed from net.a5x
 */
public class a5x_0 {
    private byte[] b = new byte[0];
    private Cipher a;
    private byte[] c = new byte[0];

    protected a5x_0(Cipher cipher) {
        this.a = cipher;
    }

    private byte[] a(ByteBuf byteBuf) {
        int n = awm_0.e(byteBuf);
        if (this.b.length < n) {
            this.b = new byte[n];
        }
        awm_0.b(byteBuf, this.b, 0, n);
        return this.b;
    }

    protected void a(ByteBuf byteBuf, ByteBuf byteBuf2) throws ShortBufferException {
        int n = awm_0.e(byteBuf);
        byte[] byArray = this.a(byteBuf);
        int n2 = yr_1.a(this.a, n);
        if (this.c.length < n2) {
            this.c = new byte[n2];
        }
        awm_0.a(byteBuf2, this.c, 0, yr_1.a(this.a, byArray, 0, n, this.c));
    }

    protected ByteBuf a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws ShortBufferException {
        int n = awm_0.e(byteBuf);
        byte[] byArray = this.a(byteBuf);
        ByteBuf byteBuf2 = v__0.a(aAD.c(channelHandlerContext), yr_1.a(this.a, n));
        awm_0.f(byteBuf2, yr_1.a(this.a, byArray, 0, n, awm_0.c(byteBuf2), awm_0.f(byteBuf2)));
        return byteBuf2;
    }

    private static ShortBufferException a(ShortBufferException shortBufferException) {
        return shortBufferException;
    }
}

