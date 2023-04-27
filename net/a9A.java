/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.EntityLivingBase;
import net.X3;
import net.a5K;
import net.a9k_0;
import net.asj_0;
import net.atJ;
import net.atT;
import net.q1_0;
import net.rr_1;
import org.lwjgl.util.vector.Vector3f;

public class a9A
extends a9k_0 {
    @Override
    public String a() {
        return X3.a;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, q1_0 q1_02, atT atT2) {
        rr_1 rr_12 = (rr_1)q1_02;
        atJ atJ2 = (atJ)atT2;
        asj_0.a(((a5K)rr_12.q).D, new Vector3f(0.0f, 0.0f, 0.0f), 0.5f);
        asj_0.a(((a5K)rr_12.l).D, 2.0f, 0.2f);
        asj_0.a(((a5K)rr_12.o).D, -2.0f, 0.2f);
        asj_0.c(((a5K)rr_12.l).D, 0.0f, 0.1f);
        asj_0.c(((a5K)rr_12.o).D, 0.0f, 0.1f);
        asj_0.c(((a5K)rr_12.l).D, 5.0f);
        asj_0.c(((a5K)rr_12.o).D, -5.0f);
        asj_0.c(((a5K)rr_12.h).D, 0.0f, 0.1f);
        asj_0.c(((a5K)rr_12.j).D, 0.0f, 0.1f);
        asj_0.c(rr_12.M.D, 4.0f, 0.1f);
        asj_0.c(rr_12.B.D, 4.0f, 0.1f);
        asj_0.c(rr_12.E.D, -4.0f, 0.1f);
        asj_0.c(rr_12.L.D, -4.0f, 0.1f);
        asj_0.a(((a5K)rr_12.r).D, rr_12.F);
        asj_0.d(((a5K)rr_12.r).D, rr_12.J);
        asj_0.b(((a5K)rr_12.q).D, (float)((MathInvoker.m(atJ2.i / 10.0f) - 1.0) / 2.0) * -3.0f);
        asj_0.e(((a5K)rr_12.j).D, -((float)((MathInvoker.m((double)(atJ2.i / 10.0f) + 1.5707963267948966) - 1.0) / 2.0)) * -5.0f);
        asj_0.e(((a5K)rr_12.h).D, -((float)((MathInvoker.m((double)(atJ2.i / 10.0f) + 1.5707963267948966) - 1.0) / 2.0)) * 5.0f);
    }
}

