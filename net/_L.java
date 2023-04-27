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
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import java.util.List;
import net.CG;
import net.NR;
import net._v_0;
import net.a6w_0;
import net.aSY;
import net.aV8;
import net.abb_0;
import net.ayj_0;
import net.dw_2;
import net.h__0;
import net.nl_1;
import net.nu_1;
import net.oe_0;
import org.apache.logging.log4j.Logger;


public class _L
extends _v_0 {
    private Predicate<Entity> c;
    private EntityLivingBase d;
    private oe_0 e;
    private static Logger b = LogManagerInvoker.c();
    private nl_1 f;

    @Override
    public boolean g() {
        double d = this.a();
        List list = aV8.a(this.f.worldObj, EntityPlayer.class, h__0.d(CG.v(this.f), d, 4.0, d), this.c);
        ListInvoker.sort(list, this.e);
        if (ListInvoker.isEmpty(list)) {
            return false;
        }
        this.d = (EntityLivingBase)ListInvoker.get(list, 0);
        return true;
    }

    protected double a() {
        CG.a(this.f, abb_0.c);
        return 16.0;
    }

    @Override
    public void a() {
        CG.a(this.f, null);
        super.b();
    }

    private boolean lambda$new$0(Entity entity) {
        if (!(entity instanceof EntityPlayer)) {
            return false;
        }
        if (aSY.b(((EntityPlayer)entity).abilities)) {
            return false;
        }
        double d = this.a();
        if (ayj_0.l(entity)) {
            d *= (double)0.8f;
        }
        if (ayj_0.L(entity)) {
            float f = a6w_0.b((EntityPlayer)entity);
            if (f < 0.1f) {
                f = 0.1f;
            }
            d *= (double)(0.7f * f);
        }
        return !((double)ayj_0.d(entity, this.f) > d) && NR.a(this.f, (EntityLivingBase)entity, false, true);
    }

    public _L(nl_1 nl_12) {
        this.f = nl_12;
        if (nl_12 instanceof nu_1) {
            LoggerInvoker.warn(b, dw_2.a);
        }
        this.c = this::lambda$new$0;
        this.e = new oe_0(nl_12);
    }

    @Override
    public void b() {
        CG.a(this.f, this.d);
        super.b();
    }

    @Override
    public boolean f() {
        CG.o(this.f);
        return false;
    }
}

