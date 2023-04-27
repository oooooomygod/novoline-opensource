/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.ge
 */
public class ge_2
extends Block {
    public ge_2() {
        super(Material.y);
        this.a(CreativeTabs.m);
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return px_0.a(Blocks.O);
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return MapColor.o;
    }
}

