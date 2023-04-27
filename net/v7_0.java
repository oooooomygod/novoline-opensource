/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.block.BlockSapling;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import deobf.MCInvoker;

/*
 * Renamed from net.v7
 */
public class v7_0 {
    private static JE a = null;

    private static boolean a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        aP2.b();
        Block block = Blocks.cm;
        return BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.a(blockPos))) != block && BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.b(blockPos))) != block && BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.d(blockPos))) != block && BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.f(blockPos))) != block ? false : BlocksInvoker.L(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.g(blockPos))));
    }

    public static IBlockState c() {
        return BlocksInvoker.t(Blocks.cm);
    }

    public static void b() {
        a = ap__0.b(xd_0.a(MCInvoker.Y(ys_2.at())), BlocksInvoker.t(Blocks.cm));
    }

    public static JE a() {
        return a;
    }

    private static boolean a(Block block, IBlockState iBlockState) {
        aP2.b();
        if (BlocksInvoker.p(block)) {
            return false;
        }
        if (BlocksInvoker.L(block)) {
            return false;
        }
        if (block instanceof hq_1) {
            return false;
        }
        if (!(block instanceof fc_2 && (block instanceof fl_1 || block instanceof fu_0 || block instanceof fa_1 || block instanceof BlockSapling || block instanceof fg_1))) {
            if (!(block instanceof g2_0 || block instanceof gv_2 || block instanceof fw_2 || block instanceof gd_2 || block instanceof gy_1 || block instanceof hr_0)) {
                Comparable comparable;
                if (block instanceof hu_1 && BlockStateInvoker.b(iBlockState, hl_1.P) == EnumFacing.UP) {
                    return true;
                }
                return block instanceof ge_1 && ((comparable = BlockStateInvoker.b(iBlockState, ge_1.Q)) == aAP.UP_X || comparable == aAP.UP_Z);
            }
            return true;
        }
        return true;
    }

    public static boolean a(IBlockAccess iBlockAccess, Block block, IBlockState iBlockState, BlockPos blockPos) {
        aP2.b();
        return !v7_0.a(block, iBlockState) ? false : v7_0.a(iBlockAccess, blockPos);
    }
}

