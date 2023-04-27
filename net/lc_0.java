/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Renamed from net.Lc
 */
public class lc_0
extends Item {
    public static int[] m = new int[]{0x1E1B1B, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 0xABABAB, 0x434343, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 0xF0F0F0};

    public lc_0() {
        this.a(true);
        this.setMaxDamage(0);
        this.a(CreativeTabs.i);
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        IBlockState iBlockState;
        Block block;
        if (!a6w_0.a(entityPlayer, amv_2.a(blockPos, enumFacing), enumFacing, itemStack)) {
            return false;
        }
        YZ yZ = my_2.b(act_2.c(itemStack));
        if (yZ == YZ.WHITE) {
            if (lc_0.a(itemStack, world, blockPos)) {
                if (!world.isRemote) {
                    aV8.c(world, 2005, blockPos, 0);
                }
                return true;
            }
        } else if (yZ == YZ.BROWN && (block = BlockStateInvoker.getBlock(iBlockState = aV8.q(world, blockPos))) == Blocks.b2 && BlockStateInvoker.b(iBlockState, BlockPlanks.P) == F3.JUNGLE) {
            if (enumFacing == EnumFacing.DOWN) {
                return false;
            }
            if (enumFacing == EnumFacing.UP) {
                return false;
            }
            if (aV8.k(world, blockPos = amv_2.a(blockPos, enumFacing))) {
                IBlockState iBlockState2 = BlocksInvoker.a(Blocks.aN, world, blockPos, enumFacing, f, f2, f3, 0, entityPlayer);
                aV8.a(world, blockPos, iBlockState2, 2);
                if (!aSY.a(entityPlayer.abilities)) {
                    --itemStack.a;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, EntityLivingBase entityLivingBase) {
        if (entityLivingBase instanceof ne_1) {
            ne_1 ne_12 = (ne_1)entityLivingBase;
            YZ yZ = my_2.b(act_2.c(itemStack));
            if (!au_1.d(ne_12) && au_1.e(ne_12) != yZ) {
                au_1.a(ne_12, yZ);
                --itemStack.a;
            }
            return true;
        }
        return false;
    }

    public static boolean a(ItemStack itemStack, World world, BlockPos blockPos) {
        ale_1 ale_12;
        IBlockState iBlockState = aV8.q(world, blockPos);
        if (BlockStateInvoker.getBlock(iBlockState) instanceof ale_1 && amv_1.a(ale_12 = (ale_1)((Object)BlockStateInvoker.getBlock(iBlockState)), world, blockPos, iBlockState, world.isRemote)) {
            if (!world.isRemote) {
                if (amv_1.a(ale_12, world, world.o, blockPos, iBlockState)) {
                    amv_1.b(ale_12, world, world.o, blockPos, iBlockState);
                }
                --itemStack.a;
            }
            return true;
        }
        return false;
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        int n = 0;
        while (true) {
            ListInvoker.add(list, new ItemStack(item, 1, n));
            ++n;
        }
    }

    @Override
    public String a(ItemStack itemStack) {
        int n = act_2.c(itemStack);
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), super.d()), aNG.a), my_2.b(n).b()).toString();
    }

    public static void a(World world, BlockPos blockPos, int n) {
        n = 15;
        Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos));
        if (BlocksInvoker.getBlockState(block) != Material.air) {
            BlocksInvoker.a(block, (IBlockAccess)world, blockPos);
            int n2 = 0;
            while (true) {
                double d = a5_0.f(j) * 0.02;
                double d2 = a5_0.f(j) * 0.02;
                double d3 = a5_0.f(j) * 0.02;
                aV8.a(world, B7.VILLAGER_HAPPY, (float)amv_2.j(blockPos) + a5_0.e(j), (double)amv_2.h(blockPos) + (double)a5_0.e(j) * BlocksInvoker.C(block), (float)amv_2.i(blockPos) + a5_0.e(j), d, d2, d3, new int[0]);
                ++n2;
            }
        }
    }
}

