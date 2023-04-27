/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import java.util.Set;

public class LY
extends lw_0 {
    private static Set<Block> q = axe_2.a(new Block[]{Blocks.bc, Blocks.coal_ore, Blocks.cobblestone, Blocks.bX, Blocks.ar, Blocks.C, Blocks.X, Blocks.bg, Blocks.D, Blocks.gold_ore, Blocks.I, Blocks.co, Blocks.iron_ore, Blocks.ba, Blocks.bH, Blocks.b4, Blocks.L, Blocks.bu, Blocks.bJ, Blocks.bQ, Blocks.b5, Blocks.bG, Blocks.r, Blocks.stone, Blocks.bA});

    protected LY(anh_2 anh_22) {
        super(2.0f, anh_22, q);
    }

    @Override
    public float a(ItemStack itemStack, Block block) {
        return BlocksInvoker.getBlockState(block) != Material.t && BlocksInvoker.getBlockState(block) != Material.x && BlocksInvoker.getBlockState(block) != Material.y ? super.a(itemStack, block) : this.p;
    }

    @Override
    public boolean b(Block block) {
        return block == Blocks.O ? agv_2.a(this.m) == 3 : (block != Blocks.ar && block != Blocks.C ? (block != Blocks.K && block != Blocks.av ? (block != Blocks.D && block != Blocks.gold_ore ? (block != Blocks.co && block != Blocks.iron_ore ? (block != Blocks.ba && block != Blocks.bH ? (block != Blocks.b5 && block != Blocks.b4 ? BlocksInvoker.getBlockState(block) == Material.y || BlocksInvoker.getBlockState(block) == Material.t || BlocksInvoker.getBlockState(block) == Material.x : agv_2.a(this.m) >= 2) : agv_2.a(this.m) >= 1) : agv_2.a(this.m) >= 1) : agv_2.a(this.m) >= 2) : agv_2.a(this.m) >= 2) : agv_2.a(this.m) >= 2);
    }
}

