/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import net.a5_0;
import net.a93;
import net.aK4;
import net.aKU;
import net.aV8;
import net.ajt_0;
import net.cp_0;
import net.my_0;
import net.nM;
import net.n__0;
import net.nk_1;
import net.nt_2;

public class ajN
extends ajt_0 {
    private List<cp_0> g = my_0.c();

    public ajN() {
        ListInvoker.add(this.g, new cp_0(nt_2.class, 10, 2, 3));
        ListInvoker.add(this.g, new cp_0(n__0.class, 5, 4, 4));
        ListInvoker.add(this.g, new cp_0(nM.class, 10, 4, 4));
        ListInvoker.add(this.g, new cp_0(nk_1.class, 3, 4, 4));
    }

    public List<cp_0> b() {
        return this.g;
    }

    @Override
    public String b() {
        return a93.a;
    }

    @Override
    protected boolean b(int n, int n2) {
        int n3 = n >> 4;
        int n4 = n2 >> 4;
        a5_0.a(this.a, (long)(n3 ^ n4 << 4) ^ aV8.w(this.b));
        a5_0.d(this.a);
        return a5_0.a(this.a, 3) == 0 && n == (n3 << 4) + 4 + a5_0.a(this.a, 8) && n2 == (n4 << 4) + 4 + a5_0.a(this.a, 8);
    }

    @Override
    protected aKU a(int n, int n2) {
        return new aK4(this.b, this.a, n, n2);
    }
}

