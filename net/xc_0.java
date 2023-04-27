/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.connection.UserConnectionImpl
 *  com.viaversion.viaversion.protocol.ProtocolPipelineImpl
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.socket.SocketChannel
 *  io.netty.handler.timeout.ReadTimeoutHandler
 */
package net;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.connection.UserConnectionImpl;
import com.viaversion.viaversion.protocol.ProtocolPipelineImpl;
import deobf.NetworkManager;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import deobf.EnumPacketDirection;

/*
 * Renamed from net.xC
 */
class xc_0
extends ChannelInitializer<Channel> {
    NetworkManager a;

    private static ChannelException a(ChannelException channelException) {
        return channelException;
    }

    protected void initChannel(Channel channel) {
        try {
            ui_2.a(aF5.h(channel), ChannelOption.TCP_NODELAY, Boolean.TRUE);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        a4y_0.a(a4y_0.a(a4y_0.a(a4y_0.a(a4y_0.a(a4y_0.a(aF5.c(channel), ok_0.i, (ChannelHandler)new ReadTimeoutHandler(30)), ok_0.f, (ChannelHandler)new aIF()), ok_0.c, (ChannelHandler)new FQ(EnumPacketDirection.CLIENTBOUND)), ok_0.h, (ChannelHandler)new DM()), ok_0.j, (ChannelHandler)new Kc(EnumPacketDirection.SERVERBOUND)), ok_0.a, (ChannelHandler)this.a);
        if (channel instanceof SocketChannel && fo_0.a(fo_0.a()) != 47) {
            UserConnectionImpl userConnectionImpl = new UserConnectionImpl(channel, true);
            new ProtocolPipelineImpl((UserConnection)userConnectionImpl);
            a4y_0.a(a4y_0.a(aF5.c(channel), ok_0.e, ok_0.b, (ChannelHandler)new aio_1((UserConnection)userConnectionImpl)), ok_0.d, ok_0.g, (ChannelHandler)new ry_0((UserConnection)userConnectionImpl));
        }
    }

    xc_0(NetworkManager networkManager) {
        this.a = networkManager;
    }
}

