/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.a5Y;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.rq
 */
public class rq_2
extends q1_0 {
    public a5Y h;

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        super.a(f, f2, f3, f4, f5, f6, entity);
        this.h.m = f4 / 57.295776f;
        this.h.t = f5 / 57.295776f;
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        up_0.b(this.h, f6);
    }

    public rq_2() {
        this(0, 35, 64, 64);
    }

    public rq_2(int n, int n2, int n3, int n4) {
        this.b = n3;
        this.e = n4;
        this.h = new a5Y(this, n, n2);
        up_0.a(this.h, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        up_0.a(this.h, 0.0f, 0.0f, 0.0f);
    }
}

