/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net._v_0;
import net.aCE;
import net.nd_2;
import net.om_2;
import net.tz_1;

/*
 * Renamed from net._g
 */
public class _g_0
extends _v_0 {
    nd_2 c;
    EntityLivingBase b;

    public _g_0(nd_2 nd_22) {
        this.c = nd_22;
        this.a(1);
    }

    @Override
    public boolean g() {
        EntityLivingBase entityLivingBase = om_2.h(this.c);
        return om_2.d(this.c) > 0 || om_2.a(this.c, entityLivingBase) < 9.0;
    }

    @Override
    public void d() {
        if (this.b == null) {
            om_2.a(this.c, -1);
        } else if (om_2.a(this.c, this.b) > 49.0) {
            om_2.a(this.c, -1);
        } else if (!aCE.a(om_2.b(this.c), this.b)) {
            om_2.a(this.c, -1);
        } else {
            om_2.a(this.c, 1);
        }
    }

    @Override
    public void b() {
        tz_1.a(om_2.c(this.c));
        this.b = om_2.h(this.c);
    }

    @Override
    public void a() {
        this.b = null;
    }
}

