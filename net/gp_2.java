/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import java.util.Iterator;
import java.util.Random;

import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.gp
 */
public class gp_2
extends gj_1 {
    public static J_ Q;
    public static JC<a5E> R;

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        if (BlockStateInvoker.b(iBlockState, R) == a5E.FOOT) {
            super.a(world, blockPos, iBlockState, f, 0);
        }
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return BlockStateInvoker.b(iBlockState, R) == a5E.HEAD ? null : Items.bed;
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        this.a();
    }

    public static BlockPos a(World world, BlockPos blockPos, int n) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(aV8.q(world, blockPos), P));
        int n2 = amv_2.j(blockPos);
        int n3 = amv_2.h(blockPos);
        int n4 = amv_2.i(blockPos);
        int n5 = 0;
        while (true) {
            int n6 = n2 - SJ.k(enumFacing) * n5 - 1;
            int n7 = n4 - SJ.a(enumFacing) * n5 - 1;
            int n8 = n6 + 2;
            int n9 = n7 + 2;
            for (int i = n6; i <= n8; ++i) {
                for (int j = n7; j <= n9; ++j) {
                    BlockPos blockPos2 = new BlockPos(i, n3, j);
                    if (!gp_2.a(world, blockPos2)) continue;
                    return blockPos2;
                }
            }
            ++n5;
        }
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        if (!world.isRemote) {
            if (BlockStateInvoker.b(iBlockState, R) != a5E.HEAD && BlockStateInvoker.getBlock(iBlockState = aV8.q(world, blockPos = amv_2.a(blockPos, (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P))))) != this) {
                return true;
            }
            if (qq_2.l(world.d) && aV8.o(world, blockPos) != il_0.q) {
                if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
                    EntityPlayer entityPlayer2 = this.b(world, blockPos);
                    a6w_0.a(entityPlayer, new aoz_1(ns_0.d, new Object[0]));
                    return true;
                }
                aox_1 aox_12 = a6w_0.a(entityPlayer, blockPos);
                if (aox_12 == aox_1.OK) {
                    iBlockState = BlockStateInvoker.a(iBlockState, Q, Boolean.TRUE);
                    aV8.a(world, blockPos, iBlockState, 4);
                } else if (aox_12 == aox_1.NOT_POSSIBLE_NOW) {
                    a6w_0.a(entityPlayer, new aoz_1(ns_0.b, new Object[0]));
                } else if (aox_12 == aox_1.NOT_SAFE) {
                    a6w_0.a(entityPlayer, new aoz_1(ns_0.a, new Object[0]));
                }
            } else {
                aV8.j(world, blockPos);
                BlockPos blockPos2 = amv_2.a(blockPos, SJ.b((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P))));
                if (BlockStateInvoker.getBlock(aV8.q(world, blockPos2)) == this) {
                    aV8.j(world, blockPos2);
                }
                aV8.a(world, null, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5, 5.0f, true, true);
            }
        }
        return true;
    }

    @Override
    public int F() {
        return 1;
    }

    static {
        R = xu_0.a(ns_0.c, a5E.class);
        Q = aWq.a(ns_0.e);
    }

    public gp_2() {
        super(Material.q);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), R, (Comparable)((Object)a5E.FOOT)), Q, Boolean.FALSE));
        this.a();
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
        if (BlockStateInvoker.b(iBlockState, R) == a5E.HEAD) {
            if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, SJ.b(enumFacing)))) != this) {
                aV8.j(world, blockPos);
            }
        } else if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, enumFacing))) != this) {
            aV8.j(world, blockPos);
            if (!world.isRemote) {
                this.a(world, blockPos, iBlockState, 0);
            }
        }
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return Items.bed;
    }

    @Override
    public boolean v() {
        return false;
    }

    private EntityPlayer b(World world, BlockPos blockPos) {
        Iterator iterator = ListInvoker.iterator(aV8.e(world));
        while (dz_0.c(iterator)) {
            EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
            if (!a6w_0.v(entityPlayer) || !entityPlayer.bm.equals(blockPos)) continue;
            return entityPlayer;
        }
        return null;
    }

    @Override
    protected a42 s() {
        return new a42(this, P, R, Q);
    }

    @Override
    public IBlockState c(int n) {
        EnumFacing enumFacing = SJ.b(n);
        return (n & 8) > 0 ? BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), R, (Comparable)((Object)a5E.HEAD)), P, (Comparable)((Object)enumFacing)), Q, auk_2.b((n & 4) > 0)) : BlockStateInvoker.a(BlockStateInvoker.a(this.m(), R, (Comparable)((Object)a5E.FOOT)), P, (Comparable)((Object)enumFacing));
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        IBlockState iBlockState2;
        if (BlockStateInvoker.b(iBlockState, R) == a5E.FOOT && BlockStateInvoker.getBlock(iBlockState2 = aG3.c(iBlockAccess, amv_2.a(blockPos, (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P))))) == this) {
            iBlockState = BlockStateInvoker.a(iBlockState, Q, BlockStateInvoker.b(iBlockState2, Q));
        }
        return iBlockState;
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= SJ.j((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
        if (BlockStateInvoker.b(iBlockState, R) == a5E.HEAD) {
            n |= 8;
            if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
                n |= 4;
            }
        }
        return n;
    }

    protected static boolean a(World world, BlockPos blockPos) {
        return aV8.a((IBlockAccess)world, amv_2.g(blockPos)) && !akm_1.i(BlockStateInvoker.getBlock(aV8.q(world, blockPos)).w()) && !akm_1.i(BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))).w());
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer) {
        BlockPos blockPos2;
        if (aSY.a(entityPlayer.abilities) && BlockStateInvoker.b(iBlockState, R) == a5E.HEAD && BlockStateInvoker.getBlock(aV8.q(world, blockPos2 = amv_2.a(blockPos, SJ.b((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)))))) == this) {
            aV8.j(world, blockPos2);
        }
    }

    private void a() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5625f, 1.0f);
    }
}

