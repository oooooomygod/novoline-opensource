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
import deobf.EntityPlayer;
import deobf.IBlockAccess;

/*
 * Renamed from net.gv
 */
public class gv_2
extends gj_1 {
    public static J_ Q;
    public static J_ R;
    public static J_ S;

    @Override
    public boolean c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return auk_2.a((Boolean)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), S));
    }

    public gv_2(F3 f3) {
        super(Material.wood, aER.a(f3));
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), S, Boolean.FALSE), R, Boolean.FALSE), Q, Boolean.FALSE));
        this.a(CreativeTabs.j);
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, (Comparable)((Object)atn_0.D(entityLivingBase))), S, Boolean.FALSE), R, Boolean.FALSE), Q, Boolean.FALSE);
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return true;
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= SJ.j((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, R))) {
            n |= 8;
        }
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, S))) {
            n |= 4;
        }
        return n;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean v() {
        return false;
    }

    static {
        S = aWq.a(alo_0.a);
        R = aWq.a(alo_0.c);
        Q = aWq.a(alo_0.b);
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return akm_1.i(BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))).w()) && super.e(world, blockPos);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, S))) {
            iBlockState = BlockStateInvoker.a(iBlockState, S, Boolean.FALSE);
        } else {
            EnumFacing enumFacing2 = SJ.a(entityPlayer.rotationYaw);
            if (BlockStateInvoker.b(iBlockState, P) == SJ.b(enumFacing2)) {
                iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)enumFacing2));
            }
            iBlockState = BlockStateInvoker.a(iBlockState, S, Boolean.TRUE);
        }
        aV8.a(world, blockPos, iBlockState, 2);
        aV8.a(world, entityPlayer, auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, S)) ? 1003 : 1006, blockPos, 0);
        return true;
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        kl_1 kl_12 = SJ.h((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
        if (kl_12 == kl_1.Z && (BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.d(blockPos))) == Blocks.w || BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.f(blockPos))) == Blocks.w) || kl_12 == kl_1.X && (BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.a(blockPos))) == Blocks.w || BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.b(blockPos))) == Blocks.w)) {
            iBlockState = BlockStateInvoker.a(iBlockState, Q, Boolean.TRUE);
        }
        return iBlockState;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, (Comparable)((Object)SJ.b(n))), S, auk_2.b((n & 4) != 0)), R, auk_2.b((n & 8) != 0));
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        kl_1 kl_12 = SJ.h((EnumFacing)((Object)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), P)));
        if (kl_12 == kl_1.Z) {
            this.a(0.0f, 0.0f, 0.375f, 1.0f, 1.0f, 0.625f);
        } else {
            this.a(0.375f, 0.0f, 0.0f, 0.625f, 1.0f, 1.0f);
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!world.isRemote) {
            boolean bl = aV8.B(world, blockPos);
            if (block.b()) {
                if (!auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, S)) && !auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, R))) {
                    aV8.a(world, blockPos, BlockStateInvoker.a(BlockStateInvoker.a(iBlockState, S, Boolean.TRUE), R, Boolean.TRUE), 2);
                    aV8.a(world, null, 1003, blockPos, 0);
                } else if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, S)) && auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, R))) {
                    aV8.a(world, blockPos, BlockStateInvoker.a(BlockStateInvoker.a(iBlockState, S, Boolean.FALSE), R, Boolean.FALSE), 2);
                    aV8.a(world, null, 1006, blockPos, 0);
                } else if (bl != auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, R))) {
                    aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, R, auk_2.b(bl)), 2);
                }
            }
        }
    }

    @Override
    protected a42 s() {
        return new a42(this, P, S, R, Q);
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, S))) {
            return null;
        }
        kl_1 kl_12 = SJ.h((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
        return kl_12 == kl_1.Z ? new rm_2(amv_2.j(blockPos), amv_2.h(blockPos), (float)amv_2.i(blockPos) + 0.375f, amv_2.j(blockPos) + 1, (float)amv_2.h(blockPos) + 1.5f, (float)amv_2.i(blockPos) + 0.625f) : new rm_2((float)amv_2.j(blockPos) + 0.375f, amv_2.h(blockPos), amv_2.i(blockPos), (float)amv_2.j(blockPos) + 0.625f, (float)amv_2.h(blockPos) + 1.5f, amv_2.i(blockPos) + 1);
    }
}

