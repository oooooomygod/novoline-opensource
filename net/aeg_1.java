/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IBlockAccess;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.aeG
 */
class aeg_1
implements aqz_0 {
    aeg_1() {
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        aP2.b();
        return axn_1.c() != null ? axn_1.c().a(iBlockAccess, blockPos) : zm_1.a();
    }

    @Override
    public boolean a() {
        return axn_1.c() == null;
    }
}

