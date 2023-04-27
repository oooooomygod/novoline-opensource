/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.B7;
import net.N7;
import net.World;
import net._v_0;
import net.a5_0;
import net.a6w_0;
import net.aV8;
import net.abs_1;
import net.aop_1;
import net.apf_0;
import net.dz_0;
import net.h__0;
import net.n4_0;
import net.n5_0;
import net.na_2;
import net.tz_1;
import net.wr_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net._h
 */
public class _h_0
extends _v_0 {
    private n5_0 d;
    int f;
    private n5_0 b;
    double c;
    World e;

    private n5_0 a() {
        float f = 8.0f;
        List list = aV8.a(this.e, this.d.getClass(), h__0.d(N7.e(this.d), f, f, f));
        double d = Double.MAX_VALUE;
        n5_0 n5_02 = null;
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            n5_0 n5_03 = (n5_0)dz_0.b(iterator);
            if (!N7.a(this.d, n5_03) || !(N7.a(this.d, (Entity)n5_03) < d)) continue;
            n5_02 = n5_03;
            d = N7.a(this.d, (Entity)n5_03);
        }
        return n5_02;
    }

    @Override
    public boolean g() {
        if (!N7.b(this.d)) {
            return false;
        }
        this.b = this.a();
        return this.b != null;
    }

    @Override
    public void a() {
        this.b = null;
        this.f = 0;
    }

    private void c() {
        n4_0 n4_02 = N7.a(this.d, (n4_0)this.b);
        EntityPlayer entityPlayer = N7.c(this.d);
        if (N7.c(this.b) != null) {
            entityPlayer = N7.c(this.b);
        }
        a6w_0.a(entityPlayer, aop_1.r);
        if (this.d instanceof na_2) {
            a6w_0.a(entityPlayer, apf_0.H);
        }
        N7.a(this.d, 6000);
        N7.a(this.b, 6000);
        N7.a(this.d);
        N7.a(this.b);
        wr_0.a(n4_02, -24000);
        wr_0.a(n4_02, this.d.posX, this.d.posY, this.d.posZ, 0.0f, 0.0f);
        aV8.b(this.e, n4_02);
        Random random = N7.j(this.d);
        int n = 0;
        while (true) {
            double d = a5_0.f(random) * 0.02;
            double d2 = a5_0.f(random) * 0.02;
            double d3 = a5_0.f(random) * 0.02;
            double d4 = a5_0.c(random) * (double)this.d.width * 2.0 - (double)this.d.width;
            double d5 = 0.5 + a5_0.c(random) * (double)this.d.n;
            double d6 = a5_0.c(random) * (double)this.d.width * 2.0 - (double)this.d.width;
            aV8.a(this.e, B7.HEART, this.d.posX + d4, this.d.posY + d5, this.d.posZ + d6, d, d2, d3, new int[0]);
            ++n;
        }
    }

    @Override
    public boolean f() {
        return N7.d(this.b) && N7.b(this.b) && this.f < 60;
    }

    @Override
    public void d() {
        abs_1.a(N7.h(this.d), this.b, 10.0f, N7.g(this.d));
        tz_1.a(N7.i(this.d), this.b, this.c);
        ++this.f;
        if (this.f >= 60 && N7.a(this.d, (Entity)this.b) < 9.0) {
            this.c();
        }
    }

    public _h_0(n5_0 n5_02, double d) {
        this.d = n5_02;
        this.e = n5_02.worldObj;
        this.c = d;
        this.a(3);
    }
}

