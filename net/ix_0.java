/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.Ix
 */
class ix_0
extends I3 {
    ip_0 aG;

    ix_0(ip_0 ip_02, int n, il_0 il_02) {
        this.aG = ip_02;
        super(n, il_02);
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos) {
        this.aF.a(world, random, blockPos);
    }
}

