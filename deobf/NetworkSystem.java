/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.ServerBootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.epoll.EpollEventLoopGroup
 *  io.netty.channel.epoll.EpollServerSocketChannel
 *  io.netty.channel.local.LocalAddress
 *  io.netty.channel.local.LocalEventLoopGroup
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioServerSocketChannel
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.Logger
 */
package deobf;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.ServerInvoker;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import net.minecraft.network.packts.S40PacketDisconnect;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Iterator;
import java.util.List;
import net.ChatComponentText;
import net.CrashReport;
import net.LazyLoadBase;
import net.M9;
import net.VL;
import net.X0;
import net.aF5;
import net.aL0;
import net.aXS;
import net.adz_1;
import net.asg_0;
import net.ca_1;
import net.d7_0;
import net.dq_0;
import net.dx_2;
import net.dz_0;
import net.my_0;
import net.qq_1;
import org.apache.logging.log4j.Logger;

public class NetworkSystem {
    private List<ChannelFuture> a = asg_0.c(my_0.c());
    public static LazyLoadBase<NioEventLoopGroup> b;
    public static LazyLoadBase<EpollEventLoopGroup> f;
    private static Logger g;
    private List<NetworkManager> d = asg_0.c(my_0.c());
    public volatile boolean c;
    public static LazyLoadBase<LocalEventLoopGroup> e;
    private MinecraftServer h;

    public NetworkSystem(MinecraftServer minecraftServer) {
        this.h = minecraftServer;
        this.c = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public SocketAddress d() {
        List<ChannelFuture> list = this.a;
        synchronized (list) {
            ChannelFuture channelFuture = M9.d(qq_1.a((ServerBootstrap)qq_1.a(qq_1.a(qq_1.a((ServerBootstrap)qq_1.a(new ServerBootstrap(), LocalServerChannel.class), (ChannelHandler)new adz_1(this)), (EventLoopGroup)ca_1.a(b)), (SocketAddress)LocalAddress.ANY)));
            ListInvoker.add(this.a, channelFuture);
            return aF5.d(M9.a(channelFuture));
        }
    }

    public MinecraftServer a() {
        return this.h;
    }

    private static void lambda$networkTick$0(NetworkManager networkManager, ChatComponentText chatComponentText, Future future) throws Exception {
        NetworkManagerInvoker.a(networkManager, chatComponentText);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(InetAddress inetAddress, int n) throws IOException {
        List<ChannelFuture> list = this.a;
        synchronized (list) {
            LazyLoadBase<NioEventLoopGroup> lazyLoadBase;
            Class<NioServerSocketChannel> clazz;
            if (X0.c() && ServerInvoker.b(this.h)) {
                clazz = EpollServerSocketChannel.class;
                lazyLoadBase = f;
                LoggerInvoker.info(g, VL.b);
            } else {
                clazz = NioServerSocketChannel.class;
                lazyLoadBase = b;
                LoggerInvoker.info(g, VL.d);
            }
            ListInvoker.add(this.a, M9.d(qq_1.a((ServerBootstrap)qq_1.a(qq_1.a(qq_1.a((ServerBootstrap)qq_1.a(new ServerBootstrap(), clazz), (ChannelHandler)new aXS(this)), (EventLoopGroup)ca_1.a(lazyLoadBase)), inetAddress, n))));
            return;
        }
    }

    static {
        g = LogManagerInvoker.c();
        b = new dx_2();
        f = new d7_0();
        e = new dq_0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        List<NetworkManager> list = this.d;
        synchronized (list) {
            Iterator iterator = ListInvoker.iterator(this.d);
            while (dz_0.c(iterator)) {
                NetworkManager networkManager = (NetworkManager)((Object)dz_0.b(iterator));
                if (NetworkManagerInvoker.c(networkManager)) continue;
                if (!NetworkManagerInvoker.d(networkManager)) {
                    dz_0.a(iterator);
                    NetworkManagerInvoker.a(networkManager);
                    continue;
                }
                try {
                    NetworkManagerInvoker.h(networkManager);
                }
                catch (Exception exception) {
                    Object object;
                    if (NetworkManagerInvoker.g(networkManager)) {
                        object = CrashInvoker.makeCrashReport(exception, VL.a);
                        CrashReportCategory crashReportCategory = CrashInvoker.a((CrashReport)object, VL.g);
                        CrashReportCategoryInvoker.a(crashReportCategory, VL.e, () -> networkManager.toString());
                        throw new ReportedException((CrashReport)object);
                    }
                    LoggerInvoker.b(g, aL0.a(aL0.a(new StringBuilder(), VL.c), NetworkManagerInvoker.b(networkManager)).toString(), exception);
                    object = new ChatComponentText(VL.h);
                    NetworkManagerInvoker.a(networkManager, new S40PacketDisconnect((IChatComponent)object), arg_0 -> NetworkSystem.lambda$networkTick$0(networkManager, (ChatComponentText)object, arg_0), new GenericFutureListener[0]);
                    NetworkManagerInvoker.e(networkManager);
                    continue;
                }
                break;
            }
            return;
        }
    }

    static MinecraftServer a(NetworkSystem networkSystem) {
        return networkSystem.h;
    }

    static List b(NetworkSystem networkSystem) {
        return networkSystem.d;
    }

    public void c() {
        this.c = false;
        Iterator iterator = ListInvoker.iterator(this.a);
        while (dz_0.c(iterator)) {
            ChannelFuture channelFuture = (ChannelFuture)dz_0.b(iterator);
            try {
                M9.b(aF5.g(M9.a(channelFuture)));
            }
            catch (InterruptedException interruptedException) {
                LoggerInvoker.f(g, VL.f);
            }
        }
    }
}

