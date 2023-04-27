/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.channel.epoll.EpollEventLoopGroup
 */
package net;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.epoll.EpollEventLoopGroup;
import net.LazyLoadBase;
import net.agg_0;
import net.vf_2;

/*
 * Renamed from net.du
 */
class du_2
extends LazyLoadBase<EpollEventLoopGroup> {
    @Override
    protected EpollEventLoopGroup a() {
        return new EpollEventLoopGroup(0, agg_0.a(agg_0.a(agg_0.a(new ThreadFactoryBuilder(), vf_2.a), true)));
    }

    du_2() {
    }
}

