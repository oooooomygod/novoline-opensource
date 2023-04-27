/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.init.Blocks;

/*
 * Renamed from net.Vn
 */
class vn_0
extends vx_0 {
    @Override
    public IBlockState a() {
        return BlockStateInvoker.a(BlocksInvoker.t(Blocks.z), hk_1.P, (Comparable)((Object)aCq.CHISELED));
    }

    vn_0(int n2, String string2, String string3) {
    }
}

