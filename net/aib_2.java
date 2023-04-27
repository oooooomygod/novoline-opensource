/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import deobf.DefaultVertexFormats;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.aib
 */
class aib_2
extends aiy_1 {
    Rx x;
    public int y;

    public aib_2(Rx rx) {
        this.x = rx;
        super(rx.t, rx.n, rx.f, 43, rx.f - 60, 24);
        this.y = -1;
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
        this.y = n;
        pq_2.a(this.x);
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        wi_1 wi_12 = (wi_1)ListInvoker.get(KX.a(Rx.a(this.x)), ListInvoker.size(KX.a(Rx.a(this.x))) - n - 1);
        IBlockState iBlockState = aFB.a(wi_12);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        Item item = px_0.a(block);
        ItemStack itemStack = block != Blocks.air ? new ItemStack(item, 1, BlocksInvoker.c(block, iBlockState)) : null;
        String string = aad_0.d;
        if (block != Blocks.water && block != Blocks.flowing_water) {
            if (block == Blocks.lava || block == Blocks.flowing_lava) {
                item = Items.lava_bucket;
            }
        } else {
            item = Items.water_bucket;
        }
        itemStack = new ItemStack(item, 1, BlocksInvoker.c(block, iBlockState));
        string = BlocksInvoker.K(block);
        this.a(n2, n3, itemStack);
        FontRendererInvoker.a(this.x.q, string, n2 + 18 + 5, n3 + 3, 0xFFFFFF);
        String string2 = I18n.format(aad_0.c, new Object[]{P8.d(aFB.c(wi_12))});
        FontRendererInvoker.a(this.x.q, string2, n2 + 2 + 213 - FontRendererInvoker.a(this.x.q, string2), n3 + 3, 0xFFFFFF);
    }

    private void d(int n, int n2) {
        this.d(n, n2, 0, 0);
    }

    @Override
    protected int f() {
        return ListInvoker.size(KX.a(Rx.a(this.x)));
    }

    @Override
    protected void a() {
    }

    private void a(int n, int n2, ItemStack itemStack) {
        this.d(n + 1, n2 + 1);
        GlStateManagerInvoker.c();
        if (act_2.k(itemStack) != null) {
            ne_0.f();
            DU.a(this.x.i, itemStack, n + 2, n2 + 2);
            ne_0.e();
        }
        GlStateManagerInvoker.y();
    }

    @Override
    protected int h() {
        return this.r - 70;
    }

    private void d(int n, int n2, int n3, int n4) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.n), Gui.e);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2 + 18, Rx.zLevel), (float)n3 * 0.0078125f, (float)(n4 + 18) * 0.0078125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + 18, n2 + 18, Rx.zLevel), (float)(n3 + 18) * 0.0078125f, (float)(n4 + 18) * 0.0078125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + 18, n2, Rx.zLevel), (float)(n3 + 18) * 0.0078125f, (float)n4 * 0.0078125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2, Rx.zLevel), (float)n3 * 0.0078125f, (float)n4 * 0.0078125f));
        TessellatorInvoker.draw(tessellator);
    }

    @Override
    protected boolean c(int n) {
        return n == this.y;
    }
}

