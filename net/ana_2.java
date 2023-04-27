/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.IBlockAccess;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.ana
 */
public class ana_2 {
    private aQP[] a;
    private ap8_0 c;
    private ahl_0 b = new ahl_0();

    private aMH a(Entity entity, aQP aQP2, aQP aQP3, float f) {
        aQP2.g = 0.0f;
        aQP2.i = aQP2.e = axw_0.a(aQP2, aQP3);
        ko_2.c(this.b);
        ko_2.a(this.b, aQP2);
        aQP aQP4 = aQP2;
        while (!ko_2.b(this.b)) {
            aQP aQP5 = ko_2.a(this.b);
            if (aQP5.equals(aQP3)) {
                return this.a(aQP2, aQP3);
            }
            if (axw_0.a(aQP5, aQP3) < axw_0.a(aQP4, aQP3)) {
                aQP4 = aQP5;
            }
            aQP5.a = true;
            int n = mv_1.a(this.c, this.a, entity, aQP5, aQP3, f);
            for (int i = 0; i < n; ++i) {
                aQP aQP6 = this.a[i];
                float f2 = aQP5.g + axw_0.a(aQP5, aQP6);
                if (!(f2 < f * 2.0f) || axw_0.a(aQP6) && !(f2 < aQP6.g)) continue;
                aQP6.b = aQP5;
                aQP6.g = f2;
                aQP6.e = axw_0.a(aQP6, aQP3);
                if (axw_0.a(aQP6)) {
                    ko_2.a(this.b, aQP6, aQP6.g + aQP6.e);
                    continue;
                }
                aQP6.i = aQP6.g + aQP6.e;
                ko_2.a(this.b, aQP6);
            }
        }
        if (aQP4 == aQP2) {
            return null;
        }
        return this.a(aQP2, aQP4);
    }

    public aMH a(IBlockAccess iBlockAccess, Entity entity, BlockPos blockPos, float f) {
        return this.a(iBlockAccess, entity, (float)amv_2.j(blockPos) + 0.5f, (float)amv_2.h(blockPos) + 0.5f, (float)amv_2.i(blockPos) + 0.5f, f);
    }

    private aMH a(aQP aQP2, aQP aQPArray) {
        int n = 1;
        aQP[] aQPArray2 = aQPArray;
        while (aQPArray2.b != null) {
            ++n;
            aQPArray2 = aQPArray2.b;
        }
        aQPArray2 = new aQP[n];
        Object object = aQPArray;
        aQPArray2[--n] = aQPArray;
        while (object.b != null) {
            object = object.b;
            aQPArray2[--n] = object;
        }
        return new aMH(aQPArray2);
    }

    private aMH a(IBlockAccess iBlockAccess, Entity entity, double d, double d2, double d3, float f) {
        ko_2.c(this.b);
        mv_1.a(this.c, iBlockAccess, entity);
        aQP aQP2 = mv_1.a(this.c, entity);
        aQP aQP3 = mv_1.a(this.c, entity, d, d2, d3);
        aMH aMH2 = this.a(entity, aQP2, aQP3, f);
        mv_1.a(this.c);
        return aMH2;
    }

    public ana_2(ap8_0 ap8_02) {
        this.a = new aQP[32];
        this.c = ap8_02;
    }

    public aMH a(IBlockAccess iBlockAccess, Entity entity, Entity entity2, float f) {
        return this.a(iBlockAccess, entity, entity2.posX, ayj_0.u((Entity)entity2).a, entity2.posZ, f);
    }
}

