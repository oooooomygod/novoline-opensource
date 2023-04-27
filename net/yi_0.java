/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.ThreadInvoker;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import net.TA;
import net.a4m_0;
import net.aL0;
import net.aP2;
import net.aS0;
import net.aYA;
import net.aZ5;
import net.anZ;
import net.at_2;
import net.cg_1;
import net.dz_0;
import net.qn_0;
import net.xy_2;

/*
 * Renamed from net.Yi
 */
public class yi_0
extends Thread {
    private static String c = "\r\n";
    private anZ b = null;
    private static Charset a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "I$".toCharArray();
        int n2 = 0;
        int n3 = 70;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 2));
            n3 = n3;
        }
    }

    private void a() throws IOException {
        String string = cg_1.e(this.b);
        int n = cg_1.d(this.b);
        Proxy proxy = cg_1.g(this.b);
        Socket socket = new Socket(proxy);
        qn_0.a(socket, new InetSocketAddress(string, n), 5000);
        cg_1.a(this.b, socket);
    }

    private void a(xy_2 xy_22, OutputStream outputStream) throws IOException {
        aP2.b();
        this.a(outputStream, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aZ5.f(xy_22)), TA.g), aZ5.c(xy_22)), TA.e), aZ5.h(xy_22)), TA.b).toString());
        Map map = aZ5.d(xy_22);
        Iterator iterator = aS0.f(MapInvoker.c(map));
        if (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            String string2 = (String)MapInvoker.c(aZ5.d(xy_22), string);
            this.a(outputStream, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), TA.c), string2), TA.d).toString());
        }
        this.a(outputStream, TA.a);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public yi_0(anZ anZ2) {
        super(TA.f);
        this.b = anZ2;
    }

    @Override
    public void run() {
        aP2.b();
        at_2 at_22 = null;
        try {
            this.a();
            if (!ThreadInvoker.f()) {
                at_22 = cg_1.c(this.b);
                xy_2 xy_22 = a4m_0.b(at_22);
                OutputStream outputStream = cg_1.f(this.b);
                this.a(xy_22, outputStream);
                cg_1.a(this.b, at_22);
            }
        }
        catch (InterruptedException interruptedException) {
            return;
        }
        catch (Exception exception) {
            cg_1.b(this.b, at_22, exception);
        }
    }

    private void a(OutputStream outputStream, String string) throws IOException {
        byte[] byArray = StringInvoker.a(string, a);
        aYA.a(outputStream, byArray);
    }
}

