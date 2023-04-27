/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import deobf.IBlockAccess;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Renamed from net.gc
 */
public class gc_2
extends BlockFalling {
    public static js_0 R;
    public static jw_0 Q;

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= SJ.j((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, Q)));
        return n |= P8.b((Integer)BlockStateInvoker.b(iBlockState, R)) << 2;
    }

    @Override
    public IBlockState a(IBlockState iBlockState) {
        return BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)EnumFacing.SOUTH));
    }

    protected gc_2() {
        super(Material.x);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), Q, (Comparable)((Object)EnumFacing.NORTH)), R, P8.d(0)));
        this.a(0);
        this.a(CreativeTabs.l);
    }

    @Override
    protected a42 s() {
        return new a42(this, Q, R);
    }

    @Override
    public int h(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, R));
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public void b(World world, BlockPos blockPos) {
        aV8.c(world, 1022, blockPos, 0);
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        EnumFacing enumFacing2 = SJ.l(atn_0.D(entityLivingBase));
        return BlockStateInvoker.a(BlockStateInvoker.a(super.a(world, blockPos, enumFacing, f, f2, f3, n, entityLivingBase), Q, (Comparable)((Object)enumFacing2)), R, P8.d(n >> 2));
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        if (!world.isRemote) {
            a6w_0.a(entityPlayer, new a3H(world, blockPos));
        }
        return true;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)SJ.b(n & 3))), R, P8.d((n & 0xF) >> 2));
    }

    @Override
    protected void a(oq_1 oq_12) {
        aei_0.a(oq_12, true);
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return true;
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        ListInvoker.add(list, new ItemStack(item, 1, 0));
        ListInvoker.add(list, new ItemStack(item, 1, 1));
        ListInvoker.add(list, new ItemStack(item, 1, 2));
    }

    static {
        Q = au_2.a(rw_2.a, cs_1.HORIZONTAL);
        R = a7X.a(rw_2.b, 0, 2);
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), Q));
        if (SJ.h(enumFacing) == kl_1.X) {
            this.a(0.0f, 0.0f, 0.125f, 1.0f, 1.0f, 0.875f);
        } else {
            this.a(0.125f, 0.0f, 0.0f, 0.875f, 1.0f, 1.0f);
        }
    }
}

