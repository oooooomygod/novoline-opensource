/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.hj
 */
public abstract class hj_2
extends Block {
    public static JC<wj_2> P = xu_0.a(a9M.a, wj_2.class);

    protected static boolean a(Block block) {
        return block == Blocks.bA || block == Blocks.e || block == Blocks.bf;
    }

    @Override
    public boolean v() {
        return this.d();
    }

    public hj_2(Material material) {
        super(material);
        if (this.d()) {
            this.F = true;
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
        this.a(255);
    }

    @Override
    public boolean f() {
        return this.d();
    }

    @Override
    public int g(World world, BlockPos blockPos) {
        return super.g(world, blockPos) & 7;
    }

    public abstract boolean d();

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        IBlockState iBlockState = BlockStateInvoker.a(super.a(world, blockPos, enumFacing, f, f2, f3, n, entityLivingBase), P, (Comparable)((Object)wj_2.BOTTOM));
        return this.d() ? iBlockState : (enumFacing != EnumFacing.DOWN && (enumFacing == EnumFacing.UP || (double)f2 <= 0.5) ? iBlockState : BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)wj_2.TOP)));
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, rm_2 rm_22, List<rm_2> list, Entity entity) {
        this.a((IBlockAccess)world, blockPos);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
    }

    public abstract String a(int var1);

    @Override
    protected boolean c() {
        return false;
    }

    @Override
    public int a(Random random) {
        return this.d() ? 2 : 1;
    }

    @Override
    public void o() {
        if (this.d()) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        if (this.d()) {
            return super.b(iBlockAccess, blockPos, enumFacing);
        }
        if (enumFacing != EnumFacing.UP && enumFacing != EnumFacing.DOWN && !super.b(iBlockAccess, blockPos, enumFacing)) {
            return false;
        }
        BlockPos blockPos2 = amv_2.a(blockPos, SJ.b(enumFacing));
        IBlockState iBlockState = aG3.c(iBlockAccess, blockPos);
        IBlockState iBlockState2 = aG3.c(iBlockAccess, blockPos2);
        boolean bl = hj_2.a(BlockStateInvoker.getBlock(iBlockState)) && BlockStateInvoker.b(iBlockState, P) == wj_2.TOP;
        boolean bl2 = hj_2.a(BlockStateInvoker.getBlock(iBlockState2)) && BlockStateInvoker.b(iBlockState2, P) == wj_2.TOP;
        if (enumFacing == EnumFacing.DOWN || enumFacing == EnumFacing.UP && super.b(iBlockAccess, blockPos, enumFacing) || hj_2.a(BlockStateInvoker.getBlock(iBlockState))) {
            // empty if block
        }
        return true;
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        if (this.d()) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            IBlockState iBlockState = aG3.c(iBlockAccess, blockPos);
            if (BlockStateInvoker.getBlock(iBlockState) == this) {
                if (BlockStateInvoker.b(iBlockState, P) == wj_2.TOP) {
                    this.a(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
                } else {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
                }
            }
        }
    }

    public abstract a4_0<?> e();

    public abstract Object a(ItemStack var1);
}

