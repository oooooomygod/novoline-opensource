/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import java.util.Map;
import net.minecraft.block.Block;

/*
 * Renamed from net.a6c
 */
public class a6c_0
extends a6r_0 {
    @Override
    protected aRJ a(IBlockState iBlockState) {
        return new aRJ((ResourceLocation)a82.b(Block.m, BlockStateInvoker.getBlock(iBlockState)), this.a((Map<a4_0, Comparable>)BlockStateInvoker.b(iBlockState)));
    }
}

