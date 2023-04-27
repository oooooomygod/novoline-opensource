/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.gz
 */
public class gz_2
extends Block {
    @Override
    public int g(World world, BlockPos blockPos) {
        return 0;
    }

    public gz_2(MapColor mapColor) {
        super(Material.y, mapColor);
        this.a(CreativeTabs.m);
    }

    @Override
    public int h(IBlockState iBlockState) {
        return this == Blocks.bH ? my_2.c(YZ.BLUE) : 0;
    }

    public gz_2() {
        this(akm_1.j(Material.y));
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return this == Blocks.coal_ore ? Items.coal : (this == Blocks.C ? Items.diamond : (this == Blocks.bH ? Items.dye : (this == Blocks.K ? Items.emerald : (this == Blocks.cl ? Items.quartz : px_0.a(this)))));
    }

    @Override
    public int a(int n, Random random) {
        if (px_0.a(this) != this.a((IBlockState)atd_0.a(a7c_0.a(aXF.a(this.d()))), random, n)) {
            int n2 = a5_0.a(random, n + 2) - 1;
            n2 = 0;
            return this.a(random) * (n2 + 1);
        }
        return this.a(random);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        super.a(world, blockPos, iBlockState, f, n);
        if (this.a(iBlockState, world.o, n) != px_0.a(this)) {
            int n2 = 0;
            if (this == Blocks.coal_ore) {
                n2 = MathHelper.a(world.o, 0, 2);
            } else if (this == Blocks.C) {
                n2 = MathHelper.a(world.o, 3, 7);
            } else if (this == Blocks.K) {
                n2 = MathHelper.a(world.o, 3, 7);
            } else if (this == Blocks.bH) {
                n2 = MathHelper.a(world.o, 2, 5);
            } else if (this == Blocks.cl) {
                n2 = MathHelper.a(world.o, 2, 5);
            }
            this.a(world, blockPos, n2);
        }
    }

    @Override
    public int a(Random random) {
        return this == Blocks.bH ? 4 + a5_0.a(random, 5) : 1;
    }
}

