/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;

/*
 * Renamed from net.zp
 */
class zp_2
extends BlockPos {
    private int n;

    public int d() {
        return this.n;
    }

    public zp_2(BlockPos blockPos, int n) {
        super(blockPos.a(), blockPos.c(), blockPos.b());
        this.n = n;
    }
}

