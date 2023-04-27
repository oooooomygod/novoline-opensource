/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.apache.logging.log4j.Logger
 *  org.java_websocket.client.WebSocketClient
 *  org.java_websocket.handshake.ServerHandshake
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.ThreadInvoker;
import java.net.URI;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import net.a3h_0;
import net.aL0;
import net.agd_0;
import net.aih_0;
import net.ape_0;
import net.apl_2;
import net.av9_0;
import net.skidunion.A;
import net.skidunion.F;
import net.skidunion.G;
import net.skidunion.I;
import net.skidunion.K;
import net.skidunion.N;
import net.skidunion.Q;
import net.skidunion.a2;
import net.skidunion.a3;
import net.skidunion.a7;
import net.skidunion.aD;
import net.skidunion.aG;
import net.skidunion.aI;
import net.skidunion.aQ;
import net.skidunion.aR;
import net.skidunion.aV;
import net.skidunion.aW;
import net.skidunion.aZ;
import net.skidunion.aa_0;
import net.skidunion.af_0;
import net.skidunion.ag_0;
import net.skidunion.al_0;
import net.skidunion.ap_0;
import net.skidunion.ar_0;
import net.skidunion.au_0;
import net.skidunion.av_0;
import net.skidunion.ax;
import net.skidunion.c_0;
import net.skidunion.d_0;
import net.skidunion.m_0;
import net.skidunion.n_0;
import net.skidunion.o_0;
import net.skidunion.y_0;
import net.skidunion.z_0;
import net.ve_0;
import net.zx_2;
import org.apache.logging.log4j.Logger;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u00107\u001a\u000208J\u0016\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:2\u0006\u0010<\u001a\u00020+J\b\u0010=\u001a\u00020>H\u0016J\u0016\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:2\u0006\u0010@\u001a\u00020+J\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020+0:2\u0006\u0010@\u001a\u00020+J\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020C0:2\u0006\u0010@\u001a\u00020+J\u0012\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0E0:J\u001a\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0E0:2\u0006\u0010F\u001a\u00020>J\u0006\u0010G\u001a\u00020>J\u0006\u0010H\u001a\u00020>J\u0016\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:2\u0006\u0010J\u001a\u00020+J\u001e\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:2\u0006\u0010L\u001a\u00020+2\u0006\u0010M\u001a\u00020NJ \u0010O\u001a\u0002082\u0006\u0010P\u001a\u00020N2\u0006\u0010Q\u001a\u00020+2\u0006\u0010R\u001a\u00020>H\u0016J\u0010\u0010S\u001a\u0002082\u0006\u0010T\u001a\u00020UH\u0016J\u0010\u0010V\u001a\u0002082\u0006\u0010<\u001a\u00020+H\u0016J\u0010\u0010W\u001a\u0002082\u0006\u0010X\u001a\u00020YH\u0016J\u0010\u0010Z\u001a\u0002082\u0006\u0010[\u001a\u00020+H\u0016J\u0016\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:2\u0006\u0010]\u001a\u00020^J\u001e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:2\u0006\u0010`\u001a\u00020+2\u0006\u0010]\u001a\u00020^J\u0015\u0010a\u001a\u0002082\u0006\u0010b\u001a\u00020cH\u0000\u00a2\u0006\u0002\bdJ\u0016\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:2\u0006\u0010L\u001a\u00020+J\u000e\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020iJ\u001e\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:2\u0006\u0010@\u001a\u00020+2\u0006\u0010h\u001a\u00020+R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030'0&\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020+X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\u0011\u00103\u001a\u000204\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106\u00a8\u0006k"}, d2={"Lnet/net.skidunion/aP;", "Lorg/java_websocket/client/WebSocketClient;", "serverURI", "Ljava/net/URI;", "(Ljava/net/URI;)V", "e", "Ljava/util/concurrent/CountDownLatch;", "m", "()Ljava/util/concurrent/CountDownLatch;", "a", "(Ljava/util/concurrent/CountDownLatch;)V", "i", "Lnet/net.skidunion/n;", "h", "()Lnet/net.skidunion/n;", "a", "(Lnet/net.skidunion/n;)V", "k", "Lnet/net.skidunion/aG;", "b", "()Lnet/net.skidunion/aG;", "a", "Lnet/net.skidunion/o;", "k", "()Lnet/net.skidunion/o;", "a", "(Lnet/net.skidunion/o;)V", "f", "Lnet/net.skidunion/m;", "d", "Lorg/apache/logging/log4j/Logger;", "l", "Lnet/net.skidunion/I;", "i", "()Lnet/net.skidunion/I;", "a", "(Lnet/net.skidunion/I;)V", "g", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lnet/net.skidunion/c;", "d", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "j", "", "f", "()Ljava/lang/String;", "a", "(Ljava/lang/String;)V", "b", "j", "g", "c", "Lnet/net.skidunion/aZ;", "a", "()Lnet/net.skidunion/aZ;", "e", "", "d", "Lnet/net.skidunion/Q;", "", "message", "connectBlocking", "", "b", "name", "c", "e", "Lnet/net.skidunion/af;", "getConfigs", "", "self", "n", "c", "f", "username", "a", "target", "duration", "", "onClose", "code", "reason", "remote", "onError", "ex", "Ljava/lang/Exception;", "onMessage", "onOpen", "handshakedata", "Lorg/java_websocket/handshake/ServerHandshake;", "send", "text", "a", "contents", "", "a", "to", "sendPacket", "packet", "Lnet/net.skidunion/ap;", "a", "h", "a", "Lnet/net.skidunion/N;", "data", "Lnet/net.skidunion/K;", "a", "client"})
public class aP
extends WebSocketClient {
    private m_0 f;
    @NotNull
    public String b;
    @NotNull
    private I l;
    private Logger d;
    @NotNull
    public n_0 i;
    @NotNull
    public String j;
    @NotNull
    private aZ c;
    @NotNull
    public o_0 a;
    @NotNull
    private CountDownLatch e;
    @NotNull
    private CopyOnWriteArrayList<c_0<?>> g;
    @NotNull
    private aG k;
    private static int[] h;

    @NotNull
    public Q<List<af_0>> a(boolean bl) {
        return new Q<List<af_0>>(this, new a7(bl), aR.g);
    }

    public void a(@NotNull CountDownLatch countDownLatch) {
        zx_2.b(countDownLatch, apl_2.j);
        this.e = countDownLatch;
    }

    @NotNull
    public String f() {
        aP.g();
        String string = this.j;
        if (string == null) {
            zx_2.a(apl_2.G);
        }
        return string;
    }

    public aP(@NotNull URI uRI) {
        zx_2.b(uRI, apl_2.J);
        super(uRI);
        Logger logger = LogManagerInvoker.a(apl_2.B);
        zx_2.a((Object)logger, apl_2.w);
        this.d = logger;
        aP.g();
        this.f = new m_0();
        this.l = I.CONNECTING;
        this.c = new aZ(this);
        this.k = new aG();
        this.e = new CountDownLatch(1);
        this.g = new CopyOnWriteArrayList();
        if (ListInvoker.b() != null) {
            aP.b(new int[3]);
        }
    }

    @NotNull
    public aG b() {
        return this.k;
    }

    @NotNull
    public Q a(@NotNull String string, int n) {
        zx_2.b(string, apl_2.z);
        return new Q(this, new a3(string, n, false), a2.g);
    }

    @NotNull
    public Q<List<af_0>> l() {
        return this.a(false);
    }

    public void send(@NotNull String string) {
        aP.g();
        zx_2.b(string, apl_2.g);
        LoggerInvoker.b(this.d, aL0.a(aL0.a(new StringBuilder(), apl_2.H), string).toString());
        if (this.n()) {
            n_0 n_02 = this.i;
            if (n_02 == null) {
                zx_2.a(apl_2.u);
            }
            super.send(a3h_0.b(n_02, string));
        }
        super.send(string);
    }

    public void onMessage(@NotNull String string) {
        String string2;
        aP.g();
        zx_2.b(string, apl_2.R);
        if (this.c() || this.n()) {
            n_0 n_02 = this.i;
            if (n_02 == null) {
                zx_2.a(apl_2.y);
            }
            string2 = a3h_0.a(n_02, string);
        } else {
            string2 = string;
        }
        String string3 = string2;
        LoggerInvoker.b(this.d, aL0.a(aL0.a(new StringBuilder(), apl_2.N), string3).toString());
        aih_0.a(F.a, this, string3);
    }

    public void onError(@NotNull Exception exception) {
        zx_2.b(exception, apl_2.b);
        LoggerInvoker.a(this.d, apl_2.F, exception);
        ve_0.a(this.k, new z_0(exception));
    }

    public void a(@NotNull n_0 n_02) {
        zx_2.b(n_02, apl_2.C);
        this.i = n_02;
    }

    @NotNull
    public o_0 k() {
        o_0 o_02 = this.a;
        if (o_02 == null) {
            zx_2.a(apl_2.e);
        }
        return o_02;
    }

    @NotNull
    public n_0 h() {
        n_0 n_02 = this.i;
        if (n_02 == null) {
            zx_2.a(apl_2.d);
        }
        return n_02;
    }

    @NotNull
    public Q d(@NotNull String string) {
        zx_2.b(string, apl_2.i);
        return new Q(this, new ar_0(string), a2.g);
    }

    @NotNull
    public Q b(@NotNull String string) {
        zx_2.b(string, apl_2.v);
        return new Q(this, new aQ(string), a2.g);
    }

    @NotNull
    public Q a(@NotNull String string, @NotNull Object object) {
        zx_2.b(string, apl_2.k);
        zx_2.b(object, apl_2.r);
        return new Q(this, new av_0(string, object.toString()), a2.g);
    }

    public void g(@NotNull String string) {
        zx_2.b(string, apl_2.E);
        this.b = string;
    }

    @NotNull
    public I i() {
        return this.l;
    }

    @NotNull
    public aZ a() {
        return this.c;
    }

    public boolean connectBlocking() {
        aP.g();
        ve_0.a(this.k, new al_0(this));
        LoggerInvoker.info(this.d, apl_2.A);
        String string = this.j;
        if (string == null) {
            zx_2.a(apl_2.Q);
        }
        this.addHeader(apl_2.K, string);
        return super.connectBlocking();
    }

    public void onOpen(@NotNull ServerHandshake serverHandshake) {
        zx_2.b(serverHandshake, apl_2.c);
        LoggerInvoker.info(this.d, apl_2.a);
        this.l = I.LOGIN;
    }

    public void a(@NotNull o_0 o_02) {
        zx_2.b(o_02, apl_2.m);
        this.a = o_02;
    }

    @NotNull
    public CountDownLatch m() {
        return this.e;
    }

    @NotNull
    public Q a(@NotNull Object object) {
        zx_2.b(object, apl_2.M);
        return new Q(this, new aW(object.toString()), a2.g);
    }

    @NotNull
    public N a(@NotNull K k) {
        zx_2.b(k, apl_2.p);
        return new N(this, new aV(k));
    }

    @NotNull
    public Q a(@NotNull String string, @NotNull String string2) {
        zx_2.b(string, apl_2.h);
        zx_2.b(string2, apl_2.I);
        return new Q(this, new ag_0(string, string2), a2.g);
    }

    @NotNull
    public CopyOnWriteArrayList<c_0<?>> d() {
        return this.g;
    }

    public boolean c() {
        return this.l == I.LOGIN_SENT;
    }

    @NotNull
    public Q<String> c(@NotNull String string) {
        zx_2.b(string, apl_2.f);
        return new Q<String>(this, new aI(string), aD.g);
    }

    public void a(@NotNull ap_0 ap_02) {
        zx_2.b(ap_02, apl_2.q);
        ve_0.a(this.k, new A(ap_02));
        this.send(ap_02.toString());
    }

    public void a(@NotNull I i) {
        zx_2.b((Object)i, apl_2.l);
        this.l = i;
    }

    @NotNull
    public Q<af_0> e(@NotNull String string) {
        zx_2.b(string, apl_2.o);
        return new Q<af_0>(this, new ax(string), aa_0.g);
    }

    public void e() {
        av9_0.a(this.e);
    }

    public void onClose(int n, @NotNull String string, boolean bl) {
        zx_2.b(string, apl_2.x);
        aP.g();
        LoggerInvoker.info(this.d, aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), apl_2.t), n), apl_2.P), string), ')').toString());
        ve_0.a(this.k, new y_0(n, string));
        ape_0.a(agd_0.b(this.c));
        ape_0.a(agd_0.a(this.c));
        this.l = I.DISCONNECTED;
        switch (n) {
            case 4004: {
                throw (Throwable)G.a;
            }
        }
        LoggerInvoker.info(this.d, apl_2.L);
        ThreadInvoker.sleep(5000L);
        new d_0(this).start();
        ListInvoker.b(new ListInvoker[5]);
    }

    public static void b(int[] nArray) {
        h = nArray;
    }

    private static G a(G g) {
        return g;
    }

    @NotNull
    public String j() {
        aP.g();
        String string = this.b;
        if (string == null) {
            zx_2.a(apl_2.n);
        }
        return string;
    }

    @NotNull
    public Q h(@NotNull String string) {
        zx_2.b(string, apl_2.s);
        return new Q(this, new a3(string, 0, true), a2.g);
    }

    public static int[] g() {
        return h;
    }

    public boolean n() {
        return this.l == I.AUTHENTICATED;
    }

    @NotNull
    public Q f(@NotNull String string) {
        zx_2.b(string, apl_2.O);
        return new Q(this, new au_0(string), a2.g);
    }

    static {
        if (aP.g() == null) {
            aP.b(new int[4]);
        }
    }

    public void a(@NotNull String string) {
        zx_2.b(string, apl_2.D);
        this.j = string;
    }
}

