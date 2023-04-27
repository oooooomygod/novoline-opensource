/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.channel.epoll.EpollEventLoopGroup
 *  io.netty.channel.epoll.EpollSocketChannel
 *  io.netty.channel.local.LocalChannel
 *  io.netty.channel.local.LocalEventLoopGroup
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.handler.timeout.TimeoutException
 *  io.netty.util.AttributeKey
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 */
package deobf;

import cc.novoline.events.State;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.FutureTaskInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.StringInvoker;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Queue;
import javax.crypto.SecretKey;
import net.Ca;
import net.ChatComponentText;
import net.LazyLoadBase;
import net.M9;
import net.NN;
import net.INetHandler;
import net.X0;
import net.a0g_0;
import net.a4y_0;
import net.a8E;
import net.a9y_0;
import net.aAD;
import net.aF5;
import net.aK3;
import net.aL0;
import net.aSV;
import net.aV5;
import net.aXV;
import net.aZE;
import net.aed_0;
import net.ag4_0;
import net.aoe_2;
import net.aoz_1;
import net.apt_1;
import net.apv_2;
import net.aqk_0;
import net.ard_0;
import net.avc_0;
import net.ca_1;
import net.d3_0;
import net.d_0;
import net.dr_2;
import net.du_2;
import net.er_0;
import net.kG;
import net.om_1;
import net.rk_1;
import net.si_1;
import net.ui_2;
import net.wv_1;
import net.xc_0;
import net.yt_1;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

public class NetworkManager
extends SimpleChannelInboundHandler<Packet> {
    private boolean h;
    public static Marker f;
    private static Logger c;
    public static LazyLoadBase<LocalEventLoopGroup> j;
    public static LazyLoadBase<NioEventLoopGroup> e;
    public static LazyLoadBase<EpollEventLoopGroup> k;
    private java.util.concurrent.locks.ReentrantReadWriteLock d;
    public static AttributeKey<EnumConnectionState> l;
    public static Marker i;
    private EnumPacketDirection direction;
    private IChatComponent b;
    private boolean m;
    private SocketAddress g;
    private Queue<InboundHandlerTuplePacketListener> a = ard_0.b();
    private Channel n;
    private INetHandler o;

    public void a(int n) {
        if (a4y_0.b(aF5.c(this.n), aZE.l) instanceof apt_1) {
            aXV.a((apt_1)a4y_0.b(aF5.c(this.n), aZE.C), n);
        } else {
            om_1.a(aF5.c(this.n), aZE.d, aZE.A, (ChannelHandler)new apt_1(n));
        }
        if (a4y_0.b(aF5.c(this.n), aZE.t) instanceof wv_1) {
            kG.a((wv_1)a4y_0.b(aF5.c(this.n), aZE.k), n);
        } else {
            om_1.a(aF5.c(this.n), aZE.p, aZE.r, (ChannelHandler)new wv_1(n));
        }
    }

    private void a(Packet packet, GenericFutureListener<? extends Future<? super Void>>[] genericFutureListenerArray) {
        EnumConnectionState enumConnectionState = aK3.a(packet);
        EnumConnectionState enumConnectionState2 = (EnumConnectionState)((Object)a8E.a(aF5.a(this.n, l)));
        if (enumConnectionState2 != enumConnectionState) {
            LoggerInvoker.b(c, aZE.x);
            ui_2.a(aF5.h(this.n), false);
        }
        if (er_0.a(aF5.e(this.n))) {
            if (enumConnectionState != enumConnectionState2) {
                this.a(enumConnectionState);
            }
            ChannelFuture channelFuture = aF5.a(this.n, packet);
            M9.a(channelFuture, genericFutureListenerArray);
            M9.a(channelFuture, (GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
        } else {
            er_0.b(aF5.e(this.n), () -> this.lambda$dispatchPacket$0(enumConnectionState, enumConnectionState2, packet, genericFutureListenerArray));
        }
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) {
        this.a(new aoz_1(aZE.m, new Object[0]));
    }

    public IChatComponent e() {
        return this.b;
    }

    public void a(SecretKey secretKey) {
        this.m = true;
        a4y_0.a(aF5.c(this.n), aZE.n, aZE.a, (ChannelHandler)new NN(rk_1.a(2, secretKey)));
        a4y_0.a(aF5.c(this.n), aZE.g, aZE.e, (ChannelHandler)new aed_0(rk_1.a(1, secretKey)));
    }

    protected void a(ChannelHandlerContext channelHandlerContext, Packet packet) {
        if (!StringInvoker.c(DisplayInvoker.b(), aZE.s)) {
            return;
        }
        PacketEvent packetEvent = new PacketEvent(packet, State.INCOMING);
        EventManagerInvoker.call(packetEvent);
        if (PacketEventInvoker.a(packetEvent)) {
            return;
        }
        if (aF5.a(this.n)) {
            try {
                si_1.a(packet, this.o);
            }
            catch (yt_1 yt_12) {}
        }
    }

    @SafeVarargs
    public void a(Packet packet, GenericFutureListener<? extends Future<? super Void>> genericFutureListener, GenericFutureListener<? extends Future<? super Void>> ... genericFutureListenerArray) {
        if (this.d()) {
            this.a();
            this.a(packet, (GenericFutureListener[])aoe_2.a((Object[])genericFutureListenerArray, 0, genericFutureListener));
        } else {
            aqk_0.b(a0g_0.a(this.d));
            try {
                FutureTaskInvoker.a(this.a, new InboundHandlerTuplePacketListener(packet, (GenericFutureListener[])aoe_2.a((Object[])genericFutureListenerArray, 0, genericFutureListener)));
            }
            finally {
                aqk_0.a(a0g_0.a(this.d));
            }
        }
    }

    public INetHandler k() {
        return this.o;
    }

    public boolean f() {
        return this.n == null;
    }

    public void a(INetHandler INetHandler) {
        ag4_0.a(INetHandler, aZE.q, new Object[0]);
        LoggerInvoker.a(c, aZE.h, new Object[]{this, INetHandler});
        this.o = INetHandler;
    }

    public boolean i() {
        return this.m;
    }

    public void a(EnumConnectionState enumConnectionState) {
        a8E.a(aF5.a(this.n, l), (Object)enumConnectionState);
        ui_2.a(aF5.h(this.n), true);
        LoggerInvoker.b(c, aZE.u);
    }

    public boolean g() {
        return this.n instanceof LocalChannel || this.n instanceof LocalServerChannel;
    }

    public NetworkManager(EnumPacketDirection enumPacketDirection) {
        this.d = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.direction = enumPacketDirection;
    }

    public SocketAddress j() {
        return this.g;
    }

    public void c() {
        if (this.n != null && !aF5.a(this.n)) {
            if (!this.h) {
                this.h = true;
                if (this.e() != null) {
                    Ca.a(this.k(), this.e());
                } else if (this.k() != null) {
                    Ca.a(this.k(), new ChatComponentText(aZE.D));
                }
            } else {
                LoggerInvoker.warn(c, aZE.b);
            }
        }
    }

    public void b() {
        this.a();
        if (this.o instanceof ITickable) {
            a9y_0.a((ITickable)((Object)this.o));
        }
        aF5.b(this.n);
    }

    public static NetworkManager a(SocketAddress socketAddress) {
        NetworkManager networkManager = new NetworkManager(EnumPacketDirection.CLIENTBOUND);
        M9.d(aV5.a((Bootstrap)aV5.a((Bootstrap)aV5.a((Bootstrap)aV5.a(new Bootstrap(), (EventLoopGroup)ca_1.a(j)), (ChannelHandler)new avc_0(networkManager)), LocalChannel.class), socketAddress));
        return networkManager;
    }

    public void b(Packet packet) {
        if (this.d()) {
            this.a();
            this.a(packet, null);
        } else {
            aqk_0.b(a0g_0.a(this.d));
            try {
                FutureTaskInvoker.a(this.a, new InboundHandlerTuplePacketListener(packet, null));
            }
            finally {
                aqk_0.a(a0g_0.a(this.d));
            }
        }
    }

    public static NetworkManager a(InetAddress inetAddress, int n, boolean bl) {
        LazyLoadBase<EpollEventLoopGroup> lazyLoadBase;
        Class<EpollSocketChannel> clazz;
        NetworkManager networkManager = new NetworkManager(EnumPacketDirection.CLIENTBOUND);
        if (X0.c()) {
            clazz = EpollSocketChannel.class;
            lazyLoadBase = k;
        } else {
            clazz = NioSocketChannel.class;
            lazyLoadBase = e;
        }
        M9.d(aV5.a((Bootstrap)aV5.a((Bootstrap)aV5.a((Bootstrap)aV5.a(new Bootstrap(), (EventLoopGroup)ca_1.a(lazyLoadBase)), (ChannelHandler)new xc_0(networkManager)), clazz), inetAddress, n));
        return networkManager;
    }

    public boolean d() {
        return this.n != null && aF5.a(this.n);
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        aoz_1 aoz_12 = throwable instanceof TimeoutException ? new aoz_1(aZE.o, new Object[0]) : new aoz_1(aZE.i, aL0.a(aL0.a(new StringBuilder(), aZE.f), throwable).toString());
        this.a(aoz_12);
    }

    private void lambda$dispatchPacket$0(EnumConnectionState enumConnectionState, EnumConnectionState enumConnectionState2, Packet packet, GenericFutureListener[] genericFutureListenerArray) {
        if (enumConnectionState != enumConnectionState2) {
            this.a(enumConnectionState);
        }
        ChannelFuture channelFuture = aF5.a(this.n, packet);
        M9.a(channelFuture, genericFutureListenerArray);
        M9.a(channelFuture, (GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
    }

    public void h() {
        ui_2.a(aF5.h(this.n), false);
    }

    public void sendPacket(Packet packet) {
        PacketEvent packetEvent = new PacketEvent(packet, State.OUTGOING);
        EventManagerInvoker.call(packetEvent);
        if (PacketEventInvoker.a(packetEvent)) {
            return;
        }
        if (this.d()) {
            this.a();
            this.a(PacketEventInvoker.c(packetEvent), null);
        } else {
            aqk_0.b(a0g_0.a(this.d));
            try {
                FutureTaskInvoker.a(this.a, new InboundHandlerTuplePacketListener(PacketEventInvoker.c(packetEvent), null));
            }
            finally {
                aqk_0.a(a0g_0.a(this.d));
            }
        }
    }

    static {
        c = LogManagerInvoker.c();
        f = aSV.a(aZE.w);
        i = aSV.a(aZE.B, f);
        l = apv_2.a(aZE.z);
        e = new dr_2();
        k = new du_2();
        j = new d3_0();
    }

    public void a(IChatComponent iChatComponent) {
        if (aF5.a(this.n)) {
            M9.c(aF5.g(this.n));
            this.b = iChatComponent;
        }
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelActive(channelHandlerContext);
        this.n = aAD.a(channelHandlerContext);
        this.g = aF5.f(this.n);
        try {
            this.a(EnumConnectionState.HANDSHAKING);
        }
        catch (Throwable throwable) {
            LoggerInvoker.c(c, throwable);
        }
    }

    private void a() {
        block6: {
            if (this.n != null && aF5.a(this.n)) {
                d_0.a(a0g_0.b(this.d));
                while (true) {
                    if (!FutureTaskInvoker.c(this.a)) {
                        InboundHandlerTuplePacketListener inboundHandlerTuplePacketListener = (InboundHandlerTuplePacketListener)FutureTaskInvoker.d(this.a);
                        this.a(InboundHandlerTuplePacketListener.a(inboundHandlerTuplePacketListener), InboundHandlerTuplePacketListener.b(inboundHandlerTuplePacketListener));
                        continue;
                    }
                    break block6;
                    break;
                }
                finally {
                    d_0.b(a0g_0.b(this.d));
                }
            }
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

