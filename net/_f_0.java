/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import deobf.Vec3;
import net._v_0;
import net.aMY;
import net.atn_0;
import net.avu_1;
import net.nu_1;
import net.tz_1;

/*
 * Renamed from net._f
 */
public class _f_0
extends _v_0 {
    private double c;
    private double f;
    private float b;
    private nu_1 g;
    private EntityLivingBase h;
    private double e;
    private double d;

    @Override
    public boolean f() {
        return !tz_1.b(aMY.a(this.g)) && atn_0.J(this.h) && atn_0.b(this.h, this.g) < (double)(this.b * this.b);
    }

    @Override
    public boolean g() {
        this.h = aMY.j(this.g);
        if (this.h == null) {
            return false;
        }
        if (atn_0.b(this.h, this.g) > (double)(this.b * this.b)) {
            return false;
        }
        avu_1.a(this.g, 16, 7, new Vec3(this.h.posX, this.h.posY, this.h.posZ));
        return false;
    }

    @Override
    public void b() {
        tz_1.a(aMY.a(this.g), this.d, this.c, this.e, this.f);
    }

    @Override
    public void a() {
        this.h = null;
    }

    public _f_0(nu_1 nu_12, double d, float f) {
        this.g = nu_12;
        this.f = d;
        this.b = f;
        this.a(1);
    }
}

