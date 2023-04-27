/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;

/*
 * Renamed from net.Oq
 */
class oq_0
extends OP {
    a6f_0 n;

    @Override
    public BlockPos d() {
        return this.n.g;
    }

    @Override
    public World c() {
        return this.n.e;
    }

    @Override
    public void a(cy_0 cy_02) {
        super.a(cy_02);
        if (this.c() != null) {
            aV8.p(this.c(), this.n.g);
        }
    }

    @Override
    public void a(int n) {
        aV8.b(this.n.e, this.n.g, Blocks.p, n, 0);
    }

    oq_0(a6f_0 a6f_02) {
        this.n = a6f_02;
    }
}

