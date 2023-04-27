/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.a5K;
import net.a6w_0;
import net.a9G;
import net.asj_0;
import net.atJ;
import net.rr_1;
import net.s6_0;

/*
 * Renamed from net.kd
 */
public class kd_1 {
    public static void a(EntityPlayer entityPlayer, rr_1 rr_12, atJ atJ2) {
        a9G.a();
        if (!s6_0.b(atJ2)) {
            return;
        }
        boolean cfr_ignored_0 = atJ2.f.x == 0.0f & atJ2.f.z == 0.0f;
        if (a6w_0.y(entityPlayer)) {
            asj_0.b(((a5K)rr_12.q).D, 20.0f, 0.3f);
            asj_0.d(((a5K)rr_12.r).D, rr_12.J - 20.0f);
            asj_0.a(((a5K)rr_12.r).D, rr_12.F - 15.0f);
            asj_0.c(((a5K)rr_12.l).D, 0.0f);
            asj_0.c(((a5K)rr_12.o).D, 0.0f);
            asj_0.c(((a5K)rr_12.h).D, 60.0f, 0.3f);
            asj_0.c(rr_12.A, 90.0f, 0.3f);
        }
    }
}

