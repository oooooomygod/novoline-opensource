/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class ZQ
extends YJ {
    public ZQ() {
    }

    public ZQ(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.b = hF;
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        this.a((zr_0)y_, list, random, 1, 3, false);
    }

    public static ZQ a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -1, -3, 0, 5, 10, 19, enumFacing);
        return ZQ.a(hF) && Y_.a(list, hF) == null ? new ZQ(n4, random, hF, enumFacing) : null;
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        this.a(world, hF, 0, 3, 0, 4, 4, 18, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 5, 0, 3, 7, 18, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 0, 5, 0, 0, 5, 18, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 4, 5, 0, 4, 5, 18, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 2, 0, 4, 2, 5, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 2, 13, 4, 2, 18, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 0, 0, 4, 1, 3, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 0, 15, 4, 1, 18, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(world, BlocksInvoker.t(Blocks.ak), n, -1, n2, hF);
            this.a(world, BlocksInvoker.t(Blocks.ak), n, -1, 18 - n2, hF);
            ++n2;
        }
    }
}

