/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class ZV
extends YJ {
    @Override
    public boolean a(World world, Random random, HF hF) {
        this.a(world, hF, 7, 3, 0, 11, 4, 18, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 3, 7, 18, 4, 11, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 8, 5, 0, 10, 7, 18, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 0, 5, 8, 18, 7, 10, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 7, 5, 0, 7, 5, 7, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 7, 5, 11, 7, 5, 18, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 11, 5, 0, 11, 5, 7, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 11, 5, 11, 11, 5, 18, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 5, 7, 7, 5, 7, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 11, 5, 7, 18, 5, 7, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 5, 11, 7, 5, 11, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 11, 5, 11, 18, 5, 11, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 7, 2, 0, 11, 2, 5, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 7, 2, 13, 11, 2, 18, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 7, 0, 0, 11, 1, 3, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 7, 0, 15, 11, 1, 18, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        int n = 7;
        int n2 = 0;
        while (true) {
            this.a(world, BlocksInvoker.t(Blocks.ak), n, -1, n2, hF);
            this.a(world, BlocksInvoker.t(Blocks.ak), n, -1, 18 - n2, hF);
            ++n2;
        }
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        this.a((zr_0)y_, list, random, 8, 3, false);
        this.b((zr_0)y_, list, random, 3, 8, false);
        this.c((zr_0)y_, list, random, 3, 8, false);
    }

    public ZV(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.b = hF;
    }

    public static ZV a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -8, -3, 0, 19, 10, 19, enumFacing);
        return ZV.a(hF) && Y_.a(list, hF) == null ? new ZV(n4, random, hF, enumFacing) : null;
    }

    public ZV() {
    }

    protected ZV(Random random, int n, int n2) {
        super(0);
        this.c = abw_2.a(cs_1.HORIZONTAL, random);
        switch (a8e_0.a[this.c.ordinal()]) {
            case 1: 
            case 2: {
                this.b = new HF(n, 64, n2, n + 19 - 1, 73, n2 + 19 - 1);
                break;
            }
            default: {
                this.b = new HF(n, 64, n2, n + 19 - 1, 73, n2 + 19 - 1);
            }
        }
    }
}

