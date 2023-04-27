/*
 * Decompiled with CFR 0.152.
 */
package net;

import net._v_0;
import net.a5_0;
import net.apt_2;
import net.ny_1;
import net.pp_0;

/*
 * Renamed from net.alI
 */
class ali_1
extends _v_0 {
    private ny_1 b;
    private float c;
    private int d;

    @Override
    public void d() {
        if (--this.d <= 0) {
            this.d = 40 + a5_0.a(apt_2.i(this.b), 60);
            this.c = a5_0.a(apt_2.i(this.b), 360);
        }
        ((pp_0)apt_2.f(this.b)).a(this.c, false);
    }

    public ali_1(ny_1 ny_12) {
        this.b = ny_12;
        this.a(2);
    }

    @Override
    public boolean g() {
        return apt_2.b(this.b) == null && (this.b.onGround || apt_2.g(this.b) || apt_2.e(this.b));
    }
}

