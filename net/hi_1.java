/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.CreativeTabs;

/*
 * Renamed from net.hI
 */
public class hi_1
extends Block {
    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.snowball;
    }

    @Override
    public int a(Random random) {
        return 4;
    }

    protected hi_1() {
        super(Material.c);
        this.a(true);
        this.a(CreativeTabs.m);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (aV8.b(world, YG.BLOCK, blockPos) > 11) {
            this.a(world, blockPos, aV8.q(world, blockPos), 0);
            aV8.j(world, blockPos);
        }
    }
}

