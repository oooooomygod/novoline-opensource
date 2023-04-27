/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.MK;
import net._v_0;
import net.a5_0;
import net.lw_1;
import net.nw_1;
import net.py_0;

class al3
extends _v_0 {
    private nw_1 b;

    @Override
    public boolean f() {
        return false;
    }

    public al3(nw_1 nw_12) {
        this.b = nw_12;
        this.a(1);
    }

    @Override
    public boolean g() {
        double d;
        double d2;
        py_0 py_02 = lw_1.a(this.b);
        if (!MK.c(py_02)) {
            return true;
        }
        double d3 = MK.d(py_02) - this.b.posX;
        double d4 = d3 * d3 + (d2 = MK.a(py_02) - this.b.posY) * d2 + (d = MK.b(py_02) - this.b.posZ) * d;
        return d4 < 1.0 || d4 > 3600.0;
    }

    @Override
    public void b() {
        Random random = lw_1.e(this.b);
        double d = this.b.posX + (double)((a5_0.e(random) * 2.0f - 1.0f) * 16.0f);
        double d2 = this.b.posY + (double)((a5_0.e(random) * 2.0f - 1.0f) * 16.0f);
        double d3 = this.b.posZ + (double)((a5_0.e(random) * 2.0f - 1.0f) * 16.0f);
        MK.a(lw_1.a(this.b), d, d2, d3, 1.0);
    }
}

