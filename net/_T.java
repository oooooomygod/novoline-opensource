/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.minecraft.block.BlockPos;


public class _T
extends _v_0 {
    private int f;
    private World c;
    aym_1 b;
    private nz_0 e;
    private nz_0 d;

    @Override
    public void b() {
        this.f = 300;
        ayh_1.d(this.d, true);
    }

    public _T(nz_0 nz_02) {
        this.d = nz_02;
        this.c = nz_02.worldObj;
        this.a(3);
    }

    private boolean d() {
        if (!xx_2.g(this.b)) {
            return false;
        }
        int n = (int)((double)xx_2.e(this.b) * 0.35);
        return xx_2.i(this.b) < n;
    }

    @Override
    public void d() {
        --this.f;
        abs_1.a(ayh_1.l(this.d), this.e, 10.0f, 30.0f);
        if (ayh_1.a(this.d, (Entity)this.e) > 2.25) {
            tz_1.a(ayh_1.o(this.d), this.e, 0.25);
        } else if (this.f == 0 && ayh_1.n(this.e)) {
            this.c();
        }
        if (a5_0.a(ayh_1.q(this.d), 35) == 0) {
            aV8.a(this.c, (Entity)this.d, (byte)12);
        }
    }

    @Override
    public void a() {
        this.b = null;
        this.e = null;
        ayh_1.d(this.d, false);
    }

    private void c() {
        nz_0 nz_02 = ayh_1.a(this.d, this.e);
        ayh_1.a(this.e, 6000);
        ayh_1.a(this.d, 6000);
        ayh_1.c(this.e, false);
        ayh_1.c(this.d, false);
        ayh_1.a(nz_02, -24000);
        ayh_1.a(nz_02, this.d.posX, this.d.posY, this.d.posZ, 0.0f, 0.0f);
        aV8.b(this.c, nz_02);
        aV8.a(this.c, (Entity)nz_02, (byte)12);
    }

    @Override
    public boolean g() {
        if (ayh_1.c(this.d) != 0) {
            return false;
        }
        if (a5_0.a(ayh_1.q(this.d), 500) != 0) {
            return false;
        }
        this.b = EX.a(aV8.o(this.c), new BlockPos(this.d), 0);
        if (this.b == null) {
            return false;
        }
        if (this.d() && ayh_1.b(this.d, true)) {
            aV8.a(this.c, nz_0.class, h__0.d(ayh_1.k(this.d), 8.0, 3.0, 8.0), (Entity)this.d);
            return false;
        }
        return false;
    }

    @Override
    public boolean f() {
        return this.f >= 0 && this.d() && ayh_1.c(this.d) == 0 && ayh_1.b(this.d, false);
    }
}

