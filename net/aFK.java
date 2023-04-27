/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.IBlockState;
import net.World;
import net.a9z_0;
import net.m0_0;
import net.mi_1;
import net.uj_0;

public class aFK
implements a9z_0 {
    @Override
    public mi_1 a(int n, World world, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        IBlockState iBlockState = BlocksInvoker.b(nArray[0]);
        return BlocksInvoker.y(BlockStateInvoker.getBlock(iBlockState)) == -1 ? null : uj_0.a(new m0_0(world, d, d2, d3, d4, d5, d6, iBlockState));
    }
}

