/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.minecraft.renderer.chunk.RenderChunk;
import java.util.Iterator;

public class a2I
implements Iterator<RenderChunk> {
    private s_0 a;
    private us_0 b;
    private zw_1 c = new zw_1(0, 0, 0);

    public RenderChunk a() {
        BlockPos blockPos = FL.a(this.b);
        aut_1.a(this.c, amv_2.j(blockPos) << 4, amv_2.h(blockPos) << 4, amv_2.i(blockPos) << 4);
        RenderChunk renderChunk = uk_2.a(this.a, this.c);
        return renderChunk;
    }

    public a2I(s_0 s_02, BlockPos blockPos, BlockPos blockPos2, int n, int n2) {
        this.a = s_02;
        this.b = new us_0(blockPos, blockPos2, n, n2);
    }

    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }

    @Override
    public void remove() {
        throw new RuntimeException(avw_2.a);
    }
}

