/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import java.util.Map;
import java.util.Random;

/*
 * Renamed from net.gL
 */
public class gl_1
extends Block {
    public static J_ V;
    private Map<Block, Integer> W = MapsInvoker.b();
    public static J_ T;
    public static J_ Y;
    public static js_0 U;
    public static J_ Q;
    public static J_ R;
    public static J_ P;
    public static js_0 X;
    private Map<Block, Integer> S = MapsInvoker.b();

    static {
        U = a7X.a(azz_1.g, 0, 15);
        T = aWq.a(azz_1.h);
        R = aWq.a(azz_1.a);
        Q = aWq.a(azz_1.d);
        P = aWq.a(azz_1.c);
        V = aWq.a(azz_1.f);
        Y = aWq.a(azz_1.b);
        X = a7X.a(azz_1.i, 0, 2);
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return aV8.a((IBlockAccess)world, amv_2.g(blockPos)) || this.c(world, blockPos);
    }

    @Override
    public int a(World world) {
        return 30;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (J9.c(aV8.k(world), azz_1.e)) {
            Block block;
            if (!this.e(world, blockPos)) {
                aV8.j(world, blockPos);
            }
            boolean bl = (block = BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos)))) == Blocks.bu;
            if (!(world.d instanceof a91) || block == Blocks.bedrock) {
                // empty if block
            }
            if (aV8.n(world) && this.d(world, blockPos)) {
                aV8.j(world, blockPos);
            } else {
                int n = P8.b((Integer)BlockStateInvoker.b(iBlockState, U));
                if (n < 15) {
                    iBlockState = BlockStateInvoker.a(iBlockState, U, P8.d(n + a5_0.a(random, 3) / 2));
                    aV8.a(world, blockPos, iBlockState, 4);
                }
                aV8.a(world, blockPos, (Block)this, this.a(world) + a5_0.a(random, 10));
                if (!this.c(world, blockPos)) {
                    if (!aV8.a((IBlockAccess)world, amv_2.g(blockPos)) || n > 3) {
                        aV8.j(world, blockPos);
                    }
                    return;
                }
                if (!this.a((IBlockAccess)world, amv_2.g(blockPos)) && n == 15 && a5_0.a(random, 4) == 0) {
                    aV8.j(world, blockPos);
                    return;
                }
                aV8.e(world, blockPos);
                int n2 = 0;
                n2 = -50;
                this.a(world, amv_2.f(blockPos), 300 + n2, random, n);
                this.a(world, amv_2.d(blockPos), 300 + n2, random, n);
                this.a(world, amv_2.g(blockPos), 250 + n2, random, n);
                this.a(world, amv_2.e(blockPos), 250 + n2, random, n);
                this.a(world, amv_2.a(blockPos), 300 + n2, random, n);
                this.a(world, amv_2.b(blockPos), 300 + n2, random, n);
                int n3 = -1;
                int n4 = -1;
                int n5 = -1;
                while (true) {
                    int n6 = 100;
                    BlockPos blockPos2 = amv_2.a(blockPos, n3, n5, n4);
                    int n7 = this.b(world, blockPos2);
                    int n8 = (n7 + 40 + aYj.a(aV8.p(world)) * 7) / (n + 30);
                    if (!(a5_0.a(random, n6) > (n8 /= 2) || aV8.n(world) && this.d(world, blockPos2))) {
                        int n9 = n + a5_0.a(random, 5) / 4;
                        if (n9 > 15) {
                            n9 = 15;
                        }
                        aV8.a(world, blockPos2, BlockStateInvoker.a(iBlockState, U, P8.d(n9)), 3);
                    }
                    ++n5;
                }
            }
        }
    }

    private int b(World world, BlockPos blockPos) {
        if (!aV8.k(world, blockPos)) {
            return 0;
        }
        int n = 0;
        for (EnumFacing enumFacing : EnumFacing.values()) {
            n = MathInvoker.max(this.b(BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, enumFacing)))), n);
        }
        return n;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!aV8.a((IBlockAccess)world, amv_2.g(blockPos)) && !this.c(world, blockPos)) {
            aV8.j(world, blockPos);
        }
    }

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, U));
    }

    private int c(Block block) {
        Integer cfr_ignored_0 = (Integer)MapInvoker.c(this.S, block);
        return 0;
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (a5_0.a(random, 24) == 0) {
            aV8.a(world, (double)((float)amv_2.j(blockPos) + 0.5f), (double)((float)amv_2.h(blockPos) + 0.5f), (double)((float)amv_2.i(blockPos) + 0.5f), azz_1.j, 1.0f + a5_0.e(random), a5_0.e(random) * 0.7f + 0.3f, false);
        }
        if (!aV8.a((IBlockAccess)world, amv_2.g(blockPos)) && !Blocks.c.a((IBlockAccess)world, amv_2.g(blockPos))) {
            if (Blocks.c.a((IBlockAccess)world, amv_2.d(blockPos))) {
                int n = 0;
                while (true) {
                    double d = (double)amv_2.j(blockPos) + a5_0.c(random) * (double)0.1f;
                    double d2 = (double)amv_2.h(blockPos) + a5_0.c(random);
                    double d3 = (double)amv_2.i(blockPos) + a5_0.c(random);
                    aV8.a(world, B7.SMOKE_LARGE, d, d2, d3, 0.0, 0.0, 0.0, new int[0]);
                    ++n;
                }
            }
            if (Blocks.c.a((IBlockAccess)world, amv_2.f(blockPos))) {
                int n = 0;
                while (true) {
                    double d = (double)(amv_2.j(blockPos) + 1) - a5_0.c(random) * (double)0.1f;
                    double d4 = (double)amv_2.h(blockPos) + a5_0.c(random);
                    double d5 = (double)amv_2.i(blockPos) + a5_0.c(random);
                    aV8.a(world, B7.SMOKE_LARGE, d, d4, d5, 0.0, 0.0, 0.0, new int[0]);
                    ++n;
                }
            }
            if (Blocks.c.a((IBlockAccess)world, amv_2.a(blockPos))) {
                int n = 0;
                while (true) {
                    double d = (double)amv_2.j(blockPos) + a5_0.c(random);
                    double d6 = (double)amv_2.h(blockPos) + a5_0.c(random);
                    double d7 = (double)amv_2.i(blockPos) + a5_0.c(random) * (double)0.1f;
                    aV8.a(world, B7.SMOKE_LARGE, d, d6, d7, 0.0, 0.0, 0.0, new int[0]);
                    ++n;
                }
            }
            if (Blocks.c.a((IBlockAccess)world, amv_2.b(blockPos))) {
                int n = 0;
                while (true) {
                    double d = (double)amv_2.j(blockPos) + a5_0.c(random);
                    double d8 = (double)amv_2.h(blockPos) + a5_0.c(random);
                    double d9 = (double)(amv_2.i(blockPos) + 1) - a5_0.c(random) * (double)0.1f;
                    aV8.a(world, B7.SMOKE_LARGE, d, d8, d9, 0.0, 0.0, 0.0, new int[0]);
                    ++n;
                }
            }
            if (Blocks.c.a((IBlockAccess)world, amv_2.e(blockPos))) {
                int n = 0;
                while (true) {
                    double d = (double)amv_2.j(blockPos) + a5_0.c(random);
                    double d10 = (double)(amv_2.h(blockPos) + 1) - a5_0.c(random) * (double)0.1f;
                    double d11 = (double)amv_2.i(blockPos) + a5_0.c(random);
                    aV8.a(world, B7.SMOKE_LARGE, d, d10, d11, 0.0, 0.0, 0.0, new int[0]);
                    ++n;
                }
            }
        } else {
            int n = 0;
            while (true) {
                double d = (double)amv_2.j(blockPos) + a5_0.c(random);
                double d12 = (double)amv_2.h(blockPos) + a5_0.c(random) * 0.5 + 0.5;
                double d13 = (double)amv_2.i(blockPos) + a5_0.c(random);
                aV8.a(world, B7.SMOKE_LARGE, d, d12, d13, 0.0, 0.0, 0.0, new int[0]);
                ++n;
            }
        }
    }

    protected gl_1() {
        super(Material.b);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), U, P8.d(0)), T, Boolean.FALSE), R, Boolean.FALSE), Q, Boolean.FALSE), P, Boolean.FALSE), V, Boolean.FALSE), Y, Boolean.FALSE), X, P8.d(0)));
        this.a(true);
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    private boolean c(World world, BlockPos blockPos) {
        for (EnumFacing enumFacing : EnumFacing.values()) {
            if (!this.a((IBlockAccess)world, amv_2.a(blockPos, enumFacing))) continue;
            return true;
        }
        return false;
    }

    public void a(Block block, int n, int n2) {
        MapInvoker.c(this.W, block, P8.d(n));
        MapInvoker.c(this.S, block, P8.d(n2));
    }

    public static void a() {
        Blocks.c.a(Blocks.planks, 5, 20);
        Blocks.c.a(Blocks.a_, 5, 20);
        Blocks.c.a(Blocks.e, 5, 20);
        Blocks.c.a(Blocks.ch, 5, 20);
        Blocks.c.a(Blocks.a4, 5, 20);
        Blocks.c.a(Blocks.aZ, 5, 20);
        Blocks.c.a(Blocks.S, 5, 20);
        Blocks.c.a(Blocks.cb, 5, 20);
        Blocks.c.a(Blocks.x, 5, 20);
        Blocks.c.a(Blocks.Z, 5, 20);
        Blocks.c.a(Blocks.cg, 5, 20);
        Blocks.c.a(Blocks.n, 5, 20);
        Blocks.c.a(Blocks.m, 5, 20);
        Blocks.c.a(Blocks.bo, 5, 20);
        Blocks.c.a(Blocks.cp, 5, 20);
        Blocks.c.a(Blocks.a7, 5, 20);
        Blocks.c.a(Blocks.F, 5, 20);
        Blocks.c.a(Blocks.aT, 5, 20);
        Blocks.c.a(Blocks.aa, 5, 20);
        Blocks.c.a(Blocks.b2, 5, 5);
        Blocks.c.a(Blocks.bO, 5, 5);
        Blocks.c.a(Blocks.bP, 30, 60);
        Blocks.c.a(Blocks.bM, 30, 60);
        Blocks.c.a(Blocks.at, 30, 20);
        Blocks.c.a(Blocks.Y, 15, 100);
        Blocks.c.a(Blocks.bN, 60, 100);
        Blocks.c.a(Blocks.ai, 60, 100);
        Blocks.c.a(Blocks.G, 60, 100);
        Blocks.c.a(Blocks.bY, 60, 100);
        Blocks.c.a(Blocks.ca, 60, 100);
        Blocks.c.a(Blocks.b_, 30, 60);
        Blocks.c.a(Blocks.as, 15, 100);
        Blocks.c.a(Blocks.bK, 5, 5);
        Blocks.c.a(Blocks.y, 60, 20);
        Blocks.c.a(Blocks.bl, 60, 20);
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return MapColor.G;
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (qq_2.j(world.d) > 0 || !abu_0.a(Blocks.h, world, blockPos)) {
            if (!aV8.a((IBlockAccess)world, amv_2.g(blockPos)) && !this.c(world, blockPos)) {
                aV8.j(world, blockPos);
            } else {
                aV8.a(world, blockPos, (Block)this, this.a(world) + a5_0.a(world.o, 10));
            }
        }
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    protected a42 s() {
        return new a42(this, U, Q, P, V, Y, X, T, R);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), U, P8.d(n));
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    public boolean a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return this.b(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos))) > 0;
    }

    private int b(Block block) {
        Integer cfr_ignored_0 = (Integer)MapInvoker.c(this.W, block);
        return 0;
    }

    protected boolean d(World world, BlockPos blockPos) {
        return aV8.s(world, blockPos) || aV8.s(world, amv_2.d(blockPos)) || aV8.s(world, amv_2.f(blockPos)) || aV8.s(world, amv_2.a(blockPos)) || aV8.s(world, amv_2.b(blockPos));
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        int n = amv_2.j(blockPos);
        int n2 = amv_2.h(blockPos);
        int n3 = amv_2.i(blockPos);
        if (!aV8.a(iBlockAccess, amv_2.g(blockPos)) && !Blocks.c.a(iBlockAccess, amv_2.g(blockPos))) {
            boolean bl = (n + n2 + n3 & 1) == 1;
            boolean bl2 = (n / 2 + n2 / 2 + n3 / 2 & 1) == 1;
            int n4 = 0;
            if (this.a(iBlockAccess, amv_2.e(blockPos))) {
                n4 = 1;
            }
            return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(iBlockState, Q, auk_2.b(this.a(iBlockAccess, amv_2.a(blockPos)))), P, auk_2.b(this.a(iBlockAccess, amv_2.f(blockPos)))), V, auk_2.b(this.a(iBlockAccess, amv_2.b(blockPos)))), Y, auk_2.b(this.a(iBlockAccess, amv_2.d(blockPos)))), X, P8.d(n4)), T, auk_2.b(bl2)), R, auk_2.b(bl));
        }
        return this.m();
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    private void a(World world, BlockPos blockPos, int n, Random random, int n2) {
        int n3 = this.c(BlockStateInvoker.getBlock(aV8.q(world, blockPos)));
        if (a5_0.a(random, n) < n3) {
            IBlockState iBlockState = aV8.q(world, blockPos);
            if (a5_0.a(random, n2 + 10) < 5 && !aV8.s(world, blockPos)) {
                int n4 = n2 + a5_0.a(random, 5) / 4;
                if (n4 > 15) {
                    n4 = 15;
                }
                aV8.a(world, blockPos, BlockStateInvoker.a(this.m(), U, P8.d(n4)), 3);
            } else {
                aV8.j(world, blockPos);
            }
            if (BlockStateInvoker.getBlock(iBlockState) == Blocks.Y) {
                Blocks.Y.d(world, blockPos, BlockStateInvoker.a(iBlockState, h2_0.P, Boolean.TRUE));
            }
        }
    }
}

