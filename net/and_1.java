/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 */
package net;

import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.ServerInvoker;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import net.md_0;

/*
 * Renamed from net.anD
 */
class and_1
implements ChannelFutureListener {
    md_0 a;

    and_1(md_0 md_02) {
        this.a = md_02;
    }

    public void a(ChannelFuture channelFuture) throws Exception {
        NetworkManagerInvoker.a(this.a.d, ServerInvoker.s(md_0.a(this.a)));
    }
}

