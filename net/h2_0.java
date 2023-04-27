/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.EnchantmentHelperInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.CreativeTabs;
import deobf.EntityArrow;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.h2
 */
public class h2_0
extends Block {
    public static J_ P = aWq.a(arc_2.a);

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (aV8.B(world, blockPos)) {
            this.d(world, blockPos, BlockStateInvoker.a(iBlockState, P, Boolean.TRUE));
            aV8.j(world, blockPos);
        }
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P)) ? 1 : 0;
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        super.c(world, blockPos, iBlockState);
        if (aV8.B(world, blockPos)) {
            this.d(world, blockPos, BlockStateInvoker.a(iBlockState, P, Boolean.TRUE));
            aV8.j(world, blockPos);
        }
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, auk_2.b((n & 1) > 0));
    }

    @Override
    public void d(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.a(world, blockPos, iBlockState, (EntityLivingBase)null);
    }

    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase) {
        if (!world.isRemote && auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) {
            od_1 od_12 = new od_1(world, (float)amv_2.j(blockPos) + 0.5f, amv_2.h(blockPos), (float)amv_2.i(blockPos) + 0.5f, entityLivingBase);
            aV8.b(world, od_12);
            aV8.a(world, od_12, arc_2.b, 1.0f, 1.0f);
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Entity entity) {
        EntityArrow entityArrow;
        if (!world.isRemote && entity instanceof EntityArrow && EnchantmentHelperInvoker.a(entityArrow = (EntityArrow)entity)) {
            this.a(world, blockPos, BlockStateInvoker.a(aV8.q(world, blockPos), P, Boolean.TRUE), entityArrow.ak instanceof EntityLivingBase ? (EntityLivingBase)entityArrow.ak : null);
            aV8.j(world, blockPos);
        }
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        Item item;
        if (a6w_0.n(entityPlayer) != null && ((item = act_2.k(a6w_0.n(entityPlayer))) == Items.flint_and_steel || item == Items.fire_charge)) {
            this.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, Boolean.TRUE), (EntityLivingBase)entityPlayer);
            aV8.j(world, blockPos);
            if (item == Items.flint_and_steel) {
                act_2.damageItem(a6w_0.n(entityPlayer), 1, entityPlayer);
            } else if (!aSY.a(entityPlayer.abilities)) {
                --a6w_0.n((EntityPlayer)entityPlayer).a;
            }
            return true;
        }
        return super.a(world, blockPos, iBlockState, entityPlayer, enumFacing, f, f2, f3);
    }

    @Override
    public boolean a(aw0_0 aw0_02) {
        return false;
    }

    public h2_0() {
        super(Material.s);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, Boolean.FALSE));
        this.a(CreativeTabs.j);
    }

    @Override
    public void a(World world, BlockPos blockPos, aw0_0 aw0_02) {
        if (!world.isRemote) {
            od_1 od_12 = new od_1(world, (float)amv_2.j(blockPos) + 0.5f, amv_2.h(blockPos), (float)amv_2.i(blockPos) + 0.5f, aI9.a(aw0_02));
            od_12.ak = a5_0.a(world.o, od_12.ak / 4) + od_12.ak / 8;
            aV8.b(world, od_12);
        }
    }
}

