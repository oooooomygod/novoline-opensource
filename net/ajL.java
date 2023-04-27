/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

class ajL
implements ahb_1 {
    private ajL() {
    }

    @Override
    public zg_0 a(EnumFacing enumFacing, ajM ajM2, Random random) {
        ajM2.b = true;
        return new za_0(enumFacing, ajM2, random);
    }

    @Override
    public boolean a(ajM ajM2) {
        return !ajM2.f[SJ.i(EnumFacing.WEST)] && !ajM2.f[SJ.i(EnumFacing.EAST)] && !ajM2.f[SJ.i(EnumFacing.NORTH)] && !ajM2.f[SJ.i(EnumFacing.SOUTH)] && !ajM2.f[SJ.i(EnumFacing.UP)];
    }

    ajL(anr_2 anr_22) {
        this();
    }
}

