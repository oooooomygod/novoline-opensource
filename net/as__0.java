/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;

/*
 * Renamed from net.as_
 */
public class as__0 {
    private EnumFacing f;
    private kl_1 a;
    private World g;
    private EnumFacing b;
    private int c = 0;
    private int d;
    private int e;
    private BlockPos h;

    static int b(as__0 as__02) {
        return as__02.e;
    }

    protected int d() {
        int n;
        this.d = 0;
        block0: while (this.d < 21) {
            for (n = 0; n < this.e; ++n) {
                BlockPos blockPos = amv_2.c(amv_2.a(this.h, this.f, n), this.d);
                Block block = BlockStateInvoker.getBlock(aV8.q(this.g, blockPos));
                if (!this.a(block)) break block0;
                if (block == Blocks.h) {
                    ++this.c;
                }
                if ((block = BlockStateInvoker.getBlock(aV8.q(this.g, amv_2.a(blockPos, this.b)))) != Blocks.O) break block0;
            }
            ++this.d;
        }
        for (n = 0; n < this.e; ++n) {
            if (BlockStateInvoker.getBlock(aV8.q(this.g, amv_2.c(amv_2.a(this.h, this.f, n), this.d))) == Blocks.O) continue;
            this.d = 0;
            break;
        }
        if (this.d <= 21 && this.d >= 3) {
            return this.d;
        }
        this.h = null;
        this.e = 0;
        this.d = 0;
        return 0;
    }

    protected boolean a(Block block) {
        return block.o == Material.air || block == Blocks.c || block == Blocks.h;
    }

    public void e() {
        for (int i = 0; i < this.e; ++i) {
            BlockPos blockPos = amv_2.a(this.h, this.f, i);
            for (int j = 0; j < this.d; ++j) {
                aV8.a(this.g, amv_2.c(blockPos, j), BlockStateInvoker.a(abu_0.a(Blocks.h), fq_1.Q, (Comparable)((Object)this.a)), 2);
            }
        }
    }

    public boolean c() {
        return this.h != null && this.e >= 2 && this.e <= 21 && this.d >= 3 && this.d <= 21;
    }

    public int b() {
        return this.e;
    }

    public as__0(World world, BlockPos blockPos, kl_1 kl_12) {
        this.g = world;
        this.a = kl_12;
        if (kl_12 == kl_1.X) {
            this.b = EnumFacing.EAST;
            this.f = EnumFacing.WEST;
        } else {
            this.b = EnumFacing.NORTH;
            this.f = EnumFacing.SOUTH;
        }
        BlockPos blockPos2 = blockPos;
        while (amv_2.h(blockPos) > amv_2.h(blockPos2) - 21 && amv_2.h(blockPos) > 0 && this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))))) {
            blockPos = amv_2.g(blockPos);
        }
        int n = this.a(blockPos, this.b) - 1;
        this.h = amv_2.a(blockPos, this.b, n);
        this.e = this.a(this.h, this.f);
        if (this.e < 2 || this.e > 21) {
            this.h = null;
            this.e = 0;
        }
        if (this.h != null) {
            this.d = this.d();
        }
    }

    static BlockPos d(as__0 as__02) {
        return as__02.h;
    }

    static int a(as__0 as__02) {
        return as__02.d;
    }

    static int e(as__0 as__02) {
        return as__02.c;
    }

    static EnumFacing c(as__0 as__02) {
        return as__02.f;
    }

    public int a() {
        return this.d;
    }

    protected int a(BlockPos blockPos, EnumFacing enumFacing) {
        Object object;
        int n = 0;
        while (this.a(BlockStateInvoker.getBlock(aV8.q(this.g, (BlockPos)(object = amv_2.a(blockPos, enumFacing, n))))) && BlockStateInvoker.getBlock(aV8.q(this.g, amv_2.g((BlockPos)object))) == Blocks.O) {
            ++n;
        }
        object = BlockStateInvoker.getBlock(aV8.q(this.g, amv_2.a(blockPos, enumFacing, n)));
        return object == Blocks.O ? n : 0;
    }
}

