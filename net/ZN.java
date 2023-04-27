/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class ZN
extends zd_0 {
    public static ZN a(zw_0 zw_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, 0, 0, 0, 5, 12, 9, enumFacing);
        return ZN.a(hF) && Y_.a(list, hF) == null ? new ZN(zw_02, n4, random, hF, enumFacing) : null;
    }

    @Override
    protected int c(int n, int n2) {
        return 2;
    }

    public ZN() {
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.f < 0) {
            this.f = this.a(world, hF);
            if (this.f < 0) {
                return true;
            }
            aqu_2.a(this.b, 0, this.f - this.b.a + 12 - 1, 0);
        }
        this.a(world, hF, 1, 1, 1, 3, 3, 7, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 1, 5, 1, 3, 9, 3, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 1, 0, 0, 3, 0, 8, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 1, 1, 0, 3, 10, 0, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 0, 1, 1, 0, 10, 3, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 4, 1, 1, 4, 10, 3, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 0, 0, 4, 0, 4, 7, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 4, 0, 4, 4, 4, 7, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 1, 1, 8, 3, 4, 8, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 1, 5, 4, 3, 10, 4, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 1, 5, 5, 3, 5, 7, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 0, 9, 0, 4, 9, 4, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 0, 4, 0, 4, 4, 4, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 0, 11, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 4, 11, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 2, 11, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 2, 11, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 1, 1, 6, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 1, 1, 7, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 2, 1, 7, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 3, 1, 6, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 3, 1, 7, hF);
        this.b(world, BlocksInvoker.a(Blocks.U, this.a(Blocks.U, 3)), 1, 1, 5, hF);
        this.b(world, BlocksInvoker.a(Blocks.U, this.a(Blocks.U, 3)), 2, 1, 6, hF);
        this.b(world, BlocksInvoker.a(Blocks.U, this.a(Blocks.U, 3)), 3, 1, 5, hF);
        this.b(world, BlocksInvoker.a(Blocks.U, this.a(Blocks.U, 1)), 1, 2, 7, hF);
        this.b(world, BlocksInvoker.a(Blocks.U, this.a(Blocks.U, 0)), 3, 2, 7, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 0, 2, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 0, 3, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 4, 2, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 4, 3, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 0, 6, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 0, 7, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 4, 6, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 4, 7, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 2, 6, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 2, 7, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 2, 6, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 2, 7, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 0, 3, 6, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 4, 3, 6, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 2, 3, 8, hF);
        this.b(world, BlockStateInvoker.a(BlocksInvoker.t(Blocks.bD), hl_1.P, (Comparable)((Object)SJ.b(this.c))), 2, 4, 7, hF);
        this.b(world, BlockStateInvoker.a(BlocksInvoker.t(Blocks.bD), hl_1.P, (Comparable)((Object)SJ.l(this.c))), 1, 4, 6, hF);
        this.b(world, BlockStateInvoker.a(BlocksInvoker.t(Blocks.bD), hl_1.P, (Comparable)((Object)SJ.c(this.c))), 3, 4, 6, hF);
        this.b(world, BlockStateInvoker.a(BlocksInvoker.t(Blocks.bD), hl_1.P, (Comparable)((Object)this.c)), 2, 4, 5, hF);
        int n = this.a(Blocks.bm, 4);
        int n2 = 1;
        while (true) {
            this.b(world, BlocksInvoker.a(Blocks.bm, n), 3, n2, 3, hF);
            ++n2;
        }
    }

    public ZN(zw_0 zw_02, int n, Random random, HF hF, EnumFacing enumFacing) {
        super(zw_02, n);
        this.c = enumFacing;
        this.b = hF;
    }
}

