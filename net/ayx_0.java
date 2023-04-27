/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityLivingBase;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.aYx
 */
public class ayx_0
extends aY3<ry_1> {
    @Override
    protected void a(ry_1 ry_12, int n) {
        aEF.b();
        this.a(ry_12);
        switch (n) {
            case 1: {
                ry_12.l.p = true;
                ry_12.o.p = true;
            }
            case 2: {
                ry_12.q.p = true;
                ry_12.l.p = true;
                ry_12.o.p = true;
            }
            case 3: {
                ry_12.q.p = true;
                ry_12.h.p = true;
                ry_12.j.p = true;
            }
            case 4: {
                ry_12.r.p = true;
                ry_12.k.p = true;
            }
        }
    }

    public ayx_0(jg_1<?> jg_12) {
        super(jg_12);
    }

    protected void a(ry_1 ry_12) {
        ew_0.a(ry_12, false);
    }

    @Override
    protected void a() {
        aEF.b();
        this.j = new rj_2(0.5f);
        this.i = new rj_2(1.0f);
        ListInvoker.b(new ListInvoker[4]);
    }

    @Override
    protected ry_1 a(EntityLivingBase entityLivingBase, ItemStack itemStack, int n, ry_1 ry_12) {
        aEF.b();
        ry_1 ry_13 = px_0.a(act_2.k(itemStack), entityLivingBase, itemStack, n);
        ry_1 ry_14 = ry_13 == null ? ry_12 : ry_13;
        if (ListInvoker.b() != null) {
            aEF.b(new String[1]);
        }
        return ry_14;
    }
}

