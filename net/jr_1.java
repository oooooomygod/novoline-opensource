/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import net.minecraft.renderer.entity.RenderItem;

/*
 * Renamed from net.jR
 */
public class jr_1
extends ja_2<of_2> {
    @Override
    public ItemStack a(of_2 of_22) {
        return new ItemStack(this.f, 1, yd_0.a(of_22));
    }

    public jr_1(RenderManager renderManager, RenderItem renderItem) {
        super(renderManager, Items.potionitem, renderItem);
    }
}

