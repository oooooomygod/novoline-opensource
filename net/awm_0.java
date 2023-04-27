/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package net;

import io.netty.buffer.ByteBuf;
import java.nio.charset.Charset;

/*
 * Renamed from net.aWm
 */
public class awm_0 {
    public static int f(ByteBuf byteBuf) {
        return byteBuf.arrayOffset();
    }

    public static int g(ByteBuf byteBuf) {
        return byteBuf.readInt();
    }

    public static ByteBuf f(ByteBuf byteBuf, int n) {
        return byteBuf.writerIndex(n);
    }

    public static boolean d(ByteBuf byteBuf) {
        return byteBuf.isReadable();
    }

    public static ByteBuf c(ByteBuf byteBuf, int n) {
        return byteBuf.writeShort(n);
    }

    public static ByteBuf h(ByteBuf byteBuf) {
        return byteBuf.markReaderIndex();
    }

    public static short j(ByteBuf byteBuf) {
        return byteBuf.readShort();
    }

    public static ByteBuf e(ByteBuf byteBuf, int n) {
        return byteBuf.writeByte(n);
    }

    public static int e(ByteBuf byteBuf) {
        return byteBuf.readableBytes();
    }

    public static short a(ByteBuf byteBuf) {
        return byteBuf.readUnsignedByte();
    }

    public static ByteBuf a(ByteBuf byteBuf, ByteBuf byteBuf2) {
        return byteBuf.writeBytes(byteBuf2);
    }

    public static ByteBuf l(ByteBuf byteBuf) {
        return byteBuf.clear();
    }

    public static ByteBuf a(ByteBuf byteBuf, byte[] byArray, int n, int n2) {
        return byteBuf.writeBytes(byArray, n, n2);
    }

    public static byte m(ByteBuf byteBuf) {
        return byteBuf.readByte();
    }

    public static ByteBuf d(ByteBuf byteBuf, int n) {
        return byteBuf.writeChar(n);
    }

    public static ByteBuf b(ByteBuf byteBuf, int n) {
        return byteBuf.readBytes(n);
    }

    public static byte[] c(ByteBuf byteBuf) {
        return byteBuf.array();
    }

    public static ByteBuf b(ByteBuf byteBuf) {
        return byteBuf.resetReaderIndex();
    }

    public static int o(ByteBuf byteBuf) {
        return byteBuf.readerIndex();
    }

    public static ByteBuf b(ByteBuf byteBuf, byte[] byArray, int n, int n2) {
        return byteBuf.readBytes(byArray, n, n2);
    }

    public static String a(ByteBuf byteBuf, Charset charset) {
        return byteBuf.toString(charset);
    }

    public static ByteBuf a(ByteBuf byteBuf, byte[] byArray) {
        return byteBuf.readBytes(byArray);
    }

    public static int n(ByteBuf byteBuf) {
        return byteBuf.readUnsignedShort();
    }

    public static ByteBuf i(ByteBuf byteBuf) {
        return byteBuf.retain();
    }

    public static ByteBuf a(ByteBuf byteBuf, int n) {
        return byteBuf.writeInt(n);
    }

    public static boolean k(ByteBuf byteBuf) {
        return byteBuf.release();
    }
}

