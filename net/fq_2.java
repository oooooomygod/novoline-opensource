/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.minecraft.block.Block;
import net.CreativeTabs;

/*
 * Renamed from net.fq
 */
public class fq_2
extends Block {
    public fq_2() {
        super(Material.N);
        this.a(CreativeTabs.m);
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.clay_ball;
    }

    @Override
    public int a(Random random) {
        return 4;
    }
}

