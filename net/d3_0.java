/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.channel.local.LocalEventLoopGroup
 */
package net;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.local.LocalEventLoopGroup;
import net.LazyLoadBase;
import net.agg_0;
import net.wz_2;

/*
 * Renamed from net.d3
 */
class d3_0
extends LazyLoadBase<LocalEventLoopGroup> {
    d3_0() {
    }

    @Override
    protected LocalEventLoopGroup a() {
        return new LocalEventLoopGroup(0, agg_0.a(agg_0.a(agg_0.a(new ThreadFactoryBuilder(), wz_2.a), true)));
    }
}

