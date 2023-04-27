/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.F_;
import net._v_0;
import net.a5_0;
import net.afv_0;
import net.apt_2;
import net.ny_1;
import net.pp_0;
import net.qo_2;

/*
 * Renamed from net.alg
 */
class alg_1
extends _v_0 {
    private ny_1 b;

    public alg_1(ny_1 ny_12) {
        this.b = ny_12;
        this.a(5);
        afv_0.e((F_)apt_2.c(ny_12), true);
    }

    @Override
    public boolean g() {
        return apt_2.g(this.b) || apt_2.e(this.b);
    }

    @Override
    public void d() {
        if (a5_0.e(apt_2.i(this.b)) < 0.8f) {
            qo_2.a(apt_2.d(this.b));
        }
        ((pp_0)apt_2.f(this.b)).a(1.2);
    }
}

