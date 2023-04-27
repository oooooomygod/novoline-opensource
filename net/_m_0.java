/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.google.common.base.Predicate;
import deobf.EntityLivingBase;
import java.util.List;
import net._S;
import net.a5_0;
import net.aMY;
import net.aV8;
import net.an7_0;
import net.asg_0;
import net.bw_0;
import net.h__0;
import net.nu_1;
import net.od_2;
import net.oe_0;

/*
 * Renamed from net._m
 */
public class _m_0<T extends EntityLivingBase>
extends _S {
    private int j;
    protected EntityLivingBase k;
    protected oe_0 h;
    protected Predicate<? super T> i;
    protected Class<T> l;

    public _m_0(nu_1 nu_12, Class<T> clazz, int n, boolean bl, boolean bl2, Predicate<? super T> predicate) {
        super(nu_12, bl, bl2);
        this.l = clazz;
        this.j = n;
        this.h = new oe_0(nu_12);
        this.a(1);
        this.i = new bw_0(this, predicate);
    }

    @Override
    public void b() {
        aMY.a(this.d, this.k);
        super.b();
    }

    public _m_0(nu_1 nu_12, Class<T> clazz, boolean bl, boolean bl2) {
        this(nu_12, clazz, 10, bl, bl2, null);
    }

    public _m_0(nu_1 nu_12, Class<T> clazz, boolean bl) {
        this(nu_12, clazz, bl, false);
    }

    @Override
    public boolean g() {
        if (this.j > 0 && a5_0.a(aMY.o(this.d), this.j) != 0) {
            return false;
        }
        double d = this.a();
        List list = aV8.a(this.d.worldObj, this.l, h__0.d(aMY.c(this.d), d, 4.0, d), an7_0.a(this.i, od_2.d));
        asg_0.a(list, this.h);
        if (ListInvoker.isEmpty(list)) {
            return false;
        }
        this.k = (EntityLivingBase)ListInvoker.get(list, 0);
        return true;
    }
}

