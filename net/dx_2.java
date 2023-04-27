/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.channel.nio.NioEventLoopGroup
 */
package net;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.nio.NioEventLoopGroup;
import net.LazyLoadBase;
import net.agg_0;
import net.alz_0;

/*
 * Renamed from net.dx
 */
class dx_2
extends LazyLoadBase<NioEventLoopGroup> {
    @Override
    protected NioEventLoopGroup a() {
        return new NioEventLoopGroup(0, agg_0.a(agg_0.a(agg_0.a(new ThreadFactoryBuilder(), alz_0.a), true)));
    }

    dx_2() {
    }
}

