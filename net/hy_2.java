/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.minecraft.block.Block;
import net.CreativeTabs;

/*
 * Renamed from net.hy
 */
public class hy_2
extends Block {
    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public int a(Random random) {
        return 2 + a5_0.a(random, 2);
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.prismarine_crystals;
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return MapColor.E;
    }

    public hy_2(Material material) {
        super(material);
        this.a(CreativeTabs.m);
    }

    @Override
    public int a(int n, Random random) {
        return MathHelper.a(this.a(random) + a5_0.a(random, n + 1), 1, 5);
    }
}

