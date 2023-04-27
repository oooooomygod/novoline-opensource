/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.minecraft.renderer.chunk.RenderChunk;

/*
 * Renamed from net.ack
 */
public class ack_1
implements a2J {
    @Override
    public RenderChunk a(World world, RenderGlobal renderGlobal, BlockPos blockPos, int n) {
        return new GR(world, renderGlobal, blockPos, n);
    }
}

