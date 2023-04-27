/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import net._r_0;
import net.a5_0;
import net.aMY;
import net.n9_0;

/*
 * Renamed from net._u
 */
class _u_0
extends _r_0 {
    public _u_0(n9_0 n9_02, Class<? extends Entity> clazz) {
        super(n9_02, clazz, 1.0, true);
    }

    @Override
    protected double a(EntityLivingBase entityLivingBase) {
        return 4.0f + entityLivingBase.width;
    }

    @Override
    public boolean f() {
        float f = aMY.a(this.l, 1.0f);
        if (f >= 0.5f && a5_0.a(aMY.o(this.l), 100) == 0) {
            aMY.a(this.l, (EntityLivingBase)null);
            return false;
        }
        return super.f();
    }
}

