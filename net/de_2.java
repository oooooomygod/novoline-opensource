/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import com.google.common.util.concurrent.ListenableFuture;
import deobf.Entity;
import deobf.MCInvoker;
import net.CrashReport;
import net.a49;
import net.aAI;
import net.aGM;
import net.aL0;
import net.akg_2;
import net.dj_0;
import net.dn_0;
import net.l;
import net.lp_2;
import net.uj_1;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.de
 */
public class de_2
implements Runnable {
    private l a;
    private uj_1 c;
    private static Logger b = LogManagerInvoker.c();

    public de_2(l l4) {
        this(l4, null);
    }

    private void a(lp_2 lp_22) {
        if (this.c == null) {
            aGM.a(this.a, lp_22.a());
        }
    }

    private uj_1 b() throws InterruptedException {
        return this.c != null ? this.c : aGM.b(this.a);
    }

    public de_2(l l4, uj_1 uj_12) {
        this.a = l4;
        this.c = uj_12;
    }

    static Logger a() {
        return b;
    }

    @Override
    public void run() {
        while (true) {
            try {
                try {
                    this.b(aGM.d(this.a));
                }
                catch (InterruptedException interruptedException) {
                    LoggerInvoker.b(b, dj_0.d);
                    return;
                }
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, dj_0.e);
                MCInvoker.b(MCInvoker.f(), MCInvoker.a(MCInvoker.f(), crashReport));
                return;
            }
        }
    }

    static void a(de_2 de_22, lp_2 lp_22) {
        de_22.a(lp_22);
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    protected void b(lp_2 lp_22) throws InterruptedException {
        akg_2.a(aAI.h(lp_22));
        if (aAI.a(lp_22) != a49.PENDING) {
            if (!aAI.c(lp_22)) {
                LoggerInvoker.warn(b, aL0.a(aL0.a(aL0.a(new StringBuilder(), dj_0.c), (Object)aAI.a(lp_22)), dj_0.f).toString());
            }
            return;
        }
        aAI.a(lp_22, a49.COMPILING);
        Entity entity = MCInvoker.v(MCInvoker.f());
        aAI.f(lp_22);
        return;
        finally {
            akg_2.b(aAI.h(lp_22));
        }
    }

    private static void lambda$processTask$0(ListenableFuture listenableFuture) {
        dn_0.a(listenableFuture, false);
    }
}

