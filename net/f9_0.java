/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.f9
 */
public class f9_0
extends ft_2 {
    public static js_0 P = a7X.a(ahw_0.a, 0, 15);
    private boolean Q;

    @Override
    public boolean f() {
        return false;
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    public void a(World world, BlockPos blockPos) {
        if (!qq_2.e(world.d)) {
            IBlockState iBlockState = aV8.q(world, blockPos);
            int n = aV8.b(world, YG.SKY, blockPos) - aV8.f(world);
            float f = aV8.c(world, 1.0f);
            float f2 = f < (float)Math.PI ? 0.0f : (float)Math.PI * 2;
            f += (f2 - f) * 0.2f;
            n = MathInvoker.a((float)n * MathHelper.cos(f));
            n = MathHelper.a(n, 0, 15);
            if (this.Q) {
                n = 15 - n;
            }
            if (P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) != n) {
                aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, P8.d(n)), 3);
            }
        }
    }

    @Override
    public int q() {
        return 3;
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a65();
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return px_0.a(Blocks.u);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        if (a6w_0.m(entityPlayer)) {
            if (!world.isRemote) {
                if (this.Q) {
                    aV8.a(world, blockPos, BlockStateInvoker.a(Blocks.u.m(), P, BlockStateInvoker.b(iBlockState, P)), 4);
                    Blocks.u.a(world, blockPos);
                } else {
                    aV8.a(world, blockPos, BlockStateInvoker.a(Blocks.aI.m(), P, BlockStateInvoker.b(iBlockState, P)), 4);
                    Blocks.aI.a(world, blockPos);
                }
            }
            return true;
        }
        return super.a(world, blockPos, iBlockState, entityPlayer, enumFacing, f, f2, f3);
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
    }

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return px_0.a(Blocks.u);
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        if (!this.Q) {
            super.a(item, creativeTabs, list);
        }
    }

    public f9_0(boolean bl) {
        super(Material.wood);
        this.Q = bl;
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, P8.d(0)));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
        this.a(CreativeTabs.j);
        this.setHardness(0.2f);
        this.a(u);
        this.b(ahw_0.b);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, P8.d(n));
    }
}

