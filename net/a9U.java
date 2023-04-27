/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.a5K;
import net.a6w_0;
import net.a9G;
import net.a9k_0;
import net.aWW;
import net.asj_0;
import net.atJ;
import net.atT;
import net.na_0;
import net.q1_0;
import net.rr_1;

public class a9U
extends a9k_0 {
    @Override
    public String a() {
        return na_0.a;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, q1_0 q1_02, atT atT2) {
        float f;
        a9G.a();
        rr_1 rr_12 = (rr_1)q1_02;
        atJ cfr_ignored_2 = (atJ)atT2;
        EntityPlayer entityPlayer = (EntityPlayer)entityLivingBase;
        float f2 = 0.0f;
        if (entityPlayer != null) {
            f2 = a6w_0.h(entityPlayer);
        }
        int cfr_ignored_3 = (f = f2 - 15.0f) == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
        float f3 = f2 - 10.0f;
        int cfr_ignored_4 = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
        asj_0.c(((a5K)rr_12.h).D, 0.0f, 0.3f);
        asj_0.c(((a5K)rr_12.j).D, 0.0f, 0.3f);
        asj_0.c(((a5K)rr_12.q).D, 30.0f, 0.3f);
        asj_0.b(((a5K)rr_12.q).D, 0.0f, 0.3f);
        asj_0.e(((a5K)rr_12.h).D, 0.0f);
        asj_0.b(((a5K)rr_12.h).D, -30.0f);
        asj_0.b(((a5K)rr_12.j).D, -30.0f);
        asj_0.c(((a5K)rr_12.j).D, 80.0f);
        float f4 = f2 / 10.0f;
        asj_0.b(rr_12.L.D, f4 * -50.0f);
        asj_0.c(((a5K)rr_12.r).D, rr_12.F - 30.0f, 0.3f);
        f4 = 20.0f - (f2 - 10.0f) / 5.0f * 20.0f;
        asj_0.c(((a5K)rr_12.q).D, f4, 0.3f);
        float f5 = (f2 - 10.0f) / 5.0f * -25.0f;
        asj_0.b(((a5K)rr_12.q).D, f5 + rr_12.J, 0.3f);
        asj_0.c(((a5K)rr_12.h).D, -90.0f - f4, 0.3f);
        asj_0.b(((a5K)rr_12.j).D, -30.0f);
        asj_0.c(((a5K)rr_12.j).D, 80.0f);
        float f6 = f2 / 10.0f;
        asj_0.b(rr_12.L.D, f6 * -30.0f);
        asj_0.c(((a5K)rr_12.h).H, f5);
        float f7 = -90.0f + rr_12.F;
        f7 = aWW.b(f7, -120.0f);
        asj_0.c(((a5K)rr_12.j).H, f7, 0.3f);
        asj_0.b(((a5K)rr_12.h).D, rr_12.F - 90.0f);
        asj_0.d(((a5K)rr_12.r).D, -f5);
        asj_0.c(((a5K)rr_12.r).H, -f4, 0.3f);
        asj_0.a(((a5K)rr_12.r).D, rr_12.F);
    }
}

