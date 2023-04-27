/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import com.google.common.base.Predicate;
import net.minecraft.init.Blocks;

/*
 * Renamed from net.yz
 */
class yz_2
implements Predicate<IBlockState> {
    public boolean a(IBlockState iBlockState) {
        return BlockStateInvoker.getBlock(iBlockState) == Blocks.ap || BlockStateInvoker.getBlock(iBlockState) == Blocks.a1;
    }

    yz_2() {
    }
}

