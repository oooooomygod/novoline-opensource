/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import net._v_0;
import net.aLD;
import net.atn_0;
import net.no_1;
import net.tz_1;

public class _8
extends _v_0 {
    private boolean b;
    private no_1 c;

    @Override
    public boolean g() {
        if (!aLD.d(this.c)) {
            return false;
        }
        if (aLD.f(this.c)) {
            return false;
        }
        if (!this.c.onGround) {
            return false;
        }
        EntityLivingBase entityLivingBase = aLD.c(this.c);
        return !(aLD.a(this.c, (Entity)entityLivingBase) < 144.0 && atn_0.m(entityLivingBase) != null || !this.b);
    }

    @Override
    public void b() {
        tz_1.a(aLD.b(this.c));
        this.c.l(true);
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public _8(no_1 no_12) {
        this.c = no_12;
        this.a(5);
    }

    @Override
    public void a() {
        this.c.l(false);
    }
}

