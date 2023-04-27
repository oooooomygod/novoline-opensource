/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

public class IV
extends il_0 {
    private static IBlockState aF = BlockStateInvoker.a(BlocksInvoker.t(Blocks.b2), gj_0.R, (Comparable)((Object)F3.JUNGLE));
    private boolean aI;
    private static IBlockState aG;
    private static IBlockState aH;

    @Override
    public void a(World world, Random random, BlockPos blockPos) {
        super.a(world, random, blockPos);
        int n = a5_0.a(random, 16) + 8;
        int n2 = a5_0.a(random, 16) + 8;
        int n3 = a5_0.a(random, amv_2.h(aV8.r(world, amv_2.a(blockPos, n, 0, n2))) * 2);
        awm_1.a(new i8_0(), world, random, amv_2.a(blockPos, n, n3, n2));
        i0_0 i0_02 = new i0_0();
        n2 = 0;
        while (true) {
            n3 = a5_0.a(random, 16) + 8;
            int n4 = a5_0.a(random, 16) + 8;
            a7W.a(i0_02, world, random, amv_2.a(blockPos, n3, 128, n4));
            ++n2;
        }
    }

    static {
        aH = BlockStateInvoker.a(BlockStateInvoker.a(aa1_0.a(Blocks.bP), gg_1.W, (Comparable)((Object)F3.JUNGLE)), BlockLeaves.V, Boolean.FALSE);
        aG = BlockStateInvoker.a(BlockStateInvoker.a(aa1_0.a(Blocks.bP), gg_1.W, (Comparable)((Object)F3.OAK)), BlockLeaves.V, Boolean.FALSE);
    }

    public IV(int n, boolean bl) {
        super(n);
        this.aI = bl;
        this.ai.w = 2;
        this.ai.j = 25;
        this.ai.e = 4;
        ListInvoker.add(this.ar, new cp_0(nb_1.class, 2, 1, 1));
        ListInvoker.add(this.P, new cp_0(nd_1.class, 10, 4, 4));
    }

    @Override
    public i7_0 a(Random random) {
        return a5_0.a(random, 4) == 0 ? new im_2(a4b.FERN) : new im_2(a4b.GRASS);
    }

    @Override
    public ii_1 b(Random random) {
        return a5_0.a(random, 10) == 0 ? this.g : (a5_0.a(random, 2) == 0 ? new ia_1(aF, aG) : (!this.aI && a5_0.a(random, 3) == 0 ? new ik_2(false, 10, 20, aF, aH) : new id_1(false, 4 + a5_0.a(random, 7), aF, aH, true)));
    }
}

