/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.MessageToByteEncoder
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
package net;

import cc.novoline.invoke.ListInvoker;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.lang.reflect.InvocationTargetException;
import net.a4y_0;
import net.aAD;
import net.adu_2;
import net.afj_1;
import net.aio_1;
import net.awm_0;
import net.v__0;

/*
 * Renamed from net.xM
 */
public class xm_1 {
    public static String a = "via-decoder";
    public static String b = "via-encoder";

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\\/_\fPvhE\"[S\u000b\\/_\fQ}hE\"[S";
        int n2 = "\\/_\fPvhE\"[S\u000b\\/_\fQ}hE\"[S".length();
        int n3 = 11;
        int n4 = -1;
        while (true) {
            char[] cArray;
            block5: {
                int n5;
                char[] cArray2;
                int n6;
                int n7;
                block4: {
                    int n8 = ++n4;
                    char[] cArray3 = string.substring(n8, n8 + n3).toCharArray();
                    int n9 = cArray3.length;
                    n7 = 0;
                    n6 = 124;
                    cArray2 = cArray3;
                    n5 = n9;
                    if (n9 <= 1) break block4;
                    cArray = cArray2;
                    n5 = n5;
                    if (n5 <= n7) break block5;
                }
                do {
                    cArray2 = cArray2;
                    int n10 = n7;
                    int cfr_ignored_0 = n7 % 7;
                    cArray2[n10] = (char)(cArray2[n10] ^ (n6 ^ 0x56));
                    ++n7;
                    n6 = n6;
                    cArray = cArray2;
                    n5 = n5;
                } while (n5 > n7);
            }
            stringArray[n++] = new String(cArray).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                a = stringArray2[1];
                b = stringArray2[0];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws InvocationTargetException {
        aio_1.b();
        ChannelHandler channelHandler = a4y_0.b(aAD.b(channelHandlerContext), adu_2.a);
        ByteBuf byteBuf2 = channelHandler instanceof MessageToMessageDecoder ? (ByteBuf)ListInvoker.get(afj_1.a((MessageToMessageDecoder)channelHandler, channelHandlerContext, (Object)byteBuf), 0) : (ByteBuf)ListInvoker.get(afj_1.a((ByteToMessageDecoder)channelHandler, channelHandlerContext, (Object)byteBuf), 0);
        try {
            awm_0.a(awm_0.l(byteBuf), byteBuf2);
            ListInvoker.b(new ListInvoker[2]);
            return;
        }
        finally {
            awm_0.k(byteBuf2);
        }
    }

    public static void b(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
        aio_1.b();
        ByteBuf byteBuf2 = v__0.a(aAD.c(channelHandlerContext));
        try {
            afj_1.a((MessageToByteEncoder)a4y_0.b(aAD.b(channelHandlerContext), adu_2.b), channelHandlerContext, byteBuf, byteBuf2);
            awm_0.a(awm_0.l(byteBuf), byteBuf2);
        }
        finally {
            awm_0.k(byteBuf2);
        }
        if (ListInvoker.b() != null) {
            aio_1.b(false);
        }
    }
}

