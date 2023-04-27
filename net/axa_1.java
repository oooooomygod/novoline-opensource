/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Charsets;
import deobf.NetworkSystem;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetSocketAddress;
import net.FH;
import net.JP;
import net.M9;
import net.P8;
import net.a4y_0;
import net.aAD;
import net.aCX;
import net.aF5;
import net.ape_2;
import net.awm_0;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.axA
 */
public class axa_1
extends ChannelInboundHandlerAdapter {
    private static Logger a = LogManagerInvoker.c();
    private NetworkSystem b;

    private ByteBuf a(String string) {
        ByteBuf byteBuf = FH.d();
        awm_0.e(byteBuf, 255);
        char[] cArray = StringInvoker.f(string);
        awm_0.c(byteBuf, cArray.length);
        for (char c : cArray) {
            awm_0.d(byteBuf, c);
        }
        return byteBuf;
    }

    private void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        M9.a(aAD.a(a4y_0.a(aAD.b(channelHandlerContext)), byteBuf), (GenericFutureListener)ChannelFutureListener.CLOSE);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void channelRead(ChannelHandlerContext var1_1, Object var2_2) throws Exception {
        block12: {
            var3_3 = (ByteBuf)var2_2;
            awm_0.h(var3_3);
            try {
                if (awm_0.a(var3_3) != 254) break block12;
                var5_4 = (InetSocketAddress)aF5.f(aAD.a(var1_1));
                var6_6 = JP.d(this.b);
                var7_7 = awm_0.e(var3_3);
                switch (var7_7) {
                    case 0: {
                        LoggerInvoker.a(axa_1.a, ape_2.d, new Object[]{aCX.b(var5_4), P8.d(aCX.a(var5_4))});
                        var8_8 = StringInvoker.a(ape_2.f, new Object[]{ServerInvoker.O(var6_6), P8.d(ServerInvoker.a(var6_6)), P8.d(ServerInvoker.v(var6_6))});
                        this.a(var1_1, this.a(var8_8));
                        ** break;
                    }
                    case 1: {
                        if (awm_0.a(var3_3) != 1) {
                            break;
                        }
                        ** GOTO lbl-1000
                    }
                    default: {
                        v0 = awm_0.a(var3_3) == 1;
                    }
                }
            }
            catch (RuntimeException var5_5) {
                awm_0.b(var3_3);
                a4y_0.a(aF5.c(aAD.a(var1_1)), ape_2.g);
                aAD.b(var1_1, var2_2);
                return;
            }
            catch (Throwable var15_12) {
                awm_0.b(var3_3);
                a4y_0.a(aF5.c(aAD.a(var1_1)), ape_2.k);
                aAD.b(var1_1, var2_2);
                throw var15_12;
            }
            awm_0.b(var3_3);
            a4y_0.a(aF5.c(aAD.a(var1_1)), ape_2.j);
            aAD.b(var1_1, var2_2);
            return;
lbl-1000:
            // 1 sources

            {
                LoggerInvoker.a(axa_1.a, ape_2.a, new Object[]{aCX.b(var5_4), P8.d(aCX.a(var5_4))});
                var9_9 = StringInvoker.a(ape_2.e, new Object[]{P8.d(127), ServerInvoker.t(var6_6), ServerInvoker.O(var6_6), P8.d(ServerInvoker.a(var6_6)), P8.d(ServerInvoker.v(var6_6))});
                this.a(var1_1, this.a(var9_9));
                ** break;
                var10_10 = v0;
                var10_10 = var10_10 & awm_0.a(var3_3) == 250;
            }
            {
                var10_10 &= ape_2.b.equals(new String(awm_0.c(awm_0.b(var3_3, awm_0.j(var3_3) * 2)), Charsets.UTF_16BE));
                var11_11 = awm_0.n(var3_3);
                var10_10 &= awm_0.a(var3_3) >= 73;
                var10_10 &= 3 + awm_0.c(awm_0.b(var3_3, awm_0.j(var3_3) * 2)).length + 4 == var11_11;
                var10_10 = (var10_10 &= awm_0.g(var3_3) <= 65535) & awm_0.e(var3_3) == 0;
            }
            awm_0.b(var3_3);
            a4y_0.a(aF5.c(aAD.a(var1_1)), ape_2.i);
            aAD.b(var1_1, var2_2);
            return;
lbl-1000:
            // 2 sources

            {
                awm_0.k(var3_3);
            }
            awm_0.b(var3_3);
            a4y_0.a(aF5.c(aAD.a(var1_1)), ape_2.h);
            aAD.b(var1_1, var2_2);
            return;
        }
        awm_0.b(var3_3);
        a4y_0.a(aF5.c(aAD.a(var1_1)), ape_2.c);
        aAD.b(var1_1, var2_2);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public axa_1(NetworkSystem networkSystem) {
        this.b = networkSystem;
    }
}

