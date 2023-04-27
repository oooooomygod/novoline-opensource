/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EntityMinecart;
import deobf.EnumFacing;
import net.minecraft.block.BlockDispenser;
import deobf.EntityPlayer;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.Lz
 */
public class lz_0
extends Item {
    private static IBehaviorDispenseItem n = new abn_2();
    private anf_0 m;

    static anf_0 a(lz_0 lz_02) {
        return lz_02.m;
    }

    public lz_0(anf_0 anf_02) {
        this.c = 1;
        this.m = anf_02;
        this.a(CreativeTabs.f);
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, this, n);
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        IBlockState iBlockState = aV8.q(world, blockPos);
        if (ask_1.a(iBlockState)) {
            if (!world.isRemote) {
                az_1 az_12 = BlockStateInvoker.getBlock(iBlockState) instanceof g9_0 ? (az_1)((Object)BlockStateInvoker.b(iBlockState, ask_1.a((g9_0)BlockStateInvoker.getBlock(iBlockState)))) : az_1.NORTH_SOUTH;
                double d = 0.0;
                if (amm_1.b(az_12)) {
                    d = 0.5;
                }
                EntityMinecart entityMinecart = yw_2.a(world, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.0625 + d, (double)amv_2.i(blockPos) + 0.5, this.m);
                if (act_2.g(itemStack)) {
                    yw_2.a(entityMinecart, act_2.w(itemStack));
                }
                aV8.b(world, entityMinecart);
            }
            --itemStack.a;
            return true;
        }
        return false;
    }
}

