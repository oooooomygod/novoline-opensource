/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.EntityLivingBase;
import net.Fe;
import net.MathHelper;
import net.a5K;
import net.a9G;
import net.a9k_0;
import net.aWW;
import net.asj_0;
import net.atT;
import net.q1_0;
import net.rr_1;

public class a9R
extends a9k_0 {
    @Override
    public void a(EntityLivingBase entityLivingBase, q1_0 q1_02, atT atT2) {
        a9G.a();
        rr_1 rr_12 = (rr_1)q1_02;
        asj_0.b(((a5K)rr_12.h).D, 1.1f * (float)((double)(MathHelper.cos(rr_12.I * 0.6662f + (float)Math.PI) * 2.0f * rr_12.R * 0.5f) / Math.PI * 180.0));
        asj_0.b(((a5K)rr_12.j).D, 1.1f * (float)((double)(MathHelper.cos(rr_12.I * 0.6662f) * 2.0f * rr_12.R * 0.5f) / Math.PI * 180.0));
        asj_0.a(((a5K)rr_12.h).D, 5.0f, 0.3f);
        asj_0.a(((a5K)rr_12.j).D, -5.0f, 0.3f);
        asj_0.c(((a5K)rr_12.l).D, -5.0f + 0.9f * (float)((double)(MathHelper.cos(rr_12.I * 0.6662f) * 1.4f * rr_12.R) / Math.PI * 180.0), 1.0f);
        asj_0.c(((a5K)rr_12.o).D, -5.0f + 0.9f * (float)((double)(MathHelper.cos(rr_12.I * 0.6662f + (float)Math.PI) * 1.4f * rr_12.R) / Math.PI * 180.0), 1.0f);
        asj_0.c(((a5K)rr_12.l).D, 0.0f);
        asj_0.c(((a5K)rr_12.o).D, 0.0f);
        asj_0.a(((a5K)rr_12.l).D, 2.0f, 0.2f);
        asj_0.a(((a5K)rr_12.o).D, -2.0f, 0.2f);
        float f = (float)((double)(rr_12.I * 0.6662f) / Math.PI) % 2.0f;
        asj_0.c(rr_12.B.D, f > 1.0f ? 45 : 0, 0.3f);
        asj_0.c(rr_12.M.D, f > 1.0f ? 0 : 45, 0.3f);
        asj_0.c(rr_12.L.D, f > 1.0f ? -10 : -45, 0.3f);
        asj_0.c(rr_12.E.D, f > 1.0f ? -45 : -10, 0.3f);
        float f2 = (float)MathInvoker.m(rr_12.I * 0.6662f) * -40.0f;
        float f3 = (float)(MathInvoker.m(rr_12.I * 0.6662f * 2.0f) * 0.5 + 0.5) * 20.0f;
        asj_0.b(((a5K)rr_12.q).D, f2, 0.5f);
        asj_0.b(((a5K)rr_12.q).D, f3);
        asj_0.b(((a5K)rr_12.r).D, rr_12.J - f2, 0.5f);
        asj_0.b(((a5K)rr_12.r).D, rr_12.F - f3);
        float f4 = rr_12.J * 0.3f;
        f4 = aWW.a(f4, 20.0f);
        f4 = aWW.b(f4, -20.0f);
        asj_0.a(((a5K)rr_12.q).D, -f4, 0.3f);
        asj_0.b(rr_12.S, f3 * 0.15f, 0.9f);
    }

    @Override
    public String a() {
        return Fe.a;
    }
}

