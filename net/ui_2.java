/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelConfig
 *  io.netty.channel.ChannelOption
 */
package net;

import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelOption;

/*
 * Renamed from net.ui
 */
public class ui_2 {
    public static ChannelConfig a(ChannelConfig channelConfig, boolean bl) {
        return channelConfig.setAutoRead(bl);
    }

    public static boolean a(ChannelConfig channelConfig, ChannelOption channelOption, Object object) {
        return channelConfig.setOption(channelOption, object);
    }
}

