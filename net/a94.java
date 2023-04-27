/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net.a5K;
import net.a9G;
import net.a9k_0;
import net.aVK;
import net.asj_0;
import net.atJ;
import net.atT;
import net.q1_0;
import net.rr_1;

public class a94
extends a9k_0 {
    @Override
    public String a() {
        return aVK.a;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, q1_0 q1_02, atT atT2) {
        a9G.a();
        rr_1 rr_12 = (rr_1)q1_02;
        atJ atJ2 = (atJ)atT2;
        asj_0.c(((a5K)rr_12.q).D, 0.0f, 0.3f);
        asj_0.b(((a5K)rr_12.q).D, 0.0f, 0.1f);
        asj_0.a(((a5K)rr_12.q).D, 0.0f, 0.3f);
        asj_0.a(((a5K)rr_12.h).D, 45.0f, 0.05f);
        asj_0.a(((a5K)rr_12.j).D, -45.0f, 0.05f);
        asj_0.c(((a5K)rr_12.h).D, 0.0f, 0.5f);
        asj_0.c(((a5K)rr_12.j).D, 0.0f, 0.5f);
        asj_0.a(((a5K)rr_12.l).D, 10.0f, 0.1f);
        asj_0.a(((a5K)rr_12.o).D, -10.0f, 0.1f);
        asj_0.c(((a5K)rr_12.l).D, -20.0f, 0.1f);
        asj_0.c(((a5K)rr_12.o).D, -20.0f, 0.1f);
        asj_0.c(((a5K)rr_12.l).D, -45.0f, 0.1f);
        asj_0.c(((a5K)rr_12.o).D, -45.0f, 0.1f);
        asj_0.c(rr_12.M.D, 50.0f, 0.1f);
        asj_0.c(rr_12.B.D, 50.0f, 0.1f);
        asj_0.c(rr_12.E.D, 0.0f, 0.3f);
        asj_0.c(rr_12.L.D, 0.0f, 0.3f);
        asj_0.d(((a5K)rr_12.r).D, rr_12.J);
        asj_0.a(((a5K)rr_12.r).D, rr_12.F - rr_12.q.t);
        if (atJ2.l < 2.0f) {
            asj_0.c(((a5K)rr_12.q).D, 20.0f, 2.0f);
            asj_0.c(((a5K)rr_12.l).D, 0.0f, 2.0f);
            asj_0.c(((a5K)rr_12.o).D, 0.0f, 2.0f);
            asj_0.c(rr_12.M.D, 0.0f, 2.0f);
            asj_0.c(rr_12.B.D, 0.0f, 2.0f);
            asj_0.a(((a5K)rr_12.h).D, 2.0f, 2.0f);
            asj_0.a(((a5K)rr_12.j).D, -2.0f, 2.0f);
            asj_0.c(rr_12.E.D, -20.0f, 2.0f);
            asj_0.c(rr_12.L.D, -20.0f, 2.0f);
        }
        boolean cfr_ignored_0 = atT2.f.x != 0.0f | atT2.f.z != 0.0f;
    }
}

