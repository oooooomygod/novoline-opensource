/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

public class Z4
extends zg_0 {
    @Override
    public boolean a(World world, Random random, HF hF) {
        this.a(world, hF, 1, 8, 0, 14, 8, 14, e);
        int n = 7;
        IBlockState iBlockState = i;
        this.a(world, hF, 0, n, 0, 0, n, 15, iBlockState, iBlockState, false);
        this.a(world, hF, 15, n, 0, 15, n, 15, iBlockState, iBlockState, false);
        this.a(world, hF, 1, n, 0, 15, n, 0, iBlockState, iBlockState, false);
        this.a(world, hF, 1, n, 15, 14, n, 15, iBlockState, iBlockState, false);
        n = 1;
        iBlockState = i;
        int n2 = 0;
        while (true) {
            this.a(world, hF, n2, n, 0, n2, n, 1, iBlockState, iBlockState, false);
            this.a(world, hF, n2, n, 6, n2, n, 9, iBlockState, iBlockState, false);
            this.a(world, hF, n2, n, 14, n2, n, 15, iBlockState, iBlockState, false);
            n2 += 15;
        }
    }

    public Z4() {
    }

    public Z4(EnumFacing enumFacing, ajM ajM2, Random random) {
        super(1, enumFacing, ajM2, 2, 2, 2);
    }
}

