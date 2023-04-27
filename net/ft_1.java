/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.util.MovingObjectPosition;
import deobf.TileEntity;
import deobf.Vec3;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.fT
 */
public class ft_1
extends ft_2 {
    public static JC<a04> Q;
    public static jw_0 P;

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!world.isRemote) {
            aV8.z(world, blockPos);
        }
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= SJ.i((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
        if (BlockStateInvoker.b(iBlockState, Q) == a04.STICKY) {
            n |= 8;
        }
        return n;
    }

    public rm_2 a(World world, BlockPos blockPos, IBlockState iBlockState, float f, EnumFacing enumFacing) {
        if (BlockStateInvoker.getBlock(iBlockState) != this && BlockStateInvoker.getBlock(iBlockState).w() != Material.air) {
            BlockStateInvoker.getBlock(iBlockState).b(world, blockPos, iBlockState);
            return null;
        }
        return null;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, (Comparable)((Object)su_1.a(n))), Q, (Comparable)((Object)((n & 8) > 0 ? a04.STICKY : a04.DEFAULT)));
    }

    public static TileEntity a(IBlockState iBlockState, EnumFacing enumFacing, boolean bl, boolean bl2) {
        return new a6e_0(iBlockState, enumFacing, bl, bl2);
    }

    @Override
    public void d(World world, BlockPos blockPos, IBlockState iBlockState) {
        BlockPos blockPos2 = amv_2.a(blockPos, SJ.b((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P))));
        IBlockState iBlockState2 = aV8.q(world, blockPos2);
        if (BlockStateInvoker.getBlock(iBlockState2) instanceof gi_2 && auk_2.a((Boolean)BlockStateInvoker.b(iBlockState2, gi_2.P))) {
            aV8.j(world, blockPos2);
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof a6e_0) {
            Ut.c((a6e_0)tileEntity);
        } else {
            super.a(world, blockPos, iBlockState);
        }
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return null;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.a((IBlockAccess)world, blockPos);
        return null;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        if (!world.isRemote && aV8.z(world, blockPos) == null) {
            aV8.j(world, blockPos);
            return true;
        }
        return false;
    }

    public ft_1() {
        super(Material.d);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)EnumFacing.NORTH)), Q, (Comparable)((Object)a04.DEFAULT)));
        this.setHardness(-1.0f);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        if (!world.isRemote) {
            a6e_0 a6e_02 = this.a((IBlockAccess)world, blockPos);
            IBlockState iBlockState2 = Ut.f(a6e_02);
            BlockStateInvoker.getBlock(iBlockState2).a(world, blockPos, iBlockState2, 0);
        }
    }

    static {
        P = g8_0.R;
        Q = g8_0.P;
    }

    @Override
    public boolean f() {
        return false;
    }

    private a6e_0 a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        TileEntity tileEntity = aG3.a(iBlockAccess, blockPos);
        return tileEntity instanceof a6e_0 ? (a6e_0)tileEntity : null;
    }

    @Override
    protected a42 s() {
        return new a42(this, P, Q);
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        a6e_0 a6e_02 = this.a(iBlockAccess, blockPos);
        IBlockState iBlockState = Ut.f(a6e_02);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (block == this || block.w() == Material.air) {
            return;
        }
        float f = Ut.b(a6e_02, 0.0f);
        if (Ut.e(a6e_02)) {
            f = 1.0f - f;
        }
        block.a(iBlockAccess, blockPos);
        if (block == Blocks.bB || block == Blocks.E) {
            f = 0.0f;
        }
        EnumFacing enumFacing = Ut.b(a6e_02);
        this.t = block.I() - (double)((float)SJ.k(enumFacing) * f);
        this.N = block.p() - (double)((float)SJ.f(enumFacing) * f);
        this.w = block.x() - (double)((float)SJ.a(enumFacing) * f);
        this.d = block.g() - (double)((float)SJ.k(enumFacing) * f);
        this.b = block.n() - (double)((float)SJ.f(enumFacing) * f);
        this.n = block.k() - (double)((float)SJ.a(enumFacing) * f);
    }

    @Override
    public TileEntity a(World world, int n) {
        return null;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return null;
    }

    @Override
    public MovingObjectPosition a(World world, BlockPos blockPos, Vec3 vec3, Vec3 vec32) {
        return null;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, EnumFacing enumFacing) {
        return false;
    }
}

