/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import java.util.Set;

public class LK
extends lw_0 {
    private static Set<Block> q = axe_2.a(new Block[]{Blocks.T, Blocks.dirt, Blocks.al, Blocks.grass, Blocks.gravel, Blocks.aE, Blocks.sand, Blocks.bq, Blocks.cm, Blocks.s});

    public LK(anh_2 anh_22) {
        super(1.0f, anh_22, q);
    }

    @Override
    public boolean b(Block block) {
        return block == Blocks.cm || block == Blocks.bq;
    }
}

