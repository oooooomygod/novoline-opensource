/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import net.CG;
import net.MathHelper;
import net._v_0;
import net.a5_0;
import net.nl_1;

/*
 * Renamed from net._a
 */
public class _a_0
extends _v_0 {
    EntityLivingBase b;
    float d;
    nl_1 c;

    @Override
    public boolean g() {
        this.b = CG.o(this.c);
        if (this.b == null) {
            return false;
        }
        double d = CG.a(this.c, (Entity)this.b);
        return d >= 4.0 && d <= 16.0 && this.c.onGround && a5_0.a(CG.a(this.c), 5) == 0;
    }

    public _a_0(nl_1 nl_12, float f) {
        this.c = nl_12;
        this.d = f;
        this.a(5);
    }

    @Override
    public boolean f() {
        return !this.c.onGround;
    }

    @Override
    public void b() {
        double d = this.b.posX - this.c.posX;
        double d2 = this.b.posZ - this.c.posZ;
        float f = MathHelper.e(d * d + d2 * d2);
        this.c.motionX += d / (double)f * 0.5 * (double)0.8f + this.c.motionX * (double)0.2f;
        this.c.motionZ += d2 / (double)f * 0.5 * (double)0.8f + this.c.motionZ * (double)0.2f;
        this.c.motionY = this.d;
    }
}

