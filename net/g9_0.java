/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import net.minecraft.util.MovingObjectPosition;
import deobf.Vec3;

/*
 * Renamed from net.g9
 */
public abstract class g9_0
extends Block {
    protected boolean P;

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return aV8.a((IBlockAccess)world, amv_2.g(blockPos));
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        az_1 az_12;
        IBlockState iBlockState = aG3.c(iBlockAccess, blockPos);
        az_1 az_13 = az_12 = BlockStateInvoker.getBlock(iBlockState) == this ? (az_1)((Object)BlockStateInvoker.b(iBlockState, this.a())) : null;
        if (amm_1.b(az_12)) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        }
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public MovingObjectPosition a(World world, BlockPos blockPos, Vec3 vec3, Vec3 vec32) {
        this.a((IBlockAccess)world, blockPos);
        return super.a(world, blockPos, vec3, vec32);
    }

    @Override
    public boolean v() {
        return false;
    }

    protected IBlockState a(World world, BlockPos blockPos, IBlockState iBlockState, boolean bl) {
        return world.isRemote ? iBlockState : aP7.a(aP7.a(new aft_0(this, world, blockPos, iBlockState), aV8.B(world, blockPos), bl));
    }

    protected void b(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
    }

    public abstract a4_0<az_1> a();

    public static boolean a(IBlockState iBlockState) {
        Block block = BlockStateInvoker.getBlock(iBlockState);
        return block == Blocks.bQ || block == Blocks.bg || block == Blocks.bX || block == Blocks.bc;
    }

    public static boolean a(World world, BlockPos blockPos) {
        return g9_0.a(aV8.q(world, blockPos));
    }

    @Override
    public int F() {
        return 0;
    }

    protected g9_0(boolean bl) {
        super(Material.I);
        this.P = bl;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this.a(CreativeTabs.f);
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        super.a(world, blockPos, iBlockState);
        if (amm_1.b((az_1)((Object)BlockStateInvoker.b(iBlockState, this.a())))) {
            aV8.c(world, amv_2.e(blockPos), this);
        }
        if (this.P) {
            aV8.c(world, blockPos, this);
            aV8.c(world, amv_2.g(blockPos), this);
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!world.isRemote) {
            az_1 az_12 = (az_1)((Object)BlockStateInvoker.b(iBlockState, this.a()));
            if (!aV8.a((IBlockAccess)world, amv_2.g(blockPos))) {
                // empty if block
            }
            if (az_12 == az_1.ASCENDING_EAST && !aV8.a((IBlockAccess)world, amv_2.f(blockPos)) || az_12 == az_1.ASCENDING_WEST && !aV8.a((IBlockAccess)world, amv_2.d(blockPos)) || az_12 == az_1.ASCENDING_NORTH && !aV8.a((IBlockAccess)world, amv_2.a(blockPos)) || az_12 != az_1.ASCENDING_SOUTH || !aV8.a((IBlockAccess)world, amv_2.b(blockPos))) {
                // empty if block
            }
            this.a(world, blockPos, iBlockState, 0);
            aV8.j(world, blockPos);
        }
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!world.isRemote) {
            iBlockState = this.a(world, blockPos, iBlockState, true);
            if (this.P) {
                this.a(world, blockPos, iBlockState, this);
            }
        }
    }
}

