/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import deobf.EntityMinecart;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.abn
 */
class abn_2
extends aKT {
    private aKT b = new aKT();

    @Override
    protected void a(aYE aYE2) {
        aV8.c(tb_2.a(aYE2), 1000, tb_2.f(aYE2), 0);
    }

    @Override
    public ItemStack b(aYE aYE2, ItemStack itemStack) {
        Object object;
        double d;
        az_1 az_12;
        EnumFacing enumFacing = hy_0.a(tb_2.e(aYE2));
        World world = tb_2.a(aYE2);
        double d2 = tb_2.d(aYE2) + (double)SJ.k(enumFacing) * 1.125;
        double d3 = MathInvoker.n(tb_2.b(aYE2)) + (double)SJ.f(enumFacing);
        double d4 = tb_2.c(aYE2) + (double)SJ.a(enumFacing) * 1.125;
        BlockPos blockPos = amv_2.a(tb_2.f(aYE2), enumFacing);
        IBlockState iBlockState = aV8.q(world, blockPos);
        az_1 az_13 = az_12 = BlockStateInvoker.getBlock(iBlockState) instanceof g9_0 ? (az_1)((Object)BlockStateInvoker.b(iBlockState, ask_1.a((g9_0)BlockStateInvoker.getBlock(iBlockState)))) : az_1.NORTH_SOUTH;
        if (ask_1.a(iBlockState)) {
            d = amm_1.b(az_12) ? 0.6 : 0.1;
        } else {
            if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState)) != Material.air || !ask_1.a(aV8.q(world, amv_2.g(blockPos)))) {
                return this.b.a(aYE2, itemStack);
            }
            object = aV8.q(world, amv_2.g(blockPos));
            az_1 az_14 = BlockStateInvoker.getBlock((IBlockState)object) instanceof g9_0 ? (az_1)((Object)BlockStateInvoker.b((IBlockState)object, ask_1.a((g9_0)BlockStateInvoker.getBlock((IBlockState)object)))) : az_1.NORTH_SOUTH;
            d = enumFacing != EnumFacing.DOWN && amm_1.b(az_14) ? -0.4 : -0.9;
        }
        object = yw_2.a(world, d2, d3 + d, d4, lz_0.a((lz_0)act_2.k(itemStack)));
        if (act_2.g(itemStack)) {
            yw_2.a((EntityMinecart)object, act_2.w(itemStack));
        }
        aV8.b(world, (Entity)object);
        act_2.b(itemStack, 1);
        return itemStack;
    }

    abn_2() {
    }
}

