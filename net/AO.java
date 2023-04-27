/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 */
package net;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.LoggerInvoker;
import com.google.common.util.concurrent.FutureCallback;
import deobf.MCInvoker;
import java.util.List;
import java.util.concurrent.CancellationException;
import net.a49;
import net.aAI;
import net.aL0;
import net.afq_2;
import net.akg_2;
import net.amx_0;
import net.de_2;
import net.lp_2;
import net.vo_0;

class AO
implements FutureCallback<List<Object>> {
    amx_0 b;
    lp_2 a;
    de_2 c;

    public void a(List<Object> list) {
        de_2.a(this.c, this.a);
        akg_2.a(aAI.h(this.a));
        try {
            if (aAI.a(this.a) == a49.UPLOADING) {
                aAI.a(this.a, a49.DONE);
                afq_2.a(aAI.g(this.a), this.b);
                return;
            }
            if (!aAI.c(this.a)) {
                LoggerInvoker.warn(de_2.a(), aL0.a(aL0.a(aL0.a(new StringBuilder(), vo_0.c), (Object)aAI.a(this.a)), vo_0.b).toString());
            }
            return;
        }
        finally {
            akg_2.b(aAI.h(this.a));
        }
    }

    public void onFailure(Throwable throwable) {
        de_2.a(this.c, this.a);
        if (!(throwable instanceof CancellationException) && !(throwable instanceof InterruptedException)) {
            MCInvoker.b(MCInvoker.f(), CrashInvoker.makeCrashReport(throwable, vo_0.a));
        }
    }

    private static CancellationException a(CancellationException cancellationException) {
        return cancellationException;
    }

    AO(de_2 de_22, lp_2 lp_22, amx_0 amx_02) {
        this.c = de_22;
        this.a = lp_22;
        this.b = amx_02;
    }
}

