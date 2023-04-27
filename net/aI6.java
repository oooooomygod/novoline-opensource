/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

class aI6
implements ahb_1 {
    @Override
    public boolean a(ajM ajM2) {
        return ajM2.f[SJ.i(EnumFacing.UP)] && !ajM2.a[SJ.i((EnumFacing)EnumFacing.UP)].b;
    }

    private aI6() {
    }

    aI6(anr_2 anr_22) {
        this();
    }

    @Override
    public zg_0 a(EnumFacing enumFacing, ajM ajM2, Random random) {
        ajM2.b = true;
        ajM2.a[SJ.i((EnumFacing)EnumFacing.UP)].b = true;
        return new zo_0(enumFacing, ajM2, random);
    }
}

