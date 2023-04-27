/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.minecraft.block.Block;
import net.CreativeTabs;

/*
 * Renamed from net.fu
 */
public class fu_1
extends Block {
    @Override
    public int a(Random random) {
        return 3;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.book;
    }

    public fu_1() {
        super(Material.wood);
        this.a(CreativeTabs.m);
    }
}

