/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class KJ
extends ItemBlock {
    private Block o;
    private String[] n;

    @Override
    public int c(int n) {
        return n;
    }

    @Override
    public String a(ItemStack itemStack) {
        if (this.n == null) {
            return super.a(itemStack);
        }
        int n = act_2.c(itemStack);
        return n < this.n.length ? aL0.a(aL0.a(aL0.a(new StringBuilder(), super.a(itemStack)), Y0.a), this.n[n]).toString() : super.a(itemStack);
    }

    @Override
    public int a(ItemStack itemStack, int n) {
        return BlocksInvoker.e(this.o, BlocksInvoker.a(this.o, act_2.c(itemStack)));
    }

    public KJ a(String[] stringArray) {
        this.n = stringArray;
        return this;
    }

    public KJ(Block block, boolean bl) {
        super(block);
        this.o = block;
        this.setMaxDamage(0);
        this.a(true);
    }
}

