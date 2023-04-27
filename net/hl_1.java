/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityLivingBase;
import deobf.IBlockAccess;
import net.minecraft.util.MovingObjectPosition;
import deobf.Vec3;
import java.util.Iterator;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.hL
 */
public class hl_1
extends Block {
    public static jw_0 P = au_2.a(azu_0.a, new pq_0());

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        switch ((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P))) {
            case EAST: {
                n |= 1;
                break;
            }
            case WEST: {
                n |= 2;
                break;
            }
            case SOUTH: {
                n |= 3;
                break;
            }
            case NORTH: {
                n |= 4;
                break;
            }
            default: {
                n |= 5;
            }
        }
        return n;
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
        double d = (double)amv_2.j(blockPos) + 0.5;
        double d2 = (double)amv_2.h(blockPos) + 0.7;
        double d3 = (double)amv_2.i(blockPos) + 0.5;
        if (eh_0.b(SJ.h(enumFacing))) {
            EnumFacing enumFacing2 = SJ.b(enumFacing);
            aV8.a(world, B7.SMOKE_NORMAL, d + 0.27 * (double)SJ.k(enumFacing2), d2 + 0.22, d3 + 0.27 * (double)SJ.a(enumFacing2), 0.0, 0.0, 0.0, new int[0]);
            aV8.a(world, B7.FLAME, d + 0.27 * (double)SJ.k(enumFacing2), d2 + 0.22, d3 + 0.27 * (double)SJ.a(enumFacing2), 0.0, 0.0, 0.0, new int[0]);
        } else {
            aV8.a(world, B7.SMOKE_NORMAL, d, d2, d3, 0.0, 0.0, 0.0, new int[0]);
            aV8.a(world, B7.FLAME, d, d2, d3, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public MovingObjectPosition a(World world, BlockPos blockPos, Vec3 vec3, Vec3 vec32) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(aV8.q(world, blockPos), P));
        float f = 0.15f;
        if (enumFacing == EnumFacing.EAST) {
            this.a(0.0f, 0.2f, 0.5f - f, f * 2.0f, 0.8f, 0.5f + f);
        } else if (enumFacing == EnumFacing.WEST) {
            this.a(1.0f - f * 2.0f, 0.2f, 0.5f - f, 1.0f, 0.8f, 0.5f + f);
        } else if (enumFacing == EnumFacing.SOUTH) {
            this.a(0.5f - f, 0.2f, 0.0f, 0.5f + f, 0.8f, f * 2.0f);
        } else if (enumFacing == EnumFacing.NORTH) {
            this.a(0.5f - f, 0.2f, 1.0f - f * 2.0f, 0.5f + f, 0.8f, 1.0f);
        } else {
            f = 0.1f;
            this.a(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.6f, 0.5f + f);
        }
        return super.a(world, blockPos, vec3, vec32);
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        this.a(world, blockPos, iBlockState);
    }

    protected boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!this.b(world, blockPos, iBlockState)) {
            return true;
        }
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
        kl_1 kl_12 = SJ.h(enumFacing);
        EnumFacing enumFacing2 = SJ.b(enumFacing);
        if (eh_0.b(kl_12) && !aV8.c(world, amv_2.a(blockPos, enumFacing2), true) || !eh_0.c(kl_12) || !this.a(world, amv_2.a(blockPos, enumFacing2))) {
            // empty if block
        }
        this.a(world, blockPos, iBlockState, 0);
        aV8.j(world, blockPos);
        return true;
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.b(world, blockPos, iBlockState);
    }

    @Override
    public IBlockState c(int n) {
        IBlockState iBlockState = this.m();
        switch (n) {
            case 1: {
                iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)EnumFacing.EAST));
                break;
            }
            case 2: {
                iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)EnumFacing.WEST));
                break;
            }
            case 3: {
                iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)EnumFacing.SOUTH));
                break;
            }
            case 4: {
                iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)EnumFacing.NORTH));
                break;
            }
            default: {
                iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)EnumFacing.UP));
            }
        }
        return iBlockState;
    }

    private boolean a(World world, BlockPos blockPos) {
        if (aV8.a((IBlockAccess)world, blockPos)) {
            return true;
        }
        Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos));
        return block instanceof g2_0 || block == Blocks.a8 || block == Blocks.w || block == Blocks.am;
    }

    protected boolean b(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (BlockStateInvoker.getBlock(iBlockState) == this && this.b(world, blockPos, (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)))) {
            return true;
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, blockPos)) == this) {
            this.a(world, blockPos, iBlockState, 0);
            aV8.j(world, blockPos);
        }
        return false;
    }

    protected hl_1() {
        super(Material.I);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)EnumFacing.UP)));
        this.a(true);
        this.a(CreativeTabs.l);
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        if (this.b(world, blockPos, enumFacing)) {
            return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)enumFacing));
        }
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            if (!aV8.c(world, amv_2.a(blockPos, SJ.b((EnumFacing)object)), true)) continue;
            return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)((EnumFacing)object)));
        }
        return this.m();
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        Iterator iterator = ms_0.a(au_2.a(P));
        while (dz_0.c(iterator)) {
            EnumFacing enumFacing = (EnumFacing)dz_0.b(iterator);
            if (!this.b(world, blockPos, enumFacing)) continue;
            return true;
        }
        return false;
    }

    private boolean b(World world, BlockPos blockPos, EnumFacing enumFacing) {
        BlockPos blockPos2 = amv_2.a(blockPos, SJ.b(enumFacing));
        eh_0.b(SJ.h(enumFacing));
        return aV8.c(world, blockPos2, true) || enumFacing.equals(EnumFacing.UP) && this.a(world, blockPos2);
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }
}

