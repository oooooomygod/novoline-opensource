/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.IP;
import net.ao7_0;
import net.qr_2;
import net.rm_2;

public class aV1
implements ao7_0 {
    private double a;
    private qr_2 b;
    private double c;
    private double d;

    @Override
    public boolean a(rm_2 rm_22) {
        return this.a(rm_22.e, rm_22.a, rm_22.f, rm_22.b, rm_22.c, rm_22.d);
    }

    @Override
    public void a(double d, double d2, double d3) {
        this.a = d;
        this.c = d2;
        this.d = d3;
    }

    public aV1() {
        this(IP.a());
    }

    public boolean a(double d, double d2, double d3, double d4, double d5, double d6) {
        return this.b.a(d - this.a, d2 - this.c, d3 - this.d, d4 - this.a, d5 - this.c, d6 - this.d);
    }

    public aV1(qr_2 qr_22) {
        this.b = qr_22;
    }
}

