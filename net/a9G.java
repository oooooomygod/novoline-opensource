/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EntityLivingBase;
import net.MathHelper;
import net.a5K;
import net.a9k_0;
import net.aWW;
import net.aau_0;
import net.asj_0;
import net.atT;
import net.q1_0;
import net.rr_1;


public class a9G
extends a9k_0 {
    private static int[] a;

    @Override
    public void a(EntityLivingBase entityLivingBase, q1_0 q1_02, atT atT2) {
        rr_1 rr_12 = (rr_1)q1_02;
        asj_0.b(((a5K)rr_12.h).D, 0.5f * (float)((double)(MathHelper.cos(rr_12.I * 0.6662f + (float)Math.PI) * 2.0f * rr_12.R * 0.5f) / Math.PI * 180.0));
        asj_0.b(((a5K)rr_12.j).D, 0.5f * (float)((double)(MathHelper.cos(rr_12.I * 0.6662f) * 2.0f * rr_12.R * 0.5f) / Math.PI * 180.0));
        asj_0.a(((a5K)rr_12.h).D, 5.0f, 0.3f);
        asj_0.a(((a5K)rr_12.j).D, -5.0f, 0.3f);
        asj_0.c(((a5K)rr_12.l).D, -5.0f + 0.5f * (float)((double)(MathHelper.cos(rr_12.I * 0.6662f) * 1.4f * rr_12.R) / Math.PI * 180.0), 1.0f);
        asj_0.c(((a5K)rr_12.o).D, -5.0f + 0.5f * (float)((double)(MathHelper.cos(rr_12.I * 0.6662f + (float)Math.PI) * 1.4f * rr_12.R) / Math.PI * 180.0), 1.0f);
        asj_0.c(((a5K)rr_12.l).D, 0.0f);
        asj_0.c(((a5K)rr_12.o).D, 0.0f);
        asj_0.a(((a5K)rr_12.l).D, 2.0f, 0.2f);
        a9G.a();
        asj_0.a(((a5K)rr_12.o).D, -2.0f, 0.2f);
        float f = (float)((double)(rr_12.I * 0.6662f) / Math.PI) % 2.0f;
        asj_0.c(rr_12.B.D, f > 1.0f ? 45 : 0, 0.3f);
        asj_0.c(rr_12.M.D, f > 1.0f ? 0 : 45, 0.3f);
        asj_0.c(rr_12.L.D, (float)(MathInvoker.m((double)(rr_12.I * 0.6662f) + 1.5707963267948966) + 1.0) / 2.0f * -20.0f, 1.0f);
        asj_0.c(rr_12.E.D, (float)(MathInvoker.m(rr_12.I * 0.6662f) + 1.0) / 2.0f * -20.0f, 0.3f);
        float f2 = (float)MathInvoker.m(rr_12.I * 0.6662f) * -20.0f;
        float f3 = (float)(MathInvoker.m(rr_12.I * 0.6662f * 2.0f) * 0.5 + 0.5) * 10.0f - 2.0f;
        asj_0.b(((a5K)rr_12.q).D, f2, 0.5f);
        asj_0.b(((a5K)rr_12.q).D, f3);
        asj_0.b(((a5K)rr_12.r).D, rr_12.J - f2, 0.5f);
        asj_0.b(((a5K)rr_12.r).D, rr_12.F - f3);
        float f4 = rr_12.J * 0.1f;
        f4 = aWW.a(f4, 10.0f);
        f4 = aWW.b(f4, -10.0f);
        asj_0.a(((a5K)rr_12.q).D, -f4, 0.3f);
        ListInvoker.b(new ListInvoker[4]);
    }

    @Override
    public String a() {
        return aau_0.a;
    }

    public static void a(int[] nArray) {
        a = nArray;
    }

    static {
        if (a9G.a() == null) {
            a9G.a(new int[3]);
        }
    }

    public static int[] a() {
        return a;
    }
}

