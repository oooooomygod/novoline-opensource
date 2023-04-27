/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.init.Blocks;

/*
 * Renamed from net.Vg
 */
class vg_0
extends vx_0 {
    vg_0(int n2, String string2, String string3) {
    }

    @Override
    public IBlockState a() {
        return BlockStateInvoker.a(BlocksInvoker.t(Blocks.z), hk_1.P, (Comparable)((Object)aCq.MOSSY));
    }
}

