/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import deobf.EnumFacing;

public class ZR
extends zg_0 {
    private int o;

    public ZR(EnumFacing enumFacing, HF hF, int n) {
        super(enumFacing, hF);
        this.o = n & 1;
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.o == 0) {
            int n = 0;
            while (true) {
                this.a(world, hF, 10 - n, 3 - n, 20 - n, 12 + n, 3 - n, 20, i, i, false);
                ++n;
            }
        }
        if (this.o == 1) {
            this.a(world, hF, 9, 3, 18, 13, 3, 20, i, i, false);
            this.a(world, hF, 9, 0, 18, 9, 2, 18, i, i, false);
            this.a(world, hF, 13, 0, 18, 13, 2, 18, i, i, false);
            int n = 9;
            int n2 = 20;
            int n3 = 5;
            int n4 = 0;
            while (true) {
                this.b(world, i, n, n3 + 1, n2, hF);
                this.b(world, l, n, n3, n2, hF);
                this.b(world, i, n, n3 - 1, n2, hF);
                n = 13;
                ++n4;
            }
        }
        return true;
    }

    public ZR() {
    }
}

