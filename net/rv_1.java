/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.a5Y;
import net.ry_1;
import net.up_0;

/*
 * Renamed from net.rv
 */
public class rv_1
extends ry_1 {
    public boolean t;
    public boolean s;

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        super.a(f, f2, f3, f4, f5, f6, entity);
        this.r.p = true;
        this.q.t = 0.0f;
        this.q.o = -14.0f;
        this.q.z = -0.0f;
        this.l.t -= 0.0f;
        this.o.t -= 0.0f;
        this.h.t = (float)((double)this.h.t * 0.5);
        this.j.t = (float)((double)this.j.t * 0.5);
        this.l.t = (float)((double)this.l.t * 0.5);
        this.o.t = (float)((double)this.o.t * 0.5);
        if (this.h.t > 0.4f) {
            this.h.t = 0.4f;
        }
        if (this.j.t > 0.4f) {
            this.j.t = 0.4f;
        }
        if (this.h.t < -0.4f) {
            this.h.t = -0.4f;
        }
        if (this.j.t < -0.4f) {
            this.j.t = -0.4f;
        }
        if (this.l.t > 0.4f) {
            this.l.t = 0.4f;
        }
        if (this.o.t > 0.4f) {
            this.o.t = 0.4f;
        }
        if (this.l.t < -0.4f) {
            this.l.t = -0.4f;
        }
        if (this.o.t < -0.4f) {
            this.o.t = -0.4f;
        }
        if (this.t) {
            this.h.t = -0.5f;
            this.j.t = -0.5f;
            this.h.n = 0.05f;
            this.j.n = -0.05f;
        }
        this.h.z = 0.0f;
        this.j.z = 0.0f;
        this.l.z = 0.0f;
        this.o.z = 0.0f;
        this.l.o = -5.0f;
        this.o.o = -5.0f;
        this.r.z = -0.0f;
        this.r.o = -13.0f;
        this.k.g = this.r.g;
        this.k.o = this.r.o;
        this.k.z = this.r.z;
        this.k.t = this.r.t;
        this.k.m = this.r.m;
        this.k.n = this.r.n;
        if (this.s) {
            this.r.o -= 5.0f;
        }
    }

    public rv_1(float f) {
        super(0.0f, -14.0f, 64, 32);
        this.k = new a5Y(this, 0, 16);
        up_0.a(this.k, -4.0f, -8.0f, -4.0f, 8, 8, 8, f - 0.5f);
        up_0.a(this.k, 0.0f, -14.0f, 0.0f);
        this.q = new a5Y(this, 32, 16);
        up_0.a(this.q, -4.0f, 0.0f, -2.0f, 8, 12, 4, f);
        up_0.a(this.q, 0.0f, -14.0f, 0.0f);
        this.h = new a5Y(this, 56, 0);
        up_0.a(this.h, -1.0f, -2.0f, -1.0f, 2, 30, 2, f);
        up_0.a(this.h, -3.0f, -12.0f, 0.0f);
        this.j = new a5Y(this, 56, 0);
        this.j.x = true;
        up_0.a(this.j, -1.0f, -2.0f, -1.0f, 2, 30, 2, f);
        up_0.a(this.j, 5.0f, -12.0f, 0.0f);
        this.l = new a5Y(this, 56, 0);
        up_0.a(this.l, -1.0f, 0.0f, -1.0f, 2, 30, 2, f);
        up_0.a(this.l, -2.0f, -2.0f, 0.0f);
        this.o = new a5Y(this, 56, 0);
        this.o.x = true;
        up_0.a(this.o, -1.0f, 0.0f, -1.0f, 2, 30, 2, f);
        up_0.a(this.o, 2.0f, -2.0f, 0.0f);
    }
}

