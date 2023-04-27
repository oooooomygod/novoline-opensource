/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aY3;
import net.ew_0;
import net.jg_1;
import net.ry_1;

public class aY7
extends aY3<ry_1> {
    protected void a(ry_1 ry_12) {
        ew_0.a(ry_12, false);
    }

    @Override
    protected void a(ry_1 ry_12, int n) {
        this.a(ry_12);
        switch (n) {
            case 1: {
                ry_12.l.p = true;
                ry_12.o.p = true;
                break;
            }
            case 2: {
                ry_12.q.p = true;
                ry_12.l.p = true;
                ry_12.o.p = true;
                break;
            }
            case 3: {
                ry_12.q.p = true;
                ry_12.h.p = true;
                ry_12.j.p = true;
                break;
            }
            case 4: {
                ry_12.r.p = true;
                ry_12.k.p = true;
            }
        }
    }

    @Override
    protected void a() {
        this.j = new ry_1(0.5f);
        this.i = new ry_1(1.0f);
    }

    public aY7(jg_1<?> jg_12) {
        super(jg_12);
    }
}

