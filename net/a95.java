/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.MathHelper;
import net.a5K;
import net.a9k_0;
import net.asj_0;
import net.atJ;
import net.atT;
import net.awn_0;
import net.q1_0;
import net.rr_1;

public class a95
extends a9k_0 {
    @Override
    public String a() {
        return awn_0.a;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, q1_0 q1_02, atT atT2) {
        rr_1 rr_12 = (rr_1)q1_02;
        atJ cfr_ignored_0 = (atJ)atT2;
        EntityPlayer entityPlayer = (EntityPlayer)entityLivingBase;
        asj_0.a(((a5K)rr_12.l).D, 10.0f, 0.3f);
        asj_0.a(((a5K)rr_12.o).D, -10.0f, 0.3f);
        asj_0.b(rr_12.S, -1.5f, 0.3f);
        if (entityPlayer.a5) {
            float f = 1.8f;
            float f2 = (float)entityPlayer.ticksExisted * f / 20.0f % 1.0f;
            float f3 = (float)(entityPlayer.ticksExisted - 2) * f / 20.0f % 1.0f;
            float f4 = (MathHelper.cos(f2 * (float)Math.PI * 2.0f) + 1.0f) / 2.0f * -60.0f - 30.0f + rr_12.F * 0.5f - 30.0f;
            float f5 = 30.0f + MathHelper.cos((f4 - 90.0f) / 180.0f * 3.14f) * -5.0f;
            asj_0.c(((a5K)rr_12.h).D, f4, 0.7f);
            asj_0.b(((a5K)rr_12.h).D, -f5, 0.7f);
            asj_0.a(rr_12.A, -30.0f, 0.3f);
            asj_0.c(((a5K)rr_12.q).D, MathHelper.sin(f3 * (float)Math.PI * 2.0f) * -20.0f);
            asj_0.b(((a5K)rr_12.r).D, rr_12.F - rr_12.q.t);
            asj_0.c(((a5K)rr_12.r).D, rr_12.J - rr_12.q.m);
        }
    }
}

