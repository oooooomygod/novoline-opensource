/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.C3;
import net.awl_1;
import net.ol_2;
import net.ry_1;
import net.up_0;

/*
 * Renamed from net.rp
 */
public class rp_2
extends ry_1 {
    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        if (entity instanceof ol_2) {
            ol_2 ol_22 = (ol_2)entity;
            this.r.t = (float)Math.PI / 180 * C3.a(awl_1.e(ol_22));
            this.r.m = (float)Math.PI / 180 * C3.d(awl_1.e(ol_22));
            this.r.n = (float)Math.PI / 180 * C3.b(awl_1.e(ol_22));
            up_0.a(this.r, 0.0f, 1.0f, 0.0f);
            this.q.t = (float)Math.PI / 180 * C3.a(awl_1.g(ol_22));
            this.q.m = (float)Math.PI / 180 * C3.d(awl_1.g(ol_22));
            this.q.n = (float)Math.PI / 180 * C3.b(awl_1.g(ol_22));
            this.j.t = (float)Math.PI / 180 * C3.a(awl_1.i(ol_22));
            this.j.m = (float)Math.PI / 180 * C3.d(awl_1.i(ol_22));
            this.j.n = (float)Math.PI / 180 * C3.b(awl_1.i(ol_22));
            this.h.t = (float)Math.PI / 180 * C3.a(awl_1.d(ol_22));
            this.h.m = (float)Math.PI / 180 * C3.d(awl_1.d(ol_22));
            this.h.n = (float)Math.PI / 180 * C3.b(awl_1.d(ol_22));
            this.o.t = (float)Math.PI / 180 * C3.a(awl_1.f(ol_22));
            this.o.m = (float)Math.PI / 180 * C3.d(awl_1.f(ol_22));
            this.o.n = (float)Math.PI / 180 * C3.b(awl_1.f(ol_22));
            up_0.a(this.o, 1.9f, 11.0f, 0.0f);
            this.l.t = (float)Math.PI / 180 * C3.a(awl_1.a(ol_22));
            this.l.m = (float)Math.PI / 180 * C3.d(awl_1.a(ol_22));
            this.l.n = (float)Math.PI / 180 * C3.b(awl_1.a(ol_22));
            up_0.a(this.l, -1.9f, 11.0f, 0.0f);
            rp_2.a(this.r, this.k);
        }
    }

    protected rp_2(float f, int n, int n2) {
        super(f, 0.0f, n, n2);
    }

    public rp_2() {
        this(0.0f);
    }

    public rp_2(float f) {
        this(f, 64, 32);
    }
}

