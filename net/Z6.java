/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class Z6
extends YJ {
    public Z6(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.b = hF;
    }

    public Z6() {
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        this.a((zr_0)y_, list, random, 1, 0, true);
    }

    public static Z6 a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -1, -7, 0, 5, 14, 10, enumFacing);
        return Z6.a(hF) && Y_.a(list, hF) == null ? new Z6(n4, random, hF, enumFacing) : null;
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        int n = this.a(Blocks.ct, 2);
        int n2 = 0;
        int n3 = MathInvoker.max(1, 7 - n2);
        int n4 = MathInvoker.b(MathInvoker.max(n3 + 5, 14 - n2), 13);
        int n5 = n2;
        this.a(world, hF, 0, 0, n2, 4, n3, n2, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, n3 + 1, n2, 3, n4 - 1, n2, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.b(world, BlocksInvoker.a(Blocks.ct, n), 1, n3 + 1, n2, hF);
        this.b(world, BlocksInvoker.a(Blocks.ct, n), 2, n3 + 1, n2, hF);
        this.b(world, BlocksInvoker.a(Blocks.ct, n), 3, n3 + 1, n2, hF);
        this.a(world, hF, 0, n4, n2, 4, n4, n2, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, n3 + 1, n2, 0, n4 - 1, n2, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 4, n3 + 1, n2, 4, n4 - 1, n2, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        int cfr_ignored_0 = n2 & 1;
        this.a(world, hF, 0, n3 + 2, n2, 0, n3 + 3, n2, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 4, n3 + 2, n2, 4, n3 + 3, n2, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        int n6 = 0;
        while (true) {
            this.a(world, BlocksInvoker.t(Blocks.ak), n6, -1, n5, hF);
            ++n6;
        }
    }
}

