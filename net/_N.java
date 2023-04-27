/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.F_;
import net._v_0;
import net.aMY;
import net.aV8;
import net.afv_0;
import net.nu_1;

public class _N
extends _v_0 {
    private nu_1 b;

    @Override
    public void b() {
        afv_0.d((F_)aMY.a(this.b), true);
    }

    public _N(nu_1 nu_12) {
        this.b = nu_12;
    }

    @Override
    public boolean g() {
        return aV8.t(this.b.worldObj);
    }

    @Override
    public void a() {
        afv_0.d((F_)aMY.a(this.b), false);
    }
}

