/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import java.util.ArrayList;
import java.util.List;

public class M8 {
    private static JE c = new aks_2(new ArrayList<a9Z>(), new ArrayList<List<a9Z>>(), false, false, null, null);
    private static JE a;
    private static JE b;
    private static JE d;

    private static Block a(BlockPos blockPos, EnumFacing enumFacing, IBlockAccess iBlockAccess) {
        BlockPos blockPos2 = amv_2.a(blockPos, enumFacing);
        Block block = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos2));
        return block;
    }

    static {
        d = null;
        a = null;
        b = null;
    }

    public static List a(IBlockAccess iBlockAccess, Block block, BlockPos blockPos, EnumFacing enumFacing, List list) {
        aP2.b();
        if (enumFacing != EnumFacing.UP && enumFacing != EnumFacing.DOWN) {
            if (block instanceof gp_1) {
                return ys_2.p() ? (M8.a(amv_2.g(blockPos), enumFacing, iBlockAccess) == Blocks.aE ? aND.a(d, enumFacing) : list) : aND.a(d, enumFacing);
            }
            if (block instanceof BlockGrass) {
                boolean bl;
                Block block2 = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.e(blockPos)));
                boolean bl2 = bl = block2 == Blocks.bq || block2 == Blocks.cm;
                if (!ys_2.p()) {
                    return aND.a(a, enumFacing);
                }
                if (M8.a(blockPos, enumFacing, iBlockAccess) == Blocks.cm) {
                    return aND.a(a, enumFacing);
                }
            }
            return list;
        }
        return list;
    }

    public static void a() {
        b = P9.a(aO0.c, 0);
        a = P9.a(aO0.b, -1);
        d = P9.a(aO0.a, -1);
    }
}

