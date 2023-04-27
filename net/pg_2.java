/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Iterator;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.pg
 */
class pg_2
implements Iterable {
    BlockPos a;
    BlockPos b;

    pg_2(BlockPos blockPos, BlockPos blockPos2) {
        this.a = blockPos;
        this.b = blockPos2;
    }

    public Iterator iterator() {
        return new aID(this);
    }
}

