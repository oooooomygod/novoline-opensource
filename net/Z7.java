/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class Z7
extends YJ {
    @Override
    public boolean a(World world, Random random, HF hF) {
        this.a(world, hF, 0, 0, 0, 6, 1, 6, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 2, 0, 6, 10, 6, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 0, 2, 0, 1, 8, 0, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 5, 2, 0, 6, 8, 0, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 2, 1, 0, 8, 6, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 6, 2, 1, 6, 8, 6, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 2, 6, 5, 8, 6, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 3, 2, 0, 5, 4, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 6, 3, 2, 6, 5, 2, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 6, 3, 4, 6, 5, 4, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.b(world, BlocksInvoker.t(Blocks.ak), 5, 2, 5, hF);
        this.a(world, hF, 4, 2, 5, 4, 3, 5, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 3, 2, 5, 3, 4, 5, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 2, 2, 5, 2, 5, 5, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 2, 5, 1, 6, 5, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 7, 1, 5, 7, 4, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 6, 8, 2, 6, 8, 4, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 2, 6, 0, 4, 8, 0, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 2, 5, 0, 4, 5, 0, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(world, BlocksInvoker.t(Blocks.ak), n, -1, n2, hF);
            ++n2;
        }
    }

    public Z7() {
    }

    public static Z7 a(List<Y_> list, Random random, int n, int n2, int n3, int n4, EnumFacing enumFacing) {
        HF hF = aqu_2.a(n, n2, n3, -2, 0, 0, 7, 11, 7, enumFacing);
        return Z7.a(hF) && Y_.a(list, hF) == null ? new Z7(n4, random, hF, enumFacing) : null;
    }

    public Z7(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.b = hF;
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        this.c((zr_0)y_, list, random, 6, 2, false);
    }
}

