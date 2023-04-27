/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.util.PipelineUtil
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.MessageToByteEncoder
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
package net;

import com.viaversion.viaversion.util.PipelineUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;

/*
 * Renamed from net.afJ
 */
public class afj_1 {
    private static String[] b;

    static {
        if (afj_1.b() != null) {
            afj_1.b(new String[4]);
        }
    }

    public static void a(MessageToByteEncoder messageToByteEncoder, ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        PipelineUtil.callEncode((MessageToByteEncoder)messageToByteEncoder, (ChannelHandlerContext)channelHandlerContext, (Object)object, (ByteBuf)byteBuf);
    }

    public static String[] b() {
        return b;
    }

    public static List a(ByteToMessageDecoder byteToMessageDecoder, ChannelHandlerContext channelHandlerContext, Object object) {
        return PipelineUtil.callDecode((ByteToMessageDecoder)byteToMessageDecoder, (ChannelHandlerContext)channelHandlerContext, (Object)object);
    }

    public static boolean a(Throwable throwable, Class clazz) {
        return PipelineUtil.containsCause((Throwable)throwable, (Class)clazz);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static List a(MessageToMessageDecoder messageToMessageDecoder, ChannelHandlerContext channelHandlerContext, Object object) {
        return PipelineUtil.callDecode((MessageToMessageDecoder)messageToMessageDecoder, (ChannelHandlerContext)channelHandlerContext, (Object)object);
    }
}

