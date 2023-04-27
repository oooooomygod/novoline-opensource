/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 */
package net;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.nio.charset.Charset;

public class FH {
    private static boolean b;

    public static boolean c() {
        FH.b();
        return true;
    }

    public static ByteBuf a(ByteBuf byteBuf) {
        return Unpooled.wrappedBuffer((ByteBuf)byteBuf);
    }

    public static boolean b() {
        return b;
    }

    public static ByteBuf a(byte[] byArray) {
        return Unpooled.wrappedBuffer((byte[])byArray);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static ByteBuf a(CharSequence charSequence, Charset charset) {
        return Unpooled.copiedBuffer((CharSequence)charSequence, (Charset)charset);
    }

    public static ByteBuf d() {
        return Unpooled.buffer();
    }

    static {
        if (!FH.c()) {
            FH.b(true);
        }
    }
}

