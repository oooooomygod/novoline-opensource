/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.BlockRendererDispatcher;
import deobf.IBlockAccess;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.Xd
 */
public class xd_0 {
    public static X6 b(BlockRendererDispatcher blockRendererDispatcher) {
        return blockRendererDispatcher.b();
    }

    public static void a(BlockRendererDispatcher blockRendererDispatcher, IBlockState iBlockState, float f) {
        blockRendererDispatcher.a(iBlockState, f);
    }

    public static JE a(BlockRendererDispatcher blockRendererDispatcher, IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return blockRendererDispatcher.a(iBlockState, iBlockAccess, blockPos);
    }

    public static boolean a(BlockRendererDispatcher blockRendererDispatcher, Block block, int n) {
        return blockRendererDispatcher.a(block, n);
    }

    public static void a(BlockRendererDispatcher blockRendererDispatcher, IBlockState iBlockState, BlockPos blockPos, KM kM, IBlockAccess iBlockAccess) {
        blockRendererDispatcher.a(iBlockState, blockPos, kM, iBlockAccess);
    }

    public static boolean a(BlockRendererDispatcher blockRendererDispatcher, IBlockState iBlockState, BlockPos blockPos, IBlockAccess iBlockAccess, WorldRenderer worldRenderer) {
        return blockRendererDispatcher.a(iBlockState, blockPos, iBlockAccess, worldRenderer);
    }

    public static atF a(BlockRendererDispatcher blockRendererDispatcher) {
        return blockRendererDispatcher.a();
    }
}

