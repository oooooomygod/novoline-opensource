/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import net.*;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import java.util.List;
import java.util.Random;

public class BlockSapling
extends fc_2
implements ale_1 {
    public static JC<F3> P = xu_0.a(ds_1.c, F3.class);
    public static js_0 Q = a7X.a(ds_1.a, 0, 1);

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (F3 f3 : F3.values()) {
            ListInvoker.add(list, new ItemStack(item, 1, aER.b(f3)));
        }
    }

    protected BlockSapling() {
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)F3.OAK)), Q, P8.d(0)));
        this.a(0.099999994f, 0.0f, 0.099999994f, 0.9f, 0.8f, 0.9f);
        this.a(CreativeTabs.l);
    }

    private boolean a(World world, BlockPos blockPos, int n, int n2, F3 f3) {
        return this.a(world, amv_2.a(blockPos, n, 0, n2), f3) && this.a(world, amv_2.a(blockPos, n + 1, 0, n2), f3) && this.a(world, amv_2.a(blockPos, n, 0, n2 + 1), f3) && this.a(world, amv_2.a(blockPos, n + 1, 0, n2 + 1), f3);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (!world.isRemote) {
            super.a(world, blockPos, iBlockState, random);
            if (aV8.l(world, amv_2.e(blockPos)) >= 9 && a5_0.a(random, 7) == 0) {
                this.d(world, blockPos, iBlockState, random);
            }
        }
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        this.d(world, blockPos, iBlockState, random);
    }

    @Override
    public String C() {
        return ahq_0.b(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), this.J()), ds_1.b), F3.OAK.b()), ds_1.d).toString());
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, boolean bl) {
        return true;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, (Comparable)((Object)aER.a(n & 7))), Q, P8.d((n & 8) >> 3));
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, P)));
        return n |= P8.b((Integer)BlockStateInvoker.b(iBlockState, Q)) << 3;
    }

    public boolean a(World world, BlockPos blockPos, F3 f3) {
        IBlockState iBlockState = aV8.q(world, blockPos);
        return BlockStateInvoker.getBlock(iBlockState) == this && BlockStateInvoker.b(iBlockState, P) == f3;
    }

    public void d(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (P8.b((Integer)BlockStateInvoker.b(iBlockState, Q)) == 0) {
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, Q), 4);
        } else {
            this.e(world, blockPos, iBlockState, random);
        }
    }

    @Override
    public boolean b(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        return (double)a5_0.e(world.o) < 0.45;
    }

    @Override
    protected a42 s() {
        return new a42(this, P, Q);
    }

    public void e(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        IBlockState iBlockState2;
        ii_1 ii_12 = a5_0.a(random, 10) == 0 ? new ig_2(true) : new id_1(true);
        int n = 0;
        int n2 = 0;
        block0 : switch (a2v_0.a[((F3)((Object)BlockStateInvoker.b(iBlockState, P))).ordinal()]) {
            case 1: {
                n = 0;
                n2 = 0;
                while (true) {
                    if (this.a(world, blockPos, n, n2, F3.SPRUCE)) {
                        ii_12 = new i2_0(false, a5_0.a(random));
                        n2 = 0;
                        n = 0;
                        ii_12 = new i5_0(true);
                        break block0;
                    }
                    --n2;
                }
            }
            case 2: {
                ii_12 = new in_2(true, false);
                break;
            }
            case 3: {
                iBlockState2 = BlockStateInvoker.a(Blocks.b2.m(), gj_0.R, (Comparable)((Object)F3.JUNGLE));
                IBlockState iBlockState3 = BlockStateInvoker.a(BlockStateInvoker.a(Blocks.bP.m(), gg_1.W, (Comparable)((Object)F3.JUNGLE)), BlockLeaves.V, Boolean.FALSE);
                n = 0;
                n2 = 0;
                while (true) {
                    if (this.a(world, blockPos, n, n2, F3.JUNGLE)) {
                        ii_12 = new ik_2(true, 10, 20, iBlockState2, iBlockState3);
                        n2 = 0;
                        n = 0;
                        ii_12 = new id_1(true, 4 + a5_0.a(random, 7), iBlockState2, iBlockState3, false);
                        break block0;
                    }
                    --n2;
                }
            }
            case 4: {
                ii_12 = new il_1(true);
                break;
            }
            case 5: {
                n = 0;
                n2 = 0;
                while (true) {
                    if (this.a(world, blockPos, n, n2, F3.DARK_OAK)) {
                        ii_12 = new ic_2(true);
                        return;
                    }
                    --n2;
                }
            }
        }
        iBlockState2 = Blocks.air.m();
        aV8.a(world, amv_2.a(blockPos, n, 0, n2), iBlockState2, 4);
        aV8.a(world, amv_2.a(blockPos, n + 1, 0, n2), iBlockState2, 4);
        aV8.a(world, amv_2.a(blockPos, n, 0, n2 + 1), iBlockState2, 4);
        aV8.a(world, amv_2.a(blockPos, n + 1, 0, n2 + 1), iBlockState2, 4);
        if (!aFI.a(ii_12, world, random, amv_2.a(blockPos, n, 0, n2))) {
            aV8.a(world, amv_2.a(blockPos, n, 0, n2), iBlockState, 4);
            aV8.a(world, amv_2.a(blockPos, n + 1, 0, n2), iBlockState, 4);
            aV8.a(world, amv_2.a(blockPos, n, 0, n2 + 1), iBlockState, 4);
            aV8.a(world, amv_2.a(blockPos, n + 1, 0, n2 + 1), iBlockState, 4);
        }
    }

    @Override
    public int h(IBlockState iBlockState) {
        return aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, P)));
    }
}

