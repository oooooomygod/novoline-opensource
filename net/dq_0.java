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
import net.anv_2;

/*
 * Renamed from net.dQ
 */
class dq_0
extends LazyLoadBase<LocalEventLoopGroup> {
    dq_0() {
    }

    @Override
    protected LocalEventLoopGroup a() {
        return new LocalEventLoopGroup(0, agg_0.a(agg_0.a(agg_0.a(new ThreadFactoryBuilder(), anv_2.a), true)));
    }
}

