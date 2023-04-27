/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;

class V7
extends vx_0 {
    @Override
    public IBlockState a() {
        return BlockStateInvoker.a(BlocksInvoker.t(Blocks.stone), BlockStone.P, (Comparable)((Object)UI.STONE));
    }

    V7(int n2, String string2) {
    }
}

