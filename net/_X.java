/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.CG;
import net.F_;
import net._v_0;
import net.a5_0;
import net.afv_0;
import net.nl_1;
import net.qo_2;

public class _X
extends _v_0 {
    private nl_1 b;

    @Override
    public boolean g() {
        return CG.s(this.b) || CG.p(this.b);
    }

    public _X(nl_1 nl_12) {
        this.b = nl_12;
        this.a(4);
        afv_0.e((F_)CG.e(nl_12), true);
    }

    @Override
    public void d() {
        if (a5_0.e(CG.a(this.b)) < 0.8f) {
            qo_2.a(CG.b(this.b));
        }
    }
}

