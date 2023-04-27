/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.gs
 */
public class gs_1
extends Block {
    public static JC<a9Y> S;
    private boolean V = true;
    public static JC<a9Y> P;
    public static js_0 U;
    public static JC<a9Y> Q;
    public static JC<a9Y> T;
    private Set<BlockPos> R = axe_2.a();

    private IBlockState a(World world, BlockPos blockPos, IBlockState iBlockState) {
        iBlockState = this.a(world, blockPos, blockPos, iBlockState);
        ArrayList arrayList = my_0.a(this.R);
        aS0.e(this.R);
        Iterator iterator = ListInvoker.iterator(arrayList);
        while (dz_0.c(iterator)) {
            BlockPos blockPos2 = (BlockPos)dz_0.b(iterator);
            aV8.c(world, blockPos2, this);
        }
        return iBlockState;
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), U, P8.d(n));
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return Items.redstone;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, U));
    }

    protected static boolean a(IBlockState iBlockState, EnumFacing enumFacing) {
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (block == Blocks.af) {
            return true;
        }
        if (a3G.a(Blocks.aP, block)) {
            EnumFacing enumFacing2 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, g3_0.P));
            return enumFacing2 == enumFacing || SJ.b(enumFacing2) == enumFacing;
        }
        return block.b();
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!world.isRemote) {
            if (this.e(world, blockPos)) {
                this.a(world, blockPos, iBlockState);
            } else {
                this.a(world, blockPos, iBlockState, 0);
                aV8.j(world, blockPos);
            }
        }
    }

    private void a(World world, BlockPos blockPos) {
        if (BlockStateInvoker.getBlock(aV8.q(world, blockPos)) == this) {
            aV8.c(world, blockPos, this);
            for (EnumFacing enumFacing : EnumFacing.values()) {
                aV8.c(world, amv_2.a(blockPos, enumFacing), this);
            }
        }
    }

    public gs_1() {
        super(Material.I);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), Q, (Comparable)((Object)a9Y.NONE)), P, (Comparable)((Object)a9Y.NONE)), T, (Comparable)((Object)a9Y.NONE)), S, (Comparable)((Object)a9Y.NONE)), U, P8.d(0)));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!world.isRemote) {
            EnumFacing enumFacing;
            Object object;
            this.a(world, blockPos, iBlockState);
            Iterator iterator = abw_2.b(cs_1.VERTICAL);
            while (dz_0.c(iterator)) {
                object = dz_0.b(iterator);
                aV8.c(world, amv_2.a(blockPos, (EnumFacing)object), this);
            }
            iterator = abw_2.b(cs_1.HORIZONTAL);
            while (dz_0.c(iterator)) {
                object = dz_0.b(iterator);
                enumFacing = (EnumFacing)object;
                this.a(world, amv_2.a(blockPos, enumFacing));
            }
            iterator = abw_2.b(cs_1.HORIZONTAL);
            while (dz_0.c(iterator)) {
                object = dz_0.b(iterator);
                enumFacing = (EnumFacing)object;
                BlockPos blockPos2 = amv_2.a(blockPos, enumFacing);
                if (BlockStateInvoker.getBlock(aV8.q(world, blockPos2)).D()) {
                    this.a(world, amv_2.e(blockPos2));
                    continue;
                }
                this.a(world, amv_2.g(blockPos2));
            }
        }
    }

    @Override
    protected a42 s() {
        return new a42(this, Q, P, T, S, U);
    }

    private boolean d(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        BlockPos blockPos2 = amv_2.a(blockPos, enumFacing);
        IBlockState iBlockState = aG3.c(iBlockAccess, blockPos2);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        block.D();
        BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.e(blockPos))).D();
        return gs_1.a(iBlockAccess, amv_2.e(blockPos2)) || gs_1.a(iBlockState, enumFacing) || block == Blocks.ci && BlockStateInvoker.b(iBlockState, gr_2.P) == enumFacing || gs_1.a(iBlockAccess, amv_2.g(blockPos2));
    }

    protected static boolean a(IBlockState iBlockState) {
        return gs_1.a(iBlockState, null);
    }

    static {
        Q = xu_0.a(ax2_0.a, a9Y.class);
        P = xu_0.a(ax2_0.d, a9Y.class);
        T = xu_0.a(ax2_0.c, a9Y.class);
        S = xu_0.a(ax2_0.e, a9Y.class);
        U = a7X.a(ax2_0.b, 0, 15);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        iBlockState = BlockStateInvoker.a(iBlockState, S, (Comparable)((Object)this.e(iBlockAccess, blockPos, EnumFacing.WEST)));
        iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)this.e(iBlockAccess, blockPos, EnumFacing.EAST)));
        iBlockState = BlockStateInvoker.a(iBlockState, Q, (Comparable)((Object)this.e(iBlockAccess, blockPos, EnumFacing.NORTH)));
        iBlockState = BlockStateInvoker.a(iBlockState, T, (Comparable)((Object)this.e(iBlockAccess, blockPos, EnumFacing.SOUTH)));
        return iBlockState;
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, int n) {
        IBlockState iBlockState = aG3.c(iBlockAccess, blockPos);
        return BlockStateInvoker.getBlock(iBlockState) != this ? super.a(iBlockAccess, blockPos, n) : this.a(P8.b((Integer)BlockStateInvoker.b(iBlockState, U)));
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        int n = P8.b((Integer)BlockStateInvoker.b(iBlockState, U));
        double d = (double)amv_2.j(blockPos) + 0.5 + ((double)a5_0.e(random) - 0.5) * 0.2;
        double d2 = (float)amv_2.h(blockPos) + 0.0625f;
        double d3 = (double)amv_2.i(blockPos) + 0.5 + ((double)a5_0.e(random) - 0.5) * 0.2;
        float f = (float)n / 15.0f;
        float f2 = f * 0.6f + 0.4f;
        float f3 = MathInvoker.b(0.0f, f * f * 0.7f - 0.5f);
        float f4 = MathInvoker.b(0.0f, f * f * 0.6f - 0.7f);
        aV8.a(world, B7.REDSTONE, d, d2, d3, f2, f3, f4, new int[0]);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        super.a(world, blockPos, iBlockState);
        if (!world.isRemote) {
            for (EnumFacing enumFacing : EnumFacing.values()) {
                aV8.c(world, amv_2.a(blockPos, enumFacing), this);
            }
            this.a(world, blockPos, iBlockState);
            Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
            while (dz_0.c(iterator)) {
                Object object = dz_0.b(iterator);
                this.a(world, amv_2.a(blockPos, (EnumFacing)object));
            }
            Iterator iterator2 = abw_2.b(cs_1.HORIZONTAL);
            while (dz_0.c(iterator2)) {
                Object object = dz_0.b(iterator2);
                BlockPos blockPos2 = amv_2.a(blockPos, (EnumFacing)object);
                if (BlockStateInvoker.getBlock(aV8.q(world, blockPos2)).D()) {
                    this.a(world, amv_2.e(blockPos2));
                    continue;
                }
                this.a(world, amv_2.g(blockPos2));
            }
        }
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return aV8.a((IBlockAccess)world, amv_2.g(blockPos)) || BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))) == Blocks.bs;
    }

    private a9Y e(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        BlockPos blockPos2 = amv_2.a(blockPos, enumFacing);
        Block block = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.a(blockPos, enumFacing)));
        if (!(gs_1.a(aG3.c(iBlockAccess, blockPos2), enumFacing) || !block.L() && gs_1.a(aG3.c(iBlockAccess, amv_2.g(blockPos2))))) {
            Block block2 = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.e(blockPos)));
            return !block2.L() && block.L() && gs_1.a(aG3.c(iBlockAccess, amv_2.e(blockPos2))) ? a9Y.UP : a9Y.NONE;
        }
        return a9Y.SIDE;
    }

    private IBlockState a(World world, BlockPos blockPos, BlockPos blockPos2, IBlockState iBlockState) {
        IBlockState iBlockState2 = iBlockState;
        int n = P8.b((Integer)BlockStateInvoker.b(iBlockState, U));
        int n2 = 0;
        n2 = this.a(world, blockPos2, n2);
        this.V = false;
        int n3 = aV8.v(world, blockPos);
        this.V = true;
        if (n3 > n2 - 1) {
            n2 = n3;
        }
        int n4 = 0;
        EnumFacing[] enumFacingArray = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c((Iterator)enumFacingArray)) {
            Object object = dz_0.b((Iterator)enumFacingArray);
            BlockPos blockPos3 = amv_2.a(blockPos, (EnumFacing)object);
            boolean bl = amv_2.j(blockPos3) != amv_2.j(blockPos2) || amv_2.i(blockPos3) != amv_2.i(blockPos2);
            n4 = this.a(world, blockPos3, n4);
            if (BlockStateInvoker.getBlock(aV8.q(world, blockPos3)).D() && !BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))).D()) {
                if (amv_2.h(blockPos) < amv_2.h(blockPos2)) continue;
                n4 = this.a(world, amv_2.e(blockPos3), n4);
                continue;
            }
            if (BlockStateInvoker.getBlock(aV8.q(world, blockPos3)).D() || amv_2.h(blockPos) > amv_2.h(blockPos2)) continue;
            n4 = this.a(world, amv_2.g(blockPos3), n4);
        }
        n2 = n4 > n2 ? n4 - 1 : --n2;
        if (n3 > n2 - 1) {
            n2 = n3;
        }
        if (n != n2) {
            iBlockState = BlockStateInvoker.a(iBlockState, U, P8.d(n2));
            if (aV8.q(world, blockPos) == iBlockState2) {
                aV8.a(world, blockPos, iBlockState, 2);
            }
            aS0.b(this.R, blockPos);
            for (EnumFacing enumFacing : EnumFacing.values()) {
                aS0.b(this.R, amv_2.a(blockPos, enumFacing));
            }
        }
        return iBlockState;
    }

    private int a(World world, BlockPos blockPos, int n) {
        if (BlockStateInvoker.getBlock(aV8.q(world, blockPos)) != this) {
            return n;
        }
        int n2 = P8.b((Integer)BlockStateInvoker.b(aV8.q(world, blockPos), U));
        return n2 > n ? n2 : n;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.redstone;
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        if (!this.V) {
            return 0;
        }
        P8.b((Integer)BlockStateInvoker.b(iBlockState, U));
        return 0;
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public boolean b() {
        return this.V;
    }

    private int a(int n) {
        float f = (float)n / 15.0f;
        float f2 = f * 0.6f + 0.4f;
        f2 = 0.3f;
        float f3 = f * f * 0.7f - 0.5f;
        float f4 = f * f * 0.6f - 0.7f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        int n2 = MathHelper.a((int)(f2 * 255.0f), 0, 255);
        int n3 = MathHelper.a((int)(f3 * 255.0f), 0, 255);
        int n4 = MathHelper.a((int)(f4 * 255.0f), 0, 255);
        return 0xFF000000 | n2 << 16 | n3 << 8 | n4;
    }

    @Override
    public int b(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return !this.V ? 0 : this.a(iBlockAccess, blockPos, iBlockState, enumFacing);
    }

    protected static boolean a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return gs_1.a(aG3.c(iBlockAccess, blockPos));
    }
}

