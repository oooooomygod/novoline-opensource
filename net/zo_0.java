/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

/*
 * Renamed from net.Zo
 */
public class zo_0
extends zg_0 {
    public zo_0() {
    }

    public zo_0(EnumFacing enumFacing, ajM ajM2, Random random) {
        super(1, enumFacing, ajM2, 1, 2, 1);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.j.c / 25 > 0) {
            this.a(world, hF, 0, 0, this.j.f[SJ.i(EnumFacing.DOWN)]);
        }
        ajM ajM2 = this.j.a[SJ.i(EnumFacing.UP)];
        if (ajM2.a[SJ.i(EnumFacing.UP)] == null) {
            this.a(world, hF, 1, 8, 1, 6, 8, 6, e);
        }
        this.a(world, hF, 0, 4, 0, 0, 4, 7, i, i, false);
        this.a(world, hF, 7, 4, 0, 7, 4, 7, i, i, false);
        this.a(world, hF, 1, 4, 0, 6, 4, 0, i, i, false);
        this.a(world, hF, 1, 4, 7, 6, 4, 7, i, i, false);
        this.a(world, hF, 2, 4, 1, 2, 4, 2, i, i, false);
        this.a(world, hF, 1, 4, 2, 1, 4, 2, i, i, false);
        this.a(world, hF, 5, 4, 1, 5, 4, 2, i, i, false);
        this.a(world, hF, 6, 4, 2, 6, 4, 2, i, i, false);
        this.a(world, hF, 2, 4, 5, 2, 4, 6, i, i, false);
        this.a(world, hF, 1, 4, 5, 1, 4, 5, i, i, false);
        this.a(world, hF, 5, 4, 5, 5, 4, 6, i, i, false);
        this.a(world, hF, 6, 4, 5, 6, 4, 5, i, i, false);
        ajM ajM3 = this.j;
        int n = 1;
        while (true) {
            int n2 = 0;
            if (ajM3.f[SJ.i(EnumFacing.SOUTH)]) {
                this.a(world, hF, 2, n, n2, 2, n + 2, n2, i, i, false);
                this.a(world, hF, 5, n, n2, 5, n + 2, n2, i, i, false);
                this.a(world, hF, 3, n + 2, n2, 4, n + 2, n2, i, i, false);
            } else {
                this.a(world, hF, 0, n, n2, 7, n + 2, n2, i, i, false);
                this.a(world, hF, 0, n + 1, n2, 7, n + 1, n2, e, e, false);
            }
            n2 = 7;
            if (ajM3.f[SJ.i(EnumFacing.NORTH)]) {
                this.a(world, hF, 2, n, n2, 2, n + 2, n2, i, i, false);
                this.a(world, hF, 5, n, n2, 5, n + 2, n2, i, i, false);
                this.a(world, hF, 3, n + 2, n2, 4, n + 2, n2, i, i, false);
            } else {
                this.a(world, hF, 0, n, n2, 7, n + 2, n2, i, i, false);
                this.a(world, hF, 0, n + 1, n2, 7, n + 1, n2, e, e, false);
            }
            int n3 = 0;
            if (ajM3.f[SJ.i(EnumFacing.WEST)]) {
                this.a(world, hF, n3, n, 2, n3, n + 2, 2, i, i, false);
                this.a(world, hF, n3, n, 5, n3, n + 2, 5, i, i, false);
                this.a(world, hF, n3, n + 2, 3, n3, n + 2, 4, i, i, false);
            } else {
                this.a(world, hF, n3, n, 0, n3, n + 2, 7, i, i, false);
                this.a(world, hF, n3, n + 1, 0, n3, n + 1, 7, e, e, false);
            }
            n3 = 7;
            if (ajM3.f[SJ.i(EnumFacing.EAST)]) {
                this.a(world, hF, n3, n, 2, n3, n + 2, 2, i, i, false);
                this.a(world, hF, n3, n, 5, n3, n + 2, 5, i, i, false);
                this.a(world, hF, n3, n + 2, 3, n3, n + 2, 4, i, i, false);
            } else {
                this.a(world, hF, n3, n, 0, n3, n + 2, 7, i, i, false);
                this.a(world, hF, n3, n + 1, 0, n3, n + 1, 7, e, e, false);
            }
            ajM3 = ajM2;
            n += 4;
        }
    }
}

