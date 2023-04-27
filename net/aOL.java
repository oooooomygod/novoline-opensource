/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

class aOL
implements ahb_1 {
    private aOL() {
    }

    @Override
    public zg_0 a(EnumFacing enumFacing, ajM ajM2, Random random) {
        ajM2.b = true;
        ajM2.a[SJ.i((EnumFacing)EnumFacing.NORTH)].b = true;
        ajM2.a[SJ.i((EnumFacing)EnumFacing.UP)].b = true;
        ajM2.a[SJ.i((EnumFacing)EnumFacing.NORTH)].a[SJ.i((EnumFacing)EnumFacing.UP)].b = true;
        return new zk_0(enumFacing, ajM2, random);
    }

    @Override
    public boolean a(ajM ajM2) {
        if (ajM2.f[SJ.i(EnumFacing.NORTH)] && !ajM2.a[SJ.i((EnumFacing)EnumFacing.NORTH)].b && ajM2.f[SJ.i(EnumFacing.UP)] && !ajM2.a[SJ.i((EnumFacing)EnumFacing.UP)].b) {
            ajM ajM3 = ajM2.a[SJ.i(EnumFacing.NORTH)];
            return ajM3.f[SJ.i(EnumFacing.UP)] && !ajM3.a[SJ.i((EnumFacing)EnumFacing.UP)].b;
        }
        return false;
    }

    aOL(anr_2 anr_22) {
        this();
    }
}

