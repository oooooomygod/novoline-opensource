/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class aHT {
    public void a(Block block, float f) {
        GlStateManagerInvoker.color(f, f, f, 1.0f);
        GlStateManagerInvoker.b(90.0f, 0.0f, 1.0f, 0.0f);
        ajF.a(a53.c, new ItemStack(block));
    }
}

