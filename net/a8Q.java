/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Tessellator;
import java.util.Iterator;
import net.minecraft.client.Minecraft;

class a8Q
extends a87 {
    R8 D;

    @Override
    protected void a(int n, int n2, Tessellator tessellator) {
        super.a(n, n2, tessellator);
        if (this.A == 0) {
            R8.a(this.D, n + 115 - 18 + 1, n2 + 1 + 1, 18, 18);
        } else {
            R8.a(this.D, n + 115 - 18, n2 + 1, 18, 18);
        }
        if (this.A == 1) {
            R8.a(this.D, n + 165 - 18 + 1, n2 + 1 + 1, 36, 18);
        } else {
            R8.a(this.D, n + 165 - 18, n2 + 1, 36, 18);
        }
        if (this.A == 2) {
            R8.a(this.D, n + 215 - 18 + 1, n2 + 1 + 1, 54, 18);
        } else {
            R8.a(this.D, n + 215 - 18, n2 + 1, 54, 18);
        }
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        aH_ aH_2 = this.d(n);
        Item item = alp_1.a(aH_2);
        R8.a(this.D, n2 + 40, n3, item);
        int n7 = px_0.a(item);
        this.a(aop_1.V[n7], n2 + 115, n3, n % 2 == 0);
        this.a(aop_1.p[n7], n2 + 165, n3, n % 2 == 0);
        this.a(aH_2, n2 + 215, n3, n % 2 == 0);
    }

    @Override
    protected String a(int n) {
        return agj_1.c;
    }

    public a8Q(R8 r8, Minecraft minecraft) {
        this.D = r8;
        super(r8, minecraft);
        this.z = my_0.c();
        Iterator iterator = ListInvoker.iterator(aop_1.q);
        while (dz_0.c(iterator)) {
            aH_ aH_2 = (aH_)dz_0.b(iterator);
            int n = px_0.a(alp_1.a(aH_2));
            if (aQC.a(R8.k(r8), aH_2) > 0 || aop_1.p[n] != null && aQC.a(R8.k(r8), aop_1.p[n]) > 0 || aop_1.V[n] == null || aQC.a(R8.k(r8), aop_1.V[n]) > 0) {
                // empty if block
            }
            ListInvoker.add(this.z, aH_2);
        }
        this.B = new ayd_1(this, r8);
    }
}

