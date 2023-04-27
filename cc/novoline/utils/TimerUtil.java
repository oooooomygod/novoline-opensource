/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.utils;

import cc.novoline.invoke.SystemInvoker;

public class TimerUtil {
    private long a = SystemInvoker.f();

    public long c() {
        return this.a;
    }

    public long a() {
        return SystemInvoker.f() - this.a;
    }

    public double a(long l4, double d) {
        deobf.TimerUtil.e();
        double d2 = SystemInvoker.f() - this.a;
        if (d2 <= (double)l4) {
            return d / 100.0 * (d2 / (double)(l4 / 100L));
        }
        return d;
    }

    public void b() {
        this.a = SystemInvoker.f();
    }
}

