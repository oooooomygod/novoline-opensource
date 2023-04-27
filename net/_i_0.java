/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityPlayer;
import net._v_0;
import net.a5_0;
import net.aV8;
import net.avq_0;
import net.avu_1;
import net.ayj_0;
import net.na_1;
import net.tz_1;

/*
 * Renamed from net._i
 */
public class _i_0
extends _v_0 {
    private double e;
    private na_1 f;
    private double d;
    private double c;
    private double b;

    @Override
    public void b() {
        tz_1.a(avq_0.j(this.f), this.b, this.c, this.e, this.d);
    }

    @Override
    public boolean f() {
        return !tz_1.b(avq_0.j(this.f)) && this.f.h != null;
    }

    @Override
    public void d() {
        if (a5_0.a(avq_0.l(this.f), 50) == 0) {
            if (this.f.h instanceof EntityPlayer) {
                int n = avq_0.q(this.f);
                int n2 = avq_0.h(this.f);
                if (a5_0.a(avq_0.l(this.f), n2) < n) {
                    avq_0.a(this.f, (EntityPlayer)this.f.h);
                    aV8.a(this.f.worldObj, (Entity)this.f, (byte)7);
                    return;
                }
                avq_0.a(this.f, 5);
            }
            ayj_0.b(this.f.h, (Entity)null);
            this.f.h = null;
            avq_0.k(this.f);
            aV8.a(this.f.worldObj, (Entity)this.f, (byte)6);
        }
    }

    @Override
    public boolean g() {
        if (!avq_0.p(this.f) && this.f.h != null) {
            avu_1.a(this.f, 5, 4);
            return false;
        }
        return false;
    }

    public _i_0(na_1 na_12, double d) {
        this.f = na_12;
        this.d = d;
        this.a(1);
    }
}

