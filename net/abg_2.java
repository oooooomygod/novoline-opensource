/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EntityBoat;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.abg
 */
class abg_2
extends aKT {
    private aKT b = new aKT();

    @Override
    protected void a(aYE aYE2) {
        aV8.c(tb_2.a(aYE2), 1000, tb_2.f(aYE2), 0);
    }

    @Override
    public ItemStack b(aYE aYE2, ItemStack itemStack) {
        double d;
        EnumFacing enumFacing = hy_0.a(tb_2.e(aYE2));
        World world = tb_2.a(aYE2);
        double d2 = tb_2.d(aYE2) + (double)((float)SJ.k(enumFacing) * 1.125f);
        double d3 = tb_2.b(aYE2) + (double)((float)SJ.f(enumFacing) * 1.125f);
        double d4 = tb_2.c(aYE2) + (double)((float)SJ.a(enumFacing) * 1.125f);
        BlockPos blockPos = amv_2.a(tb_2.f(aYE2), enumFacing);
        Material material = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos)));
        if (Material.M.equals(material)) {
            d = 1.0;
        } else {
            if (!Material.air.equals(material) || !Material.M.equals(BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos)))))) {
                return this.b.a(aYE2, itemStack);
            }
            d = 0.0;
        }
        EntityBoat entityBoat = new EntityBoat(world, d2, d3 + d, d4);
        aV8.b(world, entityBoat);
        act_2.b(itemStack, 1);
        return itemStack;
    }

    abg_2() {
    }
}

