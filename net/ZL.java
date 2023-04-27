/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

public class ZL
extends zg_0 {
    @Override
    public boolean a(World world, Random random, HF hF) {
        this.a(world, hF, 0, 3, 0, 2, 3, 7, i, i, false);
        this.a(world, hF, 5, 3, 0, 7, 3, 7, i, i, false);
        this.a(world, hF, 0, 2, 0, 1, 2, 7, i, i, false);
        this.a(world, hF, 6, 2, 0, 7, 2, 7, i, i, false);
        this.a(world, hF, 0, 1, 0, 0, 1, 7, i, i, false);
        this.a(world, hF, 7, 1, 0, 7, 1, 7, i, i, false);
        this.a(world, hF, 0, 1, 7, 7, 3, 7, i, i, false);
        this.a(world, hF, 1, 1, 0, 2, 3, 0, i, i, false);
        this.a(world, hF, 5, 1, 0, 6, 3, 0, i, i, false);
        if (this.j.f[SJ.i(EnumFacing.NORTH)]) {
            this.a(world, hF, 3, 1, 7, 4, 2, 7, false);
        }
        if (this.j.f[SJ.i(EnumFacing.WEST)]) {
            this.a(world, hF, 0, 1, 3, 1, 2, 4, false);
        }
        if (this.j.f[SJ.i(EnumFacing.EAST)]) {
            this.a(world, hF, 6, 1, 3, 7, 2, 4, false);
        }
        return true;
    }

    public ZL() {
    }

    public ZL(EnumFacing enumFacing, ajM ajM2) {
        super(1, enumFacing, ajM2, 1, 1, 1);
    }
}

