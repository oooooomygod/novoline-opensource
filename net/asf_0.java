/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.SystemInvoker;
import java.util.concurrent.Callable;
import net.CrashReport;
import net.aL0;
import net.ag1_0;

/*
 * Renamed from net.asF
 */
class asf_0
implements Callable<String> {
    CrashReport a;

    asf_0(CrashReport crashReport) {
        this.a = crashReport;
    }

    public String a() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), SystemInvoker.c(ag1_0.c)), ag1_0.b), SystemInvoker.c(ag1_0.a)).toString();
    }
}

