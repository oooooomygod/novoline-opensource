/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import net.minecraft.block.BlockPos;
import net.minecraft.renderer.chunk.RenderChunk;
import net.minecraft.multiplayer.WorldClient;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from net.a5j
 */
public class a5j_0 {
    public static Iterator<RenderChunk> a(WorldClient worldClient, double d, Entity entity, int n, s_0 s_02) {
        a0D.r();
        float f = a3c_0.f();
        if (f > 0.0f && f < (float)((n - 1) * 16)) {
            int n2 = MathHelper.c(f / 16.0f) + 1;
            float f2 = BlockInvoker.a(worldClient, (float)d);
            float f3 = aVE.eb * ((float)Math.PI / 180);
            float f4 = f2 > 1.5707964f && f2 < 4.712389f ? f2 + (float)Math.PI : f2;
            float f5 = -MathHelper.sin(f4);
            float f6 = MathHelper.cos(f4) * MathHelper.cos(f3);
            float f7 = -MathHelper.cos(f4) * MathHelper.sin(f3);
            BlockPos blockPos = new BlockPos(MathHelper.floor_double(entity.posX) >> 4, MathHelper.floor_double(entity.posY) >> 4, MathHelper.floor_double(entity.posZ) >> 4);
            BlockPos blockPos2 = amv_2.a(blockPos, -f5 * (float)n2, -f6 * (float)n2, -f7 * (float)n2);
            BlockPos blockPos3 = amv_2.a(blockPos, f5 * (float)n, f6 * (float)n, f7 * (float)n);
            a2I a2I2 = new a2I(s_02, blockPos2, blockPos3, n2, n2);
            return a2I2;
        }
        List list = a7r_0.a(s_02.c);
        Iterator iterator = ListInvoker.iterator(list);
        return iterator;
    }
}

