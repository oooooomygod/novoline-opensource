/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 */
package net;

import com.google.common.cache.CacheLoader;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.Ed
 */
class ed_0
extends CacheLoader<BlockPos, auo_0> {
    private World a;
    private boolean b;

    public auo_0 a(BlockPos blockPos) throws Exception {
        return new auo_0(this.a, blockPos, this.b);
    }

    public ed_0(World world, boolean bl) {
        this.a = world;
        this.b = bl;
    }
}

