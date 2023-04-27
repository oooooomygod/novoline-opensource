/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net;

import cc.novoline.invoke.NetworkManagerInvoker;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import net.ChatComponentText;
import net.NetHandlerPlayServer;

class G
implements GenericFutureListener<Future<? super Void>> {
    ChatComponentText b;
    NetHandlerPlayServer a;

    public void operationComplete(Future<? super Void> future) throws Exception {
        NetworkManagerInvoker.a(this.a.netManager, this.b);
    }

    G(NetHandlerPlayServer netHandlerPlayServer, ChatComponentText chatComponentText) {
        this.a = netHandlerPlayServer;
        this.b = chatComponentText;
    }
}

