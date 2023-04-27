/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Iterator;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.ar
 */
class ar_2
implements Iterable<z6_0> {
    BlockPos a;
    BlockPos b;

    ar_2(BlockPos blockPos, BlockPos blockPos2) {
        this.a = blockPos;
        this.b = blockPos2;
    }

    @Override
    public Iterator<z6_0> iterator() {
        return new vx_2(this);
    }
}

