/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockFalling;

import java.util.Random;

/*
 * Renamed from net.gn
 */
public class gn_2
extends BlockFalling {
    @Override
    public MapColor g(IBlockState iBlockState) {
        return MapColor.e;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        if (n > 3) {
            n = 3;
        }
        return a5_0.a(random, 10 - n * 3) == 0 ? Items.flint : px_0.a(this);
    }
}

