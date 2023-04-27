/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.g0
 */
public class g0_0
extends g9_0 {
    public static JC<az_1> R = xu_0.a(sh_1.b, az_1.class, new z2_0());
    public static J_ Q = aWq.a(sh_1.a);

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), R, (Comparable)((Object)amm_1.a(n & 7))), Q, auk_2.b((n & 8) > 0));
    }

    protected boolean a(World world, BlockPos blockPos, boolean bl, int n, az_1 az_12) {
        IBlockState iBlockState = aV8.q(world, blockPos);
        if (BlockStateInvoker.getBlock(iBlockState) != this) {
            return false;
        }
        az_1 az_13 = (az_1)((Object)BlockStateInvoker.b(iBlockState, R));
        return (az_12 != az_1.EAST_WEST || az_13 != az_1.NORTH_SOUTH && az_13 != az_1.ASCENDING_NORTH && az_13 != az_1.ASCENDING_SOUTH) && (az_12 != az_1.NORTH_SOUTH || az_13 != az_1.EAST_WEST && az_13 != az_1.ASCENDING_EAST && az_13 != az_1.ASCENDING_WEST) && auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q)) && (aV8.B(world, blockPos) || this.a(world, blockPos, iBlockState, bl, n + 1));
    }

    protected g0_0() {
        super(true);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), R, (Comparable)((Object)az_1.NORTH_SOUTH)), Q, Boolean.FALSE));
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= amm_1.a((az_1)((Object)BlockStateInvoker.b(iBlockState, R)));
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
            n |= 8;
        }
        return n;
    }

    @Override
    public a4_0<az_1> a() {
        return R;
    }

    @Override
    protected a42 s() {
        return new a42(this, R, Q);
    }

    @Override
    protected void b(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        boolean bl;
        boolean bl2 = auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q));
        boolean bl3 = bl = aV8.B(world, blockPos) || this.a(world, blockPos, iBlockState, true, 0) || this.a(world, blockPos, iBlockState, false, 0);
        if (bl != bl2) {
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, Q, auk_2.b(bl)), 3);
            aV8.c(world, amv_2.g(blockPos), this);
            if (amm_1.b((az_1)((Object)BlockStateInvoker.b(iBlockState, R)))) {
                aV8.c(world, amv_2.e(blockPos), this);
            }
        }
    }

    protected boolean a(World world, BlockPos blockPos, IBlockState iBlockState, boolean bl, int n) {
        if (n >= 8) {
            return false;
        }
        int n2 = amv_2.j(blockPos);
        int n3 = amv_2.h(blockPos);
        int n4 = amv_2.i(blockPos);
        az_1 az_12 = (az_1)((Object)BlockStateInvoker.b(iBlockState, R));
        switch (aF4.a[az_12.ordinal()]) {
            case 1: {
                ++n4;
                break;
            }
            case 2: {
                --n2;
                break;
            }
            case 3: {
                --n2;
                az_12 = az_1.EAST_WEST;
                break;
            }
            case 4: {
                --n2;
                ++n3;
                az_12 = az_1.EAST_WEST;
                break;
            }
            case 5: {
                ++n4;
                az_12 = az_1.NORTH_SOUTH;
                break;
            }
            case 6: {
                ++n4;
                ++n3;
                az_12 = az_1.NORTH_SOUTH;
            }
        }
        return this.a(world, new BlockPos(n2, n3, n4), bl, n, az_12) || this.a(world, new BlockPos(n2, n3 - 1, n4), bl, n, az_12);
    }
}

