/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.minecraft.block.Block;
import net.CreativeTabs;

/*
 * Renamed from net.gU
 */
public class gu_1
extends Block {
    @Override
    public int a(Random random) {
        return 2 + a5_0.a(random, 3);
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return MapColor.z;
    }

    public gu_1(Material material) {
        super(material);
        this.a(CreativeTabs.m);
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.glowstone_dust;
    }

    @Override
    public int a(int n, Random random) {
        return MathHelper.a(this.a(random) + a5_0.a(random, n + 1), 1, 4);
    }
}

