/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.*;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.IBlockAccess;
import deobf.Vec3;
import java.util.Iterator;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.gO
 */
public abstract class BlockLiquid
extends Block {
    public static js_0 P = a7X.a(and_0.g, 0, 15);

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos) {
        int n = -1;
        int n2 = -1;
        IBlockState iBlockState;
        Block block;
        Material material;
        while ((material = (block = BlockStateInvoker.getBlock(iBlockState = aG3.c(iBlockAccess, amv_2.a(blockPos, n, 0, n2)))).w()) == this.o || block.z()) {
            ++n2;
        }
        return true;
    }

    @Override
    public boolean a(IBlockState iBlockState, boolean bl) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) == 0;
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.a(world, blockPos, iBlockState);
    }

    public static BlockStaticLiquid a(Material material) {
        if (material == Material.M) {
            return Blocks.water;
        }
        if (material == Material.e) {
            return Blocks.lava;
        }
        throw new IllegalArgumentException(and_0.a);
    }

    public static float a(int n) {
        if (n >= 8) {
            n = 0;
        }
        return (float)(n + 1) / 9.0f;
    }

    public static double a(IBlockAccess iBlockAccess, BlockPos blockPos, Material material) {
        Vec3 vec3 = BlockLiquid.b(material).d(iBlockAccess, blockPos);
        return vec3.xCoord == 0.0 && vec3.zCoord == 0.0 ? -1000.0 : MathHelper.c(vec3.zCoord, vec3.xCoord) - 1.5707963267948966;
    }

    @Override
    public boolean f() {
        return false;
    }

    protected void a(World world, BlockPos blockPos) {
        double d = amv_2.j(blockPos);
        double d2 = amv_2.h(blockPos);
        double d3 = amv_2.i(blockPos);
        aV8.a(world, d + 0.5, d2 + 0.5, d3 + 0.5, and_0.f, 0.5f, 2.6f + (a5_0.e(world.o) - a5_0.e(world.o)) * 0.8f);
        int n = 0;
        while (true) {
            aV8.a(world, B7.SMOKE_LARGE, d + MathInvoker.a(), d2 + 1.2, d3 + MathInvoker.a(), 0.0, 0.0, 0.0, new int[0]);
            ++n;
        }
    }

    public static BlockDynamicLiquid b(Material material) {
        if (material == Material.M) {
            return Blocks.flowing_water;
        }
        if (material == Material.e) {
            return Blocks.flowing_lava;
        }
        throw new IllegalArgumentException(and_0.c);
    }

    @Override
    public int b(IBlockAccess iBlockAccess, BlockPos blockPos) {
        int n = aG3.a(iBlockAccess, blockPos, 0);
        int n2 = aG3.a(iBlockAccess, amv_2.e(blockPos), 0);
        int n3 = n & 0xFF;
        int n4 = n2 & 0xFF;
        int n5 = n >> 16 & 0xFF;
        int n6 = n2 >> 16 & 0xFF;
        return (n3 > n4 ? n3 : n4) | (n5 > n6 ? n5 : n6) << 16;
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, int n) {
        return this.o == Material.M ? aY1.a(iBlockAccess, blockPos) : 0xFFFFFF;
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public Vec3 a(World world, BlockPos blockPos, Entity entity, Vec3 vec3) {
        return aNE.g(vec3, this.d((IBlockAccess)world, blockPos));
    }

    @Override
    public int q() {
        return 1;
    }

    @Override
    public boolean v() {
        return false;
    }

    protected int c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        int n = this.a(iBlockAccess, blockPos);
        return n >= 8 ? 0 : n;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return null;
    }

    protected Vec3 d(IBlockAccess iBlockAccess, BlockPos blockPos) {
        BlockPos blockPos2;
        Object object;
        Vec3 vec3 = new Vec3(0.0, 0.0, 0.0);
        int n = this.c(iBlockAccess, blockPos);
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            object = dz_0.b(iterator);
            blockPos2 = amv_2.a(blockPos, (EnumFacing)object);
            int n2 = this.c(iBlockAccess, blockPos2);
            if (akm_1.d(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos2)).w())) continue;
            n2 = this.c(iBlockAccess, amv_2.g(blockPos2));
            int n3 = n2 - (n - 8);
            vec3 = aNE.a(vec3, (amv_2.j(blockPos2) - amv_2.j(blockPos)) * n3, (amv_2.h(blockPos2) - amv_2.h(blockPos)) * n3, (amv_2.i(blockPos2) - amv_2.i(blockPos)) * n3);
        }
        if (P8.b((Integer)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), P)) >= 8) {
            iterator = abw_2.b(cs_1.HORIZONTAL);
            while (dz_0.c(iterator)) {
                object = dz_0.b(iterator);
                blockPos2 = amv_2.a(blockPos, (EnumFacing)object);
                if (!this.c(iBlockAccess, blockPos2, (EnumFacing)object) && !this.c(iBlockAccess, amv_2.e(blockPos2), (EnumFacing)object)) continue;
                vec3 = aNE.a(aNE.b(vec3), 0.0, -6.0, 0.0);
                break;
            }
        }
        return aNE.b(vec3);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, P8.d(n));
    }

    protected BlockLiquid(Material material) {
        super(material);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, P8.d(0)));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.a(true);
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        Material material;
        double d = amv_2.j(blockPos);
        double d2 = amv_2.h(blockPos);
        double d3 = amv_2.i(blockPos);
        if (this.o == Material.M) {
            int n = P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
            if (n < 8) {
                if (a5_0.a(random, 64) == 0) {
                    aV8.a(world, d + 0.5, d2 + 0.5, d3 + 0.5, and_0.e, a5_0.e(random) * 0.25f + 0.75f, a5_0.e(random) * 1.0f + 0.5f, false);
                }
            } else if (a5_0.a(random, 10) == 0) {
                aV8.a(world, B7.SUSPENDED, d + (double)a5_0.e(random), d2 + (double)a5_0.e(random), d3 + (double)a5_0.e(random), 0.0, 0.0, 0.0, new int[0]);
            }
        }
        if (this.o == Material.e && BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))).w() == Material.air && !BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))).f()) {
            if (a5_0.a(random, 100) == 0) {
                double d4 = d + (double)a5_0.e(random);
                double d5 = d2 + this.b;
                double d6 = d3 + (double)a5_0.e(random);
                aV8.a(world, B7.LAVA, d4, d5, d6, 0.0, 0.0, 0.0, new int[0]);
                aV8.a(world, d4, d5, d6, and_0.b, 0.2f + a5_0.e(random) * 0.2f, 0.9f + a5_0.e(random) * 0.15f, false);
            }
            if (a5_0.a(random, 200) == 0) {
                aV8.a(world, d, d2, d3, and_0.d, 0.2f + a5_0.e(random) * 0.2f, 0.9f + a5_0.e(random) * 0.15f, false);
            }
        }
        if (a5_0.a(random, 10) == 0 && aV8.a((IBlockAccess)world, amv_2.g(blockPos)) && !akm_1.d(material = BlockStateInvoker.getBlock(aV8.q(world, amv_2.d(blockPos, 2))).w()) && !akm_1.f(material)) {
            double d7 = d + (double)a5_0.e(random);
            double d8 = d2 - 1.05;
            double d9 = d3 + (double)a5_0.e(random);
            if (this.o == Material.M) {
                aV8.a(world, B7.DRIP_WATER, d7, d8, d9, 0.0, 0.0, 0.0, new int[0]);
            } else {
                aV8.a(world, B7.DRIP_LAVA, d7, d8, d9, 0.0, 0.0, 0.0, new int[0]);
            }
        }
    }

    protected int a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos)).w() == this.o ? P8.b((Integer)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), P)) : -1;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        this.a(world, blockPos, iBlockState);
    }

    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (this.o == Material.e) {
            for (EnumFacing enumFacing : EnumFacing.values()) {
                if (enumFacing != EnumFacing.DOWN && BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, enumFacing))).w() == Material.M) break;
            }
            Integer n = (Integer)BlockStateInvoker.b(iBlockState, P);
            if (P8.b(n) == 0) {
                aV8.a(world, blockPos, Blocks.O.m());
                this.a(world, blockPos);
                return true;
            }
            if (P8.b(n) <= 4) {
                aV8.a(world, blockPos, Blocks.cobblestone.m());
                this.a(world, blockPos);
                return true;
            }
        }
        return false;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
    }

    @Override
    public boolean c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return this.o != Material.e;
    }

    @Override
    public a5w_0 K() {
        return this.o == Material.M ? a5w_0.TRANSLUCENT : a5w_0.SOLID;
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos)).w() != this.o && (enumFacing == EnumFacing.UP || super.b(iBlockAccess, blockPos, enumFacing));
    }

    @Override
    public int a(World world) {
        return this.o == Material.M ? 5 : (this.o == Material.e ? (qq_2.e(world.d) ? 10 : 30) : 0);
    }

    @Override
    public boolean c(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        Material material = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos)).w();
        return material != this.o && (enumFacing == EnumFacing.UP || material != Material.v && super.c(iBlockAccess, blockPos, enumFacing));
    }
}

