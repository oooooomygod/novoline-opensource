/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.handler.codec.base64.Base64
 */
package net;

import cc.novoline.invoke.ListInvoker;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.base64.Base64;

public class aQ7 {
    private static ListInvoker[] b;

    public static ListInvoker[] b() {
        return b;
    }

    public static ByteBuf a(ByteBuf byteBuf) {
        return Base64.decode((ByteBuf)byteBuf);
    }

    public static ByteBuf b(ByteBuf byteBuf) {
        return Base64.encode((ByteBuf)byteBuf);
    }

    static {
        if (aQ7.b() == null) {
            aQ7.b(new ListInvoker[2]);
        }
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }
}

