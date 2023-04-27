/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import net.a5R;
import net.aL0;
import net.aP2;
import net.aZ6;
import net.ara_2;
import net.ch_2;
import net.hi_2;
import net.pm_1;
import net.te_0;
import net.tf_0;
import net.ys_2;

public class aVM
extends Thread {
    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        aP2.b();
        HttpURLConnection httpURLConnection = null;
        try {
            ys_2.a(hi_2.n);
            URL uRL = new URL(hi_2.q);
            httpURLConnection = (HttpURLConnection)a5R.e(uRL);
            if (ys_2.ax().b0) {
                te_0.b(httpURLConnection, hi_2.d, hi_2.b);
                te_0.b(httpURLConnection, hi_2.g, aL0.a(aL0.a(new StringBuilder(), hi_2.u), pm_1.a()).toString());
                te_0.b(httpURLConnection, hi_2.m, hi_2.f);
                te_0.b(httpURLConnection, hi_2.j, hi_2.v);
                te_0.b(httpURLConnection, hi_2.i, aL0.a(aL0.a(new StringBuilder(), hi_2.o), SystemInvoker.c(hi_2.r)).toString());
                te_0.b(httpURLConnection, hi_2.h, aL0.c(aL0.a(new StringBuilder(), hi_2.t), ys_2.aR()).toString());
                te_0.b(httpURLConnection, hi_2.l, aL0.a(aL0.a(new StringBuilder(), hi_2.c), tf_0.D).toString());
                te_0.b(httpURLConnection, hi_2.p, aL0.a(aL0.a(new StringBuilder(), hi_2.s), tf_0.p).toString());
            }
            te_0.a(httpURLConnection, true);
            te_0.c(httpURLConnection, false);
            te_0.e(httpURLConnection);
            try {
                InputStream inputStream = te_0.c(httpURLConnection);
                String string = ys_2.c(inputStream);
                aZ6.b(inputStream);
                String[] stringArray = ys_2.a(string, hi_2.w);
                if (stringArray.length < 1) return;
                String string2 = StringInvoker.h(stringArray[0]);
                ys_2.a(aL0.a(aL0.a(new StringBuilder(), hi_2.e), string2).toString());
                if (ys_2.c(string2, hi_2.k) <= 0) {
                    return;
                }
                ys_2.c(string2);
                return;
            }
            finally {
                if (httpURLConnection != null) {
                    te_0.a(httpURLConnection);
                }
            }
        }
        catch (Exception exception) {
            ys_2.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ara_2.b(exception.getClass())), hi_2.a), ch_2.b(exception)).toString());
        }
    }
}

