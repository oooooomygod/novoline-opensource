/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

public class Z2
extends zg_0 {
    @Override
    public boolean a(World world, Random random, HF hF) {
        ajM ajM2 = this.j.a[SJ.i(EnumFacing.NORTH)];
        ajM ajM3 = this.j;
        if (this.j.c / 25 > 0) {
            this.a(world, hF, 0, 8, ajM2.f[SJ.i(EnumFacing.DOWN)]);
            this.a(world, hF, 0, 0, ajM3.f[SJ.i(EnumFacing.DOWN)]);
        }
        if (ajM3.a[SJ.i(EnumFacing.UP)] == null) {
            this.a(world, hF, 1, 4, 1, 6, 4, 7, e);
        }
        if (ajM2.a[SJ.i(EnumFacing.UP)] == null) {
            this.a(world, hF, 1, 4, 8, 6, 4, 14, e);
        }
        this.a(world, hF, 0, 3, 0, 0, 3, 15, i, i, false);
        this.a(world, hF, 7, 3, 0, 7, 3, 15, i, i, false);
        this.a(world, hF, 1, 3, 0, 7, 3, 0, i, i, false);
        this.a(world, hF, 1, 3, 15, 6, 3, 15, i, i, false);
        this.a(world, hF, 0, 2, 0, 0, 2, 15, e, e, false);
        this.a(world, hF, 7, 2, 0, 7, 2, 15, e, e, false);
        this.a(world, hF, 1, 2, 0, 7, 2, 0, e, e, false);
        this.a(world, hF, 1, 2, 15, 6, 2, 15, e, e, false);
        this.a(world, hF, 0, 1, 0, 0, 1, 15, i, i, false);
        this.a(world, hF, 7, 1, 0, 7, 1, 15, i, i, false);
        this.a(world, hF, 1, 1, 0, 7, 1, 0, i, i, false);
        this.a(world, hF, 1, 1, 15, 6, 1, 15, i, i, false);
        this.a(world, hF, 1, 1, 1, 1, 1, 2, i, i, false);
        this.a(world, hF, 6, 1, 1, 6, 1, 2, i, i, false);
        this.a(world, hF, 1, 3, 1, 1, 3, 2, i, i, false);
        this.a(world, hF, 6, 3, 1, 6, 3, 2, i, i, false);
        this.a(world, hF, 1, 1, 13, 1, 1, 14, i, i, false);
        this.a(world, hF, 6, 1, 13, 6, 1, 14, i, i, false);
        this.a(world, hF, 1, 3, 13, 1, 3, 14, i, i, false);
        this.a(world, hF, 6, 3, 13, 6, 3, 14, i, i, false);
        this.a(world, hF, 2, 1, 6, 2, 3, 6, i, i, false);
        this.a(world, hF, 5, 1, 6, 5, 3, 6, i, i, false);
        this.a(world, hF, 2, 1, 9, 2, 3, 9, i, i, false);
        this.a(world, hF, 5, 1, 9, 5, 3, 9, i, i, false);
        this.a(world, hF, 3, 2, 6, 4, 2, 6, i, i, false);
        this.a(world, hF, 3, 2, 9, 4, 2, 9, i, i, false);
        this.a(world, hF, 2, 2, 7, 2, 2, 8, i, i, false);
        this.a(world, hF, 5, 2, 7, 5, 2, 8, i, i, false);
        this.b(world, l, 2, 2, 5, hF);
        this.b(world, l, 5, 2, 5, hF);
        this.b(world, l, 2, 2, 10, hF);
        this.b(world, l, 5, 2, 10, hF);
        this.b(world, i, 2, 3, 5, hF);
        this.b(world, i, 5, 3, 5, hF);
        this.b(world, i, 2, 3, 10, hF);
        this.b(world, i, 5, 3, 10, hF);
        if (ajM3.f[SJ.i(EnumFacing.SOUTH)]) {
            this.a(world, hF, 3, 1, 0, 4, 2, 0, false);
        }
        if (ajM3.f[SJ.i(EnumFacing.EAST)]) {
            this.a(world, hF, 7, 1, 3, 7, 2, 4, false);
        }
        if (ajM3.f[SJ.i(EnumFacing.WEST)]) {
            this.a(world, hF, 0, 1, 3, 0, 2, 4, false);
        }
        if (ajM2.f[SJ.i(EnumFacing.NORTH)]) {
            this.a(world, hF, 3, 1, 15, 4, 2, 15, false);
        }
        if (ajM2.f[SJ.i(EnumFacing.WEST)]) {
            this.a(world, hF, 0, 1, 11, 0, 2, 12, false);
        }
        if (ajM2.f[SJ.i(EnumFacing.EAST)]) {
            this.a(world, hF, 7, 1, 11, 7, 2, 12, false);
        }
        return true;
    }

    public Z2(EnumFacing enumFacing, ajM ajM2, Random random) {
        super(1, enumFacing, ajM2, 1, 1, 2);
    }

    public Z2() {
    }
}

