/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class Z3
extends YJ {
    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        this.a((zr_0)y_, list, random, 5, 3, true);
    }

    public static Z3 a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -5, -3, 0, 13, 14, 13, enumFacing);
        return Z3.a(hF) && Y_.a(list, hF) == null ? new Z3(n4, random, hF, enumFacing) : null;
    }

    public Z3() {
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        this.a(world, hF, 0, 3, 0, 12, 4, 12, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 5, 0, 12, 13, 12, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 0, 5, 0, 1, 12, 12, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 11, 5, 0, 12, 12, 12, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 2, 5, 11, 4, 12, 12, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 8, 5, 11, 10, 12, 12, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 5, 9, 11, 7, 12, 12, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 2, 5, 0, 4, 12, 1, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 8, 5, 0, 10, 12, 1, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 5, 9, 0, 7, 12, 1, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 2, 11, 2, 10, 12, 10, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 5, 8, 0, 7, 8, 0, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        int n = 1;
        while (true) {
            this.a(world, hF, n, 10, 0, n, 11, 0, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
            this.a(world, hF, n, 10, 12, n, 11, 12, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
            this.a(world, hF, 0, 10, n, 0, 11, n, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
            this.a(world, hF, 12, 10, n, 12, 11, n, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
            this.b(world, BlocksInvoker.t(Blocks.ak), n, 13, 0, hF);
            this.b(world, BlocksInvoker.t(Blocks.ak), n, 13, 12, hF);
            this.b(world, BlocksInvoker.t(Blocks.ak), 0, 13, n, hF);
            this.b(world, BlocksInvoker.t(Blocks.ak), 12, 13, n, hF);
            this.b(world, BlocksInvoker.t(Blocks.a6), n + 1, 13, 0, hF);
            this.b(world, BlocksInvoker.t(Blocks.a6), n + 1, 13, 12, hF);
            this.b(world, BlocksInvoker.t(Blocks.a6), 0, 13, n + 1, hF);
            this.b(world, BlocksInvoker.t(Blocks.a6), 12, 13, n + 1, hF);
            n += 2;
        }
    }

    public Z3(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.b = hF;
    }
}

