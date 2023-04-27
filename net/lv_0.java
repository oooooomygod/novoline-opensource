/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.Lv
 */
public class lv_0
extends ItemBlock {
    private hj_2 n;
    private hj_2 o;

    @Override
    public boolean a(World world, BlockPos blockPos, EnumFacing enumFacing, EntityPlayer entityPlayer, ItemStack itemStack) {
        IBlockState iBlockState;
        BlockPos blockPos2 = blockPos;
        a4_0 a4_02 = abv_0.b(this.o);
        Object object = abv_0.a(this.o, itemStack);
        IBlockState iBlockState2 = aV8.q(world, blockPos);
        if (iBlockState2.b() == this.o) {
            boolean bl;
            boolean bl2 = bl = BlockStateInvoker.b(iBlockState2, hj_2.P) == wj_2.TOP;
            if (enumFacing == EnumFacing.UP) {
                // empty if block
            }
            if (enumFacing == EnumFacing.DOWN && object == BlockStateInvoker.b(iBlockState2, a4_02)) {
                return true;
            }
        }
        return (iBlockState = aV8.q(world, blockPos = amv_2.a(blockPos, enumFacing))).b() == this.o && object == BlockStateInvoker.b(iBlockState, a4_02) || super.a(world, blockPos2, enumFacing, entityPlayer, itemStack);
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        if (itemStack.a == 0) {
            return false;
        }
        if (!a6w_0.a(entityPlayer, amv_2.a(blockPos, enumFacing), enumFacing, itemStack)) {
            return false;
        }
        Object object = abv_0.a(this.o, itemStack);
        IBlockState iBlockState = aV8.q(world, blockPos);
        if (iBlockState.b() == this.o) {
            a4_0 a4_02 = abv_0.b(this.o);
            Comparable comparable = BlockStateInvoker.b(iBlockState, a4_02);
            wj_2 wj_22 = (wj_2)((Object)BlockStateInvoker.b(iBlockState, hj_2.P));
            if ((enumFacing == EnumFacing.UP && wj_22 == wj_2.BOTTOM || enumFacing == EnumFacing.DOWN && wj_22 == wj_2.TOP) && comparable == object) {
                IBlockState iBlockState2 = BlockStateInvoker.a(abv_0.a(this.n), a4_02, comparable);
                if (aV8.c(world, abv_0.a(this.n, world, blockPos, iBlockState2)) && aV8.a(world, blockPos, iBlockState2, 3)) {
                    aV8.a(world, (float)amv_2.j(blockPos) + 0.5f, (double)((float)amv_2.h(blockPos) + 0.5f), (double)((float)amv_2.i(blockPos) + 0.5f), an6_0.a(this.n.l), (an6_0.d(this.n.l) + 1.0f) / 2.0f, an6_0.b(this.n.l) * 0.8f);
                    --itemStack.a;
                }
                return true;
            }
        }
        return this.a(itemStack, world, amv_2.a(blockPos, enumFacing), object) || super.a(itemStack, entityPlayer, world, blockPos, enumFacing, f, f2, f3);
    }

    @Override
    public String a(ItemStack itemStack) {
        return abv_0.b(this.o, act_2.c(itemStack));
    }

    @Override
    public int c(int n) {
        return n;
    }

    public lv_0(Block block, hj_2 hj_22, hj_2 hj_23) {
        super(block);
        this.o = hj_22;
        this.n = hj_23;
        this.setMaxDamage(0);
        this.a(true);
    }

    private boolean a(ItemStack itemStack, World world, BlockPos blockPos, Object object) {
        Comparable comparable;
        IBlockState iBlockState = aV8.q(world, blockPos);
        if (iBlockState.b() == this.o && (comparable = BlockStateInvoker.b(iBlockState, abv_0.b(this.o))) == object) {
            IBlockState iBlockState2 = BlockStateInvoker.a(abv_0.a(this.n), abv_0.b(this.o), comparable);
            if (aV8.c(world, abv_0.a(this.n, world, blockPos, iBlockState2)) && aV8.a(world, blockPos, iBlockState2, 3)) {
                aV8.a(world, (float)amv_2.j(blockPos) + 0.5f, (double)((float)amv_2.h(blockPos) + 0.5f), (double)((float)amv_2.i(blockPos) + 0.5f), an6_0.a(this.n.l), (an6_0.d(this.n.l) + 1.0f) / 2.0f, an6_0.b(this.n.l) * 0.8f);
                --itemStack.a;
            }
            return true;
        }
        return false;
    }
}

