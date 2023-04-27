/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.FY;
import net.ng_1;
import net.py_0;

class PW
extends py_0 {
    private ng_1 g;

    public PW(ng_1 ng_12) {
        super(ng_12);
        this.g = ng_12;
    }

    @Override
    public void e() {
        if (this.g.onGround && !FY.e(this.g)) {
            FY.a(this.g, 0.0);
        }
        super.e();
    }
}

