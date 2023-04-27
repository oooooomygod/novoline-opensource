/*
 * Decompiled with CFR 0.152.
 */
package net;

import net._v_0;
import net.aMY;
import net.avu_1;
import net.nu_1;
import net.tz_1;

/*
 * Renamed from net._e
 */
public class _e_0
extends _v_0 {
    private double e;
    protected double c;
    private double f;
    private nu_1 d;
    private double b;

    @Override
    public boolean f() {
        return !tz_1.b(aMY.a(this.d));
    }

    public _e_0(nu_1 nu_12, double d) {
        this.d = nu_12;
        this.c = d;
        this.a(1);
    }

    @Override
    public boolean g() {
        if (aMY.h(this.d) == null && !aMY.q(this.d)) {
            return false;
        }
        avu_1.a(this.d, 5, 4);
        return false;
    }

    @Override
    public void b() {
        tz_1.a(aMY.a(this.d), this.b, this.e, this.f, this.c);
    }
}

