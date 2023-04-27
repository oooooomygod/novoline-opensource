/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

/*
 * Renamed from net.Zk
 */
public class zk_0
extends zg_0 {
    public zk_0() {
    }

    public zk_0(EnumFacing enumFacing, ajM ajM2, Random random) {
        super(1, enumFacing, ajM2, 1, 2, 2);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        ajM ajM2 = this.j.a[SJ.i(EnumFacing.NORTH)];
        ajM ajM3 = this.j;
        ajM ajM4 = ajM2.a[SJ.i(EnumFacing.UP)];
        ajM ajM5 = ajM3.a[SJ.i(EnumFacing.UP)];
        if (this.j.c / 25 > 0) {
            this.a(world, hF, 0, 8, ajM2.f[SJ.i(EnumFacing.DOWN)]);
            this.a(world, hF, 0, 0, ajM3.f[SJ.i(EnumFacing.DOWN)]);
        }
        if (ajM5.a[SJ.i(EnumFacing.UP)] == null) {
            this.a(world, hF, 1, 8, 1, 6, 8, 7, e);
        }
        if (ajM4.a[SJ.i(EnumFacing.UP)] == null) {
            this.a(world, hF, 1, 8, 8, 6, 8, 14, e);
        }
        int n = 1;
        while (true) {
            IBlockState iBlockState = i;
            this.a(world, hF, 0, n, 0, 0, n, 15, iBlockState, iBlockState, false);
            this.a(world, hF, 7, n, 0, 7, n, 15, iBlockState, iBlockState, false);
            this.a(world, hF, 1, n, 0, 6, n, 0, iBlockState, iBlockState, false);
            this.a(world, hF, 1, n, 15, 6, n, 15, iBlockState, iBlockState, false);
            ++n;
        }
    }
}

