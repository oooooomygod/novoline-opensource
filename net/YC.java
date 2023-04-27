/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import java.util.Random;
import net.minecraft.block.BlockPos;

abstract class YC
extends Y_ {
    protected int g;
    protected int e;
    protected int d = -1;
    protected int f;

    protected YC(Random random, int n, int n2, int n3, int n4, int n5, int n6) {
        super(0);
        this.g = n4;
        this.e = n5;
        this.f = n6;
        this.c = abw_2.a(cs_1.HORIZONTAL, random);
        switch (aW2.a[this.c.ordinal()]) {
            case 1: 
            case 2: {
                this.b = new HF(n, n2, n3, n + n4 - 1, n2 + n5 - 1, n3 + n6 - 1);
                break;
            }
            default: {
                this.b = new HF(n, n2, n3, n + n6 - 1, n2 + n5 - 1, n3 + n4 - 1);
            }
        }
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        tn_0.b(nBTTagCompound, abm_0.c, this.g);
        tn_0.b(nBTTagCompound, abm_0.e, this.e);
        tn_0.b(nBTTagCompound, abm_0.b, this.f);
        tn_0.b(nBTTagCompound, abm_0.a, this.d);
    }

    public YC() {
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        this.g = tn_0.g(nBTTagCompound, abm_0.h);
        this.e = tn_0.g(nBTTagCompound, abm_0.g);
        this.f = tn_0.g(nBTTagCompound, abm_0.d);
        this.d = tn_0.g(nBTTagCompound, abm_0.f);
    }

    /*
     * WARNING - void declaration
     */
    protected boolean a(World world, HF hF, int n) {
        if (this.d >= 0) {
            return true;
        }
        int n2 = 0;
        z6_0 z6_02 = new z6_0();
        for (int i = this.b.b; i <= this.b.e; ++i) {
            for (int j = this.b.f; j <= this.b.d; ++j) {
                void var5_7;
                ain_1.a(z6_02, j, 64, i);
                if (!aqu_2.a(hF, z6_02)) continue;
                n2 += MathInvoker.max(amv_2.h(aV8.a(world, (BlockPos)z6_02)), qq_2.m(world.d));
                ++var5_7;
            }
        }
        return false;
    }
}

