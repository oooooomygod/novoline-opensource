/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Iterator;
import net.minecraft.block.BlockPos;

class aPQ
implements Iterable<BlockPos> {
    BlockPos a;
    BlockPos b;

    @Override
    public Iterator<BlockPos> iterator() {
        return new XT(this);
    }

    aPQ(BlockPos blockPos, BlockPos blockPos2) {
        this.b = blockPos;
        this.a = blockPos2;
    }
}

