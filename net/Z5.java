/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

public class Z5
extends zg_0 {
    public Z5() {
    }

    public Z5(EnumFacing enumFacing, HF hF) {
        super(enumFacing, hF);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        this.a(world, hF, 2, -1, 2, 11, -1, 11, i, i, false);
        this.a(world, hF, 0, -1, 0, 1, -1, 11, e, e, false);
        this.a(world, hF, 12, -1, 0, 13, -1, 11, e, e, false);
        this.a(world, hF, 2, -1, 0, 11, -1, 1, e, e, false);
        this.a(world, hF, 2, -1, 12, 11, -1, 13, e, e, false);
        this.a(world, hF, 0, 0, 0, 0, 0, 13, i, i, false);
        this.a(world, hF, 13, 0, 0, 13, 0, 13, i, i, false);
        this.a(world, hF, 1, 0, 0, 12, 0, 0, i, i, false);
        this.a(world, hF, 1, 0, 13, 12, 0, 13, i, i, false);
        int n = 2;
        while (true) {
            this.b(world, l, 0, 0, n, hF);
            this.b(world, l, 13, 0, n, hF);
            this.b(world, l, n, 0, 0, hF);
            n += 3;
        }
    }
}

