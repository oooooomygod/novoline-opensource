/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 */
package net;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;

/*
 * Renamed from net.v_
 */
public class v__0 {
    public static ByteBuf a(ByteBufAllocator byteBufAllocator, int n) {
        return byteBufAllocator.heapBuffer(n);
    }

    public static ByteBuf a(ByteBufAllocator byteBufAllocator) {
        return byteBufAllocator.buffer();
    }
}

