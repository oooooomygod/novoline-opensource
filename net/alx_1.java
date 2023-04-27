/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EnumDifficulty;
import net.Ma;
import net._v_0;
import net.aBR;
import net.aDJ;
import net.aV8;
import net.abb_0;
import net.abs_1;
import net.an4_0;
import net.atn_0;
import net.nx_1;
import net.tz_1;

/*
 * Renamed from net.alx
 */
class alx_1
extends _v_0 {
    private int c;
    private nx_1 b;

    @Override
    public void b() {
        this.c = -10;
        tz_1.a(aBR.h(this.b));
        abs_1.a(aBR.c(this.b), aBR.a(this.b), 90.0f, 90.0f);
        this.b.p = true;
    }

    @Override
    public boolean f() {
        return super.f() && (aBR.f(this.b) || aBR.b(this.b, aBR.a(this.b)) > 9.0);
    }

    public alx_1(nx_1 nx_12) {
        this.b = nx_12;
        this.a(3);
    }

    @Override
    public void a() {
        nx_1.a(this.b, 0);
        aBR.a(this.b, null);
        an4_0.a(nx_1.a(this.b));
    }

    @Override
    public boolean g() {
        EntityLivingBase entityLivingBase = aBR.a(this.b);
        return atn_0.J(entityLivingBase);
    }

    @Override
    public void d() {
        EntityLivingBase entityLivingBase = aBR.a(this.b);
        tz_1.a(aBR.h(this.b));
        abs_1.a(aBR.c(this.b), entityLivingBase, 90.0f, 90.0f);
        if (!aBR.a(this.b, (Entity)entityLivingBase)) {
            aBR.a(this.b, null);
        } else {
            ++this.c;
            if (this.c == 0) {
                nx_1.a(this.b, atn_0.h(aBR.a(this.b)));
                aV8.a(this.b.worldObj, (Entity)this.b, (byte)21);
            } else if (this.c >= aBR.j(this.b)) {
                float f = 1.0f;
                if (aV8.p(this.b.worldObj) == EnumDifficulty.HARD) {
                    f += 2.0f;
                }
                if (aBR.f(this.b)) {
                    f += 2.0f;
                }
                atn_0.a(entityLivingBase, aDJ.b(this.b, this.b), f);
                atn_0.a(entityLivingBase, aDJ.a(this.b), (float)Ma.d(aBR.a(this.b, abb_0.f)));
                aBR.a(this.b, null);
            } else if (this.c < 60 || this.c % 20 == 0) {
                // empty if block
            }
            super.d();
        }
    }
}

