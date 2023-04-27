/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import net.apn_0;
import net.ar3_0;
import net.dr_1;

public class aDT
implements Comparable<aDT> {
    private dr_1 a;

    public long g() {
        return this.a.g();
    }

    public String b() {
        return apn_0.d(this.a);
    }

    public int a(dr_1 dr_12) {
        return this.a.a(dr_12);
    }

    public boolean h() {
        return apn_0.f(this.a);
    }

    public long d() {
        return apn_0.b(this.a);
    }

    public int a(aDT aDT2) {
        return apn_0.b(this.a) < aDT2.d() ? 1 : (apn_0.b(this.a) > aDT2.d() ? -1 : StringInvoker.i(apn_0.d(this.a), aDT2.b()));
    }

    public int a() {
        return ar3_0.a(apn_0.a(this.a));
    }

    public boolean e() {
        return apn_0.e(this.a);
    }

    public aDT(dr_1 dr_12) {
        this.a = dr_12;
    }

    public boolean c() {
        return apn_0.g(this.a);
    }

    public String f() {
        return apn_0.c(this.a);
    }
}

