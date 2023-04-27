/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

public class ZD
extends zg_0 {
    private int o;

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.j.c / 25 > 0) {
            this.a(world, hF, 0, 0, this.j.f[SJ.i(EnumFacing.DOWN)]);
        }
        if (this.j.a[SJ.i(EnumFacing.UP)] == null) {
            this.a(world, hF, 1, 4, 1, 6, 4, 6, e);
        }
        boolean bl = this.o != 0 && a5_0.a(random) && !this.j.f[SJ.i(EnumFacing.DOWN)] && !this.j.f[SJ.i(EnumFacing.UP)] && this.j.a() > 1;
        if (this.o == 0) {
            this.a(world, hF, 0, 1, 0, 2, 1, 2, i, i, false);
            this.a(world, hF, 0, 3, 0, 2, 3, 2, i, i, false);
            this.a(world, hF, 0, 2, 0, 0, 2, 2, e, e, false);
            this.a(world, hF, 1, 2, 0, 2, 2, 0, e, e, false);
            this.b(world, l, 1, 2, 1, hF);
            this.a(world, hF, 5, 1, 0, 7, 1, 2, i, i, false);
            this.a(world, hF, 5, 3, 0, 7, 3, 2, i, i, false);
            this.a(world, hF, 7, 2, 0, 7, 2, 2, e, e, false);
            this.a(world, hF, 5, 2, 0, 6, 2, 0, e, e, false);
            this.b(world, l, 6, 2, 1, hF);
            this.a(world, hF, 0, 1, 5, 2, 1, 7, i, i, false);
            this.a(world, hF, 0, 3, 5, 2, 3, 7, i, i, false);
            this.a(world, hF, 0, 2, 5, 0, 2, 7, e, e, false);
            this.a(world, hF, 1, 2, 7, 2, 2, 7, e, e, false);
            this.b(world, l, 1, 2, 6, hF);
            this.a(world, hF, 5, 1, 5, 7, 1, 7, i, i, false);
            this.a(world, hF, 5, 3, 5, 7, 3, 7, i, i, false);
            this.a(world, hF, 7, 2, 5, 7, 2, 7, e, e, false);
            this.a(world, hF, 5, 2, 7, 6, 2, 7, e, e, false);
            this.b(world, l, 6, 2, 6, hF);
            if (this.j.f[SJ.i(EnumFacing.SOUTH)]) {
                this.a(world, hF, 3, 3, 0, 4, 3, 0, i, i, false);
            } else {
                this.a(world, hF, 3, 3, 0, 4, 3, 1, i, i, false);
                this.a(world, hF, 3, 2, 0, 4, 2, 0, e, e, false);
                this.a(world, hF, 3, 1, 0, 4, 1, 1, i, i, false);
            }
            if (this.j.f[SJ.i(EnumFacing.NORTH)]) {
                this.a(world, hF, 3, 3, 7, 4, 3, 7, i, i, false);
            } else {
                this.a(world, hF, 3, 3, 6, 4, 3, 7, i, i, false);
                this.a(world, hF, 3, 2, 7, 4, 2, 7, e, e, false);
                this.a(world, hF, 3, 1, 6, 4, 1, 7, i, i, false);
            }
            if (this.j.f[SJ.i(EnumFacing.WEST)]) {
                this.a(world, hF, 0, 3, 3, 0, 3, 4, i, i, false);
            } else {
                this.a(world, hF, 0, 3, 3, 1, 3, 4, i, i, false);
                this.a(world, hF, 0, 2, 3, 0, 2, 4, e, e, false);
                this.a(world, hF, 0, 1, 3, 1, 1, 4, i, i, false);
            }
            if (this.j.f[SJ.i(EnumFacing.EAST)]) {
                this.a(world, hF, 7, 3, 3, 7, 3, 4, i, i, false);
            } else {
                this.a(world, hF, 6, 3, 3, 7, 3, 4, i, i, false);
                this.a(world, hF, 7, 2, 3, 7, 2, 4, e, e, false);
                this.a(world, hF, 6, 1, 3, 7, 1, 4, i, i, false);
            }
        } else if (this.o == 1) {
            this.a(world, hF, 2, 1, 2, 2, 3, 2, i, i, false);
            this.a(world, hF, 2, 1, 5, 2, 3, 5, i, i, false);
            this.a(world, hF, 5, 1, 5, 5, 3, 5, i, i, false);
            this.a(world, hF, 5, 1, 2, 5, 3, 2, i, i, false);
            this.b(world, l, 2, 2, 2, hF);
            this.b(world, l, 2, 2, 5, hF);
            this.b(world, l, 5, 2, 5, hF);
            this.b(world, l, 5, 2, 2, hF);
            this.a(world, hF, 0, 1, 0, 1, 3, 0, i, i, false);
            this.a(world, hF, 0, 1, 1, 0, 3, 1, i, i, false);
            this.a(world, hF, 0, 1, 7, 1, 3, 7, i, i, false);
            this.a(world, hF, 0, 1, 6, 0, 3, 6, i, i, false);
            this.a(world, hF, 6, 1, 7, 7, 3, 7, i, i, false);
            this.a(world, hF, 7, 1, 6, 7, 3, 6, i, i, false);
            this.a(world, hF, 6, 1, 0, 7, 3, 0, i, i, false);
            this.a(world, hF, 7, 1, 1, 7, 3, 1, i, i, false);
            this.b(world, e, 1, 2, 0, hF);
            this.b(world, e, 0, 2, 1, hF);
            this.b(world, e, 1, 2, 7, hF);
            this.b(world, e, 0, 2, 6, hF);
            this.b(world, e, 6, 2, 7, hF);
            this.b(world, e, 7, 2, 6, hF);
            this.b(world, e, 6, 2, 0, hF);
            this.b(world, e, 7, 2, 1, hF);
            if (!this.j.f[SJ.i(EnumFacing.SOUTH)]) {
                this.a(world, hF, 1, 3, 0, 6, 3, 0, i, i, false);
                this.a(world, hF, 1, 2, 0, 6, 2, 0, e, e, false);
                this.a(world, hF, 1, 1, 0, 6, 1, 0, i, i, false);
            }
            if (!this.j.f[SJ.i(EnumFacing.NORTH)]) {
                this.a(world, hF, 1, 3, 7, 6, 3, 7, i, i, false);
                this.a(world, hF, 1, 2, 7, 6, 2, 7, e, e, false);
                this.a(world, hF, 1, 1, 7, 6, 1, 7, i, i, false);
            }
            if (!this.j.f[SJ.i(EnumFacing.WEST)]) {
                this.a(world, hF, 0, 3, 1, 0, 3, 6, i, i, false);
                this.a(world, hF, 0, 2, 1, 0, 2, 6, e, e, false);
                this.a(world, hF, 0, 1, 1, 0, 1, 6, i, i, false);
            }
            if (!this.j.f[SJ.i(EnumFacing.EAST)]) {
                this.a(world, hF, 7, 3, 1, 7, 3, 6, i, i, false);
                this.a(world, hF, 7, 2, 1, 7, 2, 6, e, e, false);
                this.a(world, hF, 7, 1, 1, 7, 1, 6, i, i, false);
            }
        } else if (this.o == 2) {
            this.a(world, hF, 0, 1, 0, 0, 1, 7, i, i, false);
            this.a(world, hF, 7, 1, 0, 7, 1, 7, i, i, false);
            this.a(world, hF, 1, 1, 0, 6, 1, 0, i, i, false);
            this.a(world, hF, 1, 1, 7, 6, 1, 7, i, i, false);
            this.a(world, hF, 0, 2, 0, 0, 2, 7, h, h, false);
            this.a(world, hF, 7, 2, 0, 7, 2, 7, h, h, false);
            this.a(world, hF, 1, 2, 0, 6, 2, 0, h, h, false);
            this.a(world, hF, 1, 2, 7, 6, 2, 7, h, h, false);
            this.a(world, hF, 0, 3, 0, 0, 3, 7, i, i, false);
            this.a(world, hF, 7, 3, 0, 7, 3, 7, i, i, false);
            this.a(world, hF, 1, 3, 0, 6, 3, 0, i, i, false);
            this.a(world, hF, 1, 3, 7, 6, 3, 7, i, i, false);
            this.a(world, hF, 0, 1, 3, 0, 2, 4, h, h, false);
            this.a(world, hF, 7, 1, 3, 7, 2, 4, h, h, false);
            this.a(world, hF, 3, 1, 0, 4, 2, 0, h, h, false);
            this.a(world, hF, 3, 1, 7, 4, 2, 7, h, h, false);
            if (this.j.f[SJ.i(EnumFacing.SOUTH)]) {
                this.a(world, hF, 3, 1, 0, 4, 2, 0, false);
            }
            if (this.j.f[SJ.i(EnumFacing.NORTH)]) {
                this.a(world, hF, 3, 1, 7, 4, 2, 7, false);
            }
            if (this.j.f[SJ.i(EnumFacing.WEST)]) {
                this.a(world, hF, 0, 1, 3, 0, 2, 4, false);
            }
            if (this.j.f[SJ.i(EnumFacing.EAST)]) {
                this.a(world, hF, 7, 1, 3, 7, 2, 4, false);
            }
        }
        this.a(world, hF, 3, 1, 3, 4, 1, 4, i, i, false);
        this.a(world, hF, 3, 2, 3, 4, 2, 4, e, e, false);
        this.a(world, hF, 3, 3, 3, 4, 3, 4, i, i, false);
        return true;
    }

    public ZD() {
    }

    public ZD(EnumFacing enumFacing, ajM ajM2, Random random) {
        super(1, enumFacing, ajM2, 1, 1, 1);
        this.o = a5_0.a(random, 3);
    }
}

