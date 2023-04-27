/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net.MathHelper;
import net.a5K;
import net.a7o_0;
import net.a9G;
import net.a9k_0;
import net.aWW;
import net.asj_0;
import net.atJ;
import net.atT;
import net.q1_0;
import net.rr_1;

/*
 * Renamed from net.a9h
 */
public class a9h_0
extends a9k_0 {
    @Override
    public String a() {
        return a7o_0.a;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, q1_0 q1_02, atT atT2) {
        rr_1 rr_12 = (rr_1)q1_02;
        a9G.a();
        atJ atJ2 = (atJ)atT2;
        float f = (MathHelper.cos(atJ2.i * 0.1625f) + 1.0f) / 2.0f;
        float cfr_ignored_0 = (-MathHelper.sin(atJ2.i * 0.1625f) + 1.0f) / 2.0f;
        float f2 = MathHelper.cos(atJ2.i * 0.4625f);
        float f3 = (float)((double)(atJ2.i * 0.1625f) % (Math.PI * 2)) / ((float)Math.PI * 2);
        float f4 = f * 2.0f;
        f4 -= 1.0f;
        f4 = aWW.b(f4, 0.0f);
        boolean cfr_ignored_1 = atJ2.f.x == 0.0f & atJ2.f.z == 0.0f;
        asj_0.c(((a5K)rr_12.r).H, -70.0f - f * -20.0f, 0.3f);
        asj_0.c(rr_12.Q, 70.0f, 0.3f);
        asj_0.a(rr_12.S, 10.0f, 0.3f);
        asj_0.b(((a5K)rr_12.j).H, 90.0f, 0.3f);
        asj_0.b(((a5K)rr_12.h).H, -90.0f, 0.3f);
        asj_0.c(((a5K)rr_12.j).D, f * -120.0f - 45.0f, 0.3f);
        asj_0.c(((a5K)rr_12.h).D, f * -120.0f - 45.0f, 0.3f);
        asj_0.e(((a5K)rr_12.j).H, f * -20.0f);
        asj_0.e(((a5K)rr_12.h).H, -(f * -20.0f));
        boolean cfr_ignored_2 = f3 < 0.55f | (double)f3 > 0.9;
        asj_0.c(rr_12.L.D, -60.0f, 0.3f);
        boolean cfr_ignored_3 = f3 < 0.55f | (double)f3 > 0.9;
        asj_0.c(rr_12.E.D, -60.0f, 0.3f);
        asj_0.c(((a5K)rr_12.o).D, f2 * 40.0f, 0.3f);
        asj_0.c(((a5K)rr_12.l).D, -f2 * 40.0f, 0.3f);
        asj_0.c(rr_12.B.D, 5.0f, 0.4f);
        asj_0.c(rr_12.M.D, 5.0f, 0.4f);
        asj_0.b(((a5K)rr_12.q).D, f * -20.0f);
        asj_0.b(((a5K)rr_12.r).D, rr_12.F);
        asj_0.c(((a5K)rr_12.r).D, rr_12.J);
        asj_0.c(rr_12.A, f * 120.0f, 0.3f);
    }
}

