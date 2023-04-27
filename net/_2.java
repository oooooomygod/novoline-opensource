/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import com.google.common.base.Predicate;
import deobf.EntityLivingBase;
import java.util.List;
import net.CG;
import net.NR;
import net._v_0;
import net.aV8;
import net.abb_0;
import net.atn_0;
import net.h__0;
import net.nl_1;
import net.nu_1;
import net.oe_0;
import net.zf_2;
import org.apache.logging.log4j.Logger;


public class _2
extends _v_0 {
    private Predicate<EntityLivingBase> e;
    private EntityLivingBase g;
    private oe_0 f;
    private nl_1 b;
    private static Logger c = LogManagerInvoker.c();
    private Class<? extends EntityLivingBase> d;

    @Override
    public void b() {
        CG.a(this.b, this.g);
        super.b();
    }

    @Override
    public boolean f() {
        CG.o(this.b);
        return false;
    }

    @Override
    public void a() {
        CG.a(this.b, null);
        super.b();
    }

    @Override
    public boolean g() {
        double d = this.a();
        List list = aV8.a(this.b.worldObj, this.d, h__0.d(CG.v(this.b), d, 4.0, d), this.e);
        ListInvoker.sort(list, this.f);
        if (ListInvoker.isEmpty(list)) {
            return false;
        }
        this.g = (EntityLivingBase)ListInvoker.get(list, 0);
        return true;
    }

    private boolean lambda$new$0(EntityLivingBase entityLivingBase) {
        double d = this.a();
        if (atn_0.s(entityLivingBase)) {
            d *= (double)0.8f;
        }
        return !atn_0.M(entityLivingBase) && !((double)atn_0.a(entityLivingBase, this.b) > d) && NR.a(this.b, entityLivingBase, false, true);
    }

    public _2(nl_1 nl_12, Class<? extends EntityLivingBase> clazz) {
        this.b = nl_12;
        this.d = clazz;
        if (nl_12 instanceof nu_1) {
            LoggerInvoker.warn(c, zf_2.a);
        }
        this.e = this::lambda$new$0;
        this.f = new oe_0(nl_12);
    }

    protected double a() {
        CG.a(this.b, abb_0.c);
        return 16.0;
    }
}

