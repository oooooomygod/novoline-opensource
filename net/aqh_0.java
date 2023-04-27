/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aC8;
import net.aP2;
import net.ahy_1;
import net.arc_0;

/*
 * Renamed from net.aQh
 */
public class aqh_0 {
    private int d;
    private ahy_1[] b;
    private Class a;
    private arc_0 c;

    public arc_0 c() {
        return this.c;
    }

    public aqh_0(arc_0 arc_02, Class clazz, int n) {
        this.c = arc_02;
        this.a = clazz;
        if (aC8.b(arc_02)) {
            this.b = new ahy_1[n];
            for (int i = 0; i < this.b.length; ++i) {
                this.b[i] = new ahy_1(arc_02, clazz, i);
            }
        }
    }

    public int b() {
        return this.d;
    }

    public Class a() {
        return this.a;
    }

    public ahy_1 a(int n) {
        aP2.b();
        return n >= 0 && n < this.b.length ? this.b[n] : null;
    }
}

