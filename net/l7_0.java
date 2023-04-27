/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

/*
 * Renamed from net.l7
 */
class l7_0
implements ahb_1 {
    @Override
    public zg_0 a(EnumFacing enumFacing, ajM ajM2, Random random) {
        ajM2.b = true;
        ajM2.a[SJ.i((EnumFacing)EnumFacing.EAST)].b = true;
        return new zc_0(enumFacing, ajM2, random);
    }

    private l7_0() {
    }

    l7_0(anr_2 anr_22) {
        this();
    }

    @Override
    public boolean a(ajM ajM2) {
        return ajM2.f[SJ.i(EnumFacing.EAST)] && !ajM2.a[SJ.i((EnumFacing)EnumFacing.EAST)].b;
    }
}

