/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net;

import com.google.common.base.Function;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class L6
extends ItemBlock {
    protected Block o;
    protected Function<ItemStack, String> n;

    public L6(Block block, Block block2, String[] stringArray) {
        this(block, block2, new WP(stringArray));
    }

    @Override
    public String a(ItemStack itemStack) {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), super.d()), aiw_1.a), (String)ap4_0.a(this.n, itemStack)).toString();
    }

    @Override
    public int c(int n) {
        return n;
    }

    public L6(Block block, Block block2, Function<ItemStack, String> function) {
        super(block);
        this.o = block2;
        this.n = function;
        this.setMaxDamage(0);
        this.a(true);
    }
}

