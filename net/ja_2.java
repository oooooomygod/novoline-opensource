/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.renderer.entity.RenderItem;
import net.minecraft.renderer.texture.TextureMap;

/*
 * Renamed from net.ja
 */
public class ja_2<T extends Entity>
extends j7_0<T> {
    protected Item f;
    private RenderItem e;

    public ja_2(RenderManager renderManager, Item item, RenderItem renderItem) {
        super(renderManager);
        this.f = item;
        this.e = renderItem;
    }

    @Override
    public void b(T t, double d, double d2, double d3, float f, float f2) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate((float)d, (float)d2, (float)d3);
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.c(0.5f, 0.5f, 0.5f);
        GlStateManagerInvoker.b(-this.a.l, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(this.a.b, 1.0f, 0.0f, 0.0f);
        this.a(TextureMap.r);
        DU.a(this.e, this.a(t), go_0.GROUND);
        GlStateManagerInvoker.y();
        GlStateManagerInvoker.popMatrix();
        super.b(t, d, d2, d3, f, f2);
    }

    @Override
    protected ResourceLocation a(Entity entity) {
        return TextureMap.r;
    }

    public ItemStack a(T t) {
        return new ItemStack(this.f, 1, 0);
    }
}

