/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IBlockAccess;
import net.minecraft.block.BlockPos;

class YU
implements aqz_0 {
    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        aP2.b();
        il_0 il_02 = axn_1.a(iBlockAccess, blockPos);
        return axn_1.e() != null && il_02 == il_0.aw ? ar9_0.a(axn_1.e(), il_02, blockPos) : hw_0.a(il_02, blockPos);
    }

    @Override
    public boolean a() {
        return false;
    }

    YU() {
    }
}

