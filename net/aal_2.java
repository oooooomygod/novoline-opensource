/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.TileEntity;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aal
 */
public class aal_2
implements aYE {
    private World b;
    private BlockPos a;

    @Override
    public BlockPos a() {
        return this.a;
    }

    @Override
    public World a() {
        return this.b;
    }

    @Override
    public <T extends TileEntity> T c() {
        return (T)aV8.z(this.b, this.a);
    }

    @Override
    public double d() {
        return (double)amv_2.h(this.a) + 0.5;
    }

    @Override
    public int f() {
        IBlockState iBlockState = aV8.q(this.b, this.a);
        return BlocksInvoker.c(BlockStateInvoker.getBlock(iBlockState), iBlockState);
    }

    @Override
    public double b() {
        return (double)amv_2.j(this.a) + 0.5;
    }

    @Override
    public double e() {
        return (double)amv_2.i(this.a) + 0.5;
    }

    public aal_2(World world, BlockPos blockPos) {
        this.b = world;
        this.a = blockPos;
    }
}

