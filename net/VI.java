/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.init.Blocks;

class VI
extends vx_0 {
    @Override
    public IBlockState a() {
        return BlockStateInvoker.a(BlocksInvoker.t(Blocks.z), hk_1.P, (Comparable)((Object)aCq.DEFAULT));
    }

    VI(int n2, String string2, String string3) {
    }
}

