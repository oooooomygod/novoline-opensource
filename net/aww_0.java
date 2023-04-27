/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayer;
import net.LC;
import net.MathHelper;
import net.a5K;
import net.a6w_0;
import net.a9G;
import net.aWW;
import net.abo_2;
import net.act_2;
import net.asj_0;
import net.atJ;
import net.rr_1;
import org.lwjgl.util.vector.Vector3f;

/*
 * Renamed from net.aWw
 */
public class aww_0 {
    public static void a(EntityPlayer entityPlayer, rr_1 rr_12, atJ atJ2) {
        a9G.a();
        if (atJ2.h < 0.5f) {
            abo_2.a(rr_12.N);
        }
        if (a6w_0.n(entityPlayer) != null && act_2.k(a6w_0.n(entityPlayer)) instanceof LC) {
            abo_2.a(rr_12.N, rr_12);
        }
        float f = atJ2.h / 10.0f;
        float f2 = f * 2.0f;
        f2 = aWW.a(f2, 1.0f);
        float f3 = f * 1.6f;
        f3 = aWW.a(f3, 1.0f);
        float f4 = 50.0f + 360.0f * f3;
        float f5 = 50.0f + 360.0f * f3;
        if (f5 > 360.0f) {
            f5 -= 360.0f;
        }
        if (f4 > 360.0f) {
            float f6 = (f - atJ2.g / 10.0f) * 2.0f;
            f6 = aWW.a(f6, 1.0f);
            rr_12.Q.f.y = f5;
            rr_12.Q.c.y = f5;
            rr_12.Q.a.y = 0.0f;
        }
        asj_0.b(rr_12.Q, f4, 0.7f);
        Vector3f vector3f = new Vector3f(0.0f, 0.0f, 0.0f);
        vector3f.x = 20.0f - f * 20.0f;
        vector3f.y = -40.0f * f;
        asj_0.a(((a5K)rr_12.q).D, vector3f, 0.9f);
        asj_0.d(((a5K)rr_12.r).D, rr_12.J);
        asj_0.a(((a5K)rr_12.r).D, rr_12.F);
        asj_0.c(((a5K)rr_12.r).H, -vector3f.x, 0.9f);
        asj_0.b(((a5K)rr_12.r).H, -vector3f.y, 0.9f);
        asj_0.c(((a5K)rr_12.l).D, -30.0f, 0.3f);
        asj_0.c(((a5K)rr_12.o).D, -30.0f, 0.3f);
        asj_0.e(((a5K)rr_12.l).D, 10.0f);
        asj_0.e(((a5K)rr_12.o).D, -10.0f);
        asj_0.c(rr_12.M.D, 30.0f, 0.3f);
        asj_0.c(rr_12.B.D, 30.0f, 0.3f);
        asj_0.a(((a5K)rr_12.h).H, -(-60.0f - f3 * 80.0f), 0.3f);
        asj_0.c(((a5K)rr_12.h).D, -20.0f + f2 * 70.0f, 3.0f);
        asj_0.b(((a5K)rr_12.h).D, 0.0f, 0.3f);
        asj_0.a(((a5K)rr_12.h).D, 0.0f, 0.9f);
        asj_0.a(((a5K)rr_12.j).D, 20.0f, 0.3f);
        asj_0.a(((a5K)rr_12.j).H, -80.0f, 0.3f);
        asj_0.c(rr_12.E.D, -20.0f, 0.3f);
        asj_0.c(rr_12.L.D, -60.0f, 0.3f);
        asj_0.c(rr_12.A, 90.0f * f, 0.9f);
        float f7 = atJ2.h * 5.0f;
        float f8 = atJ2.h * 5.0f;
        f7 = (MathHelper.cos(f7 * 0.0625f) + 1.0f) / 2.0f * 20.0f;
        f8 = (MathHelper.cos(f8 * 0.0625f) + 1.0f) / 2.0f * 20.0f;
        asj_0.b(((a5K)rr_12.l).D, 0.0f, 0.9f);
        asj_0.b(((a5K)rr_12.o).D, -25.0f, 0.9f);
        asj_0.e(((a5K)rr_12.l).D, f7);
        asj_0.e(((a5K)rr_12.o).D, -f7);
        asj_0.c(rr_12.S, -2.0f);
        if (ListInvoker.b() != null) {
            a9G.a(new int[4]);
        }
    }
}

