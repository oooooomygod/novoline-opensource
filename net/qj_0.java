/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a5Y;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.qJ
 */
public class qj_0
extends q1_0 {
    public a5Y h;
    public a5Y j;
    public a5Y i;

    public qj_0() {
        this.b = 64;
        this.e = 64;
        this.j = new a5Y(this, 0, 0);
        up_0.a(this.j, -10.0f, 0.0f, -2.0f, 20, 40, 1, 0.0f);
        this.h = new a5Y(this, 44, 0);
        up_0.a(this.h, -1.0f, -30.0f, -1.0f, 2, 42, 2, 0.0f);
        this.i = new a5Y(this, 0, 42);
        up_0.a(this.i, -10.0f, -32.0f, -1.0f, 20, 2, 2, 0.0f);
    }

    public void a() {
        this.j.o = -32.0f;
        up_0.b(this.j, 0.0625f);
        up_0.b(this.h, 0.0625f);
        up_0.b(this.i, 0.0625f);
    }
}

