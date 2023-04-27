/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import java.util.Iterator;
import java.util.Random;

/*
 * Renamed from net.gk
 */
public class gk_2
extends Block {
    public static js_0 P = a7X.a(gg_0.a, 0, 7);

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return px_0.a(Blocks.dirt);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        super.a(world, blockPos, iBlockState, block);
        if (akm_1.i(BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))).w())) {
            aV8.a(world, blockPos, Blocks.dirt.m());
        }
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        switch (aRX.a[enumFacing.ordinal()]) {
            case 1: {
                return true;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                Block block = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos));
                return !block.f() && block != Blocks.al;
            }
        }
        return super.b(iBlockAccess, blockPos, enumFacing);
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return new rm_2(amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos), amv_2.j(blockPos) + 1, amv_2.h(blockPos) + 1, amv_2.i(blockPos) + 1);
    }

    private boolean c(World world, BlockPos blockPos) {
        Iterator iterator = OV.a(amv_2.a(amv_2.a(blockPos, -4, 0, -4), amv_2.a(blockPos, 4, 1, 4)));
        while (dz_0.c(iterator)) {
            z6_0 z6_02 = (z6_0)dz_0.b(iterator);
            if (BlockStateInvoker.getBlock(aV8.q(world, z6_02)).w() != Material.M) continue;
            return true;
        }
        return false;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Blocks.dirt.a(BlockStateInvoker.a(Blocks.dirt.m(), BlockDirt.Q, (Comparable)((Object)a6s_0.DIRT)), random, n);
    }

    private boolean a(World world, BlockPos blockPos) {
        Block block = BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos)));
        return block instanceof fn_1 || block instanceof fh_1;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, P8.d(n & 7));
    }

    @Override
    public void a(World world, BlockPos blockPos, Entity entity, float f) {
        if (entity instanceof EntityLivingBase) {
            if (!world.isRemote && a5_0.e(world.o) < f - 0.5f) {
                if (!(entity instanceof EntityPlayer) && !J9.c(aV8.k(world), gg_0.b)) {
                    return;
                }
                aV8.a(world, blockPos, Blocks.dirt.m());
            }
            super.a(world, blockPos, entity, f);
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        int n = P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
        if (!this.c(world, blockPos) && !aV8.s(world, amv_2.e(blockPos))) {
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, P8.d(n - 1)), 2);
        } else if (n < 7) {
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, P8.d(7)), 2);
        }
    }

    protected gk_2() {
        super(Material.ground);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, P8.d(0)));
        this.a(true);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.9375f, 1.0f);
        this.a(255);
    }
}

