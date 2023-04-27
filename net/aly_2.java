/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityPlayer;
import net.CG;
import net._v_0;
import net.a5_0;
import net.aV8;
import net.abs_1;
import net.ayj_0;
import net.h__0;
import net.nl_1;

/*
 * Renamed from net.aly
 */
public class aly_2
extends _v_0 {
    protected nl_1 g;
    protected Entity d;
    protected Class<? extends Entity> c;
    private float b;
    private int f;
    protected float e;

    @Override
    public void b() {
        this.f = 40 + a5_0.a(CG.a(this.g), 40);
    }

    @Override
    public boolean f() {
        return ayj_0.a(this.d) && !(CG.a(this.g, this.d) > (double)(this.e * this.e)) && this.f > 0;
    }

    @Override
    public void d() {
        abs_1.a(CG.F(this.g), this.d.posX, this.d.posY + (double)ayj_0.n(this.d), this.d.posZ, 10.0f, CG.C(this.g));
        --this.f;
    }

    @Override
    public boolean g() {
        if (a5_0.e(CG.a(this.g)) >= this.b) {
            return false;
        }
        if (CG.o(this.g) != null) {
            this.d = CG.o(this.g);
        }
        this.d = this.c == EntityPlayer.class ? aV8.a(this.g.worldObj, (Entity)this.g, this.e) : aV8.a(this.g.worldObj, this.c, h__0.d(CG.v(this.g), this.e, 3.0, this.e), (Entity)this.g);
        return this.d != null;
    }

    public aly_2(nl_1 nl_12, Class<? extends Entity> clazz, float f, float f2) {
        this.g = nl_12;
        this.c = clazz;
        this.e = f;
        this.b = f2;
        this.a(2);
    }

    public aly_2(nl_1 nl_12, Class<? extends Entity> clazz, float f) {
        this.g = nl_12;
        this.c = clazz;
        this.e = f;
        this.b = 0.02f;
        this.a(2);
    }

    @Override
    public void a() {
        this.d = null;
    }
}

