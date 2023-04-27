/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.hU
 */
public class hu_1
extends hl_1 {
    private boolean Q;
    private static Map<World, List<T8>> R = MapsInvoker.a();

    @Override
    public int b(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return enumFacing == EnumFacing.DOWN ? this.a(iBlockAccess, blockPos, iBlockState, enumFacing) : 0;
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return this.Q && BlockStateInvoker.b(iBlockState, P) != enumFacing ? 15 : 0;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!this.a(world, blockPos, iBlockState) && this.Q == this.c(world, blockPos, iBlockState)) {
            aV8.a(world, blockPos, (Block)this, this.a(world));
        }
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        this.c(world, blockPos, iBlockState);
        List list = (List)MapInvoker.c(R, world);
        while (!ListInvoker.isEmpty(list) && aV8.d(world) - ((T8)ListInvoker.get((List)list, (int)0)).b > 60L) {
            ListInvoker.remove(list, 0);
        }
        if (this.Q) {
            aV8.a(world, blockPos, BlockStateInvoker.a(Blocks.i.m(), P, BlockStateInvoker.b(iBlockState, P)), 3);
            if (this.a(world, blockPos, true)) {
                aV8.a(world, (float)amv_2.j(blockPos) + 0.5f, (double)((float)amv_2.h(blockPos) + 0.5f), (double)((float)amv_2.i(blockPos) + 0.5f), axy_0.a, 0.5f, 2.6f + (a5_0.e(world.o) - a5_0.e(world.o)) * 0.8f);
                int n = 0;
                while (true) {
                    double d = (double)amv_2.j(blockPos) + a5_0.c(random) * 0.6 + 0.2;
                    double d2 = (double)amv_2.h(blockPos) + a5_0.c(random) * 0.6 + 0.2;
                    double d3 = (double)amv_2.i(blockPos) + a5_0.c(random) * 0.6 + 0.2;
                    aV8.a(world, B7.SMOKE_NORMAL, d, d2, d3, 0.0, 0.0, 0.0, new int[0]);
                    ++n;
                }
            }
        } else if (!this.a(world, blockPos, false)) {
            aV8.a(world, blockPos, BlockStateInvoker.a(Blocks.br.m(), P, BlockStateInvoker.b(iBlockState, P)), 3);
        }
    }

    @Override
    public boolean b(Block block) {
        return block == Blocks.i || block == Blocks.br;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (this.Q) {
            for (EnumFacing enumFacing : EnumFacing.values()) {
                aV8.c(world, amv_2.a(blockPos, enumFacing), this);
            }
        }
    }

    private boolean c(World world, BlockPos blockPos, IBlockState iBlockState) {
        EnumFacing enumFacing = SJ.b((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
        return aV8.a(world, amv_2.a(blockPos, enumFacing), enumFacing);
    }

    private boolean a(World world, BlockPos blockPos, boolean bl) {
        if (!MapInvoker.b(R, world)) {
            MapInvoker.c(R, world, my_0.c());
        }
        List list = (List)MapInvoker.c(R, world);
        ListInvoker.add(list, new T8(blockPos, aV8.d(world)));
        int n = 0;
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            T8 t8;
            T8 t82 = t8 = (T8)dz_0.b(iterator);
            if (!t82.a.equals(blockPos) || ++n < 8) continue;
            return true;
        }
        return false;
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (this.Q) {
            double d = (double)amv_2.j(blockPos) + 0.5 + (a5_0.c(random) - 0.5) * 0.2;
            double d2 = (double)amv_2.h(blockPos) + 0.7 + (a5_0.c(random) - 0.5) * 0.2;
            double d3 = (double)amv_2.i(blockPos) + 0.5 + (a5_0.c(random) - 0.5) * 0.2;
            EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
            if (eh_0.b(SJ.h(enumFacing))) {
                EnumFacing enumFacing2 = SJ.b(enumFacing);
                d += 0.27 * (double)SJ.k(enumFacing2);
                d2 += 0.22;
                d3 += 0.27 * (double)SJ.a(enumFacing2);
            }
            aV8.a(world, B7.REDSTONE, d, d2, d3, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return px_0.a(Blocks.br);
    }

    protected hu_1(boolean bl) {
        this.Q = bl;
        this.a(true);
        this.a((CreativeTabs)null);
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (this.Q) {
            for (EnumFacing enumFacing : EnumFacing.values()) {
                aV8.c(world, amv_2.a(blockPos, enumFacing), this);
            }
        }
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return px_0.a(Blocks.br);
    }

    @Override
    public int a(World world) {
        return 2;
    }
}

