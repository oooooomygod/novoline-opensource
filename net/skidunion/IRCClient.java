/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParser
 *  org.java_websocket.client.WebSocketClient
 *  org.java_websocket.handshake.ServerHandshake
 */
package net.skidunion;

import cc.novoline.Novoline;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.gson.JsonParser;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import net.SA;
import net.T2;
import net.UX;
import net.WN;
import net.a1r;
import net.aL0;
import net.aWR;
import net.aZN;
import net.aZS;
import net.aan_1;
import net.ame_0;
import net.awd_0;
import net.ch_2;
import net.ea_1;
import net.lu_1;
import net.pg_1;
import net.sc_2;
import net.su_2;
import net.vd_2;
import net.vy_1;
import net.wj_1;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

public class IRCClient
extends WebSocketClient {
    private Consumer<Void> f;
    private String a;
    private String c;
    private static int g;
    private List<UX> e;
    private String d;
    private lu_1 b = new lu_1();

    private static void lambda$null$0(Novoline novoline, String string, Void void_) {
        NovolineInvoker.n(novoline).a(new aZS(aL0.a(aL0.a(new StringBuilder(), su_2.b), string).toString()));
    }

    private static void lambda$onClose$1(Novoline novoline, String string) {
        NovolineInvoker.a(novoline, new IRCClient(ame_0.a(su_2.f)).a(arg_0 -> IRCClient.lambda$null$0(novoline, string, arg_0)));
        NovolineInvoker.n(novoline).connect();
    }

    public void onClose(int n, String string, boolean bl) {
        ea_1.a(System.out, su_2.e);
        Novoline novoline = NovolineInvoker.getInstance();
        String string2 = this.a;
        ScheduledExecutorService scheduledExecutorService = awd_0.a();
        int n2 = IRCClient.b();
        vd_2.a(scheduledExecutorService, () -> IRCClient.lambda$onClose$1(novoline, string2), 5L, TimeUnit.SECONDS);
        if (ListInvoker.b() != null) {
            IRCClient.b(++n2);
        }
    }

    public void onOpen(ServerHandshake serverHandshake) {
        IRCClient.b();
        this.c = sc_2.a(16);
        this.d = sc_2.a(16);
        this.send(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), su_2.d), this.c), su_2.a), this.d).toString());
        aan_1.a(this.f, null);
        ListInvoker.b(new ListInvoker[4]);
    }

    public void a(String string) {
        this.a = string;
    }

    public void onMessage(String string) {
        try {
            pg_1.a(vy_1.a(this.b, WN.c(a1r.a(new JsonParser(), T2.a(new wj_1(this.c), string, StringInvoker.e(this.d))))));
        }
        catch (IllegalAccessException | InstantiationException | SA throwable) {
            aWR.c(throwable);
        }
    }

    public void a(List<UX> list) {
        this.e = list;
    }

    public List<UX> d() {
        return this.e;
    }

    public IRCClient(URI uRI) {
        super(uRI);
        this.e = new ArrayList<UX>();
    }

    public static void b(int n) {
        g = n;
    }

    public IRCClient a(Consumer<Void> consumer) {
        this.f = consumer;
        return this;
    }

    public void a(aZN aZN2) {
        wj_1 wj_12 = new wj_1(this.c);
        String string = vy_1.a(this.b, aZN2);
        try {
            this.send(T2.b(wj_12, string, StringInvoker.e(this.d)));
        }
        catch (SA sA) {
            sA.printStackTrace();
        }
    }

    public static int c() {
        IRCClient.b();
        return 108;
    }

    static {
        if (IRCClient.c() != 0) {
            IRCClient.b(21);
        }
    }

    public void onError(Exception exception) {
        ea_1.a(System.out, aL0.a(aL0.a(new StringBuilder(), su_2.c), ch_2.b(exception)).toString());
    }

    public static int b() {
        return g;
    }
}

