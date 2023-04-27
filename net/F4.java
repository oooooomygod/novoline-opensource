/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import net.F5;
import net.aS0;
import net.dl_1;
import net.tt_0;

public abstract class F4 {
    public static F4[] b = new F4[]{tt_0.a(new F5(dl_1.d, dl_1.e), true), tt_0.a(new F5(dl_1.f, dl_1.b), true)};
    public String c;
    public String a;

    public F4(String string, String string2) {
        this.a = string;
        this.c = string2;
    }

    public boolean a() {
        return ((F5)this).e;
    }

    public static F4 a(String string) {
        aS0.b();
        int n = 0;
        if (n < b.length) {
            if (StringInvoker.d(F4.b[n].a, string)) {
                return b[n];
            }
            ++n;
        }
        if (ListInvoker.b() != null) {
            aS0.b("n03yc");
        }
        return null;
    }

    public F4() {
        aS0.b();
        this.a = dl_1.a;
        this.c = dl_1.c;
        ListInvoker.b(new ListInvoker[2]);
    }
}

