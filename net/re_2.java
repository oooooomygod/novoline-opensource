/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.a5Y;
import net.rq_2;
import net.up_0;

/*
 * Renamed from net.re
 */
public class re_2
extends rq_2 {
    private a5Y i = new a5Y(this, 32, 0);

    public re_2() {
        super(0, 0, 64, 64);
        up_0.a(this.i, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.25f);
        up_0.a(this.i, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        super.a(entity, f, f2, f3, f4, f5, f6);
        up_0.b(this.i, f6);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        super.a(f, f2, f3, f4, f5, f6, entity);
        this.i.m = this.h.m;
        this.i.t = this.h.t;
    }
}

