/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.viaversion.viaversion.ViaManagerImpl
 *  com.viaversion.viaversion.api.ViaManager
 *  io.netty.channel.EventLoop
 *  io.netty.channel.local.LocalEventLoopGroup
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.viaversion.viaversion.ViaManagerImpl;
import com.viaversion.viaversion.api.ViaManager;
import io.netty.channel.EventLoop;
import io.netty.channel.local.LocalEventLoopGroup;
import java.io.File;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Logger;
import net.EN;
import net.Q_;
import net.W8;
import net.a6S;
import net.aKL;
import net.agg_0;
import net.ajE;
import net.aqf_1;
import net.ary_1;
import net.avs_1;
import net.awd_0;
import net.azc_2;
import net.er_0;
import net.pw_2;
import net.sk_1;
import net.te_1;
import net.vq_1;
import net.z5_0;
import net.zq_2;

/*
 * Renamed from net.a4k
 */
public class a4k_0 {
    public static int i = 47;
    private String g;
    private static String[] k;
    public Q_ d;
    private Logger h = new W8(LogManagerInvoker.a(azc_2.b));
    private int c;
    private ExecutorService e;
    private static a4k_0 j;
    private EventLoop f;
    private File b;
    private CompletableFuture<Void> a = new CompletableFuture();

    public CompletableFuture<Void> g() {
        return this.a;
    }

    public static String[] h() {
        return k;
    }

    public void a(int n) {
        this.c = n;
    }

    public Logger d() {
        return this.h;
    }

    static {
        j = new a4k_0();
        a4k_0.b(null);
    }

    public String f() {
        return this.g;
    }

    public void a(String string) {
        this.g = string;
    }

    public void a(int n, int n2, int n3, int n4) {
        a4k_0.h();
        this.d = new Q_(-1, n, n2, MathInvoker.max(n3, 110), n4);
        if (ListInvoker.b() != null) {
            a4k_0.b(new String[5]);
        }
    }

    public EventLoop k() {
        return this.f;
    }

    public static a4k_0 a() {
        return j;
    }

    public void c() {
        this.a(5, 5, 110, 20);
    }

    public int j() {
        return this.c;
    }

    public File i() {
        return this.b;
    }

    public void e() {
        a4k_0.h();
        ThreadFactory threadFactory = agg_0.a(agg_0.a(agg_0.a(new ThreadFactoryBuilder(), true), azc_2.d));
        this.e = awd_0.a(8, threadFactory);
        this.f = aKL.a(new LocalEventLoopGroup(1, threadFactory));
        er_0.a(this.f, this.a::join);
        this.a(47);
        this.b = new File(azc_2.a);
        if (zq_2.p(this.b)) {
            z5_0.a(this.d(), azc_2.c);
        }
        te_1.a((ViaManager)vq_1.a(vq_1.a(vq_1.a(vq_1.a(EN.a(), new sk_1()), new a6S()), new pw_2(this.b))));
        aqf_1.c();
        EN.a((ViaManagerImpl)te_1.a());
        new ajE(this.b);
        new ary_1(this.b);
        avs_1.a(this.a, null);
        ListInvoker.b(new ListInvoker[2]);
    }

    public ExecutorService b() {
        return this.e;
    }

    public static void b(String[] stringArray) {
        k = stringArray;
    }

    public void a(File file) {
        this.b = file;
    }
}

