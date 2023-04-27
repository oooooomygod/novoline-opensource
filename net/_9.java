/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityLivingBase;
import java.util.Iterator;
import net._S;
import net.aMY;
import net.aV8;
import net.dz_0;
import net.h__0;
import net.nu_1;
import net.rm_2;

public class _9
extends _S {
    private boolean i;
    private Class[] h;
    private int j;

    @Override
    public boolean g() {
        int n = aMY.m(this.d);
        return n != this.j && this.a(aMY.h(this.d), false);
    }

    @Override
    public void b() {
        aMY.a(this.d, aMY.h(this.d));
        this.j = aMY.m(this.d);
        if (this.i) {
            double d = this.a();
            Iterator iterator = ListInvoker.iterator(aV8.a(this.d.worldObj, this.d.getClass(), h__0.d(new rm_2(this.d.posX, this.d.posY, this.d.posZ, this.d.posX + 1.0, this.d.posY + 1.0, this.d.posZ + 1.0), d, 10.0, d)));
            while (dz_0.c(iterator)) {
                nu_1 nu_12 = (nu_1)dz_0.b(iterator);
                if (this.d == nu_12 || aMY.j(nu_12) != null || aMY.b(nu_12, aMY.h(this.d))) continue;
                for (Class clazz : this.h) {
                    if (nu_12.getClass() == clazz) break;
                }
                this.a(nu_12, aMY.h(this.d));
            }
        }
        super.b();
    }

    public _9(nu_1 nu_12, boolean bl, Class ... classArray) {
        super(nu_12, false);
        this.i = bl;
        this.h = classArray;
        this.a(1);
    }

    protected void a(nu_1 nu_12, EntityLivingBase entityLivingBase) {
        aMY.a(nu_12, entityLivingBase);
    }
}

