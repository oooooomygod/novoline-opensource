/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

/*
 * Renamed from net.awI
 */
class awi_1
implements ahb_1 {
    private awi_1() {
    }

    @Override
    public boolean a(ajM ajM2) {
        return true;
    }

    @Override
    public zg_0 a(EnumFacing enumFacing, ajM ajM2, Random random) {
        ajM2.b = true;
        return new ZD(enumFacing, ajM2, random);
    }

    awi_1(anr_2 anr_22) {
        this();
    }
}

