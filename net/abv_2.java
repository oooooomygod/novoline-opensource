/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.abv
 */
class abv_2
extends aKT {
    private aKT b = new aKT();

    abv_2() {
    }

    @Override
    public ItemStack b(aYE aYE2, ItemStack itemStack) {
        Item item;
        BlockPos blockPos;
        World world = tb_2.a(aYE2);
        IBlockState iBlockState = aV8.q(world, blockPos = amv_2.a(tb_2.f(aYE2), hy_0.a(tb_2.e(aYE2))));
        Block block = BlockStateInvoker.getBlock(iBlockState);
        Material material = BlocksInvoker.getBlockState(block);
        if (Material.M.equals(material) && block instanceof BlockLiquid && P8.b((Integer)BlockStateInvoker.b(iBlockState, BlockLiquid.P)) == 0) {
            item = Items.water_bucket;
        } else {
            if (!Material.e.equals(material) || !(block instanceof BlockLiquid) || P8.b((Integer)BlockStateInvoker.b(iBlockState, BlockLiquid.P)) != 0) {
                return super.b(aYE2, itemStack);
            }
            item = Items.lava_bucket;
        }
        aV8.j(world, blockPos);
        if (--itemStack.a == 0) {
            act_2.a(itemStack, item);
            itemStack.a = 1;
        } else if (a24.a((a6B)tb_2.g(aYE2), new ItemStack(item)) < 0) {
            this.b.a(aYE2, new ItemStack(item));
        }
        return itemStack;
    }
}

