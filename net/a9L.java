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
import net.asj_0;
import net.atJ;
import net.atT;
import net.aw6_0;
import net.q1_0;
import net.rr_1;

public class a9L
extends a9k_0 {
    @Override
    public String a() {
        return aw6_0.a;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, q1_0 q1_02, atT atT2) {
        rr_1 rr_12 = (rr_1)q1_02;
        atJ cfr_ignored_0 = (atJ)atT2;
        EntityPlayer entityPlayer = (EntityPlayer)entityLivingBase;
        a9G.a();
        asj_0.f(((a5K)rr_12.h).D, 0.3f);
        asj_0.f(((a5K)rr_12.j).D, 0.3f);
        asj_0.f(rr_12.E.D, 0.3f);
        asj_0.f(rr_12.L.D, 0.3f);
        asj_0.a(((a5K)rr_12.l).D, 10.0f, 0.3f);
        asj_0.a(((a5K)rr_12.o).D, -10.0f, 0.3f);
        asj_0.b(rr_12.S, -1.5f, 0.3f);
        asj_0.b(((a5K)rr_12.h).D, 90.0f, 0.3f);
        asj_0.b(((a5K)rr_12.h).H, 0.0f, 0.3f);
        asj_0.c(((a5K)rr_12.h).H, -80.0f, 0.3f);
        asj_0.b(((a5K)rr_12.j).D, 90.0f, 0.3f);
        asj_0.b(((a5K)rr_12.j).H, -40.0f, 0.3f);
        asj_0.c(((a5K)rr_12.j).H, -70.0f, 0.3f);
        if (entityPlayer.a5) {
            float f = 1.8f;
            float f2 = (float)entityPlayer.ticksExisted * f / 20.0f % 1.0f;
            float cfr_ignored_1 = (float)(entityPlayer.ticksExisted - 2) * f / 20.0f % 1.0f;
            float f3 = (MathHelper.cos(f2 * (float)Math.PI * 2.0f) + 1.0f) / 2.0f * 2.0f;
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            asj_0.b(((a5K)rr_12.h).D, 90.0f, 0.3f);
            asj_0.b(((a5K)rr_12.h).H, 40.0f - 90.0f * f3, 0.7f);
            asj_0.c(((a5K)rr_12.h).H, -80.0f, 0.7f);
            asj_0.b(((a5K)rr_12.j).D, 90.0f, 0.3f);
            asj_0.b(((a5K)rr_12.j).H, 0.0f - 70.0f * f3, 0.7f);
            asj_0.c(((a5K)rr_12.j).H, -70.0f, 0.7f);
            asj_0.c(((a5K)rr_12.q).D, f3 * 20.0f);
            asj_0.a(((a5K)rr_12.r).D, rr_12.F - f3 * 20.0f);
            asj_0.d(((a5K)rr_12.r).D, rr_12.J - f3 * 20.0f);
        }
    }
}

