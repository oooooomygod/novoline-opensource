/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import net.DB;
import net.FA;
import net.NE;
import net.WA;
import net.a4m_0;
import net.aFY;
import net.aL0;
import net.aP2;
import net.aYA;
import net.aZ5;
import net.amn_1;
import net.an__0;
import net.at_2;
import net.ow_1;
import net.qn_0;
import net.wk_2;
import net.xy_2;
import net.yi_0;
import net.ys_2;

public class anZ {
    private static String s = "\n";
    private Socket o = null;
    private OutputStream e = null;
    private String m = null;
    private int a = 1000;
    private List<at_2> j;
    private List<at_2> h;
    private boolean i = false;
    private WA c = null;
    private Proxy l = Proxy.NO_PROXY;
    private static Pattern f = ow_1.c(DB.i);
    private InputStream g = null;
    private boolean t = false;
    public static int n = 5000;
    private int b = 0;
    private long q;
    private long p = 5000L;
    private yi_0 d = null;
    private int k = 0;
    public static int r = 5000;

    private void b(Exception exception) {
        aP2.b();
        if (ListInvoker.size(this.j) > 0) {
            at_2 at_22;
            if (!this.t) {
                at_22 = (at_2)ListInvoker.remove(this.j, 0);
                an__0.a(a4m_0.a(at_22), a4m_0.b(at_22), exception);
                a4m_0.a(at_22, true);
            }
            if (ListInvoker.size(this.j) > 0) {
                at_22 = (at_2)ListInvoker.remove(this.j, 0);
                aFY.a(at_22);
            }
        }
    }

    public anZ(String string, int n, Proxy proxy) {
        this.j = new LinkedList<at_2>();
        this.h = new LinkedList<at_2>();
        this.q = SystemInvoker.f();
        this.m = string;
        this.k = n;
        this.l = proxy;
        this.d = new yi_0(this);
        this.d.start();
        this.c = new WA(this);
        this.c.start();
    }

    private String a(String string, xy_2 xy_22) {
        aP2.b();
        if (wk_2.a(ow_1.a(f, string))) {
            return string;
        }
        if (StringInvoker.e(string, DB.a)) {
            return aL0.a(aL0.a(new StringBuilder(), DB.k), string).toString();
        }
        String string2 = xy_22.i();
        if (xy_22.c() != 80) {
            string2 = aL0.c(aL0.a(aL0.a(new StringBuilder(), string2), DB.h), xy_22.c()).toString();
        }
        if (StringInvoker.e(string, DB.p)) {
            return aL0.a(aL0.a(aL0.a(new StringBuilder(), DB.r), string2), string).toString();
        }
        String string3 = aZ5.c(xy_22);
        int n = StringInvoker.j(string3, DB.g);
        return aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), DB.e), string2), StringInvoker.b(string3, 0, n + 1)), string).toString();
    }

    public synchronized void a(at_2 at_22, Exception exception) {
        this.a(exception);
    }

    private void a(at_2 at_22, List<at_2> list) {
        ListInvoker.add(list, at_22);
        this.notifyAll();
    }

    private static Exception c(Exception exception) {
        return exception;
    }

    public synchronized boolean a(at_2 at_22) {
        aP2.b();
        if (this.a()) {
            return false;
        }
        this.a(at_22, this.j);
        this.a(at_22, this.h);
        ++this.b;
        return true;
    }

    public synchronized OutputStream c() throws IOException, InterruptedException {
        aP2.b();
        if (this.e == null) {
            this.i();
            this.wait(1000L);
        }
        return this.e;
    }

    public synchronized void b(at_2 at_22, Exception exception) {
        this.a(exception);
    }

    private at_2 a(List<at_2> list, boolean bl) throws InterruptedException {
        aP2.b();
        if (ListInvoker.size(list) <= 0) {
            this.i();
            this.wait(1000L);
        }
        this.g();
        return (at_2)ListInvoker.remove(list, 0);
    }

    public int d() {
        return this.b;
    }

    public synchronized InputStream j() throws IOException, InterruptedException {
        aP2.b();
        if (this.g == null) {
            this.i();
            this.wait(1000L);
        }
        return this.g;
    }

    private String[] a(String string, char c) {
        aP2.b();
        int n = StringInvoker.d(string, c);
        if (n < 0) {
            return new String[]{string};
        }
        String string2 = StringInvoker.b(string, 0, n);
        String string3 = StringInvoker.a(string, n + 1);
        return new String[]{string2, string3};
    }

    public synchronized boolean a() {
        aP2.b();
        return this.i ? true : this.b >= this.a;
    }

    public synchronized void a(Socket socket) throws IOException {
        aP2.b();
        if (!this.i) {
            if (this.o != null) {
                throw new IllegalArgumentException(DB.f);
            }
            this.o = socket;
            qn_0.a(this.o, true);
            this.g = this.o.getInputStream();
            this.e = new BufferedOutputStream(this.o.getOutputStream());
            this.g();
            this.notifyAll();
        }
    }

    public String b() {
        return this.m;
    }

    public synchronized void b(at_2 at_22) {
        aP2.b();
        if (!this.i) {
            this.g();
        }
    }

    public Proxy e() {
        return this.l;
    }

    public synchronized boolean h() {
        aP2.b();
        return ListInvoker.size(this.j) > 0;
    }

    private void i() {
        aP2.b();
        if (this.o != null) {
            long l4;
            long l5 = this.p;
            if (ListInvoker.size(this.j) > 0) {
                l5 = 5000L;
            }
            if ((l4 = SystemInvoker.f()) > this.q + l5) {
                this.a(new InterruptedException(aL0.a(aL0.a(new StringBuilder(), DB.b), l5).toString()));
            }
        }
    }

    private void a(FA fA) {
        String[] stringArray;
        int n;
        String string;
        aP2.b();
        String string2 = NE.a(fA, DB.o);
        if (string2 != null && !StringInvoker.i(string2).equals(DB.s)) {
            this.a(new EOFException(DB.c));
        }
        if ((string = NE.a(fA, DB.l)) != null && (n = 0) < (stringArray = ys_2.a(string, DB.u)).length) {
            String string3 = stringArray[n];
            String[] stringArray2 = this.a(string3, '=');
            if (stringArray2.length >= 2) {
                int n2;
                if (stringArray2[0].equals(DB.t) && (n2 = ys_2.a(stringArray2[1], -1)) > 0) {
                    this.p = n2 * 1000;
                }
                if (stringArray2[0].equals(DB.q)) {
                    this.a = n2 = ys_2.a(stringArray2[1], -1);
                }
            }
            ++n;
        }
    }

    public synchronized at_2 k() throws InterruptedException, IOException {
        aP2.b();
        if (ListInvoker.size(this.h) <= 0 && this.e != null) {
            aYA.a(this.e);
        }
        return this.a(this.h, true);
    }

    public synchronized void a(at_2 at_22, FA fA) {
        aP2.b();
        if (!this.i) {
            this.t = true;
            this.g();
            if (ListInvoker.size(this.j) > 0 && ListInvoker.get(this.j, 0) == at_22) {
                block5: {
                    ListInvoker.remove(this.j, 0);
                    a4m_0.a(at_22, true);
                    String string = NE.a(fA, DB.d);
                    if (NE.b(fA) / 100 == 3 && aZ5.a(a4m_0.b(at_22)) < 5) {
                        try {
                            string = this.a(string, a4m_0.b(at_22));
                            xy_2 xy_22 = aFY.b(string, a4m_0.b(at_22).g());
                            aZ5.a(xy_22, aZ5.a(a4m_0.b(at_22)) + 1);
                            at_2 at_23 = new at_2(xy_22, a4m_0.a(at_22));
                            aFY.a(at_23);
                            break block5;
                        }
                        catch (IOException iOException) {
                            an__0.a(a4m_0.a(at_22), a4m_0.b(at_22), iOException);
                        }
                    }
                    amn_1 amn_12 = a4m_0.a(at_22);
                    an__0.a(amn_12, a4m_0.b(at_22), fA);
                }
                this.a(fA);
            }
            throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), DB.j), at_22).toString());
        }
    }

    public anZ(String string, int n) {
        this(string, n, Proxy.NO_PROXY);
    }

    public synchronized at_2 f() throws InterruptedException {
        return this.a(this.j, false);
    }

    private synchronized void a(Exception exception) {
        aP2.b();
        if (!this.i) {
            this.i = true;
            this.b(exception);
            if (this.d != null) {
                this.d.interrupt();
            }
            if (this.c != null) {
                this.c.interrupt();
            }
            if (this.o != null) {
                try {
                    qn_0.a(this.o);
                }
                catch (IOException iOException) {}
            }
            this.o = null;
            this.g = null;
            this.e = null;
        }
    }

    private void g() {
        this.q = SystemInvoker.f();
    }

    public int l() {
        return this.k;
    }
}

