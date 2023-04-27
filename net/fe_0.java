/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import java.util.List;
import java.util.Random;

import net.CreativeTabs;
import deobf.EntityArrow;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.fE
 */
public abstract class fe_0
extends Block {
    private boolean R;
    public static jw_0 P = au_2.a(aou_2.e);
    public static J_ Q = aWq.a(aou_2.b);

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return fe_0.b(world, blockPos, SJ.b(enumFacing)) ? BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, (Comparable)((Object)enumFacing)), Q, Boolean.FALSE) : BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, (Comparable)((Object)EnumFacing.DOWN)), Q, Boolean.FALSE);
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public int a(World world) {
        return this.R ? 30 : 20;
    }

    private boolean c(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (this.e(world, blockPos)) {
            return true;
        }
        this.a(world, blockPos, iBlockState, 0);
        aV8.j(world, blockPos);
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (this.c(world, blockPos, iBlockState) && !fe_0.b(world, blockPos, SJ.b((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P))))) {
            this.a(world, blockPos, iBlockState, 0);
            aV8.j(world, blockPos);
        }
    }

    @Override
    public void o() {
        this.a(0.3125f, 0.375f, 0.375f, 0.6875f, 0.625f, 0.625f);
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        for (EnumFacing enumFacing : EnumFacing.values()) {
            if (!fe_0.b(world, blockPos, enumFacing)) continue;
            return true;
        }
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Entity entity) {
        if (!world.isRemote && this.R && !auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
            this.b(world, blockPos, iBlockState);
        }
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
    }

    private void b(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.a(iBlockState);
        List list = aV8.a(world, EntityArrow.class, new rm_2((double)amv_2.j(blockPos) + this.t, (double)amv_2.h(blockPos) + this.N, (double)amv_2.i(blockPos) + this.w, (double)amv_2.j(blockPos) + this.d, (double)amv_2.h(blockPos) + this.b, (double)amv_2.i(blockPos) + this.n));
        boolean bl = !ListInvoker.isEmpty(list);
        auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q));
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, Q, Boolean.TRUE));
        this.c(world, blockPos, (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
        aV8.a(world, blockPos, blockPos);
        aV8.a(world, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5, aou_2.a, 0.3f, 0.6f);
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, Q, Boolean.FALSE));
        this.c(world, blockPos, (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
        aV8.a(world, blockPos, blockPos);
        aV8.a(world, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5, aou_2.d, 0.3f, 0.5f);
        aV8.a(world, blockPos, (Block)this, this.a(world));
    }

    @Override
    protected a42 s() {
        return new a42(this, P, Q);
    }

    private void a(IBlockState iBlockState) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
        auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q));
        float f = 1.0f / 16.0f;
        switch (a1y.a[enumFacing.ordinal()]) {
            case 1: {
                this.a(0.0f, 0.375f, 0.3125f, f, 0.625f, 0.6875f);
                break;
            }
            case 2: {
                this.a(1.0f - f, 0.375f, 0.3125f, 1.0f, 0.625f, 0.6875f);
                break;
            }
            case 3: {
                this.a(0.3125f, 0.375f, 0.0f, 0.6875f, 0.625f, f);
                break;
            }
            case 4: {
                this.a(0.3125f, 0.375f, 1.0f - f, 0.6875f, 0.625f, 1.0f);
                break;
            }
            case 5: {
                this.a(0.3125f, 0.0f, 0.375f, 0.6875f, 0.0f + f, 0.625f);
                break;
            }
            case 6: {
                this.a(0.3125f, 1.0f - f, 0.375f, 0.6875f, 1.0f, 0.625f);
            }
        }
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        this.a(aG3.c(iBlockAccess, blockPos));
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    protected static boolean b(World world, BlockPos blockPos, EnumFacing enumFacing) {
        BlockPos blockPos2 = amv_2.a(blockPos, enumFacing);
        return enumFacing == EnumFacing.DOWN ? aV8.a((IBlockAccess)world, blockPos2) : BlockStateInvoker.getBlock(aV8.q(world, blockPos2)).D();
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q)) ? 15 : 0;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (!world.isRemote && auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
            if (this.R) {
                this.b(world, blockPos, iBlockState);
            } else {
                aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, Q, Boolean.FALSE));
                this.c(world, blockPos, (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
                aV8.a(world, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5, aou_2.c, 0.3f, 0.5f);
                aV8.a(world, blockPos, blockPos);
            }
        }
    }

    private void c(World world, BlockPos blockPos, EnumFacing enumFacing) {
        aV8.c(world, blockPos, this);
        aV8.c(world, amv_2.a(blockPos, SJ.b(enumFacing)), this);
    }

    protected fe_0(boolean bl) {
        super(Material.I);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)EnumFacing.NORTH)), Q, Boolean.FALSE));
        this.a(true);
        this.a(CreativeTabs.j);
        this.R = bl;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, EnumFacing enumFacing) {
        return fe_0.b(world, blockPos, SJ.b(enumFacing));
    }

    @Override
    public IBlockState c(int n) {
        EnumFacing enumFacing;
        switch (n & 7) {
            case 0: {
                enumFacing = EnumFacing.DOWN;
                break;
            }
            case 1: {
                enumFacing = EnumFacing.EAST;
                break;
            }
            case 2: {
                enumFacing = EnumFacing.WEST;
                break;
            }
            case 3: {
                enumFacing = EnumFacing.SOUTH;
                break;
            }
            case 4: {
                enumFacing = EnumFacing.NORTH;
                break;
            }
            default: {
                enumFacing = EnumFacing.UP;
            }
        }
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, (Comparable)((Object)enumFacing)), Q, auk_2.b((n & 8) > 0));
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n;
        switch (a1y.a[((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P))).ordinal()]) {
            case 1: {
                n = 1;
                break;
            }
            case 2: {
                n = 2;
                break;
            }
            case 3: {
                n = 3;
                break;
            }
            case 4: {
                n = 4;
                break;
            }
            default: {
                n = 5;
                break;
            }
            case 6: {
                n = 0;
            }
        }
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
            n |= 8;
        }
        return n;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        if (!auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, Q, Boolean.TRUE), 3);
            aV8.a(world, blockPos, blockPos);
            aV8.a(world, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5, aou_2.f, 0.3f, 0.6f);
            this.c(world, blockPos, (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
            aV8.a(world, blockPos, (Block)this, this.a(world));
        }
        return true;
    }

    @Override
    public int b(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return !auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q)) ? 0 : (BlockStateInvoker.b(iBlockState, P) == enumFacing ? 15 : 0);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
            this.c(world, blockPos, (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
        }
        super.a(world, blockPos, iBlockState);
    }
}

