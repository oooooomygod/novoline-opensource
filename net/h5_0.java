/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.h5
 */
public class h5_0
extends Block {
    public static J_ U;
    public static J_ W;
    public static J_ V;
    public static J_ S;
    public static J_ P;
    public static J_ T;
    public static J_ R;
    public static J_ Q;

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(iBlockState, W, auk_2.b(h5_0.a(iBlockAccess, blockPos, iBlockState, EnumFacing.NORTH))), T, auk_2.b(h5_0.a(iBlockAccess, blockPos, iBlockState, EnumFacing.EAST))), R, auk_2.b(h5_0.a(iBlockAccess, blockPos, iBlockState, EnumFacing.SOUTH))), U, auk_2.b(h5_0.a(iBlockAccess, blockPos, iBlockState, EnumFacing.WEST)));
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
            n |= 1;
        }
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, S))) {
            n |= 2;
        }
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) {
            n |= 4;
        }
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, V))) {
            n |= 8;
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

    public h5_0() {
        super(Material.I);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), Q, Boolean.FALSE), S, Boolean.FALSE), P, Boolean.FALSE), V, Boolean.FALSE), W, Boolean.FALSE), T, Boolean.FALSE), R, Boolean.FALSE), U, Boolean.FALSE));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.15625f, 1.0f);
        this.a(true);
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return Items.string;
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    @Override
    protected a42 s() {
        return new a42(this, Q, S, P, V, W, T, U, R);
    }

    static {
        Q = aWq.a(oo_0.g);
        S = aWq.a(oo_0.b);
        P = aWq.a(oo_0.a);
        V = aWq.a(oo_0.d);
        W = aWq.a(oo_0.c);
        T = aWq.a(oo_0.f);
        R = aWq.a(oo_0.e);
        U = aWq.a(oo_0.h);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.b(world, blockPos, BlockStateInvoker.a(iBlockState, Q, Boolean.TRUE));
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Entity entity) {
        if (!world.isRemote && !auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
            this.a(world, blockPos);
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (!world.isRemote && auk_2.a((Boolean)BlockStateInvoker.b(aV8.q(world, blockPos), Q))) {
            this.a(world, blockPos);
        }
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), Q, auk_2.b((n & 1) > 0)), S, auk_2.b((n & 2) > 0)), P, auk_2.b((n & 4) > 0)), V, auk_2.b((n & 8) > 0));
    }

    public static boolean a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        BlockPos blockPos2 = amv_2.a(blockPos, enumFacing);
        IBlockState iBlockState2 = aG3.c(iBlockAccess, blockPos2);
        Block block = BlockStateInvoker.getBlock(iBlockState2);
        if (block == Blocks.be) {
            EnumFacing enumFacing2 = SJ.b(enumFacing);
            return BlockStateInvoker.b(iBlockState2, hd_1.Q) == enumFacing2;
        }
        if (block == Blocks.b7) {
            boolean bl;
            boolean bl2 = auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, S));
            return bl2 == (bl = auk_2.a((Boolean)BlockStateInvoker.b(iBlockState2, S)));
        }
        return false;
    }

    private void a(World world, BlockPos blockPos) {
        IBlockState iBlockState = aV8.q(world, blockPos);
        boolean bl = auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q));
        boolean bl2 = false;
        List list = aV8.a(world, null, new rm_2((double)amv_2.j(blockPos) + this.t, (double)amv_2.h(blockPos) + this.N, (double)amv_2.i(blockPos) + this.w, (double)amv_2.j(blockPos) + this.d, (double)amv_2.h(blockPos) + this.b, (double)amv_2.i(blockPos) + this.n));
        if (!ListInvoker.isEmpty(list)) {
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                Entity entity = (Entity)dz_0.b(iterator);
                if (ayj_0.s(entity)) continue;
                bl2 = true;
                break;
            }
        }
        if (bl2 != bl) {
            iBlockState = BlockStateInvoker.a(iBlockState, Q, auk_2.b(bl2));
            aV8.a(world, blockPos, iBlockState, 3);
            this.b(world, blockPos, iBlockState);
        }
        aV8.a(world, blockPos, (Block)this, this.a(world));
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        boolean bl;
        boolean bl2 = auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, S));
        boolean bl3 = bl = !aV8.a((IBlockAccess)world, amv_2.g(blockPos));
        if (bl2 != bl) {
            this.a(world, blockPos, iBlockState, 0);
            aV8.j(world, blockPos);
        }
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.string;
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        iBlockState = BlockStateInvoker.a(iBlockState, S, auk_2.b(!aV8.a((IBlockAccess)world, amv_2.g(blockPos))));
        aV8.a(world, blockPos, iBlockState, 3);
        this.b(world, blockPos, iBlockState);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer) {
        if (!world.isRemote && a6w_0.n(entityPlayer) != null && act_2.k(a6w_0.n(entityPlayer)) == Items.shears) {
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, V, Boolean.TRUE), 4);
        }
    }

    private void b(World world, BlockPos blockPos, IBlockState iBlockState) {
        block0: for (EnumFacing enumFacing : new EnumFacing[]{EnumFacing.SOUTH, EnumFacing.WEST}) {
            int n = 1;
            while (true) {
                BlockPos blockPos2;
                IBlockState iBlockState2;
                if (BlockStateInvoker.getBlock(iBlockState2 = aV8.q(world, blockPos2 = amv_2.a(blockPos, enumFacing, n))) == Blocks.be) {
                    if (BlockStateInvoker.b(iBlockState2, hd_1.Q) != SJ.b(enumFacing)) continue block0;
                    TU.a(Blocks.be, world, blockPos2, iBlockState2, false, true, n, iBlockState);
                    continue block0;
                }
                if (BlockStateInvoker.getBlock(iBlockState2) != Blocks.b7) continue block0;
                ++n;
            }
        }
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        IBlockState iBlockState = aG3.c(iBlockAccess, blockPos);
        auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P));
        auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, S));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.09375f, 1.0f);
    }

    @Override
    public a5w_0 K() {
        return a5w_0.TRANSLUCENT;
    }
}

