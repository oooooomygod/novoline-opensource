/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumCreateEntityType;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Chunk;
import deobf.IBlockAccess;
import deobf.TileEntity;

/*
 * Renamed from net.aVn
 */
public class avn_0
implements IBlockAccess {
    protected int d;
    protected Chunk[][] a;
    protected boolean c;
    protected World b;
    protected int e;

    @Override
    public IBlockState b(BlockPos blockPos) {
        if (amv_2.h(blockPos) >= 0 && amv_2.h(blockPos) < 256) {
            int n = (amv_2.j(blockPos) >> 4) - this.e;
            int n2 = (amv_2.i(blockPos) >> 4) - this.d;
            if (n < this.a.length && n2 < this.a[n].length) {
                Chunk chunk = this.a[n][n2];
                return chunk.d(blockPos);
            }
        }
        return BlocksInvoker.t(Blocks.air);
    }

    public int b(YG yG, BlockPos blockPos) {
        if (amv_2.h(blockPos) >= 0 && amv_2.h(blockPos) < 256) {
            int n = (amv_2.j(blockPos) >> 4) - this.e;
            int n2 = (amv_2.i(blockPos) >> 4) - this.d;
            return this.a[n][n2].a(yG, blockPos);
        }
        return yG.defaultLightValue;
    }

    @Override
    public boolean d() {
        return this.c;
    }

    @Override
    public WorldType e() {
        return this.b.e();
    }

    @Override
    public int a(BlockPos blockPos, EnumFacing enumFacing) {
        IBlockState iBlockState = this.b(blockPos);
        return BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), this, blockPos, iBlockState, enumFacing);
    }

    @Override
    public il_0 d(BlockPos blockPos) {
        return this.b.d(blockPos);
    }

    @Override
    public int a(BlockPos blockPos, int n) {
        int n2 = this.a(YG.SKY, blockPos);
        int n3 = this.a(YG.BLOCK, blockPos);
        if (n3 < n) {
            n3 = n;
        }
        return n2 << 20 | n3 << 4;
    }

    private int a(YG yG, BlockPos blockPos) {
        if (yG == YG.SKY && qq_2.e(this.b.d)) {
            return 0;
        }
        if (amv_2.h(blockPos) >= 0 && amv_2.h(blockPos) < 256) {
            if (BlocksInvoker.i(BlockStateInvoker.getBlock(this.b(blockPos)))) {
                int n = 0;
                for (EnumFacing enumFacing : EnumFacing.values()) {
                    int n2 = this.b(yG, amv_2.a(blockPos, enumFacing));
                    if (n2 <= n) continue;
                    n = n2;
                }
                return n;
            }
            int n = (amv_2.j(blockPos) >> 4) - this.e;
            int n3 = (amv_2.i(blockPos) >> 4) - this.d;
            return this.a[n][n3].a(yG, blockPos);
        }
        return yG.defaultLightValue;
    }

    public avn_0(World world, BlockPos blockPos, BlockPos blockPos2, int n) {
        int n2;
        int n3;
        this.b = world;
        this.e = amv_2.j(blockPos) - n >> 4;
        this.d = amv_2.i(blockPos) - n >> 4;
        int n4 = amv_2.j(blockPos2) + n >> 4;
        int n5 = amv_2.i(blockPos2) + n >> 4;
        this.a = new Chunk[n4 - this.e + 1][n5 - this.d + 1];
        this.c = true;
        for (n3 = this.e; n3 <= n4; ++n3) {
            for (n2 = this.d; n2 <= n5; ++n2) {
                this.a[n3 - this.e][n2 - this.d] = aV8.a(world, n3, n2);
            }
        }
        for (n3 = amv_2.j(blockPos) >> 4; n3 <= amv_2.j(blockPos2) >> 4; ++n3) {
            for (n2 = amv_2.i(blockPos) >> 4; n2 <= amv_2.i(blockPos2) >> 4; ++n2) {
                Chunk chunk = this.a[n3 - this.e][n2 - this.d];
                if (aqp_2.a(chunk, amv_2.h(blockPos), amv_2.h(blockPos2))) continue;
                this.c = false;
            }
        }
    }

    @Override
    public TileEntity c(BlockPos blockPos) {
        int n = (amv_2.j(blockPos) >> 4) - this.e;
        int n2 = (amv_2.i(blockPos) >> 4) - this.d;
        return aqp_2.a(this.a[n][n2], blockPos, EnumCreateEntityType.IMMEDIATE);
    }

    @Override
    public boolean a(BlockPos blockPos) {
        return BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(blockPos))) == Material.air;
    }
}

