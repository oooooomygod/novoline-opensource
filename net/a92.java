/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.FF;
import net.a6w_0;
import net.a9G;
import net.a9k_0;
import net.aY4;
import net.aii_0;
import net.ait_1;
import net.anb_0;
import net.atJ;
import net.atT;
import net.az2_0;
import net.hb_1;
import net.oz_0;
import net.q1_0;
import net.rr_1;

public class a92
extends a9k_0 {
    @Override
    public String a() {
        return az2_0.u;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, q1_0 q1_02, atT atT2) {
        block9: {
            atJ atJ2;
            rr_1 rr_12;
            block7: {
                block8: {
                    rr_12 = (rr_1)q1_02;
                    a9G.a();
                    atJ2 = (atJ)atT2;
                    EntityPlayer entityPlayer = (EntityPlayer)entityLivingBase;
                    if (a6w_0.n(entityPlayer) == null) break block7;
                    if (!(atJ2.h < 10.0f)) break block8;
                    if (atJ2.z == 1) {
                        oz_0.a((EntityPlayer)entityLivingBase, rr_12, atJ2);
                        aii_0.a(rr_12, az2_0.b, az2_0.e);
                        aii_0.a(rr_12, az2_0.j, az2_0.l);
                    }
                    if (atJ2.z == 2) {
                        ait_1.a((EntityPlayer)entityLivingBase, rr_12, atJ2);
                        aii_0.a(rr_12, az2_0.k, az2_0.m);
                        aii_0.a(rr_12, az2_0.p, az2_0.g);
                    }
                    if (atJ2.z != 3) break block9;
                    anb_0.a((EntityPlayer)entityLivingBase, rr_12, atJ2);
                    aii_0.a(rr_12, az2_0.t, az2_0.r);
                    aii_0.a(rr_12, az2_0.n, az2_0.s);
                }
                if (!(atJ2.h < 60.0f)) break block9;
                hb_1.a((EntityPlayer)entityLivingBase, rr_12, atJ2);
                aii_0.a(rr_12, az2_0.c, az2_0.a);
            }
            if (atJ2.h < 10.0f) {
                aY4.a((EntityPlayer)entityLivingBase, rr_12, atJ2);
                aii_0.a(rr_12, az2_0.o, az2_0.h);
                aii_0.a(rr_12, az2_0.f, az2_0.i);
            }
            if (atJ2.h < 60.0f) {
                FF.a((EntityPlayer)entityLivingBase, rr_12, atJ2);
                aii_0.a(rr_12, az2_0.q, az2_0.d);
            }
        }
    }
}

