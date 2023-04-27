/*
 * Decompiled with CFR 0.152.
 */
package net;

import net._v_0;
import net.a5_0;
import net.aMY;
import net.avu_1;
import net.nu_1;
import net.tz_1;

public class _J
extends _v_0 {
    private boolean g;
    private nu_1 f;
    private double d;
    private double b;
    private double e;
    private double h;
    private int c;

    @Override
    public boolean f() {
        return !tz_1.b(aMY.a(this.f));
    }

    @Override
    public boolean g() {
        if (!this.g) {
            if (aMY.d(this.f) >= 100) {
                return false;
            }
            if (a5_0.a(aMY.o(this.f), this.c) != 0) {
                return false;
            }
        }
        avu_1.a(this.f, 10, 7);
        return false;
    }

    public void c() {
        this.g = true;
    }

    public _J(nu_1 nu_12, double d, int n) {
        this.f = nu_12;
        this.e = d;
        this.c = n;
        this.a(1);
    }

    public _J(nu_1 nu_12, double d) {
        this(nu_12, d, 120);
    }

    @Override
    public void b() {
        tz_1.a(aMY.a(this.f), this.h, this.d, this.b, this.e);
    }

    public void b(int n) {
        this.c = n;
    }
}

