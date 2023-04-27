/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import deobf.IBlockAccess;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.List;

/*
 * Renamed from net.fY
 */
public class fy_1
extends ft_2 {
    public static J_ Q;
    public static jw_0 P;

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return true;
    }

    public static boolean a(int n) {
        return (n & 8) != 8;
    }

    private void b(World world, BlockPos blockPos, IBlockState iBlockState) {
        boolean bl;
        boolean bl2 = bl = !aV8.B(world, blockPos);
        if (bl != auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, Q, auk_2.b(bl)), 4);
        }
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, (Comparable)((Object)fy_1.b(n))), Q, auk_2.b(fy_1.a(n)));
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, rm_2 rm_22, List<rm_2> list, Entity entity) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        this.a(0.0f, 0.0f, 0.0f, 0.125f, 1.0f, 1.0f);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.125f);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        this.a(0.875f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        this.a(0.0f, 0.0f, 0.875f, 1.0f, 1.0f, 1.0f);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= SJ.i((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
        if (!auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
            n |= 8;
        }
        return n;
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a6P();
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        EnumFacing enumFacing2 = SJ.b(enumFacing);
        if (enumFacing2 == EnumFacing.UP) {
            enumFacing2 = EnumFacing.DOWN;
        }
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, (Comparable)((Object)enumFacing2)), Q, Boolean.TRUE);
    }

    @Override
    public int a(World world, BlockPos blockPos) {
        return afy_2.a(aV8.z(world, blockPos));
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        TileEntity tileEntity;
        if (!world.isRemote && (tileEntity = aV8.z(world, blockPos)) instanceof a6P) {
            a6w_0.a(entityPlayer, (a6P)tileEntity);
            a6w_0.a(entityPlayer, aop_1.n);
        }
        return true;
    }

    @Override
    protected a42 s() {
        return new a42(this, P, Q);
    }

    public static EnumFacing b(int n) {
        return SJ.a(n & 7);
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT_MIPPED;
    }

    public fy_1() {
        super(Material.t, MapColor.e);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)EnumFacing.DOWN)), Q, Boolean.TRUE));
        this.a(CreativeTabs.j);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        this.b(world, blockPos, iBlockState);
    }

    @Override
    public boolean v() {
        return false;
    }

    static {
        P = au_2.a(aVN.a, new ayn_1());
        Q = aWq.a(aVN.b);
    }

    @Override
    public int q() {
        return 3;
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.b(world, blockPos, iBlockState);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof a6P) {
            iz_0.a(world, blockPos, (rs_1)((a6P)tileEntity));
            aV8.d(world, blockPos, this);
        }
        super.a(world, blockPos, iBlockState);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        TileEntity tileEntity;
        super.a(world, blockPos, iBlockState, entityLivingBase, itemStack);
        if (act_2.g(itemStack) && (tileEntity = aV8.z(world, blockPos)) instanceof a6P) {
            a9i_0.a((a6P)tileEntity, act_2.w(itemStack));
        }
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
}

