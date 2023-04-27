/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

/*
 * Renamed from net.Zn
 */
public class zn_0
extends zg_0 {
    @Override
    public boolean a(World world, Random random, HF hF) {
        ajM ajM2 = this.j.a[SJ.i(EnumFacing.EAST)];
        ajM ajM3 = this.j;
        ajM ajM4 = ajM3.a[SJ.i(EnumFacing.UP)];
        ajM ajM5 = ajM2.a[SJ.i(EnumFacing.UP)];
        if (this.j.c / 25 > 0) {
            this.a(world, hF, 8, 0, ajM2.f[SJ.i(EnumFacing.DOWN)]);
            this.a(world, hF, 0, 0, ajM3.f[SJ.i(EnumFacing.DOWN)]);
        }
        if (ajM4.a[SJ.i(EnumFacing.UP)] == null) {
            this.a(world, hF, 1, 8, 1, 7, 8, 6, e);
        }
        if (ajM5.a[SJ.i(EnumFacing.UP)] == null) {
            this.a(world, hF, 8, 8, 1, 14, 8, 6, e);
        }
        int n = 1;
        while (true) {
            IBlockState iBlockState = i;
            this.a(world, hF, 0, n, 0, 0, n, 7, iBlockState, iBlockState, false);
            this.a(world, hF, 15, n, 0, 15, n, 7, iBlockState, iBlockState, false);
            this.a(world, hF, 1, n, 0, 15, n, 0, iBlockState, iBlockState, false);
            this.a(world, hF, 1, n, 7, 14, n, 7, iBlockState, iBlockState, false);
            ++n;
        }
    }

    public zn_0() {
    }

    public zn_0(EnumFacing enumFacing, ajM ajM2, Random random) {
        super(1, enumFacing, ajM2, 2, 2, 1);
    }
}

