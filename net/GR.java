/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.minecraft.renderer.chunk.RenderChunk;

public class GR
extends RenderChunk {
    private int x = N4.b(a5w_0.values().length);

    public int a(a5w_0 a5w_02, amx_0 amx_02) {
        return !azb_1.a(amx_02, a5w_02) ? this.x + a5w_02.ordinal() : -1;
    }

    public GR(World world, RenderGlobal renderGlobal, BlockPos blockPos, int n) {
        super(world, renderGlobal, blockPos, n);
    }

    @Override
    public void h() {
        super.h();
        N4.a(this.x, a5w_0.values().length);
    }
}

