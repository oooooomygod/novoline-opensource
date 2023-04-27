/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

class G_
implements ahb_1 {
    G_(anr_2 anr_22) {
        this();
    }

    private G_() {
    }

    @Override
    public boolean a(ajM ajM2) {
        if (ajM2.f[SJ.i(EnumFacing.EAST)] && !ajM2.a[SJ.i((EnumFacing)EnumFacing.EAST)].b && ajM2.f[SJ.i(EnumFacing.UP)] && !ajM2.a[SJ.i((EnumFacing)EnumFacing.UP)].b) {
            ajM ajM3 = ajM2.a[SJ.i(EnumFacing.EAST)];
            return ajM3.f[SJ.i(EnumFacing.UP)] && !ajM3.a[SJ.i((EnumFacing)EnumFacing.UP)].b;
        }
        return false;
    }

    @Override
    public zg_0 a(EnumFacing enumFacing, ajM ajM2, Random random) {
        ajM2.b = true;
        ajM2.a[SJ.i((EnumFacing)EnumFacing.EAST)].b = true;
        ajM2.a[SJ.i((EnumFacing)EnumFacing.UP)].b = true;
        ajM2.a[SJ.i((EnumFacing)EnumFacing.EAST)].a[SJ.i((EnumFacing)EnumFacing.UP)].b = true;
        return new zn_0(enumFacing, ajM2, random);
    }
}

