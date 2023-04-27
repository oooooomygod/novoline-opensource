/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import com.google.common.base.Predicate;
import deobf.Entity;
import deobf.IBlockAccess;
import java.util.List;
import java.util.Random;

import deobf.EntityMinecart;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.gm
 */
public class gm_2
extends g9_0 {
    public static JC<az_1> R = xu_0.a(NL.b, az_1.class, new adu_0());
    public static J_ Q = aWq.a(NL.a);

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q)) ? 15 : 0;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (!world.isRemote && auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
            this.b(world, blockPos, iBlockState);
        }
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= amm_1.a((az_1)((Object)BlockStateInvoker.b(iBlockState, R)));
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
            n |= 8;
        }
        return n;
    }

    @Override
    public int b(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return !auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q)) ? 0 : (enumFacing == EnumFacing.UP ? 15 : 0);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), R, (Comparable)((Object)amm_1.a(n & 7))), Q, auk_2.b((n & 8) > 0));
    }

    @Override
    protected a42 s() {
        return new a42(this, R, Q);
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
    }

    @Override
    public int a(World world) {
        return 20;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public int a(World world, BlockPos blockPos) {
        if (auk_2.a((Boolean)BlockStateInvoker.b(aV8.q(world, blockPos), Q))) {
            List<on_2> list = this.a(world, blockPos, on_2.class, new Predicate[0]);
            if (!ListInvoker.isEmpty(list)) {
                return awo_0.d(ps_1.a((on_2)ListInvoker.get(list, 0)));
            }
            List<EntityMinecart> list2 = this.a(world, blockPos, EntityMinecart.class, od_2.a);
            if (!ListInvoker.isEmpty(list2)) {
                return afy_2.a((rs_1)ListInvoker.get(list2, 0));
            }
        }
        return 0;
    }

    public gm_2() {
        super(true);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), Q, Boolean.FALSE), R, (Comparable)((Object)az_1.NORTH_SOUTH)));
        this.a(true);
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        super.c(world, blockPos, iBlockState);
        this.b(world, blockPos, iBlockState);
    }

    protected <T extends EntityMinecart> List<T> a(World world, BlockPos blockPos, Class<T> clazz, Predicate<Entity> ... predicateArray) {
        rm_2 rm_22 = this.a(blockPos);
        return predicateArray.length != 1 ? aV8.a(world, clazz, rm_22) : aV8.a(world, clazz, rm_22, predicateArray[0]);
    }

    private rm_2 a(BlockPos blockPos) {
        return new rm_2((float)amv_2.j(blockPos) + 0.2f, amv_2.h(blockPos), (float)amv_2.i(blockPos) + 0.2f, (float)(amv_2.j(blockPos) + 1) - 0.2f, (float)(amv_2.h(blockPos) + 1) - 0.2f, (float)(amv_2.i(blockPos) + 1) - 0.2f);
    }

    @Override
    public a4_0<az_1> a() {
        return R;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Entity entity) {
        if (!world.isRemote && !auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
            this.b(world, blockPos, iBlockState);
        }
    }

    @Override
    public boolean b() {
        return true;
    }

    private void b(World world, BlockPos blockPos, IBlockState iBlockState) {
        auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q));
        List<EntityMinecart> list = this.a(world, blockPos, EntityMinecart.class, new Predicate[0]);
        if (!ListInvoker.isEmpty(list)) {
            // empty if block
        }
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, Q, Boolean.TRUE), 3);
        aV8.c(world, blockPos, this);
        aV8.c(world, amv_2.g(blockPos), this);
        aV8.a(world, blockPos, blockPos);
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, Q, Boolean.FALSE), 3);
        aV8.c(world, blockPos, this);
        aV8.c(world, amv_2.g(blockPos), this);
        aV8.a(world, blockPos, blockPos);
        aV8.a(world, blockPos, (Block)this, this.a(world));
        aV8.d(world, blockPos, this);
    }
}

