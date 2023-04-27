/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class ZO
extends ZA {
    public ZO(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.d = this.a(random);
        this.b = hF;
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.a(world, hF)) {
            return false;
        }
        this.a(world, hF, 0, 0, 0, 4, 4, 4, true, random, aPZ.c());
        this.a(world, random, hF, this.d, 1, 1, 0);
        if (this.c != EnumFacing.NORTH && this.c != EnumFacing.EAST) {
            this.a(world, hF, 4, 1, 1, 4, 3, 3, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        } else {
            this.a(world, hF, 0, 1, 1, 0, 3, 3, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        }
        return true;
    }

    public ZO() {
    }

    public static ZO a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -1, -1, 0, 5, 5, 5, enumFacing);
        return ZO.a(hF) && Y_.a(list, hF) == null ? new ZO(n4, random, hF, enumFacing) : null;
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        if (this.c != EnumFacing.NORTH && this.c != EnumFacing.EAST) {
            this.a((ze_0)y_, list, random, 1, 1);
        } else {
            this.b((ze_0)y_, list, random, 1, 1);
        }
    }
}

