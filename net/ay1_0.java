/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelPipeline
 */
package net;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelPipeline;
import net.W8;
import net.a4y_0;
import net.mj_0;

/*
 * Renamed from net.ay1
 */
public class ay1_0 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static ChannelPipeline a(ChannelPipeline channelPipeline, String string, String string2, ChannelHandler channelHandler) {
        W8.b();
        String string3 = string;
        int n = -1;
        switch (string3.hashCode()) {
            case 1542433860: {
                if (!string3.equals(mj_0.e)) return a4y_0.a(channelPipeline, string, string2, channelHandler);
                n = 0;
            }
            case -1607367396: {
                if (!string3.equals(mj_0.a)) return a4y_0.a(channelPipeline, string, string2, channelHandler);
                return a4y_0.a(channelPipeline, string, string2, channelHandler);
            }
        }
        return a4y_0.a(channelPipeline, string, string2, channelHandler);
    }
}

