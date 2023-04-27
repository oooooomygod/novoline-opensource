/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.a5Y;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.rz
 */
public class rz_2
extends q1_0 {
    a5Y k;
    a5Y i;
    a5Y h;
    a5Y j;

    public rz_2(int n) {
        this.k = new a5Y(this, 0, n);
        up_0.a(this.k, -4.0f, 16.0f, -4.0f, 8, 8, 8);
        this.k = new a5Y(this, 0, n);
        up_0.a(this.k, -3.0f, 17.0f, -3.0f, 6, 6, 6);
        this.j = new a5Y(this, 32, 0);
        up_0.a(this.j, -3.25f, 18.0f, -3.5f, 2, 2, 2);
        this.i = new a5Y(this, 32, 4);
        up_0.a(this.i, 1.25f, 18.0f, -3.5f, 2, 2, 2);
        this.h = new a5Y(this, 32, 8);
        up_0.a(this.h, 0.0f, 21.0f, -3.5f, 1, 1, 1);
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        up_0.b(this.k, f6);
        if (this.j != null) {
            up_0.b(this.j, f6);
            up_0.b(this.i, f6);
            up_0.b(this.h, f6);
        }
    }
}

