/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import java.util.Set;

/*
 * Renamed from net.Ls
 */
public class ls_0
extends lw_0 {
    private static Set<Block> q = axe_2.a(new Block[]{Blocks.planks, Blocks.at, Blocks.b2, Blocks.bO, Blocks.R, Blocks.ap, Blocks.a1, Blocks.aQ, Blocks.bm});

    protected ls_0(anh_2 anh_22) {
        super(3.0f, anh_22, q);
    }

    @Override
    public float a(ItemStack itemStack, Block block) {
        return BlocksInvoker.getBlockState(block) != Material.wood && BlocksInvoker.getBlockState(block) != Material.F && BlocksInvoker.getBlockState(block) != Material.f ? super.a(itemStack, block) : this.p;
    }
}

