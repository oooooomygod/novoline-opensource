/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumDifficulty;
import net.CG;
import net.HE;
import net.J9;
import net._c_0;
import net.a5_0;
import net.aV8;
import net.af4_0;
import net.nl_1;

/*
 * Renamed from net._n
 */
public class _n_0
extends _c_0 {
    private int i = -1;
    private int h;

    public _n_0(nl_1 nl_12) {
        super(nl_12);
    }

    @Override
    public void a() {
        super.a();
        aV8.b(this.c.worldObj, CG.z(this.c), this.b, -1);
    }

    @Override
    public boolean f() {
        double d = CG.b(this.c, this.b);
        if (this.h <= 240) {
            if (!af4_0.b(this.c.worldObj, this.b) && d < 4.0) {
                boolean bl = true;
                return bl;
            }
        }
        boolean bl = false;
        return bl;
    }

    @Override
    public void b() {
        super.b();
        this.h = 0;
    }

    @Override
    public boolean g() {
        if (!super.g()) {
            return false;
        }
        if (!J9.c(aV8.k(this.c.worldObj), HE.a)) {
            return false;
        }
        return !af4_0.b(this.c.worldObj, this.b);
    }

    @Override
    public void d() {
        super.d();
        if (a5_0.a(CG.a(this.c), 20) == 0) {
            aV8.c(this.c.worldObj, 1010, this.b, 0);
        }
        ++this.h;
        int n = (int)((float)this.h / 240.0f * 10.0f);
        if (n != this.i) {
            aV8.b(this.c.worldObj, CG.z(this.c), this.b, n);
            this.i = n;
        }
        if (this.h == 240 && aV8.p(this.c.worldObj) == EnumDifficulty.HARD) {
            aV8.j(this.c.worldObj, this.b);
            aV8.c(this.c.worldObj, 1012, this.b, 0);
            aV8.c(this.c.worldObj, 2001, this.b, BlocksInvoker.v(this.f));
        }
    }
}

