/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a5Y;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.rg
 */
public class rg_2
extends q1_0 {
    public a5Y h;
    public a5Y j;
    public a5Y i = up_0.a(new a5Y(this, 0, 0), 64, 64);

    public void a() {
        this.j.t = this.i.t;
        up_0.b(this.h, 0.0625f);
        up_0.b(this.j, 0.0625f);
        up_0.b(this.i, 0.0625f);
    }

    public rg_2() {
        up_0.a(this.i, 0.0f, -5.0f, -14.0f, 14, 5, 14, 0.0f);
        this.i.g = 1.0f;
        this.i.o = 7.0f;
        this.i.z = 15.0f;
        this.j = up_0.a(new a5Y(this, 0, 0), 64, 64);
        up_0.a(this.j, -1.0f, -2.0f, -15.0f, 2, 4, 1, 0.0f);
        this.j.g = 8.0f;
        this.j.o = 7.0f;
        this.j.z = 15.0f;
        this.h = up_0.a(new a5Y(this, 0, 19), 64, 64);
        up_0.a(this.h, 0.0f, 0.0f, 0.0f, 14, 10, 14, 0.0f);
        this.h.g = 1.0f;
        this.h.o = 6.0f;
        this.h.z = 1.0f;
    }
}

