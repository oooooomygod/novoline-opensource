/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;

/*
 * Renamed from net.Lx
 */
public class lx_0
extends Item {
    private Block m;

    public boolean a(World world, BlockPos blockPos) {
        if (this.m == Blocks.air) {
            return false;
        }
        Material material = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos)));
        boolean bl = !akm_1.i(material);
        if (!aV8.k(world, blockPos)) {
            return false;
        }
        if (qq_2.i(world.d) && this.m == Blocks.flowing_water) {
            int n = amv_2.j(blockPos);
            int n2 = amv_2.h(blockPos);
            int n3 = amv_2.i(blockPos);
            aV8.a(world, (float)n + 0.5f, (double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), pj_2.a, 0.5f, 2.6f + (a5_0.e(world.o) - a5_0.e(world.o)) * 0.8f);
            int n4 = 0;
            while (true) {
                aV8.a(world, B7.SMOKE_LARGE, (double)n + MathInvoker.a(), (double)n2 + MathInvoker.a(), (double)n3 + MathInvoker.a(), 0.0, 0.0, 0.0, new int[0]);
                ++n4;
            }
        }
        if (!world.isRemote && !akm_1.f(material)) {
            aV8.b(world, blockPos, true);
        }
        aV8.a(world, blockPos, BlocksInvoker.t(this.m), 3);
        return true;
    }

    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        boolean bl = this.m == Blocks.air;
        MovingObjectPosition movingObjectPosition = this.a(world, entityPlayer, bl);
        if (movingObjectPosition.typeOfHit == I.BLOCK) {
            BlockPos blockPos = ObjectMouseOverInvoker.getBlockPos(movingObjectPosition);
            if (!aV8.a(world, entityPlayer, blockPos)) {
                return itemStack;
            }
            if (!a6w_0.a(entityPlayer, amv_2.a(blockPos, movingObjectPosition.facing), movingObjectPosition.facing, itemStack)) {
                return itemStack;
            }
            IBlockState iBlockState = aV8.q(world, blockPos);
            Material material = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState));
            if (material == Material.M && P8.b((Integer)BlockStateInvoker.b(iBlockState, BlockLiquid.P)) == 0) {
                aV8.j(world, blockPos);
                a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
                return this.a(itemStack, entityPlayer, Items.water_bucket);
            }
            if (material == Material.e && P8.b((Integer)BlockStateInvoker.b(iBlockState, BlockLiquid.P)) == 0) {
                aV8.j(world, blockPos);
                a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
                return this.a(itemStack, entityPlayer, Items.lava_bucket);
            }
        }
        return itemStack;
    }

    public lx_0(Block block) {
        this.c = 1;
        this.m = block;
        this.a(CreativeTabs.b);
    }

    private ItemStack a(ItemStack itemStack, EntityPlayer entityPlayer, Item item) {
        if (aSY.a(entityPlayer.abilities)) {
            return itemStack;
        }
        if (--itemStack.a <= 0) {
            return new ItemStack(item);
        }
        if (!InventoryInvoker.b(entityPlayer.inventory, new ItemStack(item))) {
            a6w_0.a(entityPlayer, new ItemStack(item, 1, 0), false);
        }
        return itemStack;
    }
}

