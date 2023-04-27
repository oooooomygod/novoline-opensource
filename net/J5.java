/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.ThreadInvoker;
import deobf.MCInvoker;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.Proxy;
import java.util.concurrent.atomic.AtomicInteger;
import net.FA;
import net.J4;
import net.L1;
import net.NE;
import net.ResourceLocation;
import net.a4d_0;
import net.a9F;
import net.aFY;
import net.aI8;
import net.aI_;
import net.aL0;
import net.aR2;
import net.aZ5;
import net.aiv_2;
import net.ara_2;
import net.auk_2;
import net.ch_2;
import net.ee_0;
import net.iw_2;
import net.xo_2;
import net.xy_2;
import net.zq_2;
import org.apache.logging.log4j.Logger;


public class J5
extends J4 {
    private String l;
    public boolean s = false;
    public Boolean j = null;
    private static AtomicInteger o;
    private Thread r;
    private boolean k;
    private static Logger p;
    private a9F m;
    private BufferedImage n;
    private File q;

    public J5(File file, String string, ResourceLocation resourceLocation, a9F a9F2) {
        super(resourceLocation);
        this.q = file;
        this.l = string;
        this.m = a9F2;
    }

    private void a() {
        if (!this.k && this.n != null) {
            this.k = true;
            if (this.i != null) {
                this.b();
            }
            aiv_2.a(super.a(), this.n);
        }
    }

    private void f() {
        FA fA;
        block8: {
            xy_2 xy_22 = aFY.b(this.l, MCInvoker.R(MCInvoker.f()));
            MapInvoker.c(aZ5.d(xy_22), L1.h, L1.b);
            fA = aFY.a(xy_22);
            if (NE.b(fA) / 100 == 2) break block8;
            this.j = auk_2.b(this.n != null);
            return;
        }
        try {
            BufferedImage bufferedImage;
            byte[] byArray = NE.a(fA);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            if (this.q != null) {
                iw_2.a(byteArrayInputStream, this.q);
                bufferedImage = aI8.a(this.q);
            } else {
                bufferedImage = aiv_2.a(byteArrayInputStream);
            }
            if (this.m != null) {
                bufferedImage = a4d_0.a(this.m, bufferedImage);
            }
            this.a(bufferedImage);
            this.j = auk_2.b(this.n != null);
        }
        catch (Exception exception) {
            try {
                LoggerInvoker.f(p, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), L1.d), ara_2.b(exception.getClass())), L1.f), ch_2.b(exception)).toString());
                this.j = auk_2.b(this.n != null);
            }
            catch (Throwable throwable) {
                this.j = auk_2.b(this.n != null);
                throw throwable;
            }
            return;
        }
        return;
    }

    static Logger e() {
        return p;
    }

    @Override
    public int a() {
        this.a();
        return super.a();
    }

    static BufferedImage d(J5 j5) {
        return j5.n;
    }

    static {
        p = LogManagerInvoker.c();
        o = new AtomicInteger(0);
    }

    protected void d() {
        this.r = new xo_2(this, aL0.c(aL0.a(new StringBuilder(), L1.a), ee_0.a(o)).toString());
        ThreadInvoker.a(this.r, true);
        ThreadInvoker.e(this.r);
    }

    @Override
    public void a(aI_ aI_2) throws IOException {
        if (this.n == null && this.i != null) {
            super.a(aI_2);
        }
        if (this.r == null) {
            if (this.q != null && zq_2.d(this.q)) {
                LoggerInvoker.a(p, L1.g, new Object[]{this.q});
                this.n = aI8.a(this.q);
                if (this.m != null) {
                    this.a(a4d_0.a(this.m, this.n));
                }
                J5 j5 = this;
                boolean bl = this.n != null;
                try {
                    j5.j = auk_2.b(bl);
                }
                catch (IOException iOException) {
                    LoggerInvoker.a(p, aL0.a(aL0.a(new StringBuilder(), L1.e), this.q).toString(), iOException);
                    this.d();
                }
            } else {
                this.d();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private boolean g() {
        if (!this.s) {
            return false;
        }
        Proxy proxy = MCInvoker.R(MCInvoker.f());
        return (aR2.a(proxy) == Proxy.Type.DIRECT || aR2.a(proxy) == Proxy.Type.SOCKS) && StringInvoker.e(this.l, L1.c);
    }

    static File f(J5 j5) {
        return j5.q;
    }

    static void c(J5 j5) {
        j5.f();
    }

    static boolean a(J5 j5) {
        return j5.g();
    }

    static String e(J5 j5) {
        return j5.l;
    }

    static a9F b(J5 j5) {
        return j5.m;
    }

    public void a(BufferedImage bufferedImage) {
        this.n = bufferedImage;
        if (this.m != null) {
            a4d_0.a(this.m);
        }
        this.j = auk_2.b(this.n != null);
    }
}

