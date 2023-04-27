/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import com.google.common.base.Splitter;
import deobf.EnumConnectionState;
import deobf.NetworkManager;
import net.minecraft.network.packts.C00PacketServerQuery;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import net.ChatComponentText;
import org.apache.logging.log4j.Logger;

public class aX1 {
    private static Logger b = LogManagerInvoker.c();
    private List<NetworkManager> c = asg_0.c(my_0.c());
    private static Splitter a = amx_2.a(amx_2.a('\u0000'), 6);

    private void b(ServerData serverData) {
        aBx aBx2 = E8.a(serverData.k);
        aV5.a((Bootstrap)aV5.a((Bootstrap)aV5.a((Bootstrap)aV5.a(new Bootstrap(), (EventLoopGroup)ca_1.a(NetworkManager.e)), (ChannelHandler)new G0(this, aBx2, serverData)), NioSocketChannel.class), E8.a(aBx2), E8.b(aBx2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d() {
        List<NetworkManager> list = this.c;
        synchronized (list) {
            Iterator iterator = ListInvoker.iterator(this.c);
            while (dz_0.c(iterator)) {
                NetworkManager networkManager = (NetworkManager)((Object)dz_0.b(iterator));
                if (!NetworkManagerInvoker.d(networkManager)) continue;
                dz_0.a(iterator);
                NetworkManagerInvoker.a(networkManager, new ChatComponentText(awl_2.a));
            }
            return;
        }
    }

    static Logger b() {
        return b;
    }

    public void a(ServerData serverData) throws UnknownHostException {
        aBx aBx2 = E8.a(serverData.k);
        NetworkManager networkManager = NetworkManagerInvoker.a(akt_0.a(E8.a(aBx2)), E8.b(aBx2), false);
        ListInvoker.add(this.c, (Object)networkManager);
        serverData.e = awl_2.b;
        serverData.c = -1L;
        serverData.i = null;
        NetworkManagerInvoker.setNetHandler(networkManager, new aev_0(this, networkManager, serverData));
        try {
            NetworkManagerInvoker.sendPacket(networkManager, new aQ4(47, E8.a(aBx2), E8.b(aBx2), EnumConnectionState.STATUS));
            NetworkManagerInvoker.sendPacket(networkManager, new C00PacketServerQuery());
        }
        catch (Throwable throwable) {
            LoggerInvoker.a(b, throwable);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c() {
        List<NetworkManager> list = this.c;
        synchronized (list) {
            Iterator iterator = ListInvoker.iterator(this.c);
            while (dz_0.c(iterator)) {
                NetworkManager networkManager = (NetworkManager)((Object)dz_0.b(iterator));
                if (NetworkManagerInvoker.d(networkManager)) {
                    NetworkManagerInvoker.h(networkManager);
                    continue;
                }
                dz_0.a(iterator);
                NetworkManagerInvoker.a(networkManager);
            }
            return;
        }
    }

    static Splitter a() {
        return a;
    }

    static void a(aX1 aX12, ServerData serverData) {
        aX12.b(serverData);
    }
}

