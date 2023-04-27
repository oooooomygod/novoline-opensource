/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.Random;

import net.CB;
import net.CreativeTabs;
import deobf.EnumFacing;
import net.IBehaviorDispenseItem;
import net.IBlockState;
import net.Item;
import net.J_;
import net.Material;
import net.SJ;
import net.World;
import net.a24;
import net.a42;
import net.a6B;
import net.a6F;
import net.a6w_0;
import net.aKT;
import net.aV8;
import net.aWq;
import net.aXF;
import net.aYE;
import net.aal_2;
import net.act_2;
import net.afy_2;
import net.amv_2;
import net.aop_1;
import net.au_2;
import net.auk_2;
import net.ft_2;
import net.ha_0;
import net.hf_0;
import net.iz_0;
import net.jw_0;
import net.ph_1;
import net.rs_1;
import net.tb_2;
import net.vt_0;
import net.vx_1;
import net.zn_2;


public class BlockDispenser
extends ft_2 {
    public static J_ P;
    protected Random Q = new Random();
    public static jw_0 S;
    public static zn_2<Item, IBehaviorDispenseItem> dispenseBehaviorRegistry;

    @Override
    public TileEntity a(World world, int n) {
        return new a6B();
    }

    public static EnumFacing a(int n) {
        return SJ.a(n & 7);
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= SJ.i((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, S)));
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) {
            n |= 8;
        }
        return n;
    }

    @Override
    protected a42 s() {
        return new a42(this, S, P);
    }

    public static vt_0 a(aYE aYE2) {
        EnumFacing enumFacing = BlockDispenser.a(tb_2.e(aYE2));
        double d = tb_2.d(aYE2) + 0.7 * (double)SJ.k(enumFacing);
        double d2 = tb_2.b(aYE2) + 0.7 * (double)SJ.f(enumFacing);
        double d3 = tb_2.c(aYE2) + 0.7 * (double)SJ.a(enumFacing);
        return new ph_1(d, d2, d3);
    }

    @Override
    public int q() {
        return 3;
    }

    private void b(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!world.isRemote) {
            EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, S));
            BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos))).z();
            BlockStateInvoker.getBlock(aV8.q(world, amv_2.b(blockPos))).z();
            if (enumFacing == EnumFacing.NORTH) {
                enumFacing = EnumFacing.SOUTH;
            } else if (enumFacing == EnumFacing.SOUTH) {
                enumFacing = EnumFacing.NORTH;
            } else {
                BlockStateInvoker.getBlock(aV8.q(world, amv_2.d(blockPos))).z();
                BlockStateInvoker.getBlock(aV8.q(world, amv_2.f(blockPos))).z();
                if (enumFacing == EnumFacing.WEST) {
                    enumFacing = EnumFacing.EAST;
                } else if (enumFacing == EnumFacing.EAST) {
                    enumFacing = EnumFacing.WEST;
                }
            }
            aV8.a(world, blockPos, BlockStateInvoker.a(BlockStateInvoker.a(iBlockState, S, (Comparable)((Object)enumFacing)), P, Boolean.FALSE), 2);
        }
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        TileEntity tileEntity;
        if (!world.isRemote && (tileEntity = aV8.z(world, blockPos)) instanceof a6B) {
            a6w_0.a(entityPlayer, (a6B)tileEntity);
            if (tileEntity instanceof a6F) {
                a6w_0.a(entityPlayer, aop_1.u);
            } else {
                a6w_0.a(entityPlayer, aop_1.ab);
            }
        }
        return true;
    }

    @Override
    public boolean i() {
        return true;
    }

    protected void a(World world, BlockPos blockPos) {
        aal_2 aal_22 = new aal_2(world, blockPos);
        a6B a6B2 = (a6B)ha_0.a(aal_22);
        a24.b(a6B2);
        aV8.c(world, 1001, blockPos, 0);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), S, (Comparable)((Object)BlockDispenser.a(n))), P, auk_2.b((n & 8) > 0));
    }

    protected IBehaviorDispenseItem a(ItemStack itemStack) {
        return (IBehaviorDispenseItem)vx_1.a(dispenseBehaviorRegistry, null);
    }

    static {
        S = au_2.a(hf_0.a);
        P = aWq.a(hf_0.b);
        dispenseBehaviorRegistry = new zn_2(new aKT());
    }

    @Override
    public int a(World world) {
        return 4;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        boolean bl = aV8.B(world, blockPos) || aV8.B(world, amv_2.e(blockPos));
        auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P));
        aV8.a(world, blockPos, (Block)this, this.a(world));
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, Boolean.TRUE), 4);
    }

    @Override
    public int a(World world, BlockPos blockPos) {
        return afy_2.a(aV8.z(world, blockPos));
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (!world.isRemote) {
            this.a(world, blockPos);
        }
    }

    @Override
    public IBlockState a(IBlockState iBlockState) {
        return BlockStateInvoker.a(this.m(), S, (Comparable)((Object)EnumFacing.SOUTH));
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof a6B) {
            iz_0.a(world, blockPos, (rs_1)((a6B)tileEntity));
            aV8.d(world, blockPos, this);
        }
        super.a(world, blockPos, iBlockState);
    }

    protected BlockDispenser() {
        super(Material.y);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), S, (Comparable)((Object)EnumFacing.NORTH)), P, Boolean.FALSE));
        this.a(CreativeTabs.j);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        TileEntity tileEntity;
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, S, (Comparable)((Object)CB.a(world, blockPos, entityLivingBase))), 2);
        if (act_2.g(itemStack) && (tileEntity = aV8.z(world, blockPos)) instanceof a6B) {
            a24.a((a6B)tileEntity, act_2.w(itemStack));
        }
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        super.c(world, blockPos, iBlockState);
        this.b(world, blockPos, iBlockState);
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), S, (Comparable)((Object)CB.a(world, blockPos, entityLivingBase))), P, Boolean.FALSE);
    }
}

