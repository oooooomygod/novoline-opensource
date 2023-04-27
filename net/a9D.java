/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.MathHelper;
import net.a5K;
import net.a9G;
import net.a9k_0;
import net.aRP;
import net.asj_0;
import net.atJ;
import net.atT;
import net.q1_0;
import net.rr_1;

public class a9D
extends a9k_0 {
    @Override
    public void a(EntityLivingBase entityLivingBase, q1_0 q1_02, atT atT2) {
        a9G.a();
        rr_1 rr_12 = (rr_1)q1_02;
        atJ cfr_ignored_0 = (atJ)atT2;
        EntityPlayer entityPlayer = (EntityPlayer)entityLivingBase;
        asj_0.b(rr_12.S, 1.5f, 0.3f);
        asj_0.b(((a5K)rr_12.q).D, 0.0f, 0.3f);
        asj_0.a(((a5K)rr_12.q).D, 0.0f, 0.3f);
        asj_0.c(((a5K)rr_12.l).D, -85.0f, 0.3f);
        asj_0.b(((a5K)rr_12.l).D, 45.0f, 0.3f);
        asj_0.c(((a5K)rr_12.o).D, -85.0f, 0.3f);
        asj_0.b(((a5K)rr_12.o).D, -45.0f, 0.3f);
        asj_0.b(rr_12.M.D, 60.0f);
        asj_0.b(rr_12.B.D, 60.0f);
        boolean cfr_ignored_1 = atT2.f.x == 0.0f & atT2.f.z == 0.0f;
        float f = MathHelper.cos((float)entityPlayer.ticksExisted * 0.6f) * rr_12.R;
        float f2 = MathHelper.cos((float)entityPlayer.ticksExisted * 0.3f) * rr_12.R;
        if (f2 < 0.0f) {
            f2 = -f2;
        }
        asj_0.b(rr_12.S, 1.5f + f2 * 20.0f, 0.7f);
        asj_0.c(((a5K)rr_12.q).D, 40.0f + f * 300.0f, 0.3f);
        asj_0.c(((a5K)rr_12.h).D, -45.0f, 0.3f);
        asj_0.c(((a5K)rr_12.j).D, -45.0f, 0.3f);
        asj_0.b(((a5K)rr_12.h).D, -10.0f, 0.3f);
        asj_0.b(((a5K)rr_12.j).D, 10.0f, 0.3f);
        asj_0.c(rr_12.E.D, -30.0f, 0.3f);
        asj_0.c(rr_12.L.D, -30.0f, 0.3f);
        asj_0.b(((a5K)rr_12.r).D, rr_12.J, 0.3f);
        asj_0.c(((a5K)rr_12.r).D, rr_12.F - rr_12.q.t / (float)Math.PI * 180.0f, 0.3f);
    }

    @Override
    public String a() {
        return aRP.a;
    }
}

