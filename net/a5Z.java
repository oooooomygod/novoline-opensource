/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IBlockAccess;
import net.minecraft.block.BlockPos;

class a5Z
implements aqz_0 {
    a5Z() {
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        aP2.b();
        il_0 il_02 = axn_1.a(iBlockAccess, blockPos);
        return axn_1.a() != null ? ar9_0.a(axn_1.a(), il_02, blockPos) : (ayy_0.d(ail_0.Y) ? aDb.d(il_02, ail_0.Y, new Object[0]) : il_02.ae);
    }
}

