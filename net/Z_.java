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

public class Z_
extends zd_0 {
    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.f < 0) {
            this.f = this.a(world, hF);
            if (this.f < 0) {
                return true;
            }
            aqu_2.a(this.b, 0, this.f - this.b.a + 4 - 1, 0);
        }
        this.a(world, hF, 0, 0, 0, 2, 3, 1, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.b(world, BlocksInvoker.t(Blocks.Z), 1, 0, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.Z), 1, 1, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.Z), 1, 2, 0, hF);
        this.b(world, BlocksInvoker.a(Blocks.b_, my_2.c(YZ.WHITE)), 1, 3, 0, hF);
        boolean bl = this.c == EnumFacing.EAST || this.c == EnumFacing.NORTH;
        this.b(world, BlockStateInvoker.a(BlocksInvoker.t(Blocks.bD), hl_1.P, (Comparable)((Object)SJ.l(this.c))), 2, 3, 0, hF);
        this.b(world, BlockStateInvoker.a(BlocksInvoker.t(Blocks.bD), hl_1.P, (Comparable)((Object)this.c)), 1, 3, 1, hF);
        this.b(world, BlockStateInvoker.a(BlocksInvoker.t(Blocks.bD), hl_1.P, (Comparable)((Object)SJ.c(this.c))), 0, 3, 0, hF);
        this.b(world, BlockStateInvoker.a(BlocksInvoker.t(Blocks.bD), hl_1.P, (Comparable)((Object)SJ.b(this.c))), 1, 3, -1, hF);
        return true;
    }

    public Z_(zw_0 zw_02, int n, Random random, HF hF, EnumFacing enumFacing) {
        super(zw_02, n);
        this.c = enumFacing;
        this.b = hF;
    }

    public Z_() {
    }

    public static HF a(zw_0 zw_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing) {
        HF hF = aqu_2.a(n, n2, n3, 0, 0, 0, 3, 4, 2, enumFacing);
        return Y_.a(list, hF) != null ? null : hF;
    }
}

