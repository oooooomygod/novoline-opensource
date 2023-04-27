/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

/*
 * Renamed from net.Zc
 */
public class zc_0
extends zg_0 {
    public zc_0(EnumFacing enumFacing, ajM ajM2, Random random) {
        super(1, enumFacing, ajM2, 2, 1, 1);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        ajM ajM2 = this.j.a[SJ.i(EnumFacing.EAST)];
        ajM ajM3 = this.j;
        if (this.j.c / 25 > 0) {
            this.a(world, hF, 8, 0, ajM2.f[SJ.i(EnumFacing.DOWN)]);
            this.a(world, hF, 0, 0, ajM3.f[SJ.i(EnumFacing.DOWN)]);
        }
        if (ajM3.a[SJ.i(EnumFacing.UP)] == null) {
            this.a(world, hF, 1, 4, 1, 7, 4, 6, e);
        }
        if (ajM2.a[SJ.i(EnumFacing.UP)] == null) {
            this.a(world, hF, 8, 4, 1, 14, 4, 6, e);
        }
        this.a(world, hF, 0, 3, 0, 0, 3, 7, i, i, false);
        this.a(world, hF, 15, 3, 0, 15, 3, 7, i, i, false);
        this.a(world, hF, 1, 3, 0, 15, 3, 0, i, i, false);
        this.a(world, hF, 1, 3, 7, 14, 3, 7, i, i, false);
        this.a(world, hF, 0, 2, 0, 0, 2, 7, e, e, false);
        this.a(world, hF, 15, 2, 0, 15, 2, 7, e, e, false);
        this.a(world, hF, 1, 2, 0, 15, 2, 0, e, e, false);
        this.a(world, hF, 1, 2, 7, 14, 2, 7, e, e, false);
        this.a(world, hF, 0, 1, 0, 0, 1, 7, i, i, false);
        this.a(world, hF, 15, 1, 0, 15, 1, 7, i, i, false);
        this.a(world, hF, 1, 1, 0, 15, 1, 0, i, i, false);
        this.a(world, hF, 1, 1, 7, 14, 1, 7, i, i, false);
        this.a(world, hF, 5, 1, 0, 10, 1, 4, i, i, false);
        this.a(world, hF, 6, 2, 0, 9, 2, 3, e, e, false);
        this.a(world, hF, 5, 3, 0, 10, 3, 4, i, i, false);
        this.b(world, l, 6, 2, 3, hF);
        this.b(world, l, 9, 2, 3, hF);
        if (ajM3.f[SJ.i(EnumFacing.SOUTH)]) {
            this.a(world, hF, 3, 1, 0, 4, 2, 0, false);
        }
        if (ajM3.f[SJ.i(EnumFacing.NORTH)]) {
            this.a(world, hF, 3, 1, 7, 4, 2, 7, false);
        }
        if (ajM3.f[SJ.i(EnumFacing.WEST)]) {
            this.a(world, hF, 0, 1, 3, 0, 2, 4, false);
        }
        if (ajM2.f[SJ.i(EnumFacing.SOUTH)]) {
            this.a(world, hF, 11, 1, 0, 12, 2, 0, false);
        }
        if (ajM2.f[SJ.i(EnumFacing.NORTH)]) {
            this.a(world, hF, 11, 1, 7, 12, 2, 7, false);
        }
        if (ajM2.f[SJ.i(EnumFacing.EAST)]) {
            this.a(world, hF, 15, 1, 3, 15, 2, 4, false);
        }
        return true;
    }

    public zc_0() {
    }
}

