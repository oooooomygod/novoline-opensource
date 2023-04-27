/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class ZP
extends ZA {
    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.a(world, hF)) {
            return false;
        }
        this.a(world, hF, 0, 0, 0, 8, 4, 10, true, random, aPZ.c());
        this.a(world, random, hF, this.d, 1, 1, 0);
        this.a(world, hF, 1, 1, 10, 3, 3, 10, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 4, 1, 1, 4, 3, 1, false, random, aPZ.c());
        this.a(world, hF, 4, 1, 3, 4, 3, 3, false, random, aPZ.c());
        this.a(world, hF, 4, 1, 7, 4, 3, 7, false, random, aPZ.c());
        this.a(world, hF, 4, 1, 9, 4, 3, 9, false, random, aPZ.c());
        this.a(world, hF, 4, 1, 4, 4, 3, 6, BlocksInvoker.t(Blocks.by), BlocksInvoker.t(Blocks.by), false);
        this.a(world, hF, 5, 1, 5, 7, 3, 5, BlocksInvoker.t(Blocks.by), BlocksInvoker.t(Blocks.by), false);
        this.b(world, BlocksInvoker.t(Blocks.by), 4, 3, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.by), 4, 3, 8, hF);
        this.b(world, BlocksInvoker.a(Blocks.bb, this.a(Blocks.bb, 3)), 4, 1, 2, hF);
        this.b(world, BlocksInvoker.a(Blocks.bb, this.a(Blocks.bb, 3) + 8), 4, 2, 2, hF);
        this.b(world, BlocksInvoker.a(Blocks.bb, this.a(Blocks.bb, 3)), 4, 1, 8, hF);
        this.b(world, BlocksInvoker.a(Blocks.bb, this.a(Blocks.bb, 3) + 8), 4, 2, 8, hF);
        return true;
    }

    public static ZP a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -1, -1, 0, 9, 5, 11, enumFacing);
        return ZP.a(hF) && Y_.a(list, hF) == null ? new ZP(n4, random, hF, enumFacing) : null;
    }

    public ZP(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.d = this.a(random);
        this.b = hF;
    }

    public ZP() {
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        this.c((ze_0)y_, list, random, 1, 1);
    }
}

