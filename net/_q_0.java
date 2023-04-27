/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import net.CG;
import net.World;
import net._v_0;
import net.abs_1;
import net.atn_0;
import net.nl_1;
import net.tz_1;

/*
 * Renamed from net._q
 */
public class _q_0
extends _v_0 {
    EntityLivingBase b;
    int e;
    nl_1 c;
    World d;

    @Override
    public void d() {
        abs_1.a(CG.F(this.c), this.b, 30.0f, 30.0f);
        double d = this.c.width * 2.0f * this.c.width * 2.0f;
        double d2 = CG.a(this.c, this.b.posX, atn_0.i((EntityLivingBase)this.b).a, this.b.posZ);
        double d3 = 0.8;
        if (d2 > d && d2 < 16.0) {
            d3 = 1.33;
        } else if (d2 < 225.0) {
            d3 = 0.6;
        }
        tz_1.a(CG.e(this.c), this.b, d3);
        this.e = MathInvoker.max(this.e - 1, 0);
        if (d2 <= d && this.e <= 0) {
            this.e = 20;
            CG.c(this.c, this.b);
        }
    }

    public _q_0(nl_1 nl_12) {
        this.c = nl_12;
        this.d = nl_12.worldObj;
        this.a(3);
    }

    @Override
    public boolean f() {
        return !(!atn_0.J(this.b) || CG.a(this.c, (Entity)this.b) > 225.0 || tz_1.b(CG.e(this.c)) && !this.g());
    }

    @Override
    public boolean g() {
        CG.o(this.c);
        return false;
    }

    @Override
    public void a() {
        this.b = null;
        tz_1.a(CG.e(this.c));
    }
}

