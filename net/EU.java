/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.renderer.chunk.RenderChunk;
import java.util.List;

public abstract class EU {
    protected boolean a;
    private double d;
    protected List<RenderChunk> c = my_0.b(17424);
    private double e;
    private double b;

    public void a(RenderChunk renderChunk, a5w_0 a5w_02) {
        ListInvoker.add(this.c, renderChunk);
    }

    public abstract void a(a5w_0 var1);

    public void a(RenderChunk renderChunk) {
        BlockPos blockPos = afq_2.d(renderChunk);
        GlStateManagerInvoker.translate((float)((double)amv_2.j(blockPos) - this.e), (float)((double)amv_2.h(blockPos) - this.d), (float)((double)amv_2.i(blockPos) - this.b));
    }

    public void a(double d, double d2, double d3) {
        this.a = true;
        ListInvoker.clear(this.c);
        this.e = d;
        this.d = d2;
        this.b = d3;
    }
}

