/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.EntityLivingBase;
import net.MathHelper;
import net.a5K;
import net.a9G;
import net.a9k_0;
import net.apr_0;
import net.asj_0;
import net.atT;
import net.q1_0;
import net.rr_1;

/*
 * Renamed from net.a9a
 */
public class a9a_0
extends a9k_0 {
    @Override
    public void a(EntityLivingBase entityLivingBase, q1_0 q1_02, atT atT2) {
        a9G.a();
        rr_1 rr_12 = (rr_1)q1_02;
        float f = (float)((double)(rr_12.I * 0.6662f) / Math.PI) % 2.0f;
        asj_0.c(((a5K)rr_12.l).D, -5.0f + 1.1f * (float)((double)(MathHelper.cos(rr_12.I * 0.6662f) * 1.4f * rr_12.R) / Math.PI * 180.0), 1.0f);
        asj_0.c(((a5K)rr_12.o).D, -5.0f + 1.1f * (float)((double)(MathHelper.cos(rr_12.I * 0.6662f + (float)Math.PI) * 1.4f * rr_12.R) / Math.PI * 180.0), 1.0f);
        asj_0.e(((a5K)rr_12.l).D, 10.0f);
        asj_0.e(((a5K)rr_12.o).D, -10.0f);
        asj_0.b(((a5K)rr_12.h).D, -20.0f + 20.0f * MathHelper.cos(rr_12.I * 0.6662f + (float)Math.PI));
        asj_0.b(((a5K)rr_12.j).D, -20.0f + 20.0f * MathHelper.cos(rr_12.I * 0.6662f));
        asj_0.c(rr_12.B.D, f > 1.0f ? 45 : 10, 0.3f);
        asj_0.c(rr_12.M.D, f > 1.0f ? 10 : 45, 0.3f);
        asj_0.c(rr_12.L.D, f > 1.0f ? -10 : -45, 0.01f);
        asj_0.c(rr_12.E.D, f > 1.0f ? -45 : -10, 0.01f);
        float f2 = 25.0f + (float)MathInvoker.m(rr_12.I * 0.6662f * 2.0f) * 5.0f;
        asj_0.b(((a5K)rr_12.q).D, f2);
        asj_0.a(((a5K)rr_12.r).D, rr_12.F - asj_0.c(((a5K)rr_12.q).D));
    }

    @Override
    public String a() {
        return apr_0.a;
    }
}

