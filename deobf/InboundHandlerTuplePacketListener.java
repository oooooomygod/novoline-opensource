/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
package deobf;

import deobf.Packet;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

class InboundHandlerTuplePacketListener {
    private Packet a;
    private GenericFutureListener<? extends Future<? super Void>>[] b;

    static GenericFutureListener[] b(InboundHandlerTuplePacketListener inboundHandlerTuplePacketListener) {
        return inboundHandlerTuplePacketListener.b;
    }

    static Packet a(InboundHandlerTuplePacketListener inboundHandlerTuplePacketListener) {
        return inboundHandlerTuplePacketListener.a;
    }

    @SafeVarargs
    public InboundHandlerTuplePacketListener(Packet packet, GenericFutureListener<? extends Future<? super Void>> ... genericFutureListenerArray) {
        this.a = packet;
        this.b = genericFutureListenerArray;
    }
}

