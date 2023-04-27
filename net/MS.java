/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IBlockAccess;
import net.minecraft.block.BlockPos;

class MS
implements aqz_0 {
    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        aP2.b();
        return axn_1.d() != null ? axn_1.d().a(iBlockAccess, blockPos) : zm_1.c();
    }

    @Override
    public boolean a() {
        return axn_1.d() == null;
    }

    MS() {
    }
}

