/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import java.util.Random;

/*
 * Renamed from net.fh
 */
public class fh_1
extends fc_2
implements ale_1 {
    private Block Q;
    public static js_0 P = a7X.a(af5_0.a, 0, 7);
    public static jw_0 R = au_2.a(af5_0.b, new ajh_0());

    @Override
    public void a(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        this.e(world, blockPos, iBlockState);
    }

    protected Item a() {
        return this.Q == Blocks.ap ? Items.pumpkin_seeds : (this.Q == Blocks.aQ ? Items.melon_seeds : null);
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        Item item = this.a();
        return item;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
    }

    protected fh_1(Block block) {
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), P, P8.d(0)), R, (Comparable)((Object) EnumFacing.UP)));
        this.Q = block;
        this.a(true);
        this.a(0.375f, 0.0f, 0.375f, 0.625f, 0.25f, 0.625f);
        this.a((CreativeTabs)null);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        super.a(world, blockPos, iBlockState, f, n);
        if (!world.isRemote) {
            Item item = this.a();
            int n2 = P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
            int n3 = 0;
            while (true) {
                if (a5_0.a(world.o, 15) <= n2) {
                    fh_1.a(world, blockPos, new ItemStack(item));
                }
                ++n3;
            }
        }
    }

    @Override
    public int e(IBlockState iBlockState) {
        if (BlockStateInvoker.getBlock(iBlockState) != this) {
            return super.e(iBlockState);
        }
        int n = P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
        int n2 = n * 32;
        int n3 = 255 - n * 8;
        int n4 = n * 4;
        return n2 << 16 | n3 << 8 | n4;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        float f;
        super.a(world, blockPos, iBlockState, random);
        if (aV8.l(world, amv_2.e(blockPos)) >= 9 && a5_0.a(random, (int)(25.0f / (f = fn_1.a(this, world, blockPos))) + 1) == 0) {
            int n = P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
            if (n < 7) {
                iBlockState = BlockStateInvoker.a(iBlockState, P, P8.d(n + 1));
                aV8.a(world, blockPos, iBlockState, 2);
            } else {
                Object object = abw_2.b(cs_1.HORIZONTAL);
                while (dz_0.c((Iterator)object)) {
                    Object object2 = dz_0.b((Iterator)object);
                    if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, (EnumFacing)object2))) != this.Q) continue;
                    return;
                }
                blockPos = amv_2.a(blockPos, abw_2.a(cs_1.HORIZONTAL, random));
                object = BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos)));
                if (BlockStateInvoker.getBlock((IBlockState)aV8.q((World)world, (BlockPos)blockPos)).o == Material.air && (object == Blocks.al || object == Blocks.dirt || object == Blocks.grass)) {
                    aV8.a(world, blockPos, this.Q.m());
                }
            }
        }
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        this.b = (float)(P8.b((Integer)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), P)) * 2 + 2) / 16.0f;
        this.a(0.375f, 0.0f, 0.375f, 0.625f, (float)this.b, 0.625f);
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, int n) {
        return this.e(aG3.c(iBlockAccess, blockPos));
    }

    @Override
    public void o() {
        this.a(0.375f, 0.0f, 0.375f, 0.625f, 0.25f, 0.625f);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, boolean bl) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) != 7;
    }

    @Override
    protected a42 s() {
        return new a42(this, P, R);
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return null;
    }

    @Override
    protected boolean a(Block block) {
        return block == Blocks.al;
    }

    @Override
    public boolean b(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        return true;
    }

    public void e(World world, BlockPos blockPos, IBlockState iBlockState) {
        int n = P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) + MathHelper.a(world.o, 2, 5);
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, P8.d(MathInvoker.b(7, n))), 2);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, P8.d(n));
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        iBlockState = BlockStateInvoker.a(iBlockState, R, (Comparable)((Object)EnumFacing.UP));
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            if (BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.a(blockPos, (EnumFacing)object))) != this.Q) continue;
            iBlockState = BlockStateInvoker.a(iBlockState, R, (Comparable)((Object)((EnumFacing)object)));
            break;
        }
        return iBlockState;
    }
}

