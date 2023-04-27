/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import deobf.EntityPlayer;
import net.LC;
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
 * Renamed from net.Ny
 */
public class ny_0 {
    public static void a(EntityPlayer entityPlayer, rr_1 rr_12, atJ atJ2) {
        a9G.a();
        if (atJ2.h < 0.5f) {
            abo_2.a(rr_12.N);
        }
        if (a6w_0.n(entityPlayer) != null && atJ2.h < 4.0f & act_2.k(a6w_0.n(entityPlayer)) instanceof LC) {
            abo_2.a(rr_12.N, rr_12);
        }
        float f = atJ2.h / 10.0f;
        float f2 = f * 3.0f;
        f2 = aWW.a(f2, 1.0f);
        if (!a6w_0.B(entityPlayer)) {
            asj_0.b(rr_12.Q, 30.0f, 0.7f);
        }
        Vector3f vector3f = new Vector3f(0.0f, 0.0f, 0.0f);
        vector3f.x = 20.0f - f2 * 20.0f;
        vector3f.y = -90.0f * f2;
        asj_0.a(((a5K)rr_12.q).D, vector3f, 0.9f);
        asj_0.d(((a5K)rr_12.r).D, rr_12.J);
        asj_0.a(((a5K)rr_12.r).D, rr_12.F);
        asj_0.c(((a5K)rr_12.r).H, -rr_12.q.t, 0.9f);
        asj_0.b(((a5K)rr_12.r).H, -rr_12.q.m - 30.0f, 0.9f);
        asj_0.a(((a5K)rr_12.h).H, 60.0f, 0.3f);
        asj_0.c(((a5K)rr_12.h).D, -20.0f + f2 * 100.0f, 3.0f);
        asj_0.c(((a5K)rr_12.h).D, 60.0f - f2 * 180.0f, 3.0f);
        asj_0.b(((a5K)rr_12.h).D, 0.0f, 0.9f);
        asj_0.a(((a5K)rr_12.h).D, 0.0f, 0.9f);
        asj_0.a(((a5K)rr_12.j).D, 20.0f, 0.3f);
        asj_0.a(((a5K)rr_12.j).H, -80.0f, 0.3f);
        asj_0.c(rr_12.E.D, -20.0f, 0.3f);
        asj_0.c(rr_12.L.D, -60.0f, 0.3f);
        boolean cfr_ignored_0 = atJ2.f.x == 0.0f & atJ2.f.z == 0.0f;
        asj_0.b(((a5K)rr_12.q).D, -70.0f * f2, 0.9f);
        asj_0.c(rr_12.A, 180.0f, 0.9f);
    }
}

