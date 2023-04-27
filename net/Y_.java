/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.TileEntity;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class Y_ {
    protected HF b;
    protected EnumFacing c;
    protected int a;

    protected boolean a(World world, HF hF) {
        int n;
        int n2;
        int n3 = MathInvoker.max(this.b.f - 1, hF.f);
        int n4 = MathInvoker.max(this.b.c - 1, hF.c);
        int n5 = MathInvoker.max(this.b.b - 1, hF.b);
        int n6 = MathInvoker.b(this.b.d + 1, hF.d);
        int n7 = MathInvoker.b(this.b.a + 1, hF.a);
        int n8 = MathInvoker.b(this.b.e + 1, hF.e);
        z6_0 z6_02 = new z6_0();
        for (n2 = n3; n2 <= n6; ++n2) {
            for (n = n5; n <= n8; ++n) {
                if (akm_1.f(BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, ain_1.a(z6_02, n2, n4, n)))))) {
                    return true;
                }
                if (!akm_1.f(BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, ain_1.a(z6_02, n2, n7, n)))))) continue;
                return true;
            }
        }
        for (n2 = n3; n2 <= n6; ++n2) {
            for (n = n4; n <= n7; ++n) {
                if (akm_1.f(BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, ain_1.a(z6_02, n2, n, n5)))))) {
                    return true;
                }
                if (!akm_1.f(BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, ain_1.a(z6_02, n2, n, n8)))))) continue;
                return true;
            }
        }
        for (n2 = n5; n2 <= n8; ++n2) {
            for (n = n4; n <= n7; ++n) {
                if (akm_1.f(BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, ain_1.a(z6_02, n3, n, n2)))))) {
                    return true;
                }
                if (!akm_1.f(BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, ain_1.a(z6_02, n6, n, n2)))))) continue;
                return true;
            }
        }
        return false;
    }

    protected void a(World world, IBlockState iBlockState, int n, int n2, int n3, HF hF) {
        int n4;
        int n5;
        int n6 = this.b(n, n3);
        if (aqu_2.a(hF, new BlockPos(n6, n5 = this.a(n2), n4 = this.a(n, n3)))) {
            while ((aV8.k(world, new BlockPos(n6, n5, n4)) || akm_1.f(BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, new BlockPos(n6, n5, n4)))))) && n5 > 1) {
                aV8.a(world, new BlockPos(n6, n5, n4), iBlockState, 2);
                --n5;
            }
        }
    }

    protected void a(World world, HF hF, Random random, float f, int n, int n2, int n3, IBlockState iBlockState) {
        if (a5_0.e(random) < f) {
            this.b(world, iBlockState, n, n2, n3, hF);
        }
    }

    public void a(World world, NBTTagCompound nBTTagCompound) {
        int n;
        if (tn_0.b(nBTTagCompound, azv_0.g)) {
            this.b = new HF(tn_0.i(nBTTagCompound, azv_0.a));
        }
        this.c = (n = tn_0.g(nBTTagCompound, azv_0.b)) == -1 ? null : SJ.b(n);
        this.a = tn_0.g(nBTTagCompound, azv_0.c);
        this.b(nBTTagCompound);
    }

    public Y_() {
    }

    protected void a(World world, HF hF, Random random, float f, int n, int n2, int n3, int n4, int n5, int n6, IBlockState iBlockState, IBlockState iBlockState2, boolean bl) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (!(a5_0.e(random) <= f) || BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(world, j, i, k, hF))) == Material.air) continue;
                    if (i != n2 && i != n5 && j != n && j != n4 && k != n3 && k != n6) {
                        this.b(world, iBlockState2, j, i, k, hF);
                        continue;
                    }
                    this.b(world, iBlockState, j, i, k, hF);
                }
            }
        }
    }

    protected int a(int n, int n2) {
        if (this.c == null) {
            return n2;
        }
        switch (I8.a[this.c.ordinal()]) {
            case 1: {
                return this.b.e - n2;
            }
            case 2: {
                return this.b.b + n2;
            }
            case 3: 
            case 4: {
                return this.b.b + n;
            }
        }
        return n2;
    }

    public abstract boolean a(World var1, Random var2, HF var3);

    protected void a(World world, int n, int n2, int n3, HF hF) {
        BlockPos blockPos = new BlockPos(this.b(n, n3), this.a(n2), this.a(n, n3));
        if (aqu_2.a(hF, blockPos)) {
            while (!aV8.k(world, blockPos) && amv_2.h(blockPos) < 255) {
                aV8.a(world, blockPos, BlocksInvoker.t(Blocks.air), 2);
                blockPos = amv_2.e(blockPos);
            }
        }
    }

    protected void a(World world, HF hF, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, Random random, t5_0 t5_02) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(world, j, i, k, hF))) == Material.air) continue;
                    a7J.a(t5_02, random, j, i, k, i == n2 || i == n5 || j == n || j == n4 || k == n3 || k == n6);
                    this.b(world, a7J.a(t5_02), j, i, k, hF);
                }
            }
        }
    }

    protected Y_(int n) {
        this.a = n;
    }

    protected int b(int n, int n2) {
        if (this.c == null) {
            return n;
        }
        switch (I8.a[this.c.ordinal()]) {
            case 1: 
            case 2: {
                return this.b.f + n;
            }
            case 3: {
                return this.b.d - n2;
            }
            case 4: {
                return this.b.f + n2;
            }
        }
        return n;
    }

    public BlockPos c() {
        return new BlockPos(aqu_2.b(this.b));
    }

    public NBTTagCompound b() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        tn_0.a(nBTTagCompound, azv_0.d, azx_1.a(this));
        tn_0.a(nBTTagCompound, azv_0.e, aqu_2.a(this.b));
        tn_0.b(nBTTagCompound, azv_0.h, this.c == null ? -1 : SJ.j(this.c));
        tn_0.b(nBTTagCompound, azv_0.f, this.a);
        this.a(nBTTagCompound);
        return nBTTagCompound;
    }

    protected void a(World world, HF hF, int n, int n2, int n3, int n4, int n5, int n6, IBlockState iBlockState, boolean bl) {
        float f = n4 - n + 1;
        float f2 = n5 - n2 + 1;
        float f3 = n6 - n3 + 1;
        float f4 = (float)n + f / 2.0f;
        float f5 = (float)n3 + f3 / 2.0f;
        for (int i = n2; i <= n5; ++i) {
            float f6 = (float)(i - n2) / f2;
            for (int j = n; j <= n4; ++j) {
                float f7 = ((float)j - f4) / (f * 0.5f);
                for (int k = n3; k <= n6; ++k) {
                    float f8;
                    float f9 = ((float)k - f5) / (f3 * 0.5f);
                    if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(world, j, i, k, hF))) == Material.air || !((f8 = f7 * f7 + f6 * f6 + f9 * f9) <= 1.05f)) continue;
                    this.b(world, iBlockState, j, i, k, hF);
                }
            }
        }
    }

    protected boolean a(World world, HF hF, Random random, int n, int n2, int n3, int n4, List<C6> list, int n5) {
        BlockPos blockPos = new BlockPos(this.b(n, n3), this.a(n2), this.a(n, n3));
        if (aqu_2.a(hF, blockPos) && BlockStateInvoker.getBlock(aV8.q(world, blockPos)) != Blocks.aB) {
            aV8.a(world, blockPos, BlocksInvoker.a(Blocks.aB, this.a(Blocks.aB, n4)), 2);
            TileEntity tileEntity = aV8.z(world, blockPos);
            if (tileEntity instanceof a6B) {
                aiq_2.a(random, list, (a6B)tileEntity, n5);
            }
            return true;
        }
        return false;
    }

    protected void a(World world, HF hF, Random random, int n, int n2, int n3, EnumFacing enumFacing) {
        BlockPos blockPos = new BlockPos(this.b(n, n3), this.a(n2), this.a(n, n3));
        if (aqu_2.a(hF, blockPos)) {
            c8_0.a(world, blockPos, SJ.c(enumFacing), Blocks.bh);
        }
    }

    protected int a(Block block, int n) {
        if (block == Blocks.bQ) {
            if (this.c == EnumFacing.WEST || this.c == EnumFacing.EAST) {
                if (n == 1) {
                    return 0;
                }
                return 1;
            }
        } else if (block instanceof g7_0) {
            if (this.c == EnumFacing.SOUTH) {
                return 2;
            }
            if (this.c == EnumFacing.WEST) {
                return n + 1 & 3;
            }
            if (this.c == EnumFacing.EAST) {
                return n + 3 & 3;
            }
        } else if (block != Blocks.U && block != Blocks.a7 && block != Blocks.ct && block != Blocks.bZ && block != Blocks.aO) {
            if (block == Blocks.bm) {
                if (this.c == EnumFacing.SOUTH) {
                    if (n == SJ.i(EnumFacing.NORTH)) {
                        return SJ.i(EnumFacing.SOUTH);
                    }
                    if (n == SJ.i(EnumFacing.SOUTH)) {
                        return SJ.i(EnumFacing.NORTH);
                    }
                } else if (this.c == EnumFacing.WEST) {
                    if (n == SJ.i(EnumFacing.NORTH)) {
                        return SJ.i(EnumFacing.WEST);
                    }
                    if (n == SJ.i(EnumFacing.SOUTH)) {
                        return SJ.i(EnumFacing.EAST);
                    }
                    if (n == SJ.i(EnumFacing.WEST)) {
                        return SJ.i(EnumFacing.NORTH);
                    }
                    if (n == SJ.i(EnumFacing.EAST)) {
                        return SJ.i(EnumFacing.SOUTH);
                    }
                } else if (this.c == EnumFacing.EAST) {
                    if (n == SJ.i(EnumFacing.NORTH)) {
                        return SJ.i(EnumFacing.EAST);
                    }
                    if (n == SJ.i(EnumFacing.SOUTH)) {
                        return SJ.i(EnumFacing.WEST);
                    }
                    if (n == SJ.i(EnumFacing.WEST)) {
                        return SJ.i(EnumFacing.NORTH);
                    }
                    if (n == SJ.i(EnumFacing.EAST)) {
                        return SJ.i(EnumFacing.SOUTH);
                    }
                }
            } else if (block == Blocks.bF) {
                if (this.c == EnumFacing.SOUTH) {
                    if (n == 3) {
                        return 4;
                    }
                    if (n == 4) {
                        return 3;
                    }
                } else if (this.c == EnumFacing.WEST) {
                    if (n == 3) {
                        return 1;
                    }
                    if (n == 4) {
                        return 2;
                    }
                    if (n == 2) {
                        return 3;
                    }
                    if (n == 1) {
                        return 4;
                    }
                } else if (this.c == EnumFacing.EAST) {
                    if (n == 3) {
                        return 2;
                    }
                    if (n == 4) {
                        return 1;
                    }
                    if (n == 2) {
                        return 3;
                    }
                    if (n == 1) {
                        return 4;
                    }
                }
            } else if (block != Blocks.be && !(block instanceof gj_1)) {
                if (block == Blocks.bB || block == Blocks.E || block == Blocks.aG || block == Blocks.aB) {
                    if (this.c == EnumFacing.SOUTH) {
                        if (n == SJ.i(EnumFacing.NORTH) || n == SJ.i(EnumFacing.SOUTH)) {
                            return SJ.i(SJ.b(SJ.a(n)));
                        }
                    } else if (this.c == EnumFacing.WEST) {
                        if (n == SJ.i(EnumFacing.NORTH)) {
                            return SJ.i(EnumFacing.WEST);
                        }
                        if (n == SJ.i(EnumFacing.SOUTH)) {
                            return SJ.i(EnumFacing.EAST);
                        }
                        if (n == SJ.i(EnumFacing.WEST)) {
                            return SJ.i(EnumFacing.NORTH);
                        }
                        if (n == SJ.i(EnumFacing.EAST)) {
                            return SJ.i(EnumFacing.SOUTH);
                        }
                    } else if (this.c == EnumFacing.EAST) {
                        if (n == SJ.i(EnumFacing.NORTH)) {
                            return SJ.i(EnumFacing.EAST);
                        }
                        if (n == SJ.i(EnumFacing.SOUTH)) {
                            return SJ.i(EnumFacing.WEST);
                        }
                        if (n == SJ.i(EnumFacing.WEST)) {
                            return SJ.i(EnumFacing.NORTH);
                        }
                        if (n == SJ.i(EnumFacing.EAST)) {
                            return SJ.i(EnumFacing.SOUTH);
                        }
                    }
                }
            } else {
                EnumFacing enumFacing = SJ.b(n);
                if (this.c == EnumFacing.SOUTH) {
                    if (enumFacing == EnumFacing.SOUTH || enumFacing == EnumFacing.NORTH) {
                        return SJ.j(SJ.b(enumFacing));
                    }
                } else if (this.c == EnumFacing.WEST) {
                    if (enumFacing == EnumFacing.NORTH) {
                        return SJ.j(EnumFacing.WEST);
                    }
                    if (enumFacing == EnumFacing.SOUTH) {
                        return SJ.j(EnumFacing.EAST);
                    }
                    if (enumFacing == EnumFacing.WEST) {
                        return SJ.j(EnumFacing.NORTH);
                    }
                    if (enumFacing == EnumFacing.EAST) {
                        return SJ.j(EnumFacing.SOUTH);
                    }
                } else if (this.c == EnumFacing.EAST) {
                    if (enumFacing == EnumFacing.NORTH) {
                        return SJ.j(EnumFacing.EAST);
                    }
                    if (enumFacing == EnumFacing.SOUTH) {
                        return SJ.j(EnumFacing.WEST);
                    }
                    if (enumFacing == EnumFacing.WEST) {
                        return SJ.j(EnumFacing.NORTH);
                    }
                    if (enumFacing == EnumFacing.EAST) {
                        return SJ.j(EnumFacing.SOUTH);
                    }
                }
            }
        } else if (this.c == EnumFacing.SOUTH) {
            if (n == 2) {
                return 3;
            }
            if (n == 3) {
                return 2;
            }
        } else {
            if (this.c == EnumFacing.WEST) {
                return 2;
            }
            if (this.c == EnumFacing.EAST) {
                return 2;
            }
        }
        return n;
    }

    protected IBlockState b(World world, int n, int n2, int n3, HF hF) {
        int n4;
        int n5;
        int n6 = this.b(n, n3);
        BlockPos blockPos = new BlockPos(n6, n5 = this.a(n2), n4 = this.a(n, n3));
        return !aqu_2.a(hF, blockPos) ? BlocksInvoker.t(Blocks.air) : aV8.q(world, blockPos);
    }

    protected abstract void b(NBTTagCompound var1);

    public void a(int n, int n2, int n3) {
        aqu_2.a(this.b, n, n2, n3);
    }

    protected int a(int n) {
        return this.c == null ? n : n + this.b.c;
    }

    public HF d() {
        return this.b;
    }

    protected void a(World world, HF hF, int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    this.b(world, BlocksInvoker.t(Blocks.air), j, i, k, hF);
                }
            }
        }
    }

    protected void b(World world, IBlockState iBlockState, int n, int n2, int n3, HF hF) {
        BlockPos blockPos = new BlockPos(this.b(n, n3), this.a(n2), this.a(n, n3));
        if (aqu_2.a(hF, blockPos)) {
            aV8.a(world, blockPos, iBlockState, 2);
        }
    }

    public static Y_ a(List<Y_> list, HF hF) {
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            Y_ y_ = (Y_)dz_0.b(iterator);
            if (y_.d() == null || !aqu_2.b(y_.d(), hF)) continue;
            return y_;
        }
        return null;
    }

    public void a(Y_ y_, List<Y_> list, Random random) {
    }

    protected boolean a(World world, HF hF, Random random, int n, int n2, int n3, List<C6> list, int n4) {
        BlockPos blockPos = new BlockPos(this.b(n, n3), this.a(n2), this.a(n, n3));
        if (aqu_2.a(hF, blockPos) && BlockStateInvoker.getBlock(aV8.q(world, blockPos)) != Blocks.R) {
            IBlockState iBlockState = vz_1.a(Blocks.R);
            aV8.a(world, blockPos, vz_1.a(Blocks.R, world, blockPos, iBlockState), 2);
            TileEntity tileEntity = aV8.z(world, blockPos);
            if (tileEntity instanceof a6O) {
                aiq_2.a(random, list, (a6O)tileEntity, n4);
            }
            return true;
        }
        return false;
    }

    protected void a(World world, HF hF, int n, int n2, int n3, int n4, int n5, int n6, IBlockState iBlockState, IBlockState iBlockState2, boolean bl) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(world, j, i, k, hF))) == Material.air) continue;
                    if (i != n2 && i != n5 && j != n && j != n4 && k != n3 && k != n6) {
                        this.b(world, iBlockState2, j, i, k, hF);
                        continue;
                    }
                    this.b(world, iBlockState, j, i, k, hF);
                }
            }
        }
    }

    protected abstract void a(NBTTagCompound var1);

    public int a() {
        return this.a;
    }
}

