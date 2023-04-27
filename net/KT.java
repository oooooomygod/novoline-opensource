/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class KT
extends ItemBlock {
    public KT(Block block) {
        super(block);
        this.setMaxDamage(0);
        this.a(true);
    }

    @Override
    public int c(int n) {
        return n;
    }

    @Override
    public String a(ItemStack itemStack) {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), super.d()), DX.a), my_2.a(act_2.c(itemStack)).b()).toString();
    }
}

