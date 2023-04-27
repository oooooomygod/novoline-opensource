/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

/*
 * Renamed from net.aXi
 */
class axi_0
implements ahb_1 {
    axi_0(anr_2 anr_22) {
        this();
    }

    private axi_0() {
    }

    @Override
    public boolean a(ajM ajM2) {
        return ajM2.f[SJ.i(EnumFacing.NORTH)] && !ajM2.a[SJ.i((EnumFacing)EnumFacing.NORTH)].b;
    }

    @Override
    public zg_0 a(EnumFacing enumFacing, ajM ajM2, Random random) {
        ajM ajM3 = ajM2;
        if (!ajM2.f[SJ.i(EnumFacing.NORTH)] || ajM2.a[SJ.i((EnumFacing)EnumFacing.NORTH)].b) {
            ajM3 = ajM2.a[SJ.i(EnumFacing.SOUTH)];
        }
        ajM3.b = true;
        ajM3.a[SJ.i((EnumFacing)EnumFacing.NORTH)].b = true;
        return new Z2(enumFacing, ajM3, random);
    }
}

