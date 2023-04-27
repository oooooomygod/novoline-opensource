/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.Of
 */
class of_0
extends OP {
    oo_2 n;

    @Override
    public BlockPos d() {
        return new BlockPos(this.n);
    }

    @Override
    public World c() {
        return this.n.worldObj;
    }

    @Override
    public void a(int n) {
        aV8.a(this.n.worldObj, (Entity)this.n, (byte)n);
    }

    of_0(oo_2 oo_22) {
        this.n = oo_22;
    }
}

