/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.FY;
import net.T0;
import net.ng_1;
import net.wy_2;


public class T_
extends T0 {
    private ng_1 e;
    ng_1 c;
    private boolean d;

    public T_(ng_1 ng_12, ng_1 ng_13) {
        this.c = ng_12;
        super(ng_13);
        this.d = false;
        this.e = ng_13;
    }

    public boolean b() {
        return this.b;
    }

    public boolean a() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    @Override
    public void a() {
        if (this.b) {
            FY.a(this.e, wy_2.STEP);
            this.b = false;
        }
    }
}

