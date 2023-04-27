/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import java.util.List;
import net.Ma;
import net._m_0;
import net.aMY;
import net.aV8;
import net.aax_2;
import net.abb_0;
import net.ahw_2;
import net.asg_0;
import net.atn_0;
import net.h__0;
import net.nn_0;
import net.nu_1;
import net.zn_1;

class __
extends _m_0 {
    private nn_0 o;
    private int n;
    private EntityPlayer m;
    private int p;

    @Override
    public void d() {
        if (this.m != null) {
            if (--this.n <= 0) {
                this.k = this.m;
                this.m = null;
                super.b();
                aax_2.a(this.o, zn_1.a, 1.0f, 1.0f);
                aax_2.a(this.o, true);
                ahw_2 ahw_22 = aax_2.a(this.o, abb_0.e);
                Ma.a(ahw_22, nn_0.c());
            }
        } else {
            if (this.k != null) {
                if (this.k instanceof EntityPlayer && nn_0.a(this.o, (EntityPlayer)this.k)) {
                    if (atn_0.b(this.k, this.o) < 16.0) {
                        this.o.u();
                    }
                    this.p = 0;
                } else if (atn_0.b(this.k, this.o) > 256.0 && this.p++ >= 30 && this.o.c((Entity)this.k)) {
                    this.p = 0;
                }
            }
            super.d();
        }
    }

    @Override
    public boolean g() {
        double d = this.a();
        List list = aV8.a(this.d.worldObj, EntityPlayer.class, h__0.d(aMY.c(this.d), d, 4.0, d), this.i);
        asg_0.a(list, this.h);
        if (ListInvoker.isEmpty(list)) {
            return false;
        }
        this.m = (EntityPlayer)ListInvoker.get(list, 0);
        return true;
    }

    public __(nn_0 nn_02) {
        super((nu_1)nn_02, EntityPlayer.class, true);
        this.o = nn_02;
    }

    @Override
    public void a() {
        this.m = null;
        aax_2.a(this.o, false);
        ahw_2 ahw_22 = aax_2.a(this.o, abb_0.e);
        Ma.b(ahw_22, nn_0.c());
        super.a();
    }

    @Override
    public void b() {
        this.n = 5;
        this.p = 0;
    }

    @Override
    public boolean f() {
        if (this.m != null) {
            if (!nn_0.a(this.o, this.m)) {
                return false;
            }
            nn_0.a(this.o, true);
            aax_2.a(this.o, this.m, 10.0f, 10.0f);
            return true;
        }
        return super.f();
    }
}

