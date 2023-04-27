/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class ZX
extends zd_0 {
    public ZX(zw_0 zw_02, int n, Random random, HF hF, EnumFacing enumFacing) {
        super(zw_02, n);
        this.c = enumFacing;
        this.b = hF;
    }

    @Override
    protected int c(int n, int n2) {
        return 4;
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.f < 0) {
            this.f = this.a(world, hF);
            if (this.f < 0) {
                return true;
            }
            aqu_2.a(this.b, 0, this.f - this.b.a + 7 - 1, 0);
        }
        this.a(world, hF, 1, 1, 1, 7, 4, 4, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 2, 1, 6, 8, 4, 10, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 2, 0, 6, 8, 0, 10, BlocksInvoker.t(Blocks.dirt), BlocksInvoker.t(Blocks.dirt), false);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 6, 0, 6, hF);
        this.a(world, hF, 2, 1, 6, 2, 1, 10, BlocksInvoker.t(Blocks.Z), BlocksInvoker.t(Blocks.Z), false);
        this.a(world, hF, 8, 1, 6, 8, 1, 10, BlocksInvoker.t(Blocks.Z), BlocksInvoker.t(Blocks.Z), false);
        this.a(world, hF, 3, 1, 10, 7, 1, 10, BlocksInvoker.t(Blocks.Z), BlocksInvoker.t(Blocks.Z), false);
        this.a(world, hF, 1, 0, 1, 7, 0, 4, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.a(world, hF, 0, 0, 0, 0, 3, 5, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 8, 0, 0, 8, 3, 5, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 1, 0, 0, 7, 1, 0, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 1, 0, 5, 7, 1, 5, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 1, 2, 0, 7, 3, 0, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.a(world, hF, 1, 2, 5, 7, 3, 5, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.a(world, hF, 0, 4, 1, 8, 4, 1, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.a(world, hF, 0, 4, 4, 8, 4, 4, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.a(world, hF, 0, 5, 2, 8, 5, 3, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.b(world, BlocksInvoker.t(Blocks.planks), 0, 4, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.planks), 0, 4, 3, hF);
        this.b(world, BlocksInvoker.t(Blocks.planks), 8, 4, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.planks), 8, 4, 3, hF);
        int n = this.a(Blocks.a7, 3);
        int n2 = this.a(Blocks.a7, 2);
        int n3 = -1;
        int n4 = 0;
        while (true) {
            this.b(world, BlocksInvoker.a(Blocks.a7, n), n4, 4 + n3, n3, hF);
            this.b(world, BlocksInvoker.a(Blocks.a7, n2), n4, 4 + n3, 5 - n3, hF);
            ++n4;
        }
    }

    public ZX() {
    }

    public static ZX a(zw_0 zw_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, 0, 0, 0, 9, 7, 11, enumFacing);
        return ZX.a(hF) && Y_.a(list, hF) == null ? new ZX(zw_02, n4, random, hF, enumFacing) : null;
    }
}

