/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityLivingBase;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import java.util.Random;

/*
 * Renamed from net.gr
 */
public abstract class gr_2
extends gj_1 {
    protected boolean Q;

    @Override
    public boolean b() {
        return true;
    }

    public boolean a(World world, BlockPos blockPos) {
        return aV8.a((IBlockAccess)world, amv_2.g(blockPos));
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return aV8.a((IBlockAccess)world, amv_2.g(blockPos)) && super.e(world, blockPos);
    }

    @Override
    public boolean b(Block block) {
        return this.d(block);
    }

    public boolean c(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState) {
        return false;
    }

    protected abstract int f(IBlockState var1);

    protected boolean d(IBlockState iBlockState) {
        return this.Q;
    }

    protected int a(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        IBlockState iBlockState = aG3.c(iBlockAccess, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        return this.c(block) ? (block == Blocks.af ? P8.b((Integer)BlockStateInvoker.b(iBlockState, gs_1.U)) : aG3.a(iBlockAccess, blockPos, enumFacing)) : 0;
    }

    public boolean h(World world, BlockPos blockPos, IBlockState iBlockState) {
        EnumFacing enumFacing = SJ.b((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
        BlockPos blockPos2 = amv_2.a(blockPos, enumFacing);
        return gr_2.a(BlockStateInvoker.getBlock(aV8.q(world, blockPos2))) && BlockStateInvoker.b(aV8.q(world, blockPos2), P) != enumFacing;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (!this.c((IBlockAccess)world, blockPos, iBlockState)) {
            this.g(world, blockPos, iBlockState);
            if (this.Q) {
                aV8.a(world, blockPos, this.b(iBlockState), 2);
            } else if (!this.Q) {
                aV8.a(world, blockPos, this.c(iBlockState), 2);
                aV8.a(world, blockPos, BlockStateInvoker.getBlock(this.c(iBlockState)), this.g(iBlockState), -1);
            }
        }
    }

    protected void b(World world, BlockPos blockPos, IBlockState iBlockState) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
        BlockPos blockPos2 = amv_2.a(blockPos, SJ.b(enumFacing));
        aV8.e(world, blockPos2, this);
        aV8.a(world, blockPos2, (Block)this, enumFacing);
    }

    protected boolean g(World world, BlockPos blockPos, IBlockState iBlockState) {
        return this.f(world, blockPos, iBlockState) > 0;
    }

    protected abstract IBlockState b(IBlockState var1);

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.b(world, blockPos, iBlockState);
    }

    protected int a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState) {
        return 15;
    }

    protected gr_2(boolean bl) {
        super(Material.I);
        this.Q = bl;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }

    @Override
    public int b(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return this.a(iBlockAccess, blockPos, iBlockState, enumFacing);
    }

    protected boolean c(Block block) {
        return block.b();
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (this.a(world, blockPos)) {
            this.e(world, blockPos, iBlockState);
        } else {
            this.a(world, blockPos, iBlockState, 0);
            aV8.j(world, blockPos);
            for (EnumFacing enumFacing : EnumFacing.values()) {
                aV8.c(world, amv_2.a(blockPos, enumFacing), this);
            }
        }
    }

    protected int g(IBlockState iBlockState) {
        return this.f(iBlockState);
    }

    public static boolean a(Block block) {
        return Blocks.aP.d(block) || Blocks.bR.d(block);
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)SJ.b(atn_0.D(entityLivingBase))));
    }

    protected int b(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
        EnumFacing enumFacing2 = SJ.l(enumFacing);
        EnumFacing enumFacing3 = SJ.c(enumFacing);
        return MathInvoker.max(this.a(iBlockAccess, amv_2.a(blockPos, enumFacing2), enumFacing2), this.a(iBlockAccess, amv_2.a(blockPos, enumFacing3), enumFacing3));
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        if (this.g(world, blockPos, iBlockState)) {
            aV8.a(world, blockPos, (Block)this, 1);
        }
    }

    protected int f(World world, BlockPos blockPos, IBlockState iBlockState) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
        BlockPos blockPos2 = amv_2.a(blockPos, enumFacing);
        int n = aV8.b(world, blockPos2, enumFacing);
        if (n >= 15) {
            return n;
        }
        IBlockState iBlockState2 = aV8.q(world, blockPos2);
        return MathInvoker.max(n, BlockStateInvoker.getBlock(iBlockState2) == Blocks.af ? P8.b((Integer)BlockStateInvoker.b(iBlockState2, gs_1.U)) : 0);
    }

    @Override
    public void d(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (this.Q) {
            for (EnumFacing enumFacing : EnumFacing.values()) {
                aV8.c(world, amv_2.a(blockPos, enumFacing), this);
            }
        }
        super.d(world, blockPos, iBlockState);
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return SJ.h(enumFacing) != kl_1.Y;
    }

    @Override
    public boolean f() {
        return false;
    }

    protected void e(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!this.c((IBlockAccess)world, blockPos, iBlockState)) {
            this.g(world, blockPos, iBlockState);
            if (this.Q) {
                // empty if block
            }
            if (!this.Q && !aV8.a(world, blockPos, this)) {
                int n = -1;
                if (this.h(world, blockPos, iBlockState)) {
                    n = -3;
                } else if (this.Q) {
                    n = -2;
                }
                aV8.a(world, blockPos, this, this.f(iBlockState), n);
            }
        }
    }

    public boolean d(Block block) {
        return block == BlockStateInvoker.getBlock(this.c(this.m())) || block == BlockStateInvoker.getBlock(this.b(this.m()));
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return !this.d(iBlockState) ? 0 : (BlockStateInvoker.b(iBlockState, P) == enumFacing ? this.a(iBlockAccess, blockPos, iBlockState) : 0);
    }

    protected abstract IBlockState c(IBlockState var1);
}

