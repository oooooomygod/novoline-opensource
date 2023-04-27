/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.LoggerInvoker;
import deobf.MCInvoker;
import java.awt.image.BufferedImage;
import java.net.HttpURLConnection;
import java.net.URL;
import net.J5;
import net.a4d_0;
import net.a5R;
import net.aI8;
import net.aL0;
import net.aiv_2;
import net.ara_2;
import net.auk_2;
import net.ch_2;
import net.d__0;
import net.iw_2;
import net.te_0;
import net.ys_2;

/*
 * Renamed from net.xo
 */
class xo_2
extends Thread {
    J5 a;

    xo_2(J5 j5, String string) {
        this.a = j5;
        super(string);
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        block14: {
            HttpURLConnection httpURLConnection = null;
            LoggerInvoker.e(J5.e(), d__0.a, new Object[]{J5.e(this.a), J5.f(this.a)});
            if (J5.a(this.a)) {
                J5.c(this.a);
            } else {
                BufferedImage bufferedImage;
                block12: {
                    block13: {
                        httpURLConnection = (HttpURLConnection)a5R.a(new URL(J5.e(this.a)), MCInvoker.R(MCInvoker.f()));
                        te_0.b(httpURLConnection, d__0.c, d__0.d);
                        te_0.a(httpURLConnection, true);
                        te_0.c(httpURLConnection, false);
                        te_0.e(httpURLConnection);
                        if (te_0.f(httpURLConnection) / 100 == 2) break block12;
                        if (te_0.g(httpURLConnection) == null) break block13;
                        ys_2.a(te_0.g(httpURLConnection));
                    }
                    te_0.a(httpURLConnection);
                    this.a.j = auk_2.b(J5.d(this.a) != null);
                    return;
                }
                if (J5.f(this.a) != null) {
                    iw_2.a(te_0.c(httpURLConnection), J5.f(this.a));
                    bufferedImage = aI8.a(J5.f(this.a));
                } else {
                    bufferedImage = aiv_2.a(te_0.c(httpURLConnection));
                }
                if (J5.b(this.a) != null) {
                    bufferedImage = a4d_0.a(J5.b(this.a), bufferedImage);
                }
                this.a.a(bufferedImage);
                te_0.a(httpURLConnection);
                this.a.j = auk_2.b(J5.d(this.a) != null);
            }
            break block14;
            {
                catch (Exception exception) {
                    try {
                        LoggerInvoker.f(J5.e(), aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), d__0.b), ara_2.b(exception.getClass())), d__0.e), ch_2.b(exception)).toString());
                    }
                    catch (Throwable throwable) {
                        te_0.a(httpURLConnection);
                        this.a.j = auk_2.b(J5.d(this.a) != null);
                        throw throwable;
                    }
                    te_0.a(httpURLConnection);
                    this.a.j = auk_2.b(J5.d(this.a) != null);
                }
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

